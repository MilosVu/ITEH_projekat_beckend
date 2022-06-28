package rs.naprednejava.medicalmanagementsys.services;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import exceptions.ResourceNotFoundException;
import rs.naprednejava.medicalmanagementsys.model.PharmaceuticalCompany;

@Service
public class PharmaceuticalCompanyService {
	@Autowired
    private rs.naprednejava.medicalmanagementsys.repositories.PharmaceuticalCompanyRepository pharmaceuticalCompanyRepository;
    
    
    public List<PharmaceuticalCompany> getAllPharmaceuticalCompanies(){
        return pharmaceuticalCompanyRepository.findAll();
    }
    
    
   	public PharmaceuticalCompany createPharmaceuticalCompany(PharmaceuticalCompany pharmaceuticalCompany) {
   		return pharmaceuticalCompanyRepository.save(pharmaceuticalCompany);
   	}
   	
   	
   	public ResponseEntity<PharmaceuticalCompany> getCompanyById(Long id) {
   		PharmaceuticalCompany pharmaceuticalCompany = pharmaceuticalCompanyRepository.findById(id)
   				.orElseThrow(() -> new ResourceNotFoundException("PharmaceuticalCompany does not exist with id :" + id));
   		return ResponseEntity.ok(pharmaceuticalCompany);
   	}
   	
   	
   	public ResponseEntity<PharmaceuticalCompany> updatePharmaceuticalCompany(Long id, @RequestBody PharmaceuticalCompany pharmaceuticalCompanyDetails){
   		PharmaceuticalCompany pharmaceuticalCompany = pharmaceuticalCompanyRepository.findById(id)
   				.orElseThrow(() -> new ResourceNotFoundException("PharmaceuticalCompany does not exist with id :" + id));
   		
   		
   		pharmaceuticalCompany.setName(pharmaceuticalCompanyDetails.getName());

   		
   		PharmaceuticalCompany updatedPharmaceuticalCompany = pharmaceuticalCompanyRepository.save(pharmaceuticalCompany);
   		return ResponseEntity.ok(updatedPharmaceuticalCompany);
   	}
   	
   	
   	public ResponseEntity<Map<String, Boolean>> deletePharmaceuticalCompany(Long id){
   		PharmaceuticalCompany pharmaceuticalCompany = pharmaceuticalCompanyRepository.findById(id)
   				.orElseThrow(() -> new ResourceNotFoundException("PharmaceuticalCompany does not exist with id :" + id));
   		
   		pharmaceuticalCompanyRepository.delete(pharmaceuticalCompany);
   		Map<String, Boolean> response = new HashMap<>();
   		response.put("deleted", Boolean.TRUE);
   		return ResponseEntity.ok(response);
   	}
}
