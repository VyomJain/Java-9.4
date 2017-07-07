/*A program to add integer objects into ArrayList and 
print only even numbers present in the ArrayList.*/
import java.util.*;
public class EvenArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size,num;
		Scanner input = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		ArrayList<Integer>al = new ArrayList<Integer>();
		System.out.println("Enter the number of integer to be stored in ArrayList :");
		size = input.nextInt();
		 
		for(int i =0 ; i<size; i++)
		{	
			System.out.println("Enter the integer in ArrayList :");
			
			num = sc.nextInt();
			if(num%2==0)
			{
			 al.add(num);
			}
		}			
			System.out.println(" The even integers in ArrayList :"+al);
			input.close();
			sc.close();
	}

}
