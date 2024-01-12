package com.example.msA.repository;

import com.example.msA.entitys.ClassA;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClassARepository extends JpaRepository<ClassA,Long> {
}
