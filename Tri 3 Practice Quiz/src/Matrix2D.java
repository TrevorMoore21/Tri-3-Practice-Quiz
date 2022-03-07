
public class Matrix2D
{
		

		public static void a2DMatrix()
		{
			
			int [][] tim = new int [6][6];
			
			
			
			
			int pp = 0;
			int c = 0;
			
			for (int i = 0; i < tim.length; i ++)
				{
					for (int j = 0; j < tim[0].length; j++)
						{
							
							int leggo = (int) ((Math.random() * 90) + 10);
							tim [i][j] = leggo;
							
							
							c = tim[i][j];
							System.out.print(c + " ");
							
							if (c > pp)
								{
									pp = c;
								}
						}
					System.out.println();
				}
			
			System.out.println();
			System.out.println(pp + " is the largest value");
			
			
			
		}
		

	}
