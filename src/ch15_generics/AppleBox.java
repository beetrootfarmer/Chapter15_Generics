package ch15_generics;
/*
 * [♡♡♡♡♡♡] 
 * 사과를 담는 상자
 */
public class AppleBox {
	private Apple ap;
	
	public void set(Apple a) { 
		ap = a;
	}
	
	public Apple get() {
		return ap;
	}
}
