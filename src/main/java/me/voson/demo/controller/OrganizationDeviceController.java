package me.voson.demo.controller;

import ch.qos.logback.classic.gaffer.ComponentDelegate;
import me.voson.demo.CommonResponse;
import me.voson.demo.model.DeviceSetting;
import me.voson.demo.model.Organization;
import me.voson.demo.service.OrganizationDeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

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
        return Mono.just(CommonResponse.success(organizationDeviceService.findOrganizationBySn(sn)));
    }
}
