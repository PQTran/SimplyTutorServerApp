package models;

import com.avaje.ebean.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by pqtran on 17-3-23.
 */

@Entity
public class Institute extends Model {

    @Id
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String name;

    @OneToMany(mappedBy = "institute")
    private List<Course> courses;


    public Institute() {

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

    public List<Course> getCourses() {
        return this.courses;
    }

    public static Find<Long, Institute> find = new Find<Long, Institute>(){};
}
