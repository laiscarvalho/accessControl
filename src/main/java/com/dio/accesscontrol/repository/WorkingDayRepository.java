package com.dio.accesscontrol.repository;

import com.dio.accesscontrol.model.WorkingDay;
import org.springframework.data.jpa.repository.JpaRepository;

public  interface WorkingDayRepository extends JpaRepository<WorkingDay, Long> {
}
