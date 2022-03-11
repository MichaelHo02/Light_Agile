package app.light_agile.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserProjectKey implements Serializable {
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "project_id")
    private Long projectId;

    public UserProjectKey(Long userId, Long projectId) {
        this.userId = userId;
        this.projectId = projectId;
    }

    public UserProjectKey() {

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserProjectKey that = (UserProjectKey) o;
        return Objects.equals(userId, that.userId) && Objects.equals(projectId, that.projectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, projectId);
    }
}
