public class SchoolDemo implements SchoolConstants
{
   public static void main(String[] args)
   {
       HighSchool wilsonHigh = new HighSchool();
       wilsonHigh.setEnrollment(400);
       wilsonHigh.describeLevel();
       System.out.println("Enrollment is " +
          wilsonHigh.getEnrollment());
   }
}