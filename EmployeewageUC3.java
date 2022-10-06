package Employeewage;

public class EmployeewageUC3 {

	public static void main(String[] args) {
		int is_parttime=1;
		int is_fulltime=2;
		int emp_rateperhour=20;
		int emphrs=0;
		int empwage=0;
		double empcheck= Math.floor(Math.random()* 10) %3;
		if(empcheck ==is_parttime) {
			emphrs=4;
		}
		else if(empcheck==is_fulltime){
			emphrs=8;
		}
		else {
			emphrs=0;
		}
		empwage=emphrs*emp_rateperhour;
		System.out.println("emp wage" +empwage);

	}

}
