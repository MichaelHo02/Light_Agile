package app.light_agile.entity;

import javax.persistence.*;

@Entity
@Table(name = "tasks")
public class Task {
    @Id
    @SequenceGenerator(
            name = "task_seq",
            sequenceName = "task_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_seq"
    )
    private Long id;

    @Column(name = "point", nullable = false)
    private Integer point;

    @Column(name = "user_story", nullable = false)
    private String userStory;

    @Column(name = "category")
    private String category;

    @Column(name = "status", nullable = false)
    private String status;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "project")
    private Project project;

    @ManyToOne(
            cascade = CascadeType.ALL,
            fetch = FetchType.LAZY
    )
    @JoinColumn(name = "sprint")
    private Sprint sprint;
}
