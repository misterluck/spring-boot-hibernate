package org.demo.sbh.entity;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by zhaol on 2018/3/28.
 * 人对身份证    一对一
 */
@Entity
@Table(name = "person")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "sex")
    private boolean sex;
    @Column(name = "age")
    private Short age;
    @Column(name = "birthday")
    private Date birthday;
    @OneToOne(optional = true, cascade = CascadeType.ALL, mappedBy = "person")
    private IDCard idCard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public Short getAge() {
        return age;
    }

    public void setAge(Short age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public IDCard getIdCard() {
        return idCard;
    }

    public void setIdCard(IDCard idCard) {
        this.idCard = idCard;
    }
}
