package kg.kuraido.acceptorinfinity.repository;

import kg.kuraido.acceptorinfinity.model.Conversation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ConversationRepo extends JpaRepository<Conversation, Long> {

}
