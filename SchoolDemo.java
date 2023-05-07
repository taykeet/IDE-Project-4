public class SchoolDemo implements SchoolConstants
{
   public static void main(String[] args)
   {
       System.out.println("---------------------------------");
       System.out.print("School System: " + SYSTEMNAME + "Telephone: " + COUNTYTEL + "Current Superintendent: " + SUPERINT);
       System.out.println("Here is a list of all the schools within the district:");
       System.out.println("---------------------------------");


       School auburnElementary = new ElementarySchool();
       auburnElementary.setEnrollment(400);
       auburnElementary.setSchoolName(("Auburn Elementary"));
       auburnElementary.setSchoolAddress("1760 Auburn School Drive\nRiner, VA 24149\n");
       auburnElementary.setPrincipal("Kim Rygas");
       auburnElementary.describeSchool();




   }
}