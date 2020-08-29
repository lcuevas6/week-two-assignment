
public class Loops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	int x = 0;
	while (x ++ < 100) {	
	if (x % 2 == 0)
		System.out.println(x);

	}
	int y = 100;
	while (y -- > 0) {
		if (y % 3 == 0)
		System.out.println(y);
		
	}
	
	for (int i = 1; i <= 100; i+=3) {
			System.out.println(i);	
	}
	
	for (int z = 0; z <= 100; z++) {
		if (z % 3 == 0 && z % 5 == 0) {
			System.out.println("Hello World");
		}
		else if (z % 3 == 0) {
		System.out.println("Hello");
		}
		else if (z % 5 == 0) {
		System.out.println("World");
		}
		else {
		System.out.println(z);
	}
	}
	}

}
