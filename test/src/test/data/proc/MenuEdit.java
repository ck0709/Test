package test.data.proc;

import java.util.ArrayList;
import java.util.Scanner;

import test.data.Menu;

public class MenuEdit {
	
	public void proc(ArrayList<Menu>menus) {
		System.out.print("수정할 메뉴 이름을 입력: (x:취소) :");
		Scanner sc = new Scanner(System.in);
		String searchName = sc.next();
		if(searchName.equals("x")) {
			System.out.println("취소되었습니다.");
			return;
		}
		int searchIndex = -1;
		
		for(int i=0;i<menus.size();i++) {
			if(menus.get(i).getName().equals(searchName)) {
				searchIndex = i;
				break;
			}
		}				
		if(searchIndex == -1) {
			System.out.println(searchName + " 메뉴는 없습니다.");
		} else {
			
			System.out.print("메뉴이름을 새로 입력해주세요:");
			String editName = sc.next();
			System.out.print("메뉴종류를 새로 입력해주세요:");
			String editKind = sc.next();
			System.out.print("메뉴가격을 새로 입력해주세요:");
			String editPrice = sc.next();
			
			Menu m = menus.get(searchIndex);
			m.setName(editName);
			m.setKind(editKind);
			m.setPrice(editPrice);
			System.out.println(searchName + " 메뉴 정보가 수정되었습니다.");
		}				
	}
}