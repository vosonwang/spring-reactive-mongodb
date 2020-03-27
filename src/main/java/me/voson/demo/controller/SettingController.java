package me.voson.demo.controller;

import me.voson.demo.model.Setting;
import me.voson.demo.service.SettingService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class SettingController {
    private final SettingService settingService;


    public SettingController(SettingService settingService) {
        this.settingService = settingService;
    }

    @GetMapping("/setting/{sn}")
    public Mono<ResponseEntity<Setting>> findBySN(@PathVariable() String sn) {
        return settingService.findBySN(sn)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.status(404).body(null));
    }
}
