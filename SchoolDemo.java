public class SchoolDemo implements SchoolConstants
{
   public static void main(String[] args) {

       System.out.println("---------------------------------");
       System.out.print("School System: " + SYSTEMNAME + "Telephone: " + COUNTYTEL + "Current Superintendent: " + SUPERINT);
       System.out.println("Here is a list of all the schools within the district:");
       System.out.println("---------------------------------");


       School auburnElementary = new ElementarySchool();
       auburnElementary.setEnrollment(400);
       auburnElementary.setSchoolName(("Auburn Elementary"));
       auburnElementary.setSchoolAddress("1760 Auburn School Drive\nRiner, VA 24149");
       auburnElementary.setPrincipal("Kim Rygas");
       auburnElementary.describeSchool();

       School auburnHigh = new HighSchool();
       auburnHigh.setEnrollment(400);
       auburnHigh.setSchoolName(("Auburn High"));
       auburnHigh.setSchoolAddress("1650 Auburn School Drive\n" +
               "Riner, VA 24149");
       auburnHigh.setPrincipal("Chris Stewart");
       auburnHigh.describeSchool();

       School auburnMiddle = new MiddleSchool();
       auburnMiddle.setEnrollment(400);
       auburnMiddle.setSchoolName("Auburn Middle");
       auburnMiddle.setSchoolAddress("4163 Riner Road\n" +
               "Riner, VA 24149");
       auburnMiddle.setPrincipal("Meggan Marshall");
       auburnMiddle.describeSchool();

       School BelviewE = new ElementarySchool();
       BelviewE.setEnrollment(400);
       BelviewE.setSchoolName("Belview Elementary");
       BelviewE.setSchoolAddress("3187 Pepper's Ferry Road\n" +
               "Radford, VA 24141");
       BelviewE.setPrincipal("Chris Hewitt");
       BelviewE.describeSchool();

       School blacksburgHigh = new HighSchool();
       blacksburgHigh.setEnrollment(400);
       blacksburgHigh.setSchoolName("Blacksburg High");
       blacksburgHigh.setSchoolAddress("3401 Bruin Lane\n" +
               "Blacksburg, VA 24060");
       blacksburgHigh.setPrincipal("Adam Simpson");

       School blacksburgMiddle = new MiddleSchool();
       blacksburgMiddle.setEnrollment(400);
       blacksburgMiddle.setSchoolName("Blacksburg Middle");
       blacksburgMiddle.setSchoolAddress("3109 Price's Fork Road\n" +
               "Blacksburg, VA 24060");
       blacksburgMiddle.setPrincipal("David Byrd");
       blacksburgMiddle.describeSchool();

       School christiansburgE = new ElementarySchool();
       christiansburgE.setEnrollment(400);
       christiansburgE.setSchoolName("Christiansburg Elementary");
       christiansburgE.setSchoolAddress("160 Wade's Lane\n" +
               "Christiansburg, VA 24073");
       christiansburgE.setPrincipal("Malinda Morgan");
       christiansburgE.describeSchool();

       School christiansburgH = new HighSchool();
       christiansburgH.setEnrollment(400);
       christiansburgH.setSchoolName("Christiansburg High");
       christiansburgH.setSchoolAddress("100 Independence Boulevard\n" +
               "Christiansburg, VA 24073");
       christiansburgH.setPrincipal("Gene Jones");
       christiansburgH.describeSchool();

       School christiansburgM = new MiddleSchool();
       christiansburgM.setEnrollment(400);
       christiansburgM.setSchoolName("Christiansburg Middle");
       christiansburgM.setSchoolAddress("1205 Buffalo Drive, NW\n" +
               "Christiansburg, VA 24073");
       christiansburgM.setPrincipal("Andy Hipple");
       christiansburgM.describeSchool();

       School christiansburgP = new PrimarySchool();
       christiansburgP.setEnrollment(400);
       christiansburgP.setSchoolName("Christiansburg Primary");
       christiansburgP.setSchoolAddress("240 Betty Drive\n" +
               "Christiansburg, VA 24073");
       christiansburgP.setPrincipal("Jessica Jones");
       christiansburgP.describeSchool();

       School eastMontE = new ElementarySchool();
       eastMontE.setEnrollment(400);
       eastMontE.setSchoolName("Eastern Montgomery Elementary");
       eastMontE.setSchoolAddress("4580 Eastern Montgomery Ln\n" +
               "Elliston, VA 24087");
       eastMontE.setPrincipal("Lori Corner");
       eastMontE.describeSchool();

       School eastMontH = new HighSchool();
       eastMontH.setEnrollment(400);
       eastMontH.setSchoolName("Eastern Montgomery High");
       eastMontH.setSchoolAddress("4695 Crozier Road\n" +
               "Elliston, VA 24087");
       eastMontH.setPrincipal("Todd Lewis");
       eastMontH.describeSchool();

       School FallBranchE = new ElementarySchool();
       FallBranchE.setEnrollment(400);
       FallBranchE.setSchoolName("Falling Branch Elementary");
       FallBranchE.setSchoolAddress("735 Falling Branch Road\n" +
               "Christiansburg, VA 24073");
       FallBranchE.setPrincipal("Ann Mitchell");
       FallBranchE.describeSchool();

       School GilLinkE = new ElementarySchool();
       GilLinkE.setEnrollment(400);
       GilLinkE.setSchoolName("Gilbert Linkous Elementary");
       GilLinkE.setSchoolAddress("813 Tom's Creek Road\n" +
               "Blacksburg, VA 24060");
       GilLinkE.setPrincipal("Michelle Flynn");
       GilLinkE.describeSchool();

       School HardAveE = new ElementarySchool();
       HardAveE.setEnrollment(400);
       HardAveE.setSchoolName("Harding Avenue Elementary");
       HardAveE.setSchoolAddress("429 Harding Avenue\n" +
               "Blacksburg, VA 24060");
       HardAveE.setPrincipal("Steven Sizemore");
       HardAveE.describeSchool();

       School KippsE = new ElementarySchool();
       KippsE.setEnrollment(400);
       KippsE.setSchoolName("Kipps Elementary");
       KippsE.setSchoolAddress("2801 Price's Fork Road\t\n" +
               "Blacksburg, VA 24060");
       KippsE.setPrincipal("Dr. Mark Crummey");
       KippsE.describeSchool();

       School MarBeeksE = new ElementarySchool();
       MarBeeksE.setEnrollment(400);
       MarBeeksE.setSchoolName("Margaret Beeks Elementary");
       MarBeeksE.setSchoolAddress("709 Airport Road\n" +
               "Blacksburg, VA 24060");
       MarBeeksE.setPrincipal("Dr. Beth Poff");
       MarBeeksE.describeSchool();

       School PriceForkE = new ElementarySchool();
       PriceForkE.setEnrollment(400);
       PriceForkE.setSchoolName("Price's Fork Elementary");
       PriceForkE.setSchoolAddress("4021 Price's Fork Road\n" +
               "Blacksburg, VA 24060");
       PriceForkE.setPrincipal("Melanie Harrell");
       PriceForkE.describeSchool();

       School ShawsvilleM = new MiddleSchool();
       ShawsvilleM.setEnrollment(400);
       ShawsvilleM.setSchoolName("Shawsville Middle");
       ShawsvilleM.setSchoolAddress("4179 Old Town Road\n" +
               "Shawsville, VA 24162");
       ShawsvilleM.setPrincipal("Brandon Keith");
       ShawsvilleM.describeSchool();


   }
}