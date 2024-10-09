package day28_loops;

import java.sql.SQLOutput;

public class JavaCityCases {
    public static void main(String[] args) {
        int totalCases = 0;
        for (int day = 1; day <= 30; day++){
            if(day % 7 == 0){
                totalCases += 500;
            } else {
                totalCases += 200;
            }
            System.out.println("Day " + day + " | total cases : " + totalCases);
        }
        System.out.println("JavaCity 12/2023 Total Cases: " + totalCases);
    }
}
