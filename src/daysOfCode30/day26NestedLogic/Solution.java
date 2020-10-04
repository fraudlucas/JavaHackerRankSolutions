package daysOfCode30.day26NestedLogic;

import java.util.GregorianCalendar;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Date actualDate;
        Date expectedDate;
        int fine = 0;

        actualDate = new Date(scanner.nextLine());
        expectedDate = new Date(scanner.nextLine());

        scanner.close();

        if (actualDate.year == expectedDate.year) {
            if (actualDate.month == expectedDate.month) {
                if (actualDate.dayOfMonth > expectedDate.dayOfMonth) {
                    int daysLate = actualDate.dayOfMonth - expectedDate.dayOfMonth;
                    fine = 15 * daysLate;
                }
            } else if (actualDate.month > expectedDate.month) {
                int monthsLate = actualDate.month - expectedDate.month;
                fine = 500 * monthsLate;
            }
        } else if (actualDate.year > expectedDate.year) {
            fine = 10000;
        }

        System.out.println(fine);
    }

}

class Date extends GregorianCalendar {
    int dayOfMonth;
    int month;
    int year;

    Date(String date) {
        super();

        String[] dateArray = date.split("\\s");

        this.dayOfMonth = Integer.parseInt(dateArray[0]);
        this.month = Integer.parseInt(dateArray[1]);
        this.year = Integer.parseInt(dateArray[2]);

        set(this.year, this.month - 1, this.dayOfMonth);
    }
}