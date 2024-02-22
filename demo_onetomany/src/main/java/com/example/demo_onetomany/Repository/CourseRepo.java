package com.example.demo_onetomany.Repository;

import com.example.demo_onetomany.Entity.Courses;
import com.sun.jdi.connect.Connector;
import org.hibernate.Internal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepo extends JpaRepository<Courses,Integer> {

}
