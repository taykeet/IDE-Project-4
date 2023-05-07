public class ElementarySchool extends School {
    public void describeSchool()
    {
        //Formatting is the same except for education level
        System.out.format(getSchoolName() + ":\n");
        System.out.format("Address: %s\n",getSchoolAddress());
        System.out.println("Education level: Grades K - 5");
        System.out.format("Enrollment: %s\n",getEnrollment());
        System.out.format("Principal: %s\n\n",getPrincipal());
    }
}
