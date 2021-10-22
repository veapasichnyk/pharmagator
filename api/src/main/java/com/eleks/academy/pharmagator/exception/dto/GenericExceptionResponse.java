package com.eleks.academy.pharmagator.exception.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class GenericExceptionResponse {

    @Builder.Default()
    private LocalDateTime timestamp = LocalDateTime.now();

    private String error;
    private String message;
    private Integer status;
}