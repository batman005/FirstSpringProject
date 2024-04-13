package org.example.firstspringproject;

import jakarta.persistence.*;

@Entity
public class Todo {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(nullable = false)
    Integer id;

    @Column
    String title;

    @Column
    Boolean completed;

}
