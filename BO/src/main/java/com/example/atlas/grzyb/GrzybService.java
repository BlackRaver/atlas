package com.example.atlas.grzyb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GrzybService {

    @Autowired
    private GrzybRepository grzybRepository;

    public List getAllGrzyby() {
        return grzybRepository.findAll();
    }

}
