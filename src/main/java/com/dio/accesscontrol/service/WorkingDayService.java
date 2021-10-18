package com.dio.accesscontrol.service;

import com.dio.accesscontrol.model.WorkingDay;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dio.accesscontrol.repository.WorkingDayRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;
import java.util.Optional;

@Service
public class WorkingDayService {

    WorkingDayRepository  workingDayRepository;
    @Autowired
    public  WorkingDayService(WorkingDayRepository workingDayRepository){
        this.workingDayRepository = workingDayRepository;
    }

    public WorkingDay saveWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public List<WorkingDay> findAll(){
        return  workingDayRepository.findAll();
    }

    public Optional<WorkingDay> getById(long idWorkingDay){
        return  workingDayRepository.findById(idWorkingDay);
    }

    public WorkingDay updateWorkingDay(WorkingDay workingDay){
        return workingDayRepository.save(workingDay);
    }

    public void deleteWorkingDay(long id){
         workingDayRepository.deleteById(id);
    }

}
