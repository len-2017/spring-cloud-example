package com.panjin.mapper;

import com.panjin.domain.Customer;
import org.springframework.stereotype.Component;

/**
 * @author panjin
 */
@Component
public interface CustomerMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Customer record);

    int insertSelective(Customer record);

    Customer selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Customer record);

    int updateByPrimaryKey(Customer record);
}