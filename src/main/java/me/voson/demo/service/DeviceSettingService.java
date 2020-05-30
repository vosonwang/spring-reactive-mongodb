package me.voson.demo.service;

import me.voson.demo.model.DeviceSetting;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Service
public interface DeviceSettingService {
    /**
     *  Retrieves an entity by its sn.
     *
     * @param sn String
     * @return an entity if with the given sn exists
     */
    Mono<DeviceSetting> findBySn(String sn);
}
