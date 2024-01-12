package com.example.msA.feign;


import org.springframework.cloud.openfeign.FeignClient;

@FeignClient(name = "ejemplo-service")
public interface StoreClient {
}
