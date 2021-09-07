package com.dio.accesscontrol.controller;

import com.dio.accesscontrol.model.WorkingDay;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/workingDays")
public class workingDaysController {

    @PostMapping
    public WorkingDay createWorkingDay(){
        return null;
    }
}
