import java.time.LocalDate;
import java.util.Scanner;

public class FitnessTracker {
    private String activity;
    private int min;
    private LocalDate date;

    public FitnessTracker() {
        activity = "running";
        min = 0;
        date = LocalDate.of(2017, 1, 1);
    }

    public FitnessTracker(String activity, int min, LocalDate date) {
        this.activity = activity;
        this.min = min;
        this.date = date;
    }

    public String getActivity() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter activity >>> ");
//        activity = scanner.next();
        return activity;
    }

    public int getMin() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter minutes >>> ");
//        min = scanner.nextInt();
        return min;
    }

    public LocalDate getDate() {
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Enter year >>> ");
//        int year = scanner.nextInt();
//        System.out.print("Enter month >>> ");
//        int month = scanner.nextInt();
//        System.out.print("Enter day >>> ");
//        int day = scanner.nextInt();
//        date = LocalDate.of(year, month, day);
        return date;
    }
}
