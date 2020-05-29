package me.voson.demo.service;

import me.voson.demo.model.Organization;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Service
public interface OrganizationService {
    /**
     * 根据组织名称查找组织
     * @param name String
     * @return an entity if with the given sn exists
     * */
    Mono<Organization> findByName(String name);

    /**
     * 新建组织
     * @param organization Organization
     * @return id
     */
    Mono<String> newOrganization(Organization organization);
}
