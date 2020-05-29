package me.voson.demo.service;

import me.voson.demo.model.DeviceSetting;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public interface SettingService {
    Mono<DeviceSetting> findBySn(String sn);
}
