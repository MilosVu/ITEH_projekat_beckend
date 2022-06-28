package rs.naprednejava.medicalmanagementsys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import rs.naprednejava.medicalmanagementsys.model.Patient;

@Service
public class PatientService {
	

	@Autowired
    private rs.naprednejava.medicalmanagementsys.repositories.PatientRepository patientRepository;
    
    
    public List<Patient> getAllPatients(){
        return patientRepository.findAll();
    }
	
 
 	public Patient createPatient(Patient patient) {
    	patient.setUserRole("patient");
    	return patientRepository.save(patient);
 	}
}