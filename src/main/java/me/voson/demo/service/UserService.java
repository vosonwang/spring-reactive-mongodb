package me.voson.demo.service;

import me.voson.demo.model.User;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

/**
 * @author voson
 */
@Service
public interface UserService {
    /**
     * return an entity by its name
     *
     * @param name String
     * @return entity
     */
    Mono<User> findByName(String name);

    /**
     * return an uuid of saved entity
     *
     * @param user User
     * @return uuid
     */
    Mono<Long> insert(User user);
}
