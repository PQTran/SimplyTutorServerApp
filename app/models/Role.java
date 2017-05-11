package models;

import com.avaje.ebean.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.Size;
import java.util.List;

/**
 * Created by pqtran on 17-3-23.
 */

@Entity
public class Role extends Model {

    @Id
    private Long id;

    @Size(max = 30)
    private String roleName;

    @Size(max = 100)
    private String description;

    @OneToMany(mappedBy = "role")
    private List<User> users;



    public Role() {

    }

    public Long getId() {
        return this.id;
    }

    public String getRoleName() {
        return this.roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public static Find<Long, Role> find = new Find<Long, Role>(){};
}
