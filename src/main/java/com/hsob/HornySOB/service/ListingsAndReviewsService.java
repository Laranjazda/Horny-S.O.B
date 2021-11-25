package com.hsob.HornySOB.service;

import com.hsob.HornySOB.DAO.SampleAirbnbDAO;
import com.hsob.HornySOB.model.listingsAndReviews.ListingsAndReviews;
import com.hsob.HornySOB.repository.ListingsAndReviewsRepository;
import com.mongodb.BasicDBObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListingsAndReviewsService {

    @Autowired
    ListingsAndReviewsRepository listingsAndReviewsRepository;

    public Object getById(String id){

        BasicDBObject query = new BasicDBObject("_id", id);
        BasicDBObject projection = new BasicDBObject("_id", 0)
                .append("listing_url", 1)
                .append("name",1)
                .append("last_review", 1)
                .append("amenities", 1)
                .append("images", 1);

        SampleAirbnbDAO dao = new SampleAirbnbDAO();
        return dao.getListingsAndReviewsCollection().find(query).projection(projection).first();
//        return listingsAndReviewsRepository.findById(id);
    }


    public List<ListingsAndReviews> getPlaceByBedrooms(Integer min, Integer max){
        return listingsAndReviewsRepository.getPlaceByBedrooms(min, max);
    }

}
