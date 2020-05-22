
	int Work_Hrs_checker = (int) (Math.floor(Math.random()*10)%2+1);

	switch (Work_Hrs_checker) {
		case 1:
		 Daily_Wage=(is_Present * Wage_per_hr *Full_Day_hr);
   System.out.println("Full-Time Wage = "+Daily_Wage);
		break;
		case 2:
		 Daily_Wage=(is_Present * Wage_per_hr *Part_Time_hr);
   System.out.println("Part-Time Wage = "+Daily_Wage);
		break;
	}






	}
}
