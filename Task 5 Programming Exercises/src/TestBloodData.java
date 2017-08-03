public class TestBloodData {

    public static void main(String[] args) {
        BloodData bloodDataDefault = new BloodData();
        System.out.println(bloodDataDefault.getBloodType());
        System.out.println(bloodDataDefault.getRh());

        BloodData bloodDataOverloaded = new BloodData("A", "-");
        System.out.println(bloodDataOverloaded.getBloodType());
        System.out.println(bloodDataOverloaded.getRh());
    }
}
