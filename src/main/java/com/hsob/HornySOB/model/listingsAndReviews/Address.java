package com.hsob.HornySOB.model.listingsAndReviews;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Address {
    private String street;
    private String suburb;
    private String government_area;
    private String market;
    private String country;
    private String country_code;
    private Location location;

    private Address() {/* empty constructor */}

    @Getter
    @Setter
    private class Location{
        private String type;
        private String[] coordinates;
        private Boolean is_location_exact;

        private Location() {/* empty constructor */}
    }
}

