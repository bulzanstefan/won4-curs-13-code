package ro.fasttrackit.curs13.exceptions;

public class Main {
    public static void main(String[] args) {
        try {
            new BirthdayYearCalc(10);
            new BirthdayYearCalc(-10);
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }

        try {
            new BirthdayYearCalc(1000);
        } catch (InvalidAgeException iae) {
            System.err.println(iae.getMessage());
        }
        BirthdayYearCalc birthdayYearCalc = null;
        try {
            System.out.println(new BirthdayYearCalc(20).getYear());
            birthdayYearCalc = new BirthdayYearCalc(120);
            System.out.println(birthdayYearCalc.getYear());
        } catch (InvalidAgeException iae) {
            System.out.println("Invalid age");
        } catch (TooOldException toe) {
            System.out.println(toe.getMessage() + " " + toe.getAge());
        }

        System.out.println(birthdayYearCalc.getYear());
    }
}
