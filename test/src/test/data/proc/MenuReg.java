package test.data.proc;

import java.util.ArrayList;
import java.util.Scanner;
import test.data.Menu;

public class MenuReg {
	public void proc(ArrayList<Menu> menus) {
		Scanner sc = new Scanner(System.in);
		System.out.println("　　　　　　　　　　메 뉴 추 가\n");
		System.out.println("메뉴이름을 입력하세요 (x:취소) :");
		String name = sc.next();
		if(name.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		System.out.println("메뉴종류를 입력하세요 (x:취소) :");
		String price = sc.next();
		if(price.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		System.out.println("메뉴가격을 입력하세요 (x:취소) :");
		String kind = sc.next();
		if(kind.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		Menu tempMenu = new Menu(name,kind,price);
		menus.add(tempMenu);
		System.out.println("메뉴가 추가되었습니다");
	}
}