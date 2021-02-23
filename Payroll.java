//Program by Deekshitha on 17-sep-2019
//java program to devolp a employement pyroll system.
import java.util.Scanner;
class Employee
{
String empName;
double salary;
char gender;
char grade;
SalaryProcess sp;
public Employee()
{
Scanner sc=new Scanner(System.in);
System.out.print("Enter Employee Name : ");
empName=sc.nextLine();
System.out.print("Enter Salary of employee : ");
this.salary=Float.parseFloat(sc.nextLine());
System.out.print("Enter gender of employee (M/F): ");
this.gender=sc.nextLine().charAt(0);
System.out.print("Enter Grade of employee (A/B): ");
this.gender=sc.nextLine().charAt(0);
sp=new SalaryProcess();
sp.salary=this.salary;
sp.gender=this.gender;
}
public void empDetails()
{
	System.out.println("\n\n**********Employee Details*************");
	System.out.println("Employee Name : "+empName+"\nSalary : "+salary+"\nGender : "+gender+"\nGrade : "+grade);
}

}
class SalaryProcess
{
double salary,basic,houseRentAllowance,dearnessAllowance,medicalAllowance,leaveTravelAllowance,specialAllowance;
double incomeTax,providentFund,professionalTax,taxableIncome,grossDeductions,netSalary;
char gender;
public void calcGD()
{
	this.grossDeductions=incomeTax+providentFund+professionalTax;
}
public  void calcBasic()
{
if(salary<15000)
this.basic=salary*0.5;
else
this.basic=salary*0.3;


}
public  void calcHRA()
{
this.houseRentAllowance=basic*0.4;
}
public void calcDA ()
{
     this.dearnessAllowance=1100.00;

}
public void calcMA()
{
this.medicalAllowance= 1250.00;
}

public void calcLTA()
{
leaveTravelAllowance=basic*0.5;
}
public void calcSA ()//Special Allowance
{
this.specialAllowance  = salary-basic-houseRentAllowance-dearnessAllowance-medicalAllowance-leaveTravelAllowance;
}

public void calcPF( )
{
this.providentFund = basic*0.12;
}


public void calcPT ()
{
this.professionalTax =200;
}
public void calcTI()
{
	
	calcPF();
	this.taxableIncome=12*(houseRentAllowance+dearnessAllowance+medicalAllowance+leaveTravelAllowance+providentFund);
	taxableIncome=(salary*12)-taxableIncome;
}

public void calcEarnings()
{
calcBasic();
calcHRA();
calcDA();
calcMA();
calcLTA();
calcSA();

}
public String showEarnings()
{
return "Basic :"+basic+"\nHRA :"+houseRentAllowance+"\nDA :"+dearnessAllowance+"\nMA :"+medicalAllowance+"\nLTA :"+leaveTravelAllowance+"\nSpecial Allowance :"+specialAllowance;
}
public void calcDeductions()
{
	calcTI();
	calcIT();
	calcPF();
	calcPT();
}
public String showDeductions()
{
	return "IncomeTax  :"+incomeTax+"\nProvidentFund  :"+providentFund+"\nProfessionalTax  :"+professionalTax;
}
public void calcIT()
{
	calcTI();
System.out.println(taxableIncome);
System.out.println(gender);
System.out.println(incomeTax);
if(this.taxableIncome>=250000 && gender=='M')
	this.incomeTax=(taxableIncome-250000)*0.1/12;
else if(this.taxableIncome>=300000 && gender=='F')
{
	this.incomeTax=(taxableIncome-300000)*0.1/12;
System.out.println(incomeTax);
}
else
    incomeTax=0.0;
System.out.println(incomeTax);
}

public void calcNetSalary()
{
	calcGD();
	netSalary=salary-grossDeductions;
		
}
public void calcPayroll()
{
	calcEarnings();
	calcDeductions();
	calcNetSalary();

}
public void showPayroll()
{
 	 System.out.println(" Employee earnings:");
         System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
	 System.out.println(showEarnings());
	 System.out.println("--------------------------------------------");
	 System.out.println("Taxable Income : "+taxableIncome);
	 System.out.println("--------------------------------------------\n");
    	 System.out.println(" Employee Deductions:");
   	 System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~");
       	 System.out.println(showDeductions());
	 System.out.println("\n\n--------------------------------------------");
	 System.out.println("Net Salary : "+netSalary);
	 System.out.println("--------------------------------------------");
}
}
class Payroll
{
public static void main(String []a)
{
Employee e=new Employee();
	e.empDetails();
   	e.sp.calcPayroll();
  	e.sp.showPayroll();

}
}

   
