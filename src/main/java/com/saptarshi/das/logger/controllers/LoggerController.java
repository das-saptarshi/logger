package com.saptarshi.das.logger.controllers;

import com.saptarshi.das.logger.dtos.responses.GenericResponse;
import com.saptarshi.das.logger.models.Log;
import com.saptarshi.das.logger.repositories.LogRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/logger")
public class LoggerController {
    private final LogRepository logRepository;

    @PostMapping("/log")
    public GenericResponse addLog(@RequestBody final Log log) {
        final Log savedLog = this.logRepository.save(log);
        return GenericResponse.builder()
                .logId(savedLog.getId())
                .message("Log saved successfully.")
                .status(HttpStatus.OK.name())
                .build();
    }

    @GetMapping("/query")
    public List<Log> getLogs() {
        return this.logRepository.findAll();
    }
}
