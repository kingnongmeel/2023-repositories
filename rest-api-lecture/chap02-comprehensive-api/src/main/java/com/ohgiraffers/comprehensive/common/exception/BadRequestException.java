package com.ohgiraffers.comprehensive.common.exception;

import com.ohgiraffers.comprehensive.common.exception.type.ExceptionCode;
import lombok.Getter;

@Getter
public class BadRequestException extends CustomException {
    public BadRequestException(final ExceptionCode exceptionCode) {
        super(exceptionCode);
    }
}
