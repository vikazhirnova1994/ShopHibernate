package entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "user", schema = "public")
public class Role  extends Model {

    @Column(name = "title")
    private String title;

    @ManyToMany(mappedBy="roles")
    private Set<User> users = new HashSet<User>();

    public Role() {

    }
    public Role(Long id) {

        super(id);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Set<User> getUsers() {
        return users;
    }

    public void setUsers(Set<User> users) {
        this.users = users;
    }
}
