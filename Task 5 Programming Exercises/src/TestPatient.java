public class TestPatient {

    public static void main(String[] args) {
        Patient patientDefault = new Patient();
        System.out.println(patientDefault.getId());
        System.out.println(patientDefault.getAge());
        System.out.println(patientDefault.getBloodData().getBloodType() + patientDefault.getBloodData().getRh());

        Patient patientOverloaded = new Patient(3456, 20, "B", "+");
        System.out.println(patientOverloaded.getId());
        System.out.println(patientOverloaded.getAge());
        System.out.println(patientOverloaded.getBloodData().getBloodType() + patientOverloaded.getBloodData().getRh());
    }
}
