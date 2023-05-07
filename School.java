abstract public class School
{
   private int enrollment;
   private String schoolName;

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
   public void display() {

   }
}

