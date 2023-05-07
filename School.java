abstract public class School
{
   //varibales for each school
   private int enrollment;
   private String schoolName;
   private String schoolAddress;
   private String principal;


// Required abstract/contract method that displays a elementary/middle/or high school
   public abstract void describeSchool();

   // Getters and setters for each variable, accessed from subclasses
   public void setEnrollment(int students)
   {
      enrollment = students;
   }
   public int getEnrollment()
   {
      return enrollment;
   }
   public String getSchoolName()
   {
      return schoolName;
   }

   public void setSchoolName(String schoolName)
   {
      this.schoolName = schoolName;
   }
   public String getSchoolAddress() {
      return schoolAddress;
   }
   public void setSchoolAddress(String schoolAddress) {
      this.schoolAddress = schoolAddress;
   }

   public String getPrincipal() {
      return principal;
   }

   public void setPrincipal(String principal) {
      this.principal = principal;
   }
}

