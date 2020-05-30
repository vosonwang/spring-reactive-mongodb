package me.voson.demo.controller;

import me.voson.demo.CommonResponse;
import me.voson.demo.model.User;
import me.voson.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@RestController
public class UserController {
    final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/user")
    public Mono<CommonResponse<User>> getUser(@RequestParam("name") String name) {
        return userService.findByName(name).map(CommonResponse::success).defaultIfEmpty(CommonResponse.success(null));
    }

    @PostMapping("/user")
    public Mono<CommonResponse<Long>> newUser(@RequestBody User user) {
        return userService.insert(user).map(CommonResponse::success).
                onErrorResume(e -> Mono.just(CommonResponse.fail("NEW_RECORD_FAILED", e.getMessage())));
    }
}
