package com.hsob.HornySOB.controllers;

import com.hsob.HornySOB.DAO.SampleAirbnbDAO;
import com.hsob.HornySOB.model.listingsAndReviews.ListingsAndReviews;
import com.hsob.HornySOB.service.ListingsAndReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/reviews")
public class ListingsAndReviewsController {
    @Autowired
    ListingsAndReviewsService listingsAndReviewsService;

    @GetMapping
    public Object getReviews(@RequestParam String id){

        return listingsAndReviewsService.getById(id);
    }

    @GetMapping("/range")
    public List<ListingsAndReviews> getPlaceByBedrooms(
            @RequestParam("min") Integer min,
            @RequestParam("max") Integer max){
        return listingsAndReviewsService.getPlaceByBedrooms(min, max);
    }




}
