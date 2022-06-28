package rs.naprednejava.medicalmanagementsys.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

<<<<<<< HEAD
=======
import rs.naprednejava.medicalmanagementsys.exception.ResourceNotFoundException;
>>>>>>> 534ed9f08a37b83e4fcc9edf17dd8ea51bbc10a6
import rs.naprednejava.medicalmanagementsys.model.Medicine;
import rs.naprednejava.medicalmanagementsys.model.PharmaceuticalCompany;
import rs.naprednejava.medicalmanagementsys.model.Prescription;
import rs.naprednejava.medicalmanagementsys.model.PrescriptionsMedicsRequestBody;
<<<<<<< HEAD
=======
import rs.naprednejava.medicalmanagementsys.repository.PharmaceuticalCompanyRepository;
import rs.naprednejava.medicalmanagementsys.repository.PrescriptionRepository;
import rs.naprednejava.medicalmanagementsys.service.PrescriptionService;

>>>>>>> 534ed9f08a37b83e4fcc9edf17dd8ea51bbc10a6
@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/api/v1/")
public class PrescriptionController {

	
	@Autowired
<<<<<<< HEAD
    private rs.naprednejava.medicalmanagementsys.services.PrescriptionService prescriptionService;
=======
    private PrescriptionService prescriptionService;
>>>>>>> 534ed9f08a37b83e4fcc9edf17dd8ea51bbc10a6
    
    //Get all prescriptions
    @GetMapping("/prescriptions")
    public List<Prescription> getAllPrescriptions(){
        return prescriptionService.getAllPrescriptions();
    }
    
    //Get all prescriptions by patient
    @GetMapping("/prescriptions/patient/{id}")
    public List<Prescription> getAllPrescriptionsByPatient(@PathVariable Long id){
        return prescriptionService.getAllPrescriptionsByPatient(id);
    }
    
    //Create prescription
   	@PostMapping("/prescriptions")
   	public Prescription createPrescription(@RequestBody PrescriptionsMedicsRequestBody request) {
   		System.out.println(request);
   		return prescriptionService.createPrescription(request);
   	}
   	
   	//Get prescription by id
   	@GetMapping("/prescriptions/{id}")
   	public ResponseEntity<Prescription> getPrescriptionId(@PathVariable Long id) {
   		return prescriptionService.getPrescriptionId(id);
   	}
   	
   	//Update Prescription 
   	@PutMapping("/prescriptions/{id}")
   	public ResponseEntity<Prescription> updatePrescription(@PathVariable Long id, @RequestBody Prescription prescriptionDetails){
   		return prescriptionService.updatePrescription(id, prescriptionDetails);
   	}
   	
   	//Delete prescription
   	@DeleteMapping("/prescriptions/{id}")
   	public ResponseEntity<Map<String, Boolean>> deletePrescription(@PathVariable Long id){
   		return prescriptionService.deletePrescription(id);
   	}
<<<<<<< HEAD
}

=======
}
>>>>>>> 534ed9f08a37b83e4fcc9edf17dd8ea51bbc10a6
