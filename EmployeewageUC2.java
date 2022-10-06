package Employeewage;

public class EmployeewageUC2 {

	public static void main(String[] args) {
	int is_fulltime=1;
	int emp_rateperhour=20;
	int emphrs=0;
	int empwage=0;
	double empcheck= Math.floor(Math.random()* 10) %2;
	if(empcheck ==is_fulltime) {
		emphrs=8;
		
	}
	else {
		emphrs=0;
	}
	empwage=emphrs*emp_rateperhour;
	System.out.println("emp wage" +empwage);
	}

}
