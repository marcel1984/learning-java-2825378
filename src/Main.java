public class Main {

    public static void main(String[] args){
        int studentAge = 15;
        double studentGPA = 3.45;

        boolean hasPerfectAttendance = true;
        String studentFirstName = "Marcel";
        String studentLastName = "Chacon";
        char studentFirstInitial = studentFirstName.charAt(0);
        char studentLastInitial = studentLastName.charAt(0);

//        System.out.println(studentAge);
//        System.out.println(studentGPA);
//        System.out.println(studentFirstInitial);
//        System.out.println(studentLastInitial);
//        System.out.println(hasPerfectAttendance);
//        System.out.println(studentFirstName);
//        System.out.println(studentLastName);
        System.out.println(studentFirstName + " " + studentLastName + " has a GPA of " + studentGPA);
    }
}
