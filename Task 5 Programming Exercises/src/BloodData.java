public class BloodData {

    private String bloodType;
    private String rh;

    public BloodData() {
        this("O", "+");
    }

    public BloodData(String bloodType, String rh) {
        this.bloodType = bloodType;
        this.rh = rh;
    }

    public String getBloodType() {
        return bloodType;
    }


    public String getRh() {
        return rh;
    }
}
