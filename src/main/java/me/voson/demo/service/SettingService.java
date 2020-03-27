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
     * @param sn mongo_sn
     * @return Setting
     */
    public Mono<Setting> findBySN(String sn) {
        return settingRepository.findBySN(sn);
    }
}
