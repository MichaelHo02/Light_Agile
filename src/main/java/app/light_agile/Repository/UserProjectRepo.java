package app.light_agile.Repository;

import app.light_agile.entity.UserProject;
import app.light_agile.entity.UserProjectKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserProjectRepo extends JpaRepository<UserProject, UserProjectKey> {
}
