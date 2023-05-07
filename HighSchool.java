public class HighSchool extends School
{
   public void describeSchool()
   {
      System.out.format(getSchoolName() + ":\n");
      System.out.format("Address: %s\n",getSchoolAddress());
      System.out.println("Education level: Grades 9 - 12");
      System.out.format("Enrollment: %s\n",getEnrollment());
      System.out.format("Principal: %s\n\n",getPrincipal());

   }
}