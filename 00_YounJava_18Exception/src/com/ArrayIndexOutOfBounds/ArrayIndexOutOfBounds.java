package com.ArrayIndexOutOfBounds;

public class ArrayIndexOutOfBounds {
	public static void main(String[] args) {
//		int[] arr = {1,2,3};
//		for(int i = 0; i < 4; i++){
//			System.out.printf("arary = %d\n",arr[i]);
//		}
		Integer i1 = new Integer(10);
		Integer i2 = new Integer(10);
		int i3 = 11;
		int i4 = 12;
		if(i3 == i4){
			System.out.println("���ΰ��� ��ü��");
		}else{
			System.out.println("���δٸ� ��ü��");
		}
		if(i1.equals(i2)){
			System.out.println("���� ���� ���̴�.");
		}else{
			System.out.println("���δٸ� ���̴�.");
		}
	}
	
}
