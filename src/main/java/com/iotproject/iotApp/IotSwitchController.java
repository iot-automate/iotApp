package com.iotproject.iotApp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IotSwitchController {

    @RequestMapping("/switch")
    public String onSWTrigger(){
        return "Triggering";
    }
}
