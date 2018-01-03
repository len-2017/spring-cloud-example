package com.panjin.dto.reqeust;

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
public class CustomerReqDTO {

    private String thirdUserNo;
    private String thirdUserName;
    private String phoneNo;
}
