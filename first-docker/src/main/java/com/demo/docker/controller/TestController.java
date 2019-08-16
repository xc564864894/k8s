package com.demo.docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.Map;

@RestController
public class TestController {

    @Value("${app.version}")
    private String version;

    @RequestMapping("hello")
    public Map<String, String> hello() throws UnknownHostException {
        Map<String, String> map = new HashMap<>();
        map.put("version", version);
        map.put("ip", InetAddress.getLocalHost().toString());
        return map;
    }

}
