package ch15_generics;
/*
 * 무슨 과일이든지 담을 수 있는 상자
 * 
 */

public class JustBox<T> { // <T> 사용자 지정 자료형으로 남겨두는 것!
	 private T ob; // Object를 T로 바꿈. 
	 
	 //모든 과일 Box를 받을 수 있는 자료형은? Object
	 public void set(T o) {
		 ob = o;
	 }
	 public T get() {
		 return ob;
	 }

}
