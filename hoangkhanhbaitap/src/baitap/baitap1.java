package baitap;

import java.util.LinkedList;
import java.util.Scanner;

public class baitap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> list1 = new LinkedList<Integer>();
		LinkedList<Integer> list2 = new LinkedList<Integer>();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so luong phan tu cua danh sach: ");
		int n = sc.nextInt();
		System.out.println("Nhap cac phan tu cua danh sach: ");
		for (int i = 0; i < n; i++) {
			int x = sc.nextInt();
			list2.add(x);
			list1.addFirst(x);
		}
		System.out.println("danh sach vua nhap la : ");
		for (int x : list2) {
			System.out.print(x + " ");
		}
		System.out.println("\nDanh sách đặt theo thứ tự ngược với thứ tự nhập vào: ");
		for (int x : list1) {
			System.out.print(x + " ");
		}
		locPhantu1(list1);
		System.out.println("\nDanh sach thu tu nguoc voi thu tu nhap vao: ");
		System.out.println(list1);
		locPhantu2(list2);
		System.out.println("Danh sach thu tu nhap vao:");
		System.out.println(list2);
		loaiBoSoLe(list1, list2);

	}

	private static void loaiBoSoLe(LinkedList<Integer> list1, LinkedList<Integer> list2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list1.size(); i++) {
			if (list1.get(i) % 2 != 0) {
				list1.remove(i);
				i--;
			}
		}
		System.out.println("Danh sach sau khi bi loai bo: ");
		System.out.println(list1);
		for (int i = 0; i < list2.size(); i++) {
			if (list2.get(i) % 2 != 0) {
				list2.remove(i);
				i--;
			}
		}
		System.out.println(list2);
	}

	private static void locPhantu2(LinkedList<Integer> list2) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list2.size() - 1; i++) {
			if (list2.get(i) == list2.get(i + 1)) {
				list2.remove(i);
				i--;
			}
		}
	}

	private static void locPhantu1(LinkedList<Integer> list1) {
		// TODO Auto-generated method stub
		for (int i = 0; i < list1.size() - 1; i++) {
			if (list1.get(i) == list1.get(i + 1)) {
				list1.remove(i);
				i--;
			}

		}
	}


}


		