import java.time.LocalDate;

public class TestFitnessTracker2 {

    public static void main(String[] args) {
        FitnessTracker fitnessTracker = new FitnessTracker("swimming", 60, LocalDate.of(2017, 10, 01));
        System.out.println(fitnessTracker.getActivity());
        System.out.println(fitnessTracker.getMin());
        System.out.println(fitnessTracker.getDate());
    }
}
