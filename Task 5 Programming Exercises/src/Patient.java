public class Patient {

    private int id;
    private int age;
    private BloodData bloodData;

    public Patient() {
        id = 0;
        age = 0;
        bloodData = new BloodData("O", "+");
    }

    public Patient(int id, int age, String bloodType, String rh) {
        this.id = id;
        this.age = age;
        bloodData = new BloodData(bloodType, rh);
    }

    public int getId() {
        return id;
    }


    public int getAge() {
        return age;
    }


    public BloodData getBloodData() {
        return bloodData;
    }
}
