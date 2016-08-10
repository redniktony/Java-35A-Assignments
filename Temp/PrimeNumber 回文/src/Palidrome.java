//这个程序用来检测是不是能够有正反读起来都一样的文字

//回文检测器
import java.util.Scanner;

public class Palidrome {
	public static void main(String[] args) {
		System.out.println("*************Palidrome Dector***************");
		System.out.println("Enter A String:");
		Scanner input = new Scanner(System.in);
		String s = input.nextLine();

		int i = 0;
		int length = s.length();

		while (length > 0) {
			if (s.charAt(i) == s.charAt(length - 1))// 这里可以单独检测string里面的每一个字体
			{
				i++;
				length--;// 检测下一组

				if (length < 1) {
					System.out.println("Your string is a palindrome");
					break;// 停止 loop
				}
			} else {
				System.out.println("Your string is not a palindrome");
				break;
			}
		}
	}
}