package com.application2.comparable;

public class Application2 {

	public static void main(String[] args) {
		HDTV tv1 = new HDTV(32, 16.45);
		HDTV tv2 = new HDTV(55, 17.0d);
		int result=tv1.compareTo(tv2);
		System.out.println(result==1?"TV 1 is good" :(result==-1?"TV 2 is good":"Both are same"));
	}

}
