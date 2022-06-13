package kg.kuraido.acceptorinfinity.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;


@Entity
@Table(name = "conversation")

public class Conversation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private long id;

    private String question;
    private String answer;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;


    public Conversation() {
    }

    public Conversation(String question, String answer, Category category) {
        this.question = question;
        this.answer = answer;
        this.category = category;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public Category getCategory() {
        return category;
    }
    public String getName(){
        return category.getName();
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

