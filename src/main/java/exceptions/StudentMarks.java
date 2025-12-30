package exceptions;

public class StudentMarks {

    public static void main(String[] args) {
        int[] marks = {80, 90, 85};
        try {
            System.out.println(marks[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid student index!");
        }
    }
}
