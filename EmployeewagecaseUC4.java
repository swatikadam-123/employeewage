package Employeewage;

public class EmployeewagecaseUC4 {
         
	         public static final int is_parttime=1;
		     public static final int is_fulltime=2;
		     public static final int emp_rateperhour=20;
			 public static void main(String[] args) {
				
				
				int emphrs=0;
				int empwage=0;
				int empcheck=(int) Math.floor(Math.random()* 10) %3;
				switch(empcheck) {
				case is_parttime:
					emphrs=4;
					break;
				case is_fulltime:
					emphrs=8;
					break;
					default:
						emphrs=0;
				}
				empwage=emphrs*emp_rateperhour;
				System.out.println("emp wage" +empwage);

			}
	}


