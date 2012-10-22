
	public class HospitalSystem {
		 Patient patientListStart = null;
			
		public void addPatient(Patient newPatient) {
			if(patientListStart == null){
				patientListStart = newPatient;
			}
			else{
				Patient pos = patientListStart; 
				while(pos.nextPatient != null){
					pos = pos.nextPatient;
				}
				pos.nextPatient = newPatient;
			}
		}	
		
		public void peep(){
			Patient counter = patientListStart;
			while (counter != null) {
				System.out.println(counter.name);
				counter = counter.nextPatient;
			}
		}
		
		public static void main(String[] args) {
			HospitalSystem hospitalSystem = new HospitalSystem();
			hospitalSystem.launch();
		
			//System.out.println(hospitalSystem);
			hospitalSystem.peep();
		}
	
		public void launch() {
			// add someting to take in new patients from user
			
			Patient firstPatient = new Patient("Bob");
			patientListStart = firstPatient;
					
			Patient anotherPatient = new Patient("Mary");
			addPatient(anotherPatient);		
		}
	
	}