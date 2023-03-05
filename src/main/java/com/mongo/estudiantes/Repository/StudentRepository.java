package com.mongo.estudiantes.Repository;

import com.mongo.estudiantes.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends MongoRepository<Student, String> {
    public Student findByAndStudentNumber(Long number_student);

    public Student findByEmail(String email);

    public List<Student> findAllByOrderByGpa();
}
