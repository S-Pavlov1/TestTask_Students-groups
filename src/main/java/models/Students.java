package models;

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
    private Integer id;

    private String fullName;
    private Date acceptanceDate;

    @ManyToOne
    @JoinColumn(name = "groupId", referencedColumnName = "id")
    private Groups groupId;
}
