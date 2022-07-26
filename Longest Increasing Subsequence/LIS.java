package Project;

import java.util.Scanner;

public class LIS {
	public static void main(String[] args) 
		{
		    int a=0;
		    System.out.println("Take number of elements in array");
		    Scanner sc = new Scanner(System.in);
		    int n = sc.nextInt();
		    System.out.println("Enter the elements in array");
		    int arr[] = new int[n];
		    for (int i = 0 ; i < arr.length; i++ )
		    {
		           arr[i] = sc.nextInt();
		    }
		    int b=1;
		    n=arr.length;
		    int c=0;
		    for(int i=0;i<n;i++)
		    {
		        c=arr[i];
		        for(int j=i;j<n-1;j++)
		        {
		            
		            if(c<arr[j+1])
		            {
		                c=arr[j+1];
		                b++;
		            }
		        }
		        if(a<=b)
		        {
		            a=b;
		        }
		        b=1;
		    }
		    System.out.println("Longest Increasing Subsequence is: "+a);
			
		}
	}