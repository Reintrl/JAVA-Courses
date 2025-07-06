package HomeWork7.Task1;

public class Therapist extends Doctor {
    void treat() {
        System.out.println("Терапевт выполняет свою работу");
    }

    public void assignDoctor(Patient patient) {
        Doctor doctor;
        switch (patient.getTreatmentPlan()) {
            case 1:
                doctor = new Surgeon();
                break;
            case 2:
                doctor = new Dentist();
                break;
            default:
                doctor = this;
        }
        patient.setDoctor(doctor);
        doctor.treat();
    }
}
