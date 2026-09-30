package com.example.demo.university.service;

import com.example.demo.university.dto.StudentRequest;
import com.example.demo.university.dto.StudentResponse;
import com.example.demo.university.exception.ResourceNotFoundException;
import com.example.demo.university.mapper.StudentMapper;
import com.example.demo.university.model.Department;
import com.example.demo.university.model.Student;
import com.example.demo.university.repository.DepartmentRepository;
import com.example.demo.university.repository.StudentRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private  final StudentRepository studentRepository;
    private final DepartmentRepository departmentRepository;
    private final StudentMapper mapper;

  public StudentService(StudentRepository repository,DepartmentRepository departmentRepository,StudentMapper mapper){
      this.studentRepository=repository;
      this.departmentRepository=departmentRepository;
      this.mapper=mapper;
  }

  @Transactional
  public StudentResponse findById(Long id){
      Student student = findEntity(id);
      return mapper.toResponse(student);
  }

  @Transactional
   public StudentResponse create(StudentRequest request){
        Department department = departmentRepository
                .findById(request.departmentId())
                .orElseThrow( ()->new ResourceNotFoundException("Department Not found"));

        Student student =mapper.toEntity(request,department);
        return mapper.toResponse(studentRepository.save(student));
   }

    @Transactional
   public List<StudentResponse> findAll() {
         return studentRepository.findAll().stream().map(mapper::toResponse).toList();
   }

    @Transactional
    public StudentResponse update(Long id,StudentRequest request){
        Student student = findEntity(id);
        Department department =departmentRepository
                .findById(request.departmentId())
                .orElseThrow(()-> new ResourceNotFoundException("Department not found"));

        mapper.updateEntity(student,request,department);
         Student updatedStudent = studentRepository.save(student);

         return mapper.toResponse(updatedStudent);
    }

    @Transactional
    public void delete(Long id){
       Student student = findEntity(id);
       studentRepository.delete(student);
    }



    private Student findEntity(long id){
        return studentRepository.findById(id).orElseThrow(()-> new ResourceNotFoundException("Student Not found"));

    }


}
