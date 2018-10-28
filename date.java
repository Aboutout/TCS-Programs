
/*Program 1
Count number of days between two giving dates for e.g. start date 01/01/2015 and end date
01/01/2019*/
import java.util.*;
import java.text.SimpleDateFormat;
class date{
   public static void main(String args[]){
         Scanner sc=new Scanner(System.in);
	 SimpleDateFormat myFormat = new SimpleDateFormat("dd/MM/yyyy");
	 String dateBeforeString =sc.next();// "31/01/2014";
	 String dateAfterString = sc.next();// "02/02/2014";

	 try {
	       Date dateBefore = myFormat.parse(dateBeforeString);
	       Date dateAfter = myFormat.parse(dateAfterString);
	       long difference = dateAfter.getTime() - dateBefore.getTime();
	       float daysBetween = (difference / (1000*60*60*24));
	       System.out.println("Number of Days between dates: "+daysBetween);
	 } catch (Exception e) {
	       System.out.println("ERROR");
	 }
   }
}
