package Grade;

import java.util.Scanner;

public class Grade {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter Student Num");

        int StudentNum = scan.nextInt();

        Student[] students = new Student[StudentNum];

        for (int i = 0; i < StudentNum; i++) {

            students[i] = new Student();

            System.out.println("Enter Grad for student no" + (i + 1));

            for (int j = 0; j < students[i].Grads.length; j++) {

                students[i].Grads[j] = scan.nextDouble();

            }
            System.out.println("*****************");

        }

        int Sum = 0;
        double Max = 0;
        for (int i = 0; i < students.length; i++) {

            for (int j = 0; j < students[i].Grads.length; j++) {

               int m= add(students[i].Grads);
               // Sum += students[i].Grads[j];
                System.out.println(m);

               // if (students[i].Grads[j] > Max) {
                //    Max = students[i].Grads[j];

               // }

            //}
          //  System.out.println("Sum of student " + (i + 1) + "=" + Sum);
         //   System.out.println("Max of Student" + (i + 1) + "=" + Max);
            //        System.out.println("**************");

        }
        

    }
}
