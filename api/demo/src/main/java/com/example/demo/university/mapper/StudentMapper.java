package com.example.demo.university.mapper;

import com.example.demo.university.dto.StudentRequest;
import com.example.demo.university.dto.StudentResponse;
import com.example.demo.university.model.Department;
import com.example.demo.university.model.Student;

public  class StudentMapper {
    public Student toEntity(
            StudentRequest request,
            Department department
    ){
        Student student = new Student();
        student.setStudentNumber(request.studentNumber());
        student.setFirstname(request.firstName());
        student.setLastname(request.lastName());
        student.setEmail(request.email());
        student.setPhone(request.phone());
        student.setDepartment(department);
        student.setDateOfBirth(request.dateOfBirth());
        return student;
    }

    public StudentResponse toResponse(Student student){
        Department department = student.getDepartment();
        return new StudentResponse(
                student.getId(),
                student.getFirstname(),
                student.getLastname(),
                student.getEmail(),
                student.getPhone(),
                student.getEnrollmentDate(),
                student.getDateOfBirth(),
                student.getStatus(),

                department !=null ? department.getId() : null,
                department != null ? department.getName() : null
        );
    }
}