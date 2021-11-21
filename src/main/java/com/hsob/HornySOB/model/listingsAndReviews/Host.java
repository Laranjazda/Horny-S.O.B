package com.hsob.HornySOB.model.listingsAndReviews;

public class Host {
    public String host_id;
    public String host_url;
    public String host_name;
    public String host_location;
    public String host_about;
    public String host_thumbnail_url;
    public String host_picture_url;
    public String host_neighbourhood;

    public Boolean host_is_superhost;
    public Boolean host_has_profile_pic;
    public Boolean host_identity_verified;

    public int host_listings_count;
    public int host_total_listings_count;

    public String[] host_verifications;

    public Host() {
    }

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getHost_url() {
        return host_url;
    }

    public void setHost_url(String host_url) {
        this.host_url = host_url;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getHost_location() {
        return host_location;
    }

    public void setHost_location(String host_location) {
        this.host_location = host_location;
    }

    public String getHost_about() {
        return host_about;
    }

    public void setHost_about(String host_about) {
        this.host_about = host_about;
    }

    public String getHost_thumbnail_url() {
        return host_thumbnail_url;
    }

    public void setHost_thumbnail_url(String host_thumbnail_url) {
        this.host_thumbnail_url = host_thumbnail_url;
    }

    public String getHost_picture_url() {
        return host_picture_url;
    }

    public void setHost_picture_url(String host_picture_url) {
        this.host_picture_url = host_picture_url;
    }

    public String getHost_neighbourhood() {
        return host_neighbourhood;
    }

    public void setHost_neighbourhood(String host_neighbourhood) {
        this.host_neighbourhood = host_neighbourhood;
    }

    public Boolean getHost_is_superhost() {
        return host_is_superhost;
    }

    public void setHost_is_superhost(Boolean host_is_superhost) {
        this.host_is_superhost = host_is_superhost;
    }

    public Boolean getHost_has_profile_pic() {
        return host_has_profile_pic;
    }

    public void setHost_has_profile_pic(Boolean host_has_profile_pic) {
        this.host_has_profile_pic = host_has_profile_pic;
    }

    public Boolean getHost_identity_verified() {
        return host_identity_verified;
    }

    public void setHost_identity_verified(Boolean host_identity_verified) {
        this.host_identity_verified = host_identity_verified;
    }

    public int getHost_listings_count() {
        return host_listings_count;
    }

    public void setHost_listings_count(int host_listings_count) {
        this.host_listings_count = host_listings_count;
    }

    public int getHost_total_listings_count() {
        return host_total_listings_count;
    }

    public void setHost_total_listings_count(int host_total_listings_count) {
        this.host_total_listings_count = host_total_listings_count;
    }

    public String[] getHost_verifications() {
        return host_verifications;
    }

    public void setHost_verifications(String[] host_verifications) {
        this.host_verifications = host_verifications;
    }
}
