package rs.naprednejava.medicalmanagementsys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.naprednejava.medicalmanagementsys.model.Doctor;

@Repository
public interface doctorRepository extends JpaRepository<Doctor, Long> {

}
