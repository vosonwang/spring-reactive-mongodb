package me.voson.demo.service;

import me.voson.demo.model.DeviceSetting;
import me.voson.demo.repository.DeviceSettingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Component
public class DeviceSettingServiceImpl implements DeviceSettingService {
    final DeviceSettingRepository deviceSettingRepository;

    @Autowired
    public DeviceSettingServiceImpl(DeviceSettingRepository deviceSettingRepository) {
        this.deviceSettingRepository = deviceSettingRepository;
    }

    /**
     * @param sn String
     * @return DeviceSetting
     */
    @Override
    public Mono<DeviceSetting> findBySn(String sn) {
        return deviceSettingRepository.findBySn(sn);
    }
}
