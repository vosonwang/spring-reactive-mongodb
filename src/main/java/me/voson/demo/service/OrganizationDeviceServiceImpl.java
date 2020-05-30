package me.voson.demo.service;

import me.voson.demo.model.Organization;
import me.voson.demo.repository.OrganizationDeviceRepository;
import me.voson.demo.repository.OrganizationDeviceRepositoryImpl;
import me.voson.demo.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

/**
 * @author voson
 */
@Component
public class OrganizationDeviceServiceImpl implements OrganizationDeviceService {
    final OrganizationDeviceRepository organizationDeviceRepository;

    @Autowired
    public OrganizationDeviceServiceImpl(OrganizationDeviceRepository organizationDeviceRepository) {
        this.organizationDeviceRepository = organizationDeviceRepository;
    }

    @Override
    public List<Organization> findOrganizationBySn(String sn) {
        return organizationDeviceRepository.findOrganizationBySn(sn);
    }
}
