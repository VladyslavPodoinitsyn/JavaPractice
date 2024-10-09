package day30_arrays;

public class StudentArray {
    public static void main(String[] args) {
        String[] student2 = new String[5];
        student2[0] = "1234";
        student2[1] = "Adam";
        student2[2] = "Smith";
        student2[3] = "B22";
        student2[4] = "634-980-7890";

        //or

        String[] student1 = {"AD1234", "Adam", "Smith", "B22", "634-980-7890"};

        System.out.println("student1 id = " + student1[0]);
        System.out.println("student1 firstname = " + student1[1]);
        System.out.println("student1 lastname = " + student1[2]);
        System.out.println("student1 batch num = " + student1[3]);
        System.out.println("student1 mobile num = " + student1[4]);

        System.out.println("student data length: " + student1.length);

        if (student1.length == 5) {
            System.out.println("PASS: data array has correct length");
        } else {
            System.out.println("FAIL: data array has incorrect length");
        }

        if (student1.length == student2.length) {
            System.out.println("PASS: data arrays length match");
        } else {
            System.out.println("FAIL: data arrays length mismatch");
        }

        System.out.println(student1[1].toUpperCase() + " " + student1[2].toUpperCase());

        String mobileNum = student1[4];
    }
}
