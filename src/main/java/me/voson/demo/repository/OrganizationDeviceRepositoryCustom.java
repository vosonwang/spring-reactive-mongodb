package me.voson.demo.repository;

import me.voson.demo.model.Organization;
import reactor.core.publisher.Flux;

/**
 * @author voson
 */
public interface OrganizationDeviceRepositoryCustom {
    /**
     * Returns the list of entities which contain sn
     *
     * @param sn String
     * @return the list of entities which contain sn
     */
    Flux<Organization> findOrganizationBySn(String sn);
}
