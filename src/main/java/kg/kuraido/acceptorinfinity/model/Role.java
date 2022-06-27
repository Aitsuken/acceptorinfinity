package kg.kuraido.acceptorinfinity.model;

import javax.persistence.*;
import java.util.Collection;
import java.util.Set;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(nullable = false)
    private String name;
//    @ManyToMany(mappedBy = "roles")
//    private Collection<Account> accounts;


    public Role(){
    }
    public Role(String name) {
        this.name = name;

    }

    public Role(Long id){
        this.id = id;
    }
    public Role(Long id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString(){
        return this.name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
