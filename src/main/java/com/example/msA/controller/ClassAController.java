package com.example.msA.controller;

import com.example.msA.entitys.ClassA;
import com.example.msA.feign.StoreClient;
import com.example.msA.model.ClassB;
import com.example.msA.service.ClaseAService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequiredArgsConstructor
@RequestMapping("/api")
public class ClassAController  {
    final ClaseAService service;
    private final StoreClient storeClient;

    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClassA> findAll() {
        List<ClassA> response = service.findAll();
        return response;
    }
    @PostMapping(value = "/save", produces = MediaType.APPLICATION_JSON_VALUE,
                                consumes = MediaType.APPLICATION_JSON_VALUE)
    public ClassA save(@RequestBody ClassA ClassA){
        return service.save(ClassA);
    }
    @GetMapping(value = "/b", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<ClassB> findAllB() {
        List<ClassB> response = storeClient.findAllMsB();
        return response;
    }

}
