package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by pqtran on 17-3-23.
 */

@Entity
public class QuestionChoice extends Model {

    @Id
    private Long id;

    @NotNull
    @Size(max = 100)
    private String text;

    @NotNull
    private Integer questionOrder;

    @NotNull
    private boolean isCorrect;

    @ManyToOne(optional = false)
    private Question question;

    

    public QuestionChoice() {

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

    public Integer getQuestionOrder() {
        return this.questionOrder;
    }

    public void setQuestionOrder(Integer questionOrder) {
        this.questionOrder = questionOrder;
    }

    public boolean getIsCorrect() {
        return this.isCorrect;
    }

    public void setIsCorrect(boolean isCorrect) {
        this.isCorrect = isCorrect;
    }

    public Question getQuestion() {
        return this.question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public static Find<Long, QuestionChoice> find = new Find<Long, QuestionChoice>(){};
}
