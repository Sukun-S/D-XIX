int Total_Working_Days_Month=20;
	int Total_Salary=0;

	if(is_Present==1)
	{
	for (int i =1;i<=Total_Working_Days_Month;i++)
	{
		 switch (Work_Hrs_checker) {
      case 1:
       empHrs=8;

      break;
      case 2:
       empHrs=4;

      break;
      }
	 salary=(empHrs*Wage_per_hr);
		Total_Salary+=salary;
	}
System.out.println(" Total Salary of A month = "+Total_Salary);
