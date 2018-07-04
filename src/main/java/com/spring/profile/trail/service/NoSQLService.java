package com.spring.profile.trail.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"nosql"})
public class NoSQLService implements DBService {


    @Override
    public String getDB() {
        return "mongo";
    }
}
