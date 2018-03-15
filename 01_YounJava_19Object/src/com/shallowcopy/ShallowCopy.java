package com.shallowcopy;

public class ShallowCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle org = new Rectangle(1, 1, 9, 9);
		Rectangle cpy;
		
		try {
			cpy = (Rectangle)org.clone(); //인스턴스 복사
			org.changePos(2, 2, 7, 7); //인스턴스의 좌표 정보 표시
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
	
	public void changePos(int x,int y){
		xPos = x;
		yPos = y;
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
}

class Rectangle implements Cloneable{
	private Point upperLeft; //좌측 상단 표시
	private Point lowerRight; //우측 상단 표시
	
	public Rectangle(int x1,int y1,int x2,int y2){
		upperLeft = new Point(x1,y1);
		lowerRight = new Point(x2,y2);
	}
	
	public void changePos(int x1,int y1,int x2,int y2){
		upperLeft.changePos(x1, y1);
		lowerRight.changePos(x2, y2);
	}
	
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	//직사각형 좌표 정보 출력
	public void showPosition(){
		System.out.print("좌측 상단: ");
		upperLeft.showPosition();
		
		System.out.print("우측 하단: ");
		upperLeft.showPosition();
		System.out.println();
	}
	
}


