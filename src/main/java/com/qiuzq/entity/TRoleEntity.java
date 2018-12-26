package com.qiuzq.entity;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * program: springBoot_day01
 * Date: 2018/12/26/026 21:33
 *
 * @author: Mr.Qiu
 * Description:
 */
@Entity
@Table(name = "t_role", schema = "springboot", catalog = "")
public class TRoleEntity implements Serializable {
    private long id;
    private String roleName;

    @OneToOne
    @JoinColumn(name = "id")
    private TUserEntity userEntity;

    public TUserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(TUserEntity userEntity) {
        this.userEntity = userEntity;
    }

    @Id
    @Column(name = "id")
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Basic
    @Column(name = "role_name")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TRoleEntity that = (TRoleEntity) o;
        return id == that.id &&
                Objects.equals(roleName, that.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(id, roleName);
    }
}
