package models;

import com.avaje.ebean.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by pqtran on 17-3-23.
 */

@Entity
public class Course extends Model {

    @Id
    private Long id;

    @NotNull
    @Size(max = 50)
    private String title;

    @Size(max = 100)
    private String description;

    @ManyToOne
    private Institute institute;

    @NotNull
    @ManyToOne
    private User creatorUser;

    @ManyToMany
    @JoinTable(name = "enrollment")
    private List<User> enrolledUsers;

    @OneToMany(mappedBy = "course")
    private List<Assignment> assignments;




    public Course() {

    }

    public Long getId() {
        return this.id;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Institute getInstitute() {
        return this.institute;
    }

    public void setInstitute(Institute institute) {
        this.institute = institute;
    }

    public User getCreatorUser() {
        return this.creatorUser;
    }

    public void setCreatorUser(User creatorUser) {
        this.creatorUser = creatorUser;
    }

    public List<User> getEnrolledUsers() {
        return this.enrolledUsers;
    }

    public static Find<Long, Course> find = new Find<Long, Course>(){};
}
