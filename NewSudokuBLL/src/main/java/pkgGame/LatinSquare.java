package pkgGame;

import java.util.Arrays;

public class LatinSquare {
	
	private int[][] LatinSquare;
	
	public LatinSquare() {
		super();
	}
	
	public LatinSquare(int[][] puzzle) {
		super();
		LatinSquare = puzzle;
	}
	
	public int[][] getLatinSquare() {
		return LatinSquare;
	}
	
	public void setLatinSquare(int[][] latinSquare) {
		LatinSquare = latinSquare;
	}
	
	public static boolean doesElementExist(int[] arr, int iValue)
	{
		for (int x = 0; x < arr.length; x++)
		{
			if (arr[x] == iValue) {
				return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasAllValues(int[] arr1, int[] arr2) 
	{
		boolean hasAllValues = true;
		for (int j = 0; j < arr2.length; j++) {
			boolean bFound = false;
			
			for (int i = 0; i < arr1.length; i++) {
				if(arr1[i] == arr2[j]) {
					bFound = true;
					break;
				}
			}
			if (bFound == false) 
			{
				hasAllValues = false;
				break;
			}
			}
			return hasAllValues;
		}
	
	public boolean ContainsZero()
	{
		for (int iRow = 0; iRow < this.LatinSquare.length; iRow++)
		{
			for (int iCol = 0; iCol < this.LatinSquare.length; iCol++)
			{
				if(this.LatinSquare[iRow][iCol]==0)
					return true;
			}
		}
		
		return false;
	}
	
	public static boolean hasDuplicates(int[] arr)
	{
		Arrays.sort(arr);
		for (int i = 0; i < arr.length-1; i++)
		{
			if (arr[i]==arr[i+1])
				return true;
		}
			
		return false;
	}
	
	public int[] getColumn(int iCol) 
	{
		int column[] = new int[this.LatinSquare.length];
		for(int iRow = 0; iRow < this.LatinSquare.length; iRow++)
		{
			column[iRow] = this.LatinSquare[iRow][iCol];
		}
		return column;
	}
}
