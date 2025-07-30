package com.example.smarthome;

import org.springframework.stereotype.Component;

@Component
public class User {
    private String name = "Sinchana";
    private String homeId = "H123";

    public String getName() {
        return name;
    }

    public String getHomeId() {
        return homeId;
    }
}
