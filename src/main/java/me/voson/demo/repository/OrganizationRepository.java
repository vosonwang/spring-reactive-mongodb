package me.voson.demo.repository;

import me.voson.demo.model.Organization;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Repository
public interface OrganizationRepository extends ReactiveMongoRepository<Organization, String> {
    /**
     * Retrieves an entity by its name.
     *
     * @param name String
     * @return an entity if with the given sn exists
     * */
    Mono<Organization> findByName(String name);
}

