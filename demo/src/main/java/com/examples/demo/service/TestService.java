package com.examples.demo.service;

import com.examples.demo.model.Org;
import com.examples.demo.repository.OrgRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TestService {

    @Autowired
    OrgRepo orgRepo;

    public List<Org> getOrg() {
        return orgRepo.findAll();
    }
}
