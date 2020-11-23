package co.g2academy.basic;

public class IfElseDemo {

    public static void main(String[] args) {
        int testscore = 76;
        char grade;

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore > -80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade of " + testscore + " is " + grade);

//        String condition
        String string = "abcdef";
        if (string.equals("abcdef")){
            System.out.println(true);
        }
        if (!string.equals("defg")){
            System.out.println(true);
        }

        double g = 3.1415d;
        System.out.println(g == 3.1415);

        float f = 2.5f;
        System.out.println(f == 5.0 / 2);

        double d = 2.5d;
        System.out.println(d == 5.0 / 2);
    }
}
