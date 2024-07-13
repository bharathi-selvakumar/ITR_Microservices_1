package ITR_returns;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ITR_JPA_Rep extends JpaRepository<ITR_Returns_Entity,Integer> {
}
