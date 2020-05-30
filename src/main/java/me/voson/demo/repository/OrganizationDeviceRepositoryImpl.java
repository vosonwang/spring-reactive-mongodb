package me.voson.demo.repository;

import me.voson.demo.model.Organization;
import me.voson.demo.model.OrganizationDevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.aggregation.Aggregation;
import org.springframework.data.mongodb.core.aggregation.ObjectOperators;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;

import java.util.List;

import static org.springframework.data.mongodb.core.aggregation.Aggregation.*;
import static org.springframework.data.mongodb.core.query.Criteria.where;

/**
 * @author voson
 */
@Component
public class OrganizationDeviceRepositoryImpl implements OrganizationDeviceRepositoryCustom {

    private final MongoOperations mongoOperations;

    @Autowired
    public OrganizationDeviceRepositoryImpl(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    @Override
    public List<Organization> findOrganizationBySn(String sn) {
        Aggregation aggregation = newAggregation(
                match(where("sns").is(sn)),
                lookup("organization", "organization_id", "_id", "result"),
                replaceRoot(ObjectOperators.MergeObjects.merge("$result"))
        );
        return mongoOperations.aggregate(aggregation, OrganizationDevice.class, Organization.class).getMappedResults();
    }
}
