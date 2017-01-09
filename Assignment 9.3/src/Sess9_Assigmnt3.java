import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class Sess9_Assigmnt3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n, i, tempCode;
		String tempName;
		Scanner sc = new Scanner(System.in);
		Map<Integer, String> employee = new HashMap<Integer, String>();
		System.out.println("Enter the no. of employees: ");
		n = sc.nextInt();

		for (i = 0; i < n; i++) {
			System.out.println("Enter the Employee Code(Empcode)");
			tempCode = sc.nextInt();
			sc.nextLine();
			System.out.println("Enter the Employee Name(EmpName)");
			tempName = sc.nextLine();
			employee.put(tempCode, tempName);
		}

		Iterator<String> valueIterator = employee.values().iterator();
		System.out.println("Employees Names are:");
		while (valueIterator.hasNext()) {
			System.out.println(valueIterator.next());
		}
	}
}

/*
******************************************************************************
Output:
Enter the no. of employees: 
3
Enter the Employee Code(Empcode)
1
Enter the Employee Name(EmpName)
Adarsh
Enter the Employee Code(Empcode)
2
Enter the Employee Name(EmpName)
Akshay
Enter the Employee Code(Empcode)
3
Enter the Employee Name(EmpName)
Ajay
Employees Names are:
Adarsh
Akshay
Ajay
******************************************************************************
*/
