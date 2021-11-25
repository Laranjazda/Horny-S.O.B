package com.hsob.HornySOB.model.listingsAndReviews;


import com.mongodb.BasicDBObject;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Setter
@Getter
@Document(collection = "listingsAndReviews")
public class ListingsAndReviews {
    private String _id;
    private String listing_url;
    private String name;
    private String house_rules;
    private String neighborhood_overview;
    private String property_type;
    private String room_type;
    private String bed_type;
    private String minimum_nights;
    private String maximum_nights;
    private String cancellation_policy;

    private Date last_scraped;
    private Date calendar_last_scraped;
    private Date first_review;
    private Date last_review;

    private int accommodates;
    private int bedrooms;
    private int beds;
    private int number_of_reviews;
    private double bathrooms;

    private String[] amenities;

    private double price;
    private double cleaning_fee;
    private double extra_people;
    private double guests_included;

    private Images images;
    private Host host;
    private Address address;
    private Availability availability;
    private Review_scores review_scores;

    public ListingsAndReviews() {/* empty constructor */}
    public ListingsAndReviews(BasicDBObject query, BasicDBObject projection) {

    }

    @Getter
    @Setter
    public class Availability{
        private String availability_30;
        private String availability_60;
        private String availability_90;
        private String availability_365;

        private Availability() {/* empty constructor */}
    }

    @Getter
    @Setter
    public class Review_scores{
        private int review_scores_accuracy;
        private int review_scores_cleanliness;
        private int review_scores_checkin;
        private int review_scores_communication;
        private int review_scores_location;
        private int review_scores_value;
        private int review_scores_rating;

        private Review_scores() {/* empty constructor */}
    }
}
