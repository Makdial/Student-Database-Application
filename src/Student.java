 import java.util.Scanner;
    class Student{
        private String firstName;
        private String lastName;
        private int gradeYear;
        private String studentID;
        private int tuitionBalance = 0;
        private String courses;
        private static int costOfCourse = 600;
        private static int id = 1000;

        //Constructor: prompt user to enter students's name and year
        public  Student(){
            Scanner in = new Scanner(System.in);
            System.out.print("Enter your First Name: " );
            this.firstName = in.nextLine();

            System.out.print("Enter your Last Name: ");
            this.lastName = in.nextLine();

            System.out.print("1 - Freshman\n2 - Sophmore\n3 - Junior\n4 - Senior\n Enter your class level:");
            this.gradeYear = in.nextInt();

            setStudentID();

            System.out.println(firstName + " " + lastName + "" + " --student level: " + gradeYear + " --student ID:" + studentID ) ;

        }

        //Generate student ID
        public void setStudentID(){
            id++;
            //Grade + id
            this.studentID = gradeYear + "" + id ;

        }

        //Enroll in classes
        public void enroll() {
            //Get inside a loop, user hits Q to quit
            do {
                System.out.print("Enter courses to Enroll(Q to quit): ");
                Scanner in = new Scanner(System.in);
                String course = in.nextLine();
                if (!course.equals("Q")) {
                    courses = courses + "\n  " + course;
                    tuitionBalance = tuitionBalance + costOfCourse;
                } else {
                    System.out.println("");
                    break;
                }
            } while (1 != 0);

            System.out.print("ENROLLED IN: " + courses);
            System.out.print("TUITION BALANCE: $" + tuitionBalance);
        }
            //View Balance
            public void viewBalance(){
                System.out.println("Your balance is: \n$" + tuitionBalance);
            }
            //Pay tuition
            public void payTuition(){
                viewBalance();
                System.out.print("Enter Payment: $" );
                Scanner in = new Scanner(System.in);
                int payment = in.nextInt();
                tuitionBalance = tuitionBalance - payment;
                System.out.println("Thank you for the payment of $" + payment);
                viewBalance();
            }


            //Show status

        public String toString(){
            return "Student Name: " + firstName + " " + lastName +
                    "\nStudent id: " + id +
                    "\nGrade Level: " + gradeYear +
                    "\nCourses enrolled : " + courses +
                    "\nTuition Balance: " + tuitionBalance;
        }


        }

}