package com.example.demo.university.model;

import jakarta.annotation.Nullable;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;


@Entity
@Table(name="Students")
@Getter
@Setter
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String studentNumber;

    @Column(nullable = false)
    private String fristname;

    @Column(nullable = false)
    private String lastname;

    @Column(nullable = false)
   private StudentStatus status =StudentStatus.ACTIVE;

    @Column(unique = true)
    private String email;
    private String adress;
    private String phone;

    private LocalDate enrollmentDate =LocalDate.now();

     @ManyToOne(fetch = FetchType.LAZY)
     @JoinColumn(name = "department_id")
     private Department department;


}
