package com.clone;

public class InstanceCloning {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Point org = new Point(3,5);
		Point cpy;
		
		try {
			//org의 반환형이 object형이라서 Point로 캐스팅 한다.
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
	//접근 수준 지시자를  proteced에서 public 로 바꾸기 위한 메소드 오버라이딩...
	//오버라이딩을 통해서 접근수준을 넓히는 것이 가능하다!!
	//Object클래스는 java.lang이라는 패키지 안에 있는데 
	//여기 com.clone랑 패키지가 다르므로 protected로는 할수가 없으므로
	//public 접근지정자로 하는 것이다..
	@Override
	public Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
}