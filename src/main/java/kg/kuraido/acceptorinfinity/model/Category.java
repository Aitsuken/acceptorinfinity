package kg.kuraido.acceptorinfinity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "category")
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id")
    private long id;
    private String name;
    @OneToMany(mappedBy = "category")

    private Set<Conversation> conversations = new HashSet<>();

    public Category(String name, Set<Conversation> conversations) {
        this.name = name;
        this.conversations = conversations;
    }

    public Category() {
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Conversation> getConversations() {
        return conversations;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setConversations(Set<Conversation> conversations) {
        this.conversations = conversations;
    }

    @Override
    public String toString() {
        return name;
    }
}

