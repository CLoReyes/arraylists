import java.util.ArrayList;

public class Array_Lists
	{

		public static void main(String[] args)
			{
				
			
				//Intro
				Challenge_One();
				Challenge_Two();
				Challenge_Three();
					
				
				//2D Array
				TwoDChallengeOne();
				TwoDChallengeTwo();
				TwoDChallengeThree();
					
			
					
			}

		


		private static void practice()
			{
				//first number is the row
				//second is the column
				
				ArrayList <Integer> myArray = new ArrayList <> ();
				myArray.add(3);
				myArray.add(5);
				
				for (int i = 0; i < myArray.size(); i++)
					{
						System.out.println(myArray.get(i));
					}
				
				
				
				
				
			}

		private static void Challenge_One()
			{
				//ArrayList arrayOne = new ArrayList();
				ArrayList <Double> myArray = new ArrayList <> ();
				myArray.add(3.5);
				myArray.add(5.3);
				myArray.add(8.2);
				myArray.add(6.3);
				myArray.add(3.3);
				
				for (int i = 0; i < myArray.size(); i++)
					{
						System.out.println(myArray.get(i));
					}
				
				

			}

		private static void Challenge_Two()
			{
				
						
			}

		private static void Challenge_Three()
			{
				
			}
		
		

		private static void TwoDChallengeOne()
			{

				int arrayName [] [] = { {22, 23}, {24, 25}, {25, 27} };
				for (int i = 0; i < 2; i++)
					{
						for (int j = 0; j < 3; j++)
							{
								arrayName [i][j] = 0;
							}
					}
	
			}

		private static void TwoDChallengeTwo()
			{
			
			}

		private static void TwoDChallengeThree()
			{
				
			}

	}
