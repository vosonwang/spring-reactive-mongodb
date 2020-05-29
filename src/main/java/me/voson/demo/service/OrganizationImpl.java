package me.voson.demo.service;

import me.voson.demo.model.Organization;
import me.voson.demo.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author voson
 */
@Component
public class OrganizationImpl implements OrganizationService {
    final OrganizationRepository organizationRepository;

    @Autowired
    public OrganizationImpl(OrganizationRepository organizationRepository) {
        this.organizationRepository = organizationRepository;
    }

    @Override
    public Mono<Organization> findByName(String name) {
        return organizationRepository.findByName(name);
    }

    @Override
    public Mono<String> newOrganization(Organization organization) {
        Date now = new Date();
        organization.setCreateTime(now);
        organization.setUpdateTime(now);
        return organizationRepository.insert(organization).map(Organization::getId);
    }
}
