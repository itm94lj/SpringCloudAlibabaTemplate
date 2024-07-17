package org.itm94lj.template.common.exception;

import lombok.Getter;
import org.itm94lj.template.common.api.IErrorCode;

/**
 * 自定义的API异常
 */
@Getter
public class ApiException extends RuntimeException{
    private IErrorCode errorCode;

    public ApiException(IErrorCode errorCode) {
        super(errorCode.getMessage());
        this.errorCode = errorCode;
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }
}
