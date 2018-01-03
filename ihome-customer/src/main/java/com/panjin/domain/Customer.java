package com.panjin.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

/**
 * @author panjin
 */
@Getter
@Setter
@ToString
public class Customer {

    private Long id;

    private Long customerId;

    private String customerName;

    private String phoneNo;

    private Integer status;

    private String createdBy;

    private Date createdTime;

    private String modifiedBy;

    private Date modifiedTime;

}