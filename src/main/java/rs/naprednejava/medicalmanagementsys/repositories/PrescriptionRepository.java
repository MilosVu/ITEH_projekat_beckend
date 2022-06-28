<<<<<<< HEAD
package rs.naprednejava.medicalmanagementsys.repositories;
=======
package rs.naprednejava.medicalmanagementsys.repository;
>>>>>>> 534ed9f08a37b83e4fcc9edf17dd8ea51bbc10a6

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import rs.naprednejava.medicalmanagementsys.model.Examination;
import rs.naprednejava.medicalmanagementsys.model.Prescription;

public interface PrescriptionRepository extends JpaRepository<Prescription, Long> {

	Prescription getByExamination(Examination examination);
	
	Prescription findByExaminationId(Long examinationId);

<<<<<<< HEAD
}
=======
}
>>>>>>> 534ed9f08a37b83e4fcc9edf17dd8ea51bbc10a6
