package com.hsob.HornySOB.repository;

import com.hsob.HornySOB.model.listingsAndReviews.ListingsAndReviews;
import com.mongodb.BasicDBObject;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.web.ProjectedPayload;

import java.util.List;

public interface ListingsAndReviewsRepository extends MongoRepository<ListingsAndReviews,String> {

    @Query("{$and: [ {'bedrooms':{$gte:?0}}, {'bedrooms':{$lte:?1}} ] }")
    public List<ListingsAndReviews> getPlaceByBedrooms(Integer min, Integer max);

}
