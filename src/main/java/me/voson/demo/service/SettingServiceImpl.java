package me.voson.demo.service;

import me.voson.demo.model.DeviceSetting;
import me.voson.demo.repository.SettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Component
public class SettingServiceImpl implements SettingService {
    final SettingRepository settingRepository;

    @Autowired
    public SettingServiceImpl(SettingRepository settingRepository) {
        this.settingRepository = settingRepository;
    }

    /**
     * @param sn String
     * @return DeviceSetting
     */
    @Override
    public Mono<DeviceSetting> findBySn(String sn) {
        return settingRepository.findBySn(sn);
    }
}
