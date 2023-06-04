package com.example.Kursova.bd;

import javax.persistence.*;

@Entity
@Table(name = "Form")
public class Form {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idAcc")
    private int idAcc;

    @Column(name = "FisrtName", nullable = false)
    private String firstName;

    @Column(name = "SurName", nullable = false)
    private String surName;

    @Column(name = "Patronymic", nullable = false)
    private String patronymic;

    @Column(name = "Phone", nullable = false)
    private int phone;

    @Column(name = "area", nullable = false)
    private float area;

    @Column(name = "workType", nullable = false)
    private String workType;

    public int getIdAcc() {
        return idAcc;
    }

    public void setIdAcc(int idAcc) {
        this.idAcc = idAcc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

    public String getWorkType() {
        return workType;
    }

    public void setWorkType(String workType) {
        this.workType = workType;
    }
// Конструктори, гетери і сетери, інші методи
}
