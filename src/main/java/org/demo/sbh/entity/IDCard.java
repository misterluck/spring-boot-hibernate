package org.demo.sbh.entity;

import javax.persistence.*;

/**
 * Created by zhaol on 2018/3/28.
 * 身份证对人    一对一
 */
@Entity
@Table(name = "IDCard")
public class IDCard {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    @Column(name = "idNumber", nullable = false, length = 18, unique = true)
    private String IdNumber;
    @OneToOne(optional = false, cascade = CascadeType.REFRESH)
    @JoinColumn(name = "person_id", referencedColumnName = "id", unique = true)
    private Person person;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getIdNumber() {
        return IdNumber;
    }

    public void setIdNumber(String idNumber) {
        IdNumber = idNumber;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }
}
