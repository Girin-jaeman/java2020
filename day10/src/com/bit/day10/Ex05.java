package com.bit.day10;

public class Ex05 {

	public static void main(String[] args) {
		// char
		Character ch1;
		ch1=new Character('A');

		System.out.println(Character.MIN_VALUE);
		System.out.println(Character.MAX_VALUE);
		
		char target=' ';
		// �����ڵ�����
		System.out.println(Character.isDefined(target));
		// ��������
		System.out.println(Character.isAlphabetic(target));
		System.out.println(Character.isLetter(target));
		// ��������
		System.out.println(Character.isDigit(target));
		// ��ҹ��ڱ���
		System.out.println(Character.isUpperCase(target));
		System.out.println(Character.isLowerCase(target));
		
		System.out.println(Character.isSpace(target));
		System.out.println(Character.isWhitespace(target));
	}

}

















