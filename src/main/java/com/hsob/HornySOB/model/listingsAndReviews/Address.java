package com.hsob.HornySOB.model.listingsAndReviews;

public class Address {
    public String street;
    public String suburb;
    public String government_area;
    public String market;
    public String country;
    public String country_code;
    public Location location;

    public Address() {
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getSuburb() {
        return suburb;
    }

    public void setSuburb(String suburb) {
        this.suburb = suburb;
    }

    public String getGovernment_area() {
        return government_area;
    }

    public void setGovernment_area(String government_area) {
        this.government_area = government_area;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public class Location{
        public String type;
        public String[] coordinates;
        public Boolean is_location_exact;

        public Location() {
        }

        public String getType() {
            return type;
        }

        public void setType(String type) {
            this.type = type;
        }

        public String[] getCoordinates() {
            return coordinates;
        }

        public void setCoordinates(String[] coordinates) {
            this.coordinates = coordinates;
        }

        public Boolean getIs_location_exact() {
            return is_location_exact;
        }

        public void setIs_location_exact(Boolean is_location_exact) {
            this.is_location_exact = is_location_exact;
        }
    }
}
