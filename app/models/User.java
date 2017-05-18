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
public class User extends Model {

    @Id
    private Long id;

    @NotNull
    @Size(max = 50)
    private String email;

    @NotNull
    @Size(max = 30)
    private String firstName;

    @NotNull
    @Size(max = 30)
    private String lastName;

    @NotNull
    @Size(max = 30)
    private String password;

    @Size(max = 100)
    private String hashedPassword;

    @Size(max = 100)
    private String resetToken;

    @ManyToOne(optional = false)
    private Role role;

    @OneToMany(mappedBy = "creatorUser")
    private List<Course> createdCourses;

    @ManyToMany(mappedBy = "enrolledUsers")
    private List<Course> enrolledCourses;



    public User() {

    }

    public Long getId() {
        return this.id;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashedPassword() {
        return this.hashedPassword;
    }

    public void setHashedPassword(String hashedPassword) {
        this.hashedPassword = hashedPassword;
    }

    public String getResetToken() {
        return this.resetToken;
    }

    public void setResetToken(String resetToken) {
        this.resetToken = resetToken;
    }

    public Role getRole() {
        return this.role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public List<Course> getCreatedCourses() {
        return this.createdCourses;
    }

    public List<Course> getEnrolledCourses() {
        return this.enrolledCourses;
    }

    public static Find<Long, User> find = new Find<Long, User>(){};

}
