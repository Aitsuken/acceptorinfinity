
package kg.kuraido.acceptorinfinity.repository;

import kg.kuraido.acceptorinfinity.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends JpaRepository<Account, Long> {
}
