package me.voson.demo.service;

import me.voson.demo.model.Organization;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import java.util.ArrayList;
import java.util.List;

/**
 * @author voson
 */
@Service
public interface OrganizationService {
    /**
     * Retrieves an entity by its name.
     *
     * @param name String
     * @return an entity if with the given sn exists
     * */
    Mono<Organization> findByName(String name);

    /**
     * Inserts the given entity.
     *
     * @param organization Organization
     * @return id
     */
    Mono<String> insert(Organization organization);
}
