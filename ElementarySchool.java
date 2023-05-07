public class ElementarySchool extends School {
    public void describeSchool()
    {
        System.out.format("%s \nEducation level: Grades K - 5\n", getSchoolName());
        System.out.format("Enrollment: %s",getEnrollment());
    }
}
