package com.clone;

public class InstanceCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point org = new Point(3,5);
		Point cpy;
		
		try {
			//org�� ��ȯ���� object���̶� Point�� ĳ���� �Ѵ�.
			cpy = (Point)org.clone();
			org.showPosition();
			cpy.showPosition();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}

}

class Point implements Cloneable{
	private int xPos;
	private int yPos;
	
	public Point(int x,int y){
		xPos = x;
		yPos = y;
	}
	
	public void showPosition(){
		System.out.printf("[%d, %d]",xPos,yPos);
		System.out.println();
	}
	//���� ���� �����ڸ�  proteced���� public �� �ٲٱ� ���� �޼ҵ� �������̵�...
	//�������̵��� ���ؼ� ���ټ����� ������ ���� �����ϴ�!!
	//ObjectŬ������ java.lang�̶�� ��Ű�� �ȿ� �ִµ� 
	//���� com.clone�� ��Ű���� �ٸ��Ƿ� protected�δ� �Ҽ��� �����Ƿ�
	//public ���������ڷ� �ϴ� ���̴�..
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}