package me.voson.demo.repository;

import me.voson.demo.model.OrganizationDevice;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;

/**
 * @author voson
 */
@Repository
public interface OrganizationDeviceRepository extends ReactiveMongoRepository<OrganizationDevice, String>, OrganizationDeviceRepositoryCustom {
}
