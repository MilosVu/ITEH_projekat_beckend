package rs.naprednejava.medicalmanagementsys.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;


import rs.naprednejava.medicalmanagementsys.model.Doctor;


@Service
public class DoctorService {

	@Autowired
    private rs.naprednejava.medicalmanagementsys.repositories.DoctorRepository doctorRepository;
    
    
    public List<Doctor> getAllDoctors(){
        return doctorRepository.findAll();
    }
    
    
 	public Doctor createDoctor(Doctor doctor) {
    	doctor.setUserRole("doctor");
 		return doctorRepository.save(doctor);
 	}
    
    
    
 	public ResponseEntity<Doctor> getUsersById(String id) {
    	Doctor doctor = doctorRepository.findById(Long.parseLong(id))
 				.orElseThrow(() -> new exceptions.ResourceNotFoundException("Doctor does not exist with id :" + id));
 		return ResponseEntity.ok(doctor);
 	}
}
