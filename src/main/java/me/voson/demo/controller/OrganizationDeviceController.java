package me.voson.demo.controller;

import me.voson.demo.CommonResponse;
import me.voson.demo.model.Organization;
import me.voson.demo.service.OrganizationDeviceService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.List;


/**
 * @author voson
 */
@RestController
public class OrganizationDeviceController {
    protected final Logger logger = LoggerFactory.getLogger(OrganizationDeviceController.class);

    final OrganizationDeviceService organizationDeviceService;

    @Autowired
    public OrganizationDeviceController(OrganizationDeviceService organizationDeviceService) {
        this.organizationDeviceService = organizationDeviceService;
    }

    /**
     * 查询指定序列号所属的组织列表
     */
    @GetMapping("/device/organizations/{sn}")
    public Mono<CommonResponse<List<Organization>>> getDeviceSetting(@PathVariable() String sn) {
        // Alibaba：日志输出事，变量拼接推荐占位符
        logger.info("用户查询了序列号 {} 所属的组织", sn);
        return organizationDeviceService.findOrganizationBySn(sn).collectList().map(CommonResponse::success);
    }
}
