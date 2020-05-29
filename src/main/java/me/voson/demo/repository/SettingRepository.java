package me.voson.demo.repository;

import me.voson.demo.model.DeviceSetting;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface SettingRepository extends ReactiveMongoRepository<DeviceSetting, String> {
    Mono<DeviceSetting> findBySn(String sn);
}
