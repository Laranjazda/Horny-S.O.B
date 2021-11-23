package com.hsob.HornySOB.model.listingsAndReviews;


import java.util.Date;


public class ListingsAndReviews {
    public String _id;
    public String listing_url;
    public String name;
    public String house_rules;
    public String neighborhood_overview;
    public String property_type;
    public String room_type;
    public String bed_type;
    public String minimum_nights;
    public String maximum_nights;
    public String cancellation_policy;

    public Date last_scraped;
    public Date calendar_last_scraped;
    public Date first_review;
    public Date last_review;

    public int accommodates;
    public int bedrooms;
    public int beds;
    public int number_of_reviews;
    public double bathrooms;

    public String[] amenities;
//
    public double price;
    public double cleaning_fee;
    public double extra_people;
    public double guests_included;

    public Images images;
    public Host host;
    public Address address;
    public Availability availability;
    public Review_scores review_scores;

    public ListingsAndReviews() {
    }

    public class Availability{
        public String availability_30;
        public String availability_60;
        public String availability_90;
        public String availability_365;

        public Availability() {
        }

        public String getAvailability_30() {
            return availability_30;
        }

        public void setAvailability_30(String availability_30) {
            this.availability_30 = availability_30;
        }

        public String getAvailability_60() {
            return availability_60;
        }

        public void setAvailability_60(String availability_60) {
            this.availability_60 = availability_60;
        }

        public String getAvailability_90() {
            return availability_90;
        }

        public void setAvailability_90(String availability_90) {
            this.availability_90 = availability_90;
        }

        public String getAvailability_365() {
            return availability_365;
        }

        public void setAvailability_365(String availability_365) {
            this.availability_365 = availability_365;
        }
    }

    public class Review_scores{
        public int review_scores_accuracy;
        public int review_scores_cleanliness;
        public int review_scores_checkin;
        public int review_scores_communication;
        public int review_scores_location;
        public int review_scores_value;
        public int review_scores_rating;

        public Review_scores() {
        }

        public int getReview_scores_accuracy() {
            return review_scores_accuracy;
        }

        public void setReview_scores_accuracy(int review_scores_accuracy) {
            this.review_scores_accuracy = review_scores_accuracy;
        }

        public int getReview_scores_cleanliness() {
            return review_scores_cleanliness;
        }

        public void setReview_scores_cleanliness(int review_scores_cleanliness) {
            this.review_scores_cleanliness = review_scores_cleanliness;
        }

        public int getReview_scores_checkin() {
            return review_scores_checkin;
        }

        public void setReview_scores_checkin(int review_scores_checkin) {
            this.review_scores_checkin = review_scores_checkin;
        }

        public int getReview_scores_communication() {
            return review_scores_communication;
        }

        public void setReview_scores_communication(int review_scores_communication) {
            this.review_scores_communication = review_scores_communication;
        }

        public int getReview_scores_location() {
            return review_scores_location;
        }

        public void setReview_scores_location(int review_scores_location) {
            this.review_scores_location = review_scores_location;
        }

        public int getReview_scores_value() {
            return review_scores_value;
        }

        public void setReview_scores_value(int review_scores_value) {
            this.review_scores_value = review_scores_value;
        }

        public int getReview_scores_rating() {
            return review_scores_rating;
        }

        public void setReview_scores_rating(int review_scores_rating) {
            this.review_scores_rating = review_scores_rating;
        }
    }

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }

    public String getListing_url() {
        return listing_url;
    }

    public void setListing_url(String listing_url) {
        this.listing_url = listing_url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHouse_rules() {
        return house_rules;
    }

    public void setHouse_rules(String house_rules) {
        this.house_rules = house_rules;
    }

    public String getNeighborhood_overview() {
        return neighborhood_overview;
    }

    public void setNeighborhood_overview(String neighborhood_overview) {
        this.neighborhood_overview = neighborhood_overview;
    }

    public String getProperty_type() {
        return property_type;
    }

    public void setProperty_type(String property_type) {
        this.property_type = property_type;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getBed_type() {
        return bed_type;
    }

    public void setBed_type(String bed_type) {
        this.bed_type = bed_type;
    }

    public String getMinimum_nights() {
        return minimum_nights;
    }

    public void setMinimum_nights(String minimum_nights) {
        this.minimum_nights = minimum_nights;
    }

    public String getMaximum_nights() {
        return maximum_nights;
    }

    public void setMaximum_nights(String maximum_nights) {
        this.maximum_nights = maximum_nights;
    }

    public String getCancellation_policy() {
        return cancellation_policy;
    }

    public void setCancellation_policy(String cancellation_policy) {
        this.cancellation_policy = cancellation_policy;
    }

    public Date getLast_scraped() {
        return last_scraped;
    }

    public void setLast_scraped(Date last_scraped) {
        this.last_scraped = last_scraped;
    }

    public Date getCalendar_last_scraped() {
        return calendar_last_scraped;
    }

    public void setCalendar_last_scraped(Date calendar_last_scraped) {
        this.calendar_last_scraped = calendar_last_scraped;
    }

    public Date getFirst_review() {
        return first_review;
    }

    public void setFirst_review(Date first_review) {
        this.first_review = first_review;
    }

    public Date getLast_review() {
        return last_review;
    }

    public void setLast_review(Date last_review) {
        this.last_review = last_review;
    }

    public int getAccommodates() {
        return accommodates;
    }

    public void setAccommodates(int accommodates) {
        this.accommodates = accommodates;
    }

    public int getBedrooms() {
        return bedrooms;
    }

    public void setBedrooms(int bedrooms) {
        this.bedrooms = bedrooms;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }

    public int getNumber_of_reviews() {
        return number_of_reviews;
    }

    public void setNumber_of_reviews(int number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }

    public double getBathrooms() {
        return bathrooms;
    }

    public void setBathrooms(double bathrooms) {
        this.bathrooms = bathrooms;
    }

    public String[] getAmenities() {
        return amenities;
    }

    public void setAmenities(String[] amenities) {
        this.amenities = amenities;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getCleaning_fee() {
        return cleaning_fee;
    }

    public void setCleaning_fee(double cleaning_fee) {
        this.cleaning_fee = cleaning_fee;
    }

    public double getExtra_people() {
        return extra_people;
    }

    public void setExtra_people(double extra_people) {
        this.extra_people = extra_people;
    }

    public double getGuests_included() {
        return guests_included;
    }

    public void setGuests_included(double guests_included) {
        this.guests_included = guests_included;
    }

    public Images getImages() {
        return images;
    }

    public void setImages(Images images) {
        this.images = images;
    }

    public Host getHost() {
        return host;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Availability getAvailability() {
        return availability;
    }

    public void setAvailability(Availability availability) {
        this.availability = availability;
    }

    public Review_scores getReview_scores() {
        return review_scores;
    }

    public void setReview_scores(Review_scores review_scores) {
        this.review_scores = review_scores;
    }
}
