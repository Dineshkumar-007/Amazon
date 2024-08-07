package org.flipkart;

public class SingleTon2 {
	public static void main(String[] args) {
		singleTon s3 = singleTon.getInstance();
		System.out.println(System.identityHashCode(s3));
	}

}

//         1694819250