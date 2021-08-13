package ch15_generics;
/*
 * [♡♡♡♡♡♡] 
 * 사과를 담는 상자
 */
// find and replace로 바꿔줌~
public class OrangeBox {
	private Orange or;
	
	// 오렌지를 담는다 
	public void set(Orange o) { 
		or = o;
	}
	
	// 오렌지를 꺼낸다 
	public Orange get() {
		return or;
	}
}
