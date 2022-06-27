package rs.naprednejava.medicalmanagementsys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.naprednejava.medicalmanagementsys.model.Medicine;

@Repository
public interface medicineRepository extends JpaRepository<Medicine, Long>{

}
