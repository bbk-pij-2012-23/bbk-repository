
	public class HospitalSystem {
		 Patient patientListStart = null;
		//	
		public void addPatient(Patient newPatient) {
			if(patientListStart == null){
				patientListStart = newPatient;
			}
			else{
				Patient pos = patientListStart; 
				while(pos.nextPatient != null){
					pos = pos.nextPatient;
				}
				pos.nextPatient = newPatient; //this is where the link to next patient is
				newPatient.prevPatient = pos;
			}
			
		}	
		
		public Patient deletePatient(Patient oldPatient, Patient start) { //need to delete the prevPatient reference too
		
			if (start == null) {
				return null;
			}
			
			if (start.name.equals(oldPatient.name)){
				return start.nextPatient;
			}
			else { 
				start.nextPatient = deletePatient(oldPatient, start.nextPatient);
				return start;
			}
		}	
		
			public void peep(){
			
			
			Patient counter = patientListStart;
			while ((counter != null) && (!counter.name.equals("-1"))) {
				System.out.println("Patient name: " + counter.name);
			/*if (counter.prevPatient != null){
					System.out.println("Previous patient: " + counter.prevPatient.name);
				}
				if (counter.nextPatient != null){
					System.out.println("Next Patient: " + counter.nextPatient.name);
				}*/
			
				counter = counter.nextPatient;
			}
			if (counter.name.equals("-1")){
				while (counter.prevPatient != null) {
					counter = counter.prevPatient;
					System.out.println("Patient name: " + counter.name);
					/*if (counter.prevPatient != null){
						System.out.println("Previous patient: " + counter.prevPatient.name);
					}
					if (counter.nextPatient != null){
						System.out.println("Next Patient: " + counter.nextPatient.name);
					}
					*/
				}
			}
		}		
		public static void main(String[] args) {
			HospitalSystem hospitalSystem = new HospitalSystem();
			hospitalSystem.launch();
			
			hospitalSystem.peep();
			hospitalSystem.deleterlaunch();
			//
			
		}
	
		public void launch() {
			// add someting to take in new patients from user
			System.out.println("key in patient names, hitting enter after each. enter -1 when you have finished entering names");
			System.out.println("Patient: ");
			String str = System.console().readLine();
			Patient firstPatient = new Patient(str);
			addPatient(firstPatient);
			do{
				System.out.println("Patient: ");
				str = System.console().readLine();
				Patient anotherPatient = new Patient(str);
				addPatient(anotherPatient);		
			} while (!str.equals("-1"));
		}	
		
		public void deleterlaunch() {
 				
			System.out.println("What is the name of the patient so I can remove them from the records?");
			String str = System.console().readLine();
			Patient removePatient = new Patient(str);
			patientListStart = deletePatient(removePatient, patientListStart);	
			
			
			Patient counter = patientListStart;
			while ((counter != null) && (!counter.name.equals("-1"))) {
				System.out.println("Patient name: " + counter.name);
				counter = counter.nextPatient;
			}
			if (counter.name.equals("-1")){
				while (counter.prevPatient != null) {
					counter = counter.prevPatient;
					System.out.println("Patient name: " + counter.name);
				}
			}
			
		
			
		}	
		
	}