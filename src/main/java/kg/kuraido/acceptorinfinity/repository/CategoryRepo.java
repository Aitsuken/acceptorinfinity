package kg.kuraido.acceptorinfinity.repository;

import kg.kuraido.acceptorinfinity.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepo extends JpaRepository<Category, Long> {
}
