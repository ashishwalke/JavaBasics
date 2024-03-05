package AbstractionInterface;

public class Doctor implements MedicalProfessional ,MedicalStudent {
	
	public String name;
	public int age;

	@Override
	public void studyMedicine() {
		System.out.println(name+ " is Studying Medicine");
		
	}


	@Override
	public void takeExams() {
		System.out.println(name+ " is Giving Medical Exams");
	}


	@Override
	public void doInternship() {
		System.out.println(name+ " is Doing Medical Internship");
		
	}


	@Override
	public void performMedicalDuties() {
		System.out.println(name+ " is a Doctor and Treating a Patients");
		
	}
	
	//Native Method to this class
	public void Introduce() {
		
		System.out.println("Name : " +name);
		System.out.println("Age : " +age);
	}
	
	public static void main(String[] args) {
		
		Doctor doc = new Doctor();
		doc.name="Shekhar";
		doc.age=25;
		doc.studyMedicine();
		doc.takeExams();
		doc.doInternship();
		doc.performMedicalDuties();
		doc.Introduce();
	}

}
