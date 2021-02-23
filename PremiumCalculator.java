import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
 class AgeCalculator {
	 public  static int ageCalculator(String ageCalcMethod) {
	int age;
	
 
	  LocalDate dob = LocalDate.of(1990, 04, 23); //specify year, month, date directly
	  LocalDate today = LocalDate.now(); //gets localDate
  
	  Period diff = Period.between(dob, today); //difference between the dates is calculated
 System.out.println(diff.getYears() + " years " + diff.getMonths() + "  months " + diff.getDays() + " days ");
	int years=0;
	int months=diff.getMonths();
	if(ageCalcMethod.equalsIgnoreCase("ALB"))//age last birthday
		years=diff .getYears();
	else if(ageCalcMethod.equalsIgnoreCase("ANB"))//age next birthday
		years= diff .getYears()+1;
	else if(ageCalcMethod.equalsIgnoreCase("ANR"))//age nearer birthday
		if(months<6)
			years= diff.getYears();
		else
			years= diff.getYears()+1;
	return years;
}
} 
class PremiumCalculator{
	public static void main(String arggs[]){
		int age;
		
		double sumassured=100000;
		HashMap rates=new HashMap();
		rates.put(20,2.0);
		rates.put(21,2.1);
		rates.put(22,2.2);
		rates.put(23,2.3);
		rates.put(24,2.4);
		rates.put(25,2.45);
		rates.put(26,2.5);
		double Premium;
		age=AgeCalculator.ageCalculator("ANR");
		//Premium=sumassured * 2.1/100;
		Premium=sumassured * (Double)rates.get(age)/100;
		System.out.println(rates.get(age));
		System.out.println("premium is : "+Premium);
			if(rates.get(age)!=null)
				System.out.println(rates.get(age));
			else
				System.out.println("invalid number");
	}
}