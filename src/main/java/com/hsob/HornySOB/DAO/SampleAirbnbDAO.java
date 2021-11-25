package com.hsob.HornySOB.DAO;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class SampleAirbnbDAO {
    MongoClientURI uri = new MongoClientURI("mongodb+srv://laranjazda:bros2011@h-s-o-b.5b97q.mongodb.net/myFirstDatabase?retryWrites=true&w=majority");
    MongoClient mongoClient = new MongoClient(uri);
    MongoDatabase SampleAirbnbDB = mongoClient.getDatabase("sample_airbnb");
    MongoCollection<Document> listingsAndReviewsCollection = SampleAirbnbDB.getCollection("listingsAndReviews");




    public MongoCollection<Document> SampleAirbnbDAO() {
        return listingsAndReviewsCollection;
    }

    public MongoCollection<Document> getListingsAndReviewsCollection() {
        return listingsAndReviewsCollection;
    }

    public void setListingsAndReviewsCollection(MongoCollection<Document> listingsAndReviewsCollection) {
        this.listingsAndReviewsCollection = listingsAndReviewsCollection;
    }

    public MongoClient getMongoClient() {
        return mongoClient;
    }

    public void setMongoClient(MongoClient mongoClient) {
        this.mongoClient = mongoClient;
    }

    public MongoDatabase getSampleAirbnbDB() {
        return SampleAirbnbDB;
    }

    public void setSampleAirbnbDB(MongoDatabase sampleAirbnbDB) {
        SampleAirbnbDB = sampleAirbnbDB;
    }
}
