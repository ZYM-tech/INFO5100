import java.time.temporal.ChronoUnit;
import java.util.Scanner;
import java.util.GregorianCalendar;
import java.util.Date;


public class DrivingLicenseApplication {

    public static void main(String[] args) throws Exception {

        Scanner text = new Scanner(System.in);
        System.out.println("Please Enter Birth Month (Format: MM)");
        String birMonth = text.nextLine();
        int month = Integer.parseInt(birMonth);

        System.out.println("Please Enter Birth Date (Format: DD)");
        String birDate = text.nextLine();
        int day = Integer.parseInt(birDate);

        System.out.println("Please Enter Birth Year (Format: YYYY)");
        String birthYear = text.nextLine();
        int year = Integer.parseInt(birthYear);

        Date now = new Date();
        Date birth = new GregorianCalendar(month, day, year).getTime();

        try{
            int count = (int) (ChronoUnit.DAYS.between( birth.toInstant(), now.toInstant()));
            int age = count/365;
            if (age < 16) {
                throw new Exception("Sorry, Your age is under 16 which is not eligible for applying a driving license");
            }
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}