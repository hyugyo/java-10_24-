package day02;

import java.util.Scanner;

public class ScannerEX03 {

		public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("�� �ܾ �Է��ϼ��� : ");
			String str2 = scan.next();
			System.out.println(str2);
			
			System.out.println("�� ������ �Է��ϼ��� : ");
			String str1 = scan.nextLine();
			System.out.println(str1);

			scan.close();
		}
}
