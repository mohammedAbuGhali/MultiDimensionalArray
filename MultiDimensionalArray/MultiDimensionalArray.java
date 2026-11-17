package chapter2.MultiDimensionalArray;

import java.util.Scanner;

public class MultiDimensionalArray {

    public static void main(String[] args) {
        String[][] students = new String[3][2]; // (صفوف 3 )(2 من الاعمدة)
        int size = 0; // بمعنى اكم صف في هذه المصفوفة ف مبدئيا صفر 
        Scanner in = new Scanner(System.in);
        boolean userselect = true;
        while (userselect) {
            System.out.println("-----Array operation-----");
            System.out.println("1.Add student");
            System.out.println("2.Display students");
            System.out.println("3.Update student");
            System.out.println("4.Delete student");
            System.out.println("5.Exit");
            System.out.print("Enter Selected Value : ");
            int userselectlist = in.nextInt();
            switch (userselectlist) {
                case 1: {
                    if (size < students.length) {
                        System.out.println("Enter Student Name:");
                        String stdName = in.next();
                        System.out.println("Enter Student Grade:");
                        String stdGrade = in.next();
                        students[size][0] = stdName;
                        students[size][1] = stdGrade;
                        size++;
                        System.out.println("Student ADD Succesfully...");
                    } else {
                        System.out.println("Sorry Array Is Full");
                    }
                    break;
                }
                case 2: {
                    System.out.println("All students on System");
                    for (int i = 0; i < size; i++) {
                        System.out.print("Name : " + students[i][0]);
                        System.out.print(" Grade : " + students[i][1]);
                        System.out.println("");
                    }
                    break;
                }
                case 3: {
                    System.out.println("Enter UpdatedIndex of Student to Update ");
                    int UpdatedIndex = in.nextInt();
                    if (UpdatedIndex < size && UpdatedIndex >= 0) {
                        System.out.println("Enter Student Name:");
                        String stdName = in.next();
                        System.out.println("Enter Student Grade:");
                        String stdGrade = in.next();
                        students[UpdatedIndex][0] = stdName;
                        students[UpdatedIndex][1] = stdGrade;
                        System.out.println("Student Update Succesfuly...");
                    } else {
                        System.out.println("Invaled Index !! ...");
                    }
                    break;
                }
                case 4: {
                    System.out.println("Enter deleteindex of Student to Update ");
                    int deleteindex = in.nextInt();
                    if (deleteindex < size && deleteindex >= 0) {
                        for (int i = deleteindex; i < size - 1; i++) {
                            students[i][0] = students[i + 1][0];
                            students[i][1] = students[i + 1][1];
                        }
                        size--;
                        System.out.println(" Student Deleted Succesfuly...");
                    } else {
                        System.out.println("Invaled Index !! ...");
                    }
                    break;
                }
                case 5: {
                    userselect = false;
                    break;
                }
            }
        }
    }
}
