package me.voson.demo.service;

import me.voson.demo.model.Setting;
import me.voson.demo.repository.SettingRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class SettingService {
    private final SettingRepository settingRepository;

    public SettingService(SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }

    /**
     * @param id mongo_id
     * @return Setting
     */
    public Mono<Setting> findOne(String id) {
        return settingRepository.findById(id);
    }
}
