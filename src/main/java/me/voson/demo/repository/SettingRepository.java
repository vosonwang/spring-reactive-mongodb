package me.voson.demo.repository;

import me.voson.demo.model.Setting;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SettingRepository extends ReactiveMongoRepository<Setting, String> {
}
