package com.panjin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@Getter
@AllArgsConstructor
public enum AccountStatusEnum {

    DISABLE(0, "禁用"),
    ENABLE(1, "启用");

    private int code;
    private String message;

    public static AccountStatusEnum getEnum(int code) {
        for (AccountStatusEnum item : AccountStatusEnum.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }
}
