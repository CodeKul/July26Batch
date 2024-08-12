package com.codekul.july26batch.manytomany.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
public class Teachers {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String address;

    @ManyToMany
    @JoinTable(name = "teacher_subject",
            joinColumns = {@JoinColumn(name = "teacher_id",referencedColumnName = "id")},
    inverseJoinColumns = {@JoinColumn(name = "subject_id",referencedColumnName = "id")})
    private List<Subject> subjects;

}
