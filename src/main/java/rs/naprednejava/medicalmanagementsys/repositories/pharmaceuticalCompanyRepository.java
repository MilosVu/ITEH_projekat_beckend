package rs.naprednejava.medicalmanagementsys.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import rs.naprednejava.medicalmanagementsys.model.PharmaceuticalCompany;

@Repository
public interface pharmaceuticalCompanyRepository extends JpaRepository<PharmaceuticalCompany, Long>{

}
