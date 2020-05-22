int Maximum_Days_Allowed=20;
	int	Maximum_Hrs=100;
	int TotalEmpHrs=0;
	int TotalWorkingDays=0;
	while (TotalEmpHrs <Maximum_Hrs && TotalWorkingDays < Maximum_Days_Allowed )
	{
	TotalWorkingDays++;

	switch (Work_Hrs_checker) {
      case 1:
      empHrs=8;
      break;
      case 2:
       empHrs=4;
      break;
      }
	TotalEmpHrs=TotalEmpHrs+empHrs;
	}
	Total_Salary=(TotalEmpHrs*Wage_per_hr);
	System.out.print("Total Salary Till Maximum Hrs in Month is ReACHED = " +Total_Salary);
