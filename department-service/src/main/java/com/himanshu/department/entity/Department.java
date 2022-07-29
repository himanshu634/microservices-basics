package com.himanshu.department.entity;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Data
public class Department {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long departmentId;
    private String departmentName;
    private String departmentAddress;
    private String departmentCode;
}
