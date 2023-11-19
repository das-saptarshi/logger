package com.saptarshi.das.logger.controllers;

import com.saptarshi.das.logger.dtos.LogDto;
import com.saptarshi.das.logger.dtos.responses.GenericResponse;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/logger")
public class LoggerController {

    @PostMapping("/log")
    public GenericResponse addLog(@RequestBody final LogDto log) {
        return GenericResponse.builder().build();
    }

    @GetMapping("/query")
    public List<LogDto> getLogs() {
        return Collections.emptyList();
    }
}
