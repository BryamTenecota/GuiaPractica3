package com.mongo.estudiantes.Service;


import com.mongo.estudiantes.model.Student;

import java.util.List;

public interface ServiceStudent extends GenericService<Student, String>{
    public List<Student> findAll();

    public Student findByAndStudentNumber(Long number_student);

    public Student findByEmail(String email);

    public List<Student> findAllByOrderByGpa();

}
