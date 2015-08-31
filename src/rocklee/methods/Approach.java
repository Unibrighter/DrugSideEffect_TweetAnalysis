package rocklee.methods;

import org.apache.log4j.Logger;
import rocklee.units.*;

/***
 * This Class uses some Algorithm to do the comparisons between the String
 * and then outputs some results according to the strategy we use.
 * 
 * 
 * @version 2015-08-29 11:54
 * @author Kunliang WU
 *
 */

public class Approach
{

	/*
	 * Use the global edit distance strategy to compute the match rate
	 * 
	 * */
	
	public static double globalEditDistance(PlaceName placeName ,Tweet tweet)
	{
		double result=0d;
		
		//TODO implement the algorithm
				
		return result;
	}
	
	
	/*
	 * Use the local edit distance strategy to compute the match rate
	 * 
	 * Note this is to find whether the query exists in the given aim Text
	 * 
	 * Instead of compare the texts to calculate the result
	 * */
	public static double localEditDistance(PlaceName placeName ,Tweet tweet)
	{
		double result=0d;
		
		//TODO implement the algorithm
				
		return result;
	}
	
	
	
	
	
	
}
