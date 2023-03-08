
public class NumbrixPuzzle {
	
	public int numEars(int bunnies)
	{
		if (bunnies == 0)
		{
			return 0;
		}
		else
		{
			return 2 + numEars(bunnies-1);
		}
		  
	}
	
	public void countdown(int num)
	{
		if(num == 0)
		{
			System.out.print("blastoff!");
		}
		else
		{
			System.out.println(num + ", ");
			countdown(num-1);
		}
	}
	
	public int factorial(int num)
	{
		if(num == 1)
		{
			return num;
		}
		else
		{
			return num * factorial(num-1);
		}
	}
	
	public String cheerlead(String str, int i)
	{
		if (i==1)
		{
			return str;
		}
		else
		{
			return cheerlead(str, i-1);
		}
	}
	
	public int power(int num, int power)
	{
		if(power == 0)
		{
			return 1;
		}
		else
		{
			return num * power(num, power-1);
		}
	}
	
	//6 - All the other people in the hotel room are women
	
	public int fib(int n)
	{
		if(n <= 1)
		{
			return n;
		}
		else
		{
			return fib(n-1) + fib(n-2);
		}
	}
	
	public void printPattern(int n)
	{
		if(n <= 0)
		{
			System.out.print(n);
		}
		else
		{
			System.out.println(n + " ");
			
			printPattern(n-5);
			
			System.out.print(" " + n);
		}
	} 
	
	public int countNumA(String s)
	{
		if(s.length() == 0)
		{
			return 0;
		}
		
		if (s.substring(0) == "a")
		{
			return 1 + countNumA(s.substring(1));
		}
		
		return countNumA(s.substring(1));
	}
	
	public void printAtoBbyC(int a, int b, int c)
	{
		if(a==b)
		{
			System.out.println(a);
		}
		else
		{
			System.out.println(a);
			printAtoBbyC(a+c, b, c);
		}
	}
	
	public int countOdds(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else
		{
			if((n%10) % 2 == 1)
			{
				return 1 + countOdds(n/10);
			}
			else
			{
				return countOdds(n/10);
			}
		}
	}
	
	public int sumDigits(int n)
	{
		if(n == 0)
		{
			return 0;
		}
		else
		{
			return n%10 + sumDigits(n/10);
		}
	}

	
	

}
