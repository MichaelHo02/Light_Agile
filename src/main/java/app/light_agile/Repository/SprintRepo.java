package app.light_agile.Repository;

import app.light_agile.entity.Sprint;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SprintRepo extends JpaRepository<Sprint, Long> {
}
