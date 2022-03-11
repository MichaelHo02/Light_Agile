package app.light_agile.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
public class User {
    @Id
    @SequenceGenerator(
            name = "user_seq",
            sequenceName = "user_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "user_seq"
    )
    private Long id;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "password")
    private String password;

    @OneToMany(
            mappedBy = "user"
    )
    private List<UserProject> userProjects;


    @OneToMany(
            mappedBy = "id"
    )
    private List<Project> ownedProjects;

    public User() {
    }


}
