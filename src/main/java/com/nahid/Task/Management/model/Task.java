package com.nahid.Task.Management.model;

import jakarta.persistence.Entity;
import jakarta.persistence.*;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String title;
    private String description;
    private boolean completed;
}
