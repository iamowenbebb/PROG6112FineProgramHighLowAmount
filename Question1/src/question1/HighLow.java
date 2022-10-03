/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

import java.util.*;
public class HighLow
{
	public static void main(String[] args) {
		//create a 2D array to store speeds
		int [][]arr={
		              {128,135,139},
		              {155,129,175},
		              {129,130,185},
		              {195,155,221}
		            };
		//string array to store the city
		String city[]={"JHB","DBN","CTN","PE "};
		//String array to store month
		String month[]={"JAN","FEB","MAR"};
		
		int maximumSpeed=-1;
		int minimumSpeed=1000000;
		//finds the maximumSpeed and minimumSpeed in the 2D array
		 for(int i=0;i<4;i++){
		     for(int j=0;j<3;j++){
		         if(arr[i][j]>maximumSpeed){
		             maximumSpeed=arr[i][j];
		         }
		         if(arr[i][j]<minimumSpeed){
		             minimumSpeed=arr[i][j];
		         }
		         
		     }
		 }
		 //print the output using printf the number are for indentations
		System.out.println("-------------------------------------------------------------");
		System.out.println("Speeding Fines");
		System.out.println("-------------------------------------------------------------");
		for(int i=0;i<3;i++){
		    if(i==0){
		        System.out.printf("%26s",month[i]);
		    }
		    else{
		        System.out.printf("%17s",month[i]);
		    }
		}
		System.out.println();
		
		for(int i=0;i<4;i++)
		{
		    System.out.printf("%s",city[i]);
		    for(int j=0;j<3;j++){
		        if(j==0){
		            System.out.printf("%23d",arr[i][j]);
		            System.out.printf("%s","km");
		        }
		        else{
		            System.out.printf("%15d",arr[i][j]);
		            System.out.printf("%s","km");
		        }
		    }
		    System.out.println();
		}
			System.out.println("-------------------------------------------------------------");
			System.out.println("Speeding Fines Statistics");
			System.out.println("-------------------------------------------------------------");
			System.out.println("Maximun speed captured: "+maximumSpeed+"km");
			System.out.println("Minimum speed captured: "+minimumSpeed+"km");
			System.out.println("-------------------------------------------------------------");
	}
}

