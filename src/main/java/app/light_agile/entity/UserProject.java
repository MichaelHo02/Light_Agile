package app.light_agile.entity;

import javax.persistence.*;

@Entity
@Table(name = "user_project")
public class UserProject {
    @EmbeddedId
    private UserProjectKey id;

    @ManyToOne(
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
    )
    @MapsId("userId")
    @JoinColumn(name = "user_id")
    private User user;

    @ManyToOne(
//            cascade = CascadeType.ALL,
//            fetch = FetchType.LAZY
    )
    @MapsId("projectId")
    @JoinColumn(name = "project_id")
    private Project project;
}
