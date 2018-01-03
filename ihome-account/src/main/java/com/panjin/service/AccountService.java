package com.panjin.service;

import com.panjin.domain.Account;
import com.panjin.dto.request.AccountReqDTO;
import com.panjin.enums.AccountStatusEnum;
import com.panjin.mapper.AccountMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * @author panjin.
 * @date 2018/1/3.
 */
@Service
public class AccountService {

    @Autowired
    private AccountMapper accountMapper;

    public String openAccount(AccountReqDTO accountReqDTO) {
        Account account = new Account();
        account.setAccountNo("");
        account.setCreatedBy("SYSYEM");
        account.setCreatedTime(new Date());
        account.setCustomerId(0L);
        account.setModifiedBy("SYSYEM");
        account.setStatus(AccountStatusEnum.DISABLE.getCode());
        accountMapper.insertSelective(account);
        return account.getAccountNo();
    }
}
