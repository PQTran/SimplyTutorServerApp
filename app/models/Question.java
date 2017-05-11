package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by pqtran on 17-3-23.
 */

@Entity
public class Question extends Model {

    @Id
    private Long id;

    @NotNull
    @Size(max = 300)
    private String text;

    @NotNull
    private Integer marks;

    @ManyToOne
    private Assignment assignment;

    @OneToMany(mappedBy = "question")
    private List<QuestionChoice> questionChoices;


    public Question() {

    }

    public Long getId() {
        return this.id;
    }

    public String getText() {
        return this.text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Integer getMarks() {
        return this.marks;
    }

    public void setMarks(Integer marks) {
        this.marks = marks;
    }

    public Assignment getAssignment() {
        return this.assignment;
    }

    public void setAssignment(Assignment assignment) {
        this.assignment = assignment;
    }

    public List<QuestionChoice> getQuestionChoices() {
        return this.questionChoices;
    }

    public static Find<Long, Question> find = new Find<Long, Question>(){};
}
