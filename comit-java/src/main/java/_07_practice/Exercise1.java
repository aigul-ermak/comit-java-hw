package _07_practice;

class Helper {

	String formatNumber(int num) {

		return String.valueOf(num);
	}

	String formatNumber(double num) {

		return String.format("%.3f", num);
	}

	String formatNumber(String str) {

		double num = Double.parseDouble(str);

		return String.format("%.2f", num);
	}
}

public class Exercise1 {
	public static void main(String[] args) {

		Helper helper = new Helper();

		System.out.println(helper.formatNumber(47));
		System.out.println(helper.formatNumber(47.12345));
		System.out.println(helper.formatNumber("47.12345"));

	}
}
