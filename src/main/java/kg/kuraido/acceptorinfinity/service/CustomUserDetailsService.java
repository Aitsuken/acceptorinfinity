package kg.kuraido.acceptorinfinity.service;

import kg.kuraido.acceptorinfinity.repository.AccountRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {
    private final AccountRepo accountRepo;

    public CustomUserDetailsService(AccountRepo accountRepo) {
        this.accountRepo = accountRepo;
    }

    public UserDetails 
}
