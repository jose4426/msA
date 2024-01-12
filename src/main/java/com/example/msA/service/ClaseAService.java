package com.example.msA.service;

import com.example.msA.entitys.ClassA;
import com.example.msA.repository.ClassARepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ClaseAService {
    final ClassARepository repository;

    public List<ClassA> findAll(){
        return repository.findAll();
    }

    public ClassA save( ClassA classA){
        return repository.save(classA);
    }

}
