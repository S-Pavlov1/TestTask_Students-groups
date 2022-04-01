package com.testTask.DTO;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;


@Getter
@Setter
@NoArgsConstructor
public class StudentsDto {

    private String fullName;
    private Date acceptanceDate;
    private Integer group;

}
