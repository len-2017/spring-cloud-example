package com.panjin.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@Getter
@AllArgsConstructor
public enum CustomerStatusEnum {

    INIT(0, "初始化"),
    ENABLE(1, "启用"),
    DISABLE(2, "禁用");

    private int code;
    private String message;

    public static CustomerStatusEnum getEnum(int code) {
        for (CustomerStatusEnum item : CustomerStatusEnum.values()) {
            if (item.getCode() == code) {
                return item;
            }
        }
        return null;
    }

}
