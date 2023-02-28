package com.example.restmappings;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
public class TestController {
    @GetMapping("/hello")
    public ResponseEntity<String> getHello() {
        return ResponseEntity.ok("hello");
    }

    @GetMapping("/query-param")
    @ApiResponse(description = "unable to process request param")
    public ResponseEntity<String> getRequestParam(@RequestParam Request body) {
        log.info(body.toString());
        return ResponseEntity.ok().build();
    }

    @GetMapping("/request-body")
    @ApiResponse(description = "unable to process request body")
    public ResponseEntity<String> getRequestBody(@RequestBody Request body) {
        log.info(body.toString());
        return ResponseEntity.ok().build();
    }

    @PostMapping("/")
    @ApiResponse(description = "Can send request with empty json as body i.e. {}. Any field can be null and it will return null for that field.")
    public ResponseEntity<Request> post(@RequestBody Request body) {
        log.info(body.toString());
        return ResponseEntity.ok(body);
    }

    @PatchMapping("/")
    @ApiResponse(description = "Can send request with empty json as body i.e. {}. Any field can be null and it will return null for that field.")
    public ResponseEntity<Request> patch(@RequestBody Request body) {
        log.info(body.toString());
        return ResponseEntity.ok(body);
    }

    @PutMapping("/")
    @ApiResponse(description = "Can send request with empty json as body i.e. {}. Any field can be null and it will return null for that field.")
    public ResponseEntity<Request> put(@RequestBody Request body) {
        log.info(body.toString());
        return ResponseEntity.ok(body);
    }
    @DeleteMapping("/")
    @ApiResponse(description = "Can send request with empty json as body i.e. {}. Any field can be null and it will return null for that field.")
    public ResponseEntity<Request> delete(@RequestBody Request body) {
        log.info(body.toString());
        return ResponseEntity.ok(body);
    }
}
