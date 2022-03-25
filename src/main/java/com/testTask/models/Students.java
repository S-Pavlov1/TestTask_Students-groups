package com.testTask.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Setter
@Getter
@Table(name = "Students")
public class Students {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer student_id;

    private String fullName;
    private Date acceptanceDate;

    @ManyToOne
    @JoinColumn(name = "groupId", referencedColumnName = "group_id")
    private Groups group;
}
