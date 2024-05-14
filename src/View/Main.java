package View;

import Controller.ManageStudent;
import Model.Student;
import Utils.Validation;

import java.util.ArrayList;

public class Main {
    public static void menu() {
        System.out.println(" 1.	Create");
        System.out.println(" 2.	Find and Sort");
        System.out.println(" 3.	Update/Delete");
        System.out.println(" 4.	Report");
        System.out.println(" 5.	Exit");
        System.out.print(" Enter your choice: ");
    }

    public static void main(String[] args) {
        ArrayList<Student> ls = new ArrayList<>();
        Validation validation = new Validation();
        ls.add(new Student("1", "Pham Ngoc Hoa", "Spring", "java"));
        ls.add(new Student("2", "Do Quang Hiep", "Summer", ".net"));
        ls.add(new Student("3", "Nguyen Xuan Cuong", "Spring", "c/c++"));
        int count = 3;
        //loop until user want to exit program
        while (true) {
            //Show menu option
            menu();
            int choice = validation.checkInputIntLimit(1, 5);
            switch (choice) {
                case 1:
                    ManageStudent.createStudent(count, ls);
                    break;
                case 2:
                    ManageStudent.findAndSort(ls);
                    break;
                case 3:
                    ManageStudent.updateOrDelete(count, ls);
                    break;
                case 4:
                      ManageStudent.report(ls);
                    break;
                case 5:
                    return;
            }

        }
    }



}
