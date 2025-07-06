package HomeWork7.Task1;

public class Main {
    public static void main(String[] args) {
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);

        Therapist therapist = new Therapist();
        therapist.assignDoctor(patient1);
        therapist.assignDoctor(patient2);
        therapist.assignDoctor(patient3);
    }
}
