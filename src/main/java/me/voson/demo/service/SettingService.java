package me.voson.demo.service;

import me.voson.demo.model.DeviceSetting;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Service
public interface SettingService {
    /**
     *  根据序列号查找设备配置信息
     * @param sn String
     * @return an entity if with the given sn exists
     */
    Mono<DeviceSetting> findBySn(String sn);
}
