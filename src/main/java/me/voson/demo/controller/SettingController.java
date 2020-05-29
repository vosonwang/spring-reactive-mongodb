package me.voson.demo.controller;

import me.voson.demo.CommonResponse;
import me.voson.demo.model.DeviceSetting;
import me.voson.demo.service.SettingService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SettingController {
    final SettingService settingService;

    public SettingController(SettingService settingService) {
        this.settingService = settingService;
    }

    @GetMapping("/device/setting/{sn}")
    public Mono<CommonResponse<DeviceSetting>> findBySN(@PathVariable() String sn) {
        return settingService.findBySn(sn).map(CommonResponse::success)
                .defaultIfEmpty(CommonResponse.success(null));
    }
}

