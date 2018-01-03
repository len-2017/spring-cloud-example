package com.panjin.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;

@Getter
@Setter
@ToString
public class Account {

    private Long id;

    private Long customerId;

    private String accountNo;

    private Integer status;

    private String createdBy;

    private Date createdTime;

    private String modifiedBy;

    private Date modifiedTime;

}