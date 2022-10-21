package sep_26;

public class inheritance1 {
	public static void speed(int gear)
	{
		switch(gear)
		{
		case 1:
			System.out.println("Speed limit is 20-40");
			break;
		case 2:
			System.out.println("Speed limit is 60-80");
			break;

		case 3:
			System.out.println("Speed limit is 90-100");
			break;

		case 4:
			System.out.println("Speed limit is 120-140");
			break;

		case 5:
			System.out.println("Speed limit is 140-160");
			break;
	    default:
	    	System.out.println("Speed limit does not exixts");
            break;

	}
	

}
}
