package softuni.javaweb.springproject.user.model.entity;

import softuni.javaweb.springproject.base.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "roles")
public class Role extends BaseEntity {

    private String authority;

    public Role() {
    }

    @Column(name = "authority", nullable = false, unique = true)
    public String getAuthority() {
        return authority;
    }

    public void setAuthority(String authority) {
        this.authority = authority;
    }

}
