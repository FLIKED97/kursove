package com.example.Kursova.bd;
import javax.persistence.*;

@Entity
@Table(name = "Work")
public class Work {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "idWork")
    private int idWork;

    @Column(name = "workType", nullable = false)
    private String workType;

    // Конструктори, гетери і сетери, інші методи
}
