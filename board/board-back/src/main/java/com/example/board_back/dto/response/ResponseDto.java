package com.example.board_back.dto.response;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.board_back.common.ResponseMessage;
import com.example.board_back.common.ResponseCode;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class ResponseDto {

    private String code;
    private String massage;

    public static ResponseEntity<ResponseDto> databaseError() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.DATABASE_ERROR, ResponseMessage.DATABASE_ERROR);
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(responseBody);
    }

    public static ResponseEntity<ResponseDto> validationFailed() {
        ResponseDto responseBody = new ResponseDto(ResponseCode.VALIDATION_FAILED, ResponseMessage.VALIDATION_FAILED);
        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(responseBody);
    }
}
