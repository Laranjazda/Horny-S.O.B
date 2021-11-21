package com.hsob.HornySOB.repository;

import com.hsob.HornySOB.model.listingsAndReviews.ListingsAndReviews;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ListingsAndReviewsRepository extends MongoRepository<ListingsAndReviews,String> {

}
