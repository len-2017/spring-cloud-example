package com.panjin.dto.response;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@Getter
@Setter
@ToString
public class CustomerRespDTO {

    private Long customerId;
    private String customerName;
}
