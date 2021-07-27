package com.shopping.service;


import com.shopping.entity.Drugs;
import com.shopping.entity.DrugsRepository;
import com.shopping.entity.Url;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class DrugsService {

@Autowired
    private DrugsRepository drugsRepository;

    public List Allitems() {

        //Drugs drugs = drugsRepository.findById(id).orElse(null);
        List<Drugs> urllist = drugsRepository.findAll();


        return urllist;
    }
}
