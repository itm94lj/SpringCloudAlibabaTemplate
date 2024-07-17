package org.itm94lj.template.common.exception;

import org.itm94lj.template.common.api.IErrorCode;

/**
 * 断言处理类，用于抛出各种API处理的异常
 */
public class Asserts {
    public static void fail(String message) {
        throw new ApiException(message);
    }

    public static void fail(IErrorCode errorCode) {
        throw new ApiException(errorCode);
    }
}
