package icet.edu.repository;

import icet.edu.entity.AppoinmentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppoimentRepository extends JpaRepository<AppoinmentEntity,Integer> {
}
