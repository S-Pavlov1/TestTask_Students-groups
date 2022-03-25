package com.testTask.models;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@Table(name = "university_groups")
public class Groups {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer group_id;

    private String number;
    private Integer studentsCount;

}
