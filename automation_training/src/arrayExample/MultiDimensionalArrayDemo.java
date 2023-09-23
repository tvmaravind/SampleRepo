package arrayExample;

public class MultiDimensionalArrayDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int[][] lotteryCard2 = new int[3][3];
		
		
		
		
		
		lotteryCard2[0][0] = 20;
		lotteryCard2[0][1] = 15;
		lotteryCard2[0][2] = 10;
		lotteryCard2[1][0] = 30;
		lotteryCard2[1][1] = 25;
		lotteryCard2[1][2] = 20;
		lotteryCard2[2][0] = 40;
		lotteryCard2[2][1] = 35;
		lotteryCard2[2][2] = 30;
		
		
		System.out.println(lotteryCard2[2][1]);
		System.out.println("***************************************************************");		
		int[][] lotteryCard = {	{20, 15, 10}, //1
				{30, 25, 20}, //2
				{40, 35, 30}}; //3
		
	//		{20, 15, 10}, //1
		//	{30, 25, 20}, //2
		//	{40, 35, 30} //3	
		
		
		for(int i = 0; i<lotteryCard.length;i++) //row
		{
			for(int j=0; j<lotteryCard.length;j++) //column
			{
				System.out.print(lotteryCard[i][j]+" ");
			}
			System.out.println();
		}
		
		
		System.out.println("***************************************************************");
		
		
		
		
		
		
		
		
		
		
		for(int i=0; i<3; i++)
		{
			for(int j=0; j<3; j++)
			{
				System.out.println(lotteryCard[i][j]);
			}
		}
		}
	}


