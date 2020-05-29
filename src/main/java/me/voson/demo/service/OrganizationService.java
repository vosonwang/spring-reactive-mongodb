package me.voson.demo.service;

import me.voson.demo.model.Organization;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface OrganizationService {
    Mono<Organization> findByName(String name);
    Mono<String> newOrganization(Organization organization);
}
