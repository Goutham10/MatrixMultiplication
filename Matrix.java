package twodimensionalArrays;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) 
	{
		Scanner obj =new Scanner(System.in);
		System.out.println(" first matirx ");
		System.out.println(" enter the row size ");
		int a=obj.nextInt();
		System.out.println(" enter the column size : ");
		int b=obj.nextInt();
		int x[][]=new int [a][b];
		System.out.println(" enter the elements ");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				x[i][j]=obj.nextInt();
			}
		}
		System.out.println(" the first matrix is :");
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				System.out.print(x[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println(" second matrix ");
		System.out.println(" enter the row size : ");
		int a1=obj.nextInt();
		System.out.println(" enter the column size :");
		int b1=obj.nextInt();
		int y[][]=new int[a1][b1];
		System.out.println(" enter the elements :");
		for(int i=0;i<a1;i++)
		{
			for(int j=0;j<b1;j++)
			{
				y[i][j]=obj.nextInt();
			}
		}
		System.out.println(" the second matrix is :");
		for(int i=0;i<a1;i++)
		{
			for(int j=0;j<b1;j++)
			{
				System.out.print(y[i][j]+" ");
			}
			System.out.println();
		}
		if(b!=a1)
		{
			System.out.println(" matrice multiplication not possible ");
		}
		else
		{
			System.out.println(" the multiplication for two matrices :");
		int r[][]=new int[a][b1];
		int sum=0;
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b1;j++)
			{
				for(int k=0;k<b;k++)
				{
					sum=sum+x[i][k]*y[k][j];
				}
				r[i][j]=sum;
				sum=0;
			}
		}
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b1;j++)
			{
				System.out.print(r[i][j]+" ");
			}
			System.out.println();
		}
		}
	}

}
