package com.examples.demo.feign;


import com.examples.demo.model.Org;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@FeignClient(name = "demo", url = "http://localhost:8081/api-v1")
public interface OrgClient {
    @GetMapping("/get")
    ResponseEntity<List<Org>> getOrgs();
}
