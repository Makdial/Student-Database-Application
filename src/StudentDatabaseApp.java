import java.util.Scanner;
class StudentDatabaseApp {
    public static void main(String[] args){

        //Ask how many new users we want to add
        System.out.print("Enter the number of students to enroll: " );
        Scanner in = new Scanner(System.in);
        int numOfSteudents = in.nextInt();
        Student[] students = new Student[numOfSteudents];

        //Create n number of new Students
        for(int n=0; n<numOfSteudents ;n++){
            students[n] = new Student();
            students[n].enroll();
            students[n].payTuition();
        }
        for (int n=0 ; n<numOfSteudents ; n++){
            System.out.println(students[n].toString());
        }
    }
}
