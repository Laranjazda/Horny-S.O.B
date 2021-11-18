package com.hsob.HornySOB.model;

public class ListingsAndReviews {
    public String _id;
    public String listing_url;
    public String name;

    public ListingsAndReviews() {
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

    public String get_id() {
        return _id;
    }

    public void set_id(String _id) {
        this._id = _id;
    }
}
