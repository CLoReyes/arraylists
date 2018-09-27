import java.util.ArrayList;

public class Array_Lists
	{
		static ArrayList <Double> intro = new ArrayList <> ();
	
		public static void main(String[] args)
			{
				
			
//				Intro
//				Challenge_One();
//				Challenge_Two();
//				Challenge_Three();
//					
//				
//				2D Array
//				TwoDChallengeOne();
//				TwoDChallengeTwo();
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
				
				intro.add(3.5);
				intro.add(5.3);
				intro.add(8.2);
				intro.add(6.3);
				intro.add(3.3);
				
				for (int i = 0; i < intro.size(); i++)
					{
						System.out.println(intro.get(i));
					}
				
				

			}

		private static void Challenge_Two()
			{
				double sum = 0;
				for (int i = 0; i < intro.size(); i++)
					{
						sum = sum + intro.get(i);
					}
				System.out.println("+");
				System.out.println("= " + sum);
			
			}

		private static void Challenge_Three()
			{
				intro.remove(3.5);
				intro.add(7.4);
				intro.add(5.5);
				
				double sum = 0;
				for (int i = 0; i < intro.size(); i++)
					{
						sum = sum + intro.get(i);
					}
				double average = sum / intro.size();
				System.out.println("average = " + average);
				
			}
		
		

		private static void TwoDChallengeOne()
			{
				int numberNine [] [] = new int [3] [4];
				
				numberNine [0] [0] = 2;
				numberNine [0] [1] = 4;
				numberNine [0] [2] = 6;
				numberNine [0] [3] = 8;
				numberNine [1] [0] = 3;
				numberNine [1] [1] = 6;
				numberNine [1] [2] = 9;
				numberNine [1] [3] = 12;
				numberNine [2] [0] = 4;
				numberNine [2] [1] = 8;
				numberNine [2] [2] = 12;
				numberNine [2] [3] = 16;
				
				System.out.println(numberNine [1] [2]);
				
				
			}

		private static void TwoDChallengeTwo()
			{
				int mustangs [] [] = new int [5] [3];
				
				for (int row = 0; row < mustangs.length; row++)
					{
						for (int col = 0; col < mustangs[row].length; col++)
							{
								System.out.print("mustangs ");
							}
						System.out.println();
					}
			
					
			}

		private static void TwoDChallengeThree()
			{
				
				
				
				int byTens [] [] = new int [3] [3];
				
				for (int row = 0; row < byTens.length; row++)
					{
						for (int col = 0; col < byTens[row].length; col++)
							{
								
								System.out.print((int)(Math.abs(10)^10 * 6));
								System.out.print(" ");
								//System.out.print("10 " + (int)(Math.abs(1)*10 + 1));
							}
						System.out.println();
					}
			
//				final int [] [] matrix = 
//					{
//							{1, 2, 3},
//							{4, 5, 6},
//							{7, 8, 9}
//					};
//				
//				for (int row = 0; row < matrix.length; row++)
//					{
//						for (int col = 0; col < matrix[row].length; col++)
//						{
//							System.out.println(matrix[row] [col] + " ");
//						}
//						
//					}
				
			
			}

	}
