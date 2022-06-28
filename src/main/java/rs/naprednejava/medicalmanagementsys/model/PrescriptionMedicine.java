package rs.naprednejava.medicalmanagementsys.model;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name = "prescription_medicine")
public class PrescriptionMedicine {

	@EmbeddedId
	private PrescriptionMedicineId prescriptionMedicineId;

	public PrescriptionMedicineId getPrescriptionMedicineId() {
		return prescriptionMedicineId;
	}

	public void setPrescriptionMedicineId(PrescriptionMedicineId prescriptionMedicineId) {
		this.prescriptionMedicineId = prescriptionMedicineId;
	}

	public PrescriptionMedicine(PrescriptionMedicineId prescriptionMedicineId) {
		super();
		this.prescriptionMedicineId = prescriptionMedicineId;
	}
	
	public PrescriptionMedicine() {
		super();
	}

	
	

    
   
    
<<<<<<< HEAD
}
=======
}
>>>>>>> 534ed9f08a37b83e4fcc9edf17dd8ea51bbc10a6
