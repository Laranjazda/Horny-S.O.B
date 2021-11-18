package com.hsob.HornySOB.controllers;

import com.hsob.HornySOB.service.ListingsAndReviewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/reviews")
public class ListingsAndReviewsController {
    @Autowired
    ListingsAndReviewsService listingsAndReviewsService;

    @GetMapping
    public Object getReviews(@RequestParam String _id){
        return listingsAndReviewsService.getById(_id);
    }


}
