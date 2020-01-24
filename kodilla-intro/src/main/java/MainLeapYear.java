public class MainLeapYear {
    public static void main(String[] args) {
        LeapYear leapYear = new LeapYear(1999);

        leapYear.isLeapYear();
        boolean check = leapYear.isLeapYear();
        System.out.println(check);

        if(leapYear.isLeapYear()) {
            System.out.println("blabla");
        } else {
            System.out.println("hihih");
        }

        if(leapYear.isLeapYear()){
            System.out.println("To jest rok przestępny.");
        } else {
            System.out.println("To nie jest rok przestępny");

        }

        boolean leapYear1 = leapYear.isLeapYear();
        System.out.println(leapYear1);
        if(leapYear1) {
            System.out.println("To jest rok przestepny vers2.");
        } else {
            System.out.println("To nie jest rok przestepny vers2");
        }


    }

}
