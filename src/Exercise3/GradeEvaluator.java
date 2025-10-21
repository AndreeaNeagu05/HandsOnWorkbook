package Exercise3;

import java.util.Scanner;

public class GradeEvaluator {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String name;

        while(true){
            System.out.println("Enter student name(or 'exit' to stop): ");
            name = sc.nextLine();

            if ("exit".equalsIgnoreCase(name)) {
                System.out.println("Program terminated.");
                break;
            }

            if (name.isEmpty()) {
                System.out.println("Invalid name. Skipping.\n");
                continue;
            }

            int[] scores = readScores(3);
            int attendance = readAttendance();
            double average = calculateAverage(scores);
            String status = evaluateStudent(average, attendance);
            String grade = determineGrade(average);

            System.out.println("Average:" + average + " Grade:" + grade + " " + status);
        }
    }

    public static int[] readScores(int n){
        int[] scores = new int[n];
        System.out.println("Enter " + n + " test scores: ");
        for(int i=0; i<n; i++){
            scores[i] = sc.nextInt();
        }

        return scores;
    }

    public static int readAttendance(){
        System.out.println("Enter attendance percentage: ");
        int attendance = sc.nextInt();
        sc.nextLine();

        return attendance;
    }

    public static double calculateAverage(int[] scores){
        int total = 0;
        for(int s: scores){
            total += s;
        }
        return (double) total / scores.length;
    }

    public static String evaluateStudent(double average, int attendance){
        if(average >= 70 && attendance >= 75){
            return " -> Pass";
        } else if(average >= 50 && average < 70){
            return " -> Re-exam";
        } else{
            return " -> Fail";
        }
    }

    public static String determineGrade(double average){
        return switch((int)average/10) {
            case 10,9 -> "A";
            case 8 -> "B";
            case 7 -> "C";
            case 6 -> "D";
            default -> "F";
        };
    }
}
