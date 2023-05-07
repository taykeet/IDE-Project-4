abstract public class School
{
   private int enrollment;
   private String schoolName;
   private String schoolAddress;
   private String principal;

   public abstract void describeSchool();
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

