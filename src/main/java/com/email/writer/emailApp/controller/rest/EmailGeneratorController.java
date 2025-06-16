package com.email.writer.emailApp.controller.rest;


import com.email.writer.emailApp.business.EmailGeneratorService;
import com.email.writer.emailApp.domain.EmailRequest;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/email")
@AllArgsConstructor
@CrossOrigin(origins = "*")
@Slf4j
public class EmailGeneratorController {

    private final EmailGeneratorService emailGeneratorService;

    @PostMapping("/generate")
    public ResponseEntity<String> generateEmail(@RequestBody EmailRequest emailRequest) {
        log.info( "request bode --------->>>>" + emailRequest.toString());
        String response = emailGeneratorService.generateEmailReply(emailRequest);
        return ResponseEntity.ok(response);
    }
}
