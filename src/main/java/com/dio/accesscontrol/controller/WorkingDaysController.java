package com.dio.accesscontrol.controller;

import com.dio.accesscontrol.model.WorkingDay;
import com.dio.accesscontrol.service.WorkingDayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/workingDays")
public class WorkingDaysController {

    @Autowired
    WorkingDayService workingDayService;

    @PostMapping
    public WorkingDay createWorkingDay(@RequestBody WorkingDay workingDay){
        return workingDayService.saveWorkingDay(workingDay);
    }

    @GetMapping
    public List<WorkingDay> getWorkingDayList(){
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

    @DeleteMapping("/{idWorkingDay}")
    public HttpStatus deleteWorkingDayById(@PathVariable("idWorkingDay") long idWorkingDay) {
      try {
          workingDayService.deleteWorkingDay(idWorkingDay);
      }catch (Exception e){
          System.out.println(e.getMessage());
      }
        return HttpStatus.OK;
    }

}
