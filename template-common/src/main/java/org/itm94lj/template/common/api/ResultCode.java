package org.itm94lj.template.common.api;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * 枚举一些API常用的错误类型码
 */
@Getter
@AllArgsConstructor
public enum ResultCode implements IErrorCode {
    SUCCESS(200, "操作成功"),
    FAILED(500, "操作失败"),
    VALIDATE_FAILED(404, "参数检验失败"),
    UNAUTHORIZED(401, "暂未登录或token已过期"),
    FORBIDDEN(403, "没有相关权限")
    ;

    private long code;
    private String message;
}
