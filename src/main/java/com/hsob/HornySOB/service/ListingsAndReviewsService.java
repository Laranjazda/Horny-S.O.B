package com.hsob.HornySOB.service;

import com.hsob.HornySOB.model.listingsAndReviews.ListingsAndReviews;
import com.hsob.HornySOB.repository.ListingsAndReviewsRepository;
import com.mongodb.BasicDBObject;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ListingsAndReviewsService {
    @Autowired
    ListingsAndReviewsRepository listingsAndReviewsRepository;


//    public MongoCollection hsob(){
//        MongoClientURI hsobdb = new MongoClientURI(
//                "mongodb+srv://laranjazda:bros2011@h-s-o-b.5b97q.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
//        MongoClient hsobdbURI = new MongoClient(hsobdb);
//
//        MongoDatabase dataBase = hsobdbURI.getDatabase("sample_airbnb");
//        MongoCollection<Document> collection = dataBase.getCollection("listingsAndReviews");
//
//        return collection;
//    }

    public Object getById(String _id){

//        MongoCollection airbnb = hsob();
//
//        ListingsAndReviews body = listingsAndReviews;
//
//        BasicDBObject query = new BasicDBObject("_id", _id);
//        BasicDBObject projection = new BasicDBObject("listing_url", body.getListing_url())
//                .append("last_scraped", body.getLast_scraped())
//                .append("images", body.getImages());
//
//        return airbnb.find(projection).first();

        return listingsAndReviewsRepository.findById(_id);
    }
}
