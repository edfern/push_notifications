package com.defv.pushnotifications.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("notifications")
public class NotificationsController {

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<?> testing(){
        return new ResponseEntity<>("Hey!", HttpStatus.OK);
    }
}
