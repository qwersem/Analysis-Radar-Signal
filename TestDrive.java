
public class TestDrive {

	public static void main(String[] args) {
		
		
		FluctuationSignal otklik = new FluctuationSignal(1, 50, 10);
		
		//System.out.print(otklik.signal);
		
		for (int i = 0; i < 100; i++)
        {
			System.out.println(otklik.signal[i]);
        }
		//System.out.println();
		
		
	}

}
