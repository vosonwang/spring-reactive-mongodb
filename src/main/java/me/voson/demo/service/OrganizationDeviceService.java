package me.voson.demo.service;

import me.voson.demo.model.Organization;
import reactor.core.publisher.Flux;

import java.util.List;

public interface OrganizationDeviceService {
    /**
     * Returns the list of entities which contain sn
     *
     * @param sn String
     * @return the list of entities which contain sn
     */
    List<Organization> findOrganizationBySn(String sn);
}
