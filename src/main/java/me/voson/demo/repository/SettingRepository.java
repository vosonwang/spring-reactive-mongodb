package me.voson.demo.repository;

import me.voson.demo.model.Setting;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface SettingRepository extends ReactiveCrudRepository<Setting, String> {
    Mono<Setting> findBySN(String sn);
}
