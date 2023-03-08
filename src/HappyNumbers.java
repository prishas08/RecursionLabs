
public class HappyNumbers {
	
	//#1 
	
	public boolean palindrome(String s)
	{
		if (s.length() == 0 || s.length() == 1)
		{
			return true;
		}
		
		if(s.charAt(0) == s.charAt(s.length()-1))
		{
			return palindrome(s.substring(1,s.length()-1));
		}
		
		return false;
	}
	
	//#2
	
	public boolean prime(int num, int div)
	{
		if(num % div == 0)
		{
			return false;
		}
		if (div * div > num || div > num)
		{
			return true;
		}
		//confused ^^
		
		return prime(num, div+1);
	}
	
	//#3
	
	public void timesTwo(int n)
	{
		if (n%2 != 0)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println("2 * ");
			timesTwo(n/2);
		}
	}
	
	//#4
	
	public int tri(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return n + tri(n);	
		}
		
	}
	
	//#5
	
	public int penta(int n)
	{
		if(n == 1)
		{
			return 1;
		}
		else
		{
			return (penta(n) + 4) + (3 * (n-2));
		}
		
	}
	
	//#6 - All of his children are girls
	
	//#7
	
	public int sum(int[] n, int x)
	{
		if(x == n.length-1)
		{
			return n[x];
		}
		else
		{
			return n[x] + sum(n, x+1);
		}
	}
	
	//#8a
	
	public String reverseString(String str)
	{
		if(str.length() == 0)
		{
			return str;
		}
		else
		{
			return reverseString(str.substring(1) + str.charAt(0));
		}
	}
	
	//#8b
	
	public void printReverse(String str)
	{
		if(str.length() > 0)
		{
			System.out.print(str.substring(str.length()-1));
			printReverse(str.substring(0, str.length()-1));
		}
	}
	
	//#9 Penny's fifth child's name is what
	
	//#10
	
	public boolean isPowerOfN(int num, int base)
	{
			
		if(base > num)
		{
			return false;
		}
		if(base == num)
		{
			return true;
		}
		else
		{
			return isPowerOfN(num/3, base);
		}
		
		
	}
	
	//#11 
	
	public String curlyString(String s)
	{
		if(s.substring(1) == "{")
		{
			if(s.substring(s.length()-1) == "}")
			{
				return curlyString(s.substring(0,s.length()-1));
			}
			else
			{
				return "";
			}
		}
		else
		{
			return curlyString(s.substring(1,s.length()-1));
		}
		
	}
	
	//#12
	
	public void printPattern2(int n)
	{
		if(n <= 0)
		{
			System.out.print(n);
		}
		else
		{
			System.out.println(n + " ");		
			printPattern2(n-5);
			System.out.print(" " + n);
		}
	}
	
	//#13 
	
	public void printSquares(int n)
	{
		if(n<1)
		{
			System.out.println(n);
		}
		else
		{
			System.out.println((n + n/2) * (n + n/2));
			printSquares(n-1);
			System.out.println((n + n/2) * (n + n/2));
			printSquares(n+1);
		}

	}
	
	//#14
	
	public String wordWrap(String line, int width)
	{
		if(line.length()==0)
		{
			return "";
		}
		else
		{
			return wordWrap(line.substring(8,line.length()), 8);
		}
	}
	
	
	//Happy Numbers 
	
	public int squareSum(int n)
	{
		int sum = 0;
		while(n != 0 )
		{
			sum += (n % 10) * (n % 10);
			n = n/10;
		}
		return sum;
	}
	
	public boolean isHappy(int n)
	{
		int one = n; 
		int two = n;
		
		while(one != two)
		{
			one = squareSum(one);
			two = squareSum(squareSum(two));
		}
		if(one == 1)
		{
			return true;
		}
		else 
		{
			return false;

		}
	}

}
