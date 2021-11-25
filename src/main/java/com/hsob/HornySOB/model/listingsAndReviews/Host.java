package com.hsob.HornySOB.model.listingsAndReviews;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Host {
    private String host_id;
    private String host_url;
    private String host_name;
    private String host_location;
    private String host_about;
    private String host_thumbnail_url;
    private String host_picture_url;
    private String host_neighbourhood;

    private Boolean host_is_superhost;
    private Boolean host_has_profile_pic;
    private Boolean host_identity_verified;

    private int host_listings_count;
    private int host_total_listings_count;

    private String[] host_verifications;

    private Host()  {/* empty constructor */}

}
