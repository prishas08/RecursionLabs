/**
 * Numbrix.java  6/11/2011
 *
 * @author - Jane Doe
 * @author - Period n
 * @author - Id nnnnnnn
 *
 * @author - I received help from ...
 *
 *
 * Solves Numbrix puzzles
 * http://www.parade.com/numbrix
 */

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Represents a Numbrix puzzle.
 */
public class Numbrix
{
	/** The puzzle data */
	private int[][] grid;

	/** Indicates whether numbers are used in the original puzzle
	 *  If the number n is used, then used[n] is true;  Otherwise it's false */
	private boolean[] used;


	/**
	 * Constructs a Numbrix puzzle object.
	 * @param fileName the name of the file containing the puzzle data.
	 * @throws FileNotFoundException when fileName file does not exist.
	 */
	public Numbrix(String fileName) throws FileNotFoundException
    {
		Scanner filename = new Scanner(new File(fileName));
		int row = filename.nextInt();
		int column = filename.nextInt();
		grid = new int[row][column];
		used = new boolean[row * column + 1];
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				grid[i][j] = filename.nextInt();
			}
		}
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				for(int i2 = 0; i2 < grid.length; i2++)
				{
					for(int j2 = 0; j2 < grid[0].length; j2++)
					{
						if(grid[i][j] == grid[i2][j2])
						{
							used[grid[i][j]]=false;
						}
					}
				}
			}
		}
		
    }

	/**
	 * Finds all solutions to the Numbrix puzzle stored in grid by
	 * calling recursiveSolve for every possible cell in grid that
	 * originally contains a 0 or a 1.  Each of these calls should
	 * attempt to solve the puzzle beginning with the number 1.
	 */
	public void solve()
	{
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				recursiveSolve(i,j,1);
			}
		}
	}

	/**
	 * Attempts to solve the Numbrix puzzle by placing n in grid[r][c]
	 * and then makeing recursive calls (up, down, left, and right) to
	 * place n+1 and higher numbers.
	 * @param r the row of the cell in which to place n.
	 * @param c the column of the cell in which to place n.
	 * @param n the number to place in grid[r][c].
	 */
	private void recursiveSolve(int r, int c, int n)
	{
		if(r < grid.length && r > 0 && c< grid[0].length && c > 0)
		{
			
		}
		boolean zero=(grid[r][c]==0);
		
		
		if(zero==true && used[n]==true)
		{

		}
		if(zero==false && n!= grid[r][c])
		{
			
		}
		else
		{
			if(n==grid.length*grid[0].length)
			{
				System.out.println(this);
			}
			else
			{
				if(r>1)
				{
					recursiveSolve(r-1,c,n+1);
				}
				if(c>1)
				{
					recursiveSolve(r,c-1,n+1);
				}
				if(r<grid.length)
				{
					recursiveSolve(r+1,c,n+1);
				}
				if(c<grid.length)
				{
					recursiveSolve(r,c+1,n+1);
				}
			}
			if(zero==true)
			{
				grid[r][c]=0;
			}
		}
		

	}

	/**
	 * Returns a String which represents the puzzle.
	 * @return the puzzle numbers with a tab after each number in a row
	 *         and a new line character after each row.
	 *         '-' characters should replace 0s in the output.
	 */
	public String toString()
	{
		String result = "";
		for(int i = 0; i < grid.length; i++)
		{
			for(int j = 0; j < grid[0].length; j++)
			{
				if(grid[i][j]==0)
				{
					result+= "-\t";
				}
				else
				{
					result += grid[i][j] + "\t";
				}
			}
			result += "\n";
		}
		return result;
	}
}