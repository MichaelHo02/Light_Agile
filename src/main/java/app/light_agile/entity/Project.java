package app.light_agile.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "projects")
public class Project {
    @Id
    @SequenceGenerator(
            name = "project_seq",
            sequenceName = "project_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "project_seq"
    )
    private Long id;

    @Column(name = "title")
    private String title;

    @OneToMany(
            mappedBy = "project"
    )
    List<UserProject> userProjects;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(
            name = "owner"
    )
    private User user;

    @OneToMany(
            mappedBy = "id"
    )
    private List<Sprint> sprints;

    @OneToMany(
            mappedBy = "id"
    )
    private List<Task> tasks;
}
