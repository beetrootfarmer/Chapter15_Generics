package ch15_generics;

public class FruitBox2 {
	public static void main(String[] args) {
		// 상자 생성
		JustBox<Apple> aBox = new JustBox<Apple>();
		JustBox<Orange> oBox = new JustBox<Orange>();
		
		// 상자에 과일 담기
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		//상자에서 과일 꺼내기
//		Apple ap = (Apple)aBox.get(); // 강제 형변환
//		Orange og = (Orange) oBox.get();
		Apple ap = aBox.get(); 
		Orange og = oBox.get();
		
		System.out.println("[" + ap + ap + ap + "]"); // ap.toSring과 같다 
		System.out.println("[" + og + og + og + "]");
	}

}
