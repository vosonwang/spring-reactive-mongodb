package me.voson.demo.repository;

import me.voson.demo.model.DeviceSetting;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Repository
public interface SettingRepository extends ReactiveMongoRepository<DeviceSetting, String> {
    /**
     * Retrieves an entity by its sn.
     *
     * @param sn String
     * @return an entity if with the given sn exists
     */
    Mono<DeviceSetting> findBySn(String sn);
}
