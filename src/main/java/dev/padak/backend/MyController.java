package dev.padak.backend;

import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Validated
public class MyController {

    @PostMapping("/api/myendpoint")
    public ResponseEntity<?> handleRequest(@Valid @RequestBody MyRequest request) {
        return ResponseEntity.ok("Request received successfully!");
    }
}
