package me.voson.demo.controller;

import me.voson.demo.CommonResponse;
import me.voson.demo.model.DeviceSetting;
import me.voson.demo.service.DeviceSettingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@RestController
public class DeviceSettingController {
    final DeviceSettingService deviceSettingService;

    public DeviceSettingController(DeviceSettingService deviceSettingService) {
        this.deviceSettingService = deviceSettingService;
    }

    @GetMapping("/device/setting/{sn}")
    public Mono<CommonResponse<DeviceSetting>> getDeviceSetting(@PathVariable() String sn) {
        return deviceSettingService.findBySn(sn).map(CommonResponse::success)
                .defaultIfEmpty(CommonResponse.success(null));
    }
}

