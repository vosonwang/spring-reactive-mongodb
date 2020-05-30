package me.voson.demo.controller;

import me.voson.demo.CommonResponse;
import me.voson.demo.model.Organization;
import me.voson.demo.service.OrganizationDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toList;

/**
 * @author voson
 */
@RestController
public class OrganizationDeviceController {
    final OrganizationDeviceService organizationDeviceService;

    @Autowired
    public OrganizationDeviceController(OrganizationDeviceService organizationDeviceService) {
        this.organizationDeviceService = organizationDeviceService;
    }

    @GetMapping("/device/organizations/{sn}")
    public Mono<CommonResponse<List<Organization>>> getDeviceSetting(@PathVariable() String sn) {
        return organizationDeviceService.findOrganizationBySn(sn).collectList().map(CommonResponse::success);
    }
}
