package com.bit.day10;

public class Ex01 {
	
	public static void func1(Object a){}

	public static void main(String[] args) {
		// ����Ŭ����(�⺻�ڷ����� ��ü Ÿ��)
		int a=100;
		java.lang.Integer su1;
		su1=new Integer(100);
		Integer su2=new Integer("200");
		// �ڽ�, ���䷡��
		Integer su3=100;
		// ��ڽ�, ����
		int b=su1+1;
		func1(10);
		System.out.println(su1+su2);
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		Integer su4=new Integer("100");
		byte by1=su4.byteValue();
		System.out.println(su4+":"+by1);
		
		System.out.println(su1==su4);
		System.out.println(su1.equals(su4));
		String msg="1234";
		Integer su5=Integer.valueOf(msg);
		System.out.println(su5.intValue());
		
		int su6=Integer.max(2, 3);
		System.out.println(su6);
		
		int su7=Integer.parseInt(msg);
		int su8=Integer.valueOf(msg);
		int su9=Integer.reverse(1);
		System.out.println(su9);
		int su10=16;
		System.out.println(su10+"�� 2����:"
					+Integer.toBinaryString(su10));
		System.out.println(su10+"�� 8����:"
					+Integer.toOctalString(su10));
		System.out.println(su10+"�� 16����:"
					+Integer.toHexString(su10));
		int su11=Integer.compare(10, 10);
		int su12=su4.compareTo(10);
		System.out.println(su12);
		
	}

}












