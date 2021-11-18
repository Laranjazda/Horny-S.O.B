package com.hsob.HornySOB.service;

import com.hsob.HornySOB.repository.ListingsAndReviewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class ListingsAndReviewsService {
    @Autowired
    ListingsAndReviewsRepository listingsAndReviewsRepository;

    public Object getById(String _id){
        return listingsAndReviewsRepository.findById(_id);
    }
}
