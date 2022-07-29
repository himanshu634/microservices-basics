package com.himanshu.department.service;

import com.himanshu.department.entity.Department;
import com.himanshu.department.repository.DepartmentRepository;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.slf4j.Logger;

@Service
public class DepartmentService {
    private static final Logger log = LoggerFactory.getLogger(DepartmentService.class);
    @Autowired
    private DepartmentRepository departmentRepository;

    public Department saveDepartment(Department department){
        log.info("In saveDepartment method in departmentService");
        return departmentRepository.save(department);
    }

    public Department getDepartmentById(Long id){
        log.info("In get department method of department service");
        return departmentRepository.findByDepartmentId(id);
    }
}
