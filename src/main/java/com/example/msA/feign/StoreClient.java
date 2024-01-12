package com.example.msA.feign;

import com.example.msA.conf.FeignClientConfig;
import com.example.msA.model.ClassB;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "msB", url = "http://localhost:8081/api" , configuration = FeignClientConfig.class)
public interface StoreClient {
    @GetMapping(value = "", produces = MediaType.APPLICATION_JSON_VALUE)
    List<ClassB> findAllMsB();
}
