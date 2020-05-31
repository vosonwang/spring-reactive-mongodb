package me.voson.demo.service;

import me.voson.demo.model.User;
import me.voson.demo.repository.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Mono;

import java.util.Date;

/**
 * @author voson
 */
@Component
public class UserServiceImpl implements UserService {

    final UserMapper userMapper;

    @Autowired
    public UserServiceImpl(UserMapper userMapper) {
        this.userMapper = userMapper;
    }

    @Override
    public Mono<User> findByName(String name) {
        return Mono.justOrEmpty(userMapper.findByName(name));
    }

    @Override
    public Mono<Long> insert(User user) {
        Date now = new Date();
        user.setCreateTime(now);
        user.setUpdateTime(now);
        try {
            // 似乎是因为webFlux不支持SQL数据库，所以捕获不到DuplicateKeyException这样的异常
            return Mono.just(userMapper.insert(user));
        } catch (DuplicateKeyException e) {
            return Mono.error(e.getMostSpecificCause());
        } finally {
            System.out.println("unknown error");
        }
    }
}
