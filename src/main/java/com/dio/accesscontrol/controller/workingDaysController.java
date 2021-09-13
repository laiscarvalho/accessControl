package com.dio.accesscontrol.controller;

import com.dio.accesscontrol.model.WorkingDay;
import com.dio.accesscontrol.service.WorkingDayService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workingDays")
public class workingDaysController {
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay){
        return workingDayService.saveWorkingDay(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getWorkingDayList(long id){
        return workingDayService.findAll();
    }

    @GetMapping("/{idWorkingDay}")
    public ResponseEntity<WorkingDay> getWorkingDayById(@PathVariable("idWorkingDay") long idWorkingDay) throws Exception {
        return ResponseEntity.ok(workingDayService.getById(idWorkingDay)
                .orElseThrow(()-> new Exception("working day not found")));
    }

    @PutMapping
    public WorkingDay updateWorkingDay(@RequestBody WorkingDay workingDay){
        return workingDayService.saveWorkingDay(workingDay);
    }

}
