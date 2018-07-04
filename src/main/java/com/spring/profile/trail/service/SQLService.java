package com.spring.profile.trail.service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

@Service
@Profile({"sql"})
public class SQLService implements DBService {

    @Override
    public String getDB() {
        return "sql";
    }
}
