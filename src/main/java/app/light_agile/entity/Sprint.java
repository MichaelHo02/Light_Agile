package app.light_agile.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "sprints")
public class Sprint {
    @Id
    @SequenceGenerator(
            name = "sprint_seq",
            sequenceName = "sprint_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "sprint_seq"
    )
    private Long id;

    @Column(name = "goal", nullable = false)
    private String goal;

    @Column(name = "status", nullable = false)
    private String status;

    @Column(name = "def_of_done")
    private String defOfDone;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "project")
    private Project project;

    @OneToMany(
            mappedBy = "id"
    )
    private List<Task> tasks;
}
