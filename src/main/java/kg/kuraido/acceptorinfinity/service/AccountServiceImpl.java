package kg.kuraido.acceptorinfinity.service;

import kg.kuraido.acceptorinfinity.dto.AccountDto;
import kg.kuraido.acceptorinfinity.model.Account;
import kg.kuraido.acceptorinfinity.model.Role;
import kg.kuraido.acceptorinfinity.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Set;

@Service
public class AccountServiceImpl implements AccountService{

    private final AccountRepo accountRepo;

    public AccountServiceImpl(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    @Override
    public Account save(AccountDto accountDto){
        Account user = new Account(accountDto.getName(), accountDto.getEmail(),
                accountDto.getPassword());

        return accountRepo.save(user);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return null;
    }
}
