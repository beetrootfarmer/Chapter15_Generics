package ch15_generics;

public class FruitBox {
	public static void main(String[] args) {
		// 사과 상자 생성
		AppleBox aBox = new AppleBox();
		
		// 오렌지 상자 생성
		OrangeBox oBox = new OrangeBox();
		
		// 상자에 과일 담기
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		//상자에서 과일 꺼내기
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println("[" + ap + ap + ap + "]"); // ap.toSring과 같다 
		System.out.println("[" + og + og + og + "]");
	}

}
