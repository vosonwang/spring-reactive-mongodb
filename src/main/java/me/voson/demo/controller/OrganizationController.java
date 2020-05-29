package me.voson.demo.controller;

import me.voson.demo.CommonResponse;
import me.voson.demo.model.Organization;
import me.voson.demo.service.OrganizationService;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@RestController
public class OrganizationController {
    final OrganizationService organizationService;

    public OrganizationController(OrganizationService organizationService) {
        this.organizationService = organizationService;
    }

    @GetMapping("/organization/{name}")
    public Mono<CommonResponse<Organization>> getOrganization(@PathVariable() String name) {
        return organizationService.findByName(name).map(CommonResponse::success).defaultIfEmpty(CommonResponse.success(null));
    }

    @PostMapping("/organization")
    public Mono<CommonResponse<String>> newOrganization(@RequestBody Organization organization) {
        return organizationService.insert(organization).map(CommonResponse::success).
                onErrorResume(e -> Mono.just(CommonResponse.fail("NEW_RECORD_FAILED", e.getMessage())));
    }
}
