package kg.kuraido.acceptorinfinity.service;

import kg.kuraido.acceptorinfinity.dto.AccountDto;
import kg.kuraido.acceptorinfinity.model.Account;
import org.springframework.stereotype.Service;

public interface AccountService {
    Account save(AccountDto accountDto);
}
