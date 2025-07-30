package com.example.smarthome;

import org.springframework.stereotype.Component;

@Component
public class Device {
    private String deviceType = "Light";
    private String status = "Off";

    public String getDeviceType() {
        return deviceType;
    }

    public String getStatus() {
        return status;
    }

    public void turnOn() {
        status = "On";
        System.out.println(deviceType + " is turned ON.");
    }

    public void turnOff() {
        status = "Off";
        System.out.println(deviceType + " is turned OFF.");
    }
}
