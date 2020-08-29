
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(true && false);
System.out.println(true || false);
System.out.println(false && false);
System.out.println(true && (false || true));
System.out.println(false || (true && false));
System.out.println(false || 1 < 5);
System.out.println(5 >= 4 && 1 > 3);
System.out.println(10 < 4 || 1 > 4);
System.out.println(12 >= 2 && 1 < 24);

String greeting = "Hello";
System.out.println(greeting.charAt(0) == 'h');

boolean isHotOutside = true;
boolean isWeekday = false;
boolean hasMoneyInPocket = true;
double costOfMilk = 2.99;
double moneyInWallet = 48.55;
int thirstLevel = 7;

boolean shouldBuyIcecream = isHotOutside && hasMoneyInPocket;
System.out.println("Should buy ice cream - " + shouldBuyIcecream);

boolean willGoSwimming = isHotOutside && !isWeekday;
System.out.println("Will go swimming - " + willGoSwimming);

boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
System.out.println("Is a good day - " + isAGoodDay);

boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk * 2;
System.out.println("Will buy Milk - " + willBuyMilk);












	}

}
