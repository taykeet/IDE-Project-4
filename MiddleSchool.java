public class MiddleSchool extends School {
    public void describeSchool()
    {
        System.out.format(getSchoolName() + ":\n");
        System.out.format("Address: %s",getSchoolAddress());
        System.out.println("Education level: Grades 6 - 8");
        System.out.format("Enrollment: %s\n",getEnrollment());
        System.out.format("Principal: %s\n\n",getPrincipal());

    }
}
