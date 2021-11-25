package com.hsob.HornySOB.model.listingsAndReviews;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Images {
    private String thumbnail_url;
    private String medium_url;
    private String picture_url;
    private String xl_picture_url;

    private Images()  {/* empty constructor */}

}
