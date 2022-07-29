package com.himanshu.department.controller;

import com.himanshu.department.entity.Department;
import com.himanshu.department.service.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private static final Logger log = LoggerFactory.getLogger(DepartmentController.class);
    @Autowired
    private DepartmentService departmentService;

    @PostMapping("/save")
    public Department saveDepartment(@RequestBody Department department) {
        log.info("In the save department method in DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/get/{id}")
    public Department getDepartment(@PathVariable("id") Long id){
        log.info("In get department method of department controller");
        return departmentService.getDepartmentById(id);
    }

}
