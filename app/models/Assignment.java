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
public class Assignment extends Model {

    @Id
    private Long id;

    @NotNull
    @Size(max = 50)
    private String name;

    @Size(max = 100)
    private String description;

    @ManyToOne(optional = false)
    private Course course;

    @OneToMany(mappedBy = "assignment")
    private List<Question> questions;

    public Assignment() {

    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return this.course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public List<Question> getQuestions() {
        return this.questions;
    }

    public static Find<Long, Assignment> find = new Find<Long, Assignment>(){};
}
