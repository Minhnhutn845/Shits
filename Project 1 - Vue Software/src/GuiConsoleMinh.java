import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Random;

public class GuiConsoleMinh {
	public static void main(String[] theArgs) {
		Random rand = new Random();
		int n = rand.nextInt(100);
		NumberFormat f = new DecimalFormat("#0.0");
		System.out.println(f.format(n));
	}
}