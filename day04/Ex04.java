/* while�� Ȱ��
Q1. 1~10���� ���� ���Ͻÿ�

Q2. 10~50�� ¦������ ���� ���Ͻÿ�

Q3. 1+3+5+7+9=25�� ����ϼ���

Q4. 1~50 �� 3�� ����� ����ϼ���

Q5. 2�� 1����,2�� 2����,2�� 3����,2�� 4����,2�� 5������ ���Ͻÿ�

*/

class Ex04{

  public static void main(String[] args){

	System.out.println("Q1___________________________");
	int sum1=0;
	int su1=1;
	while(su1<=10){
		sum1+=su1;
		su1++;
	}
	System.out.println("1~10������ ����"+sum1);
	System.out.println("Q2___________________________");
	int sum2=0;
	int su2=10;
	while(su2<=50){
		if(su2%2==0){sum2+=su2;}
		su2++;
	}
	System.out.println("10~50������ ¦������"+sum2);
	System.out.println("Q3___________________________");
	// 123456789=25
	int sum3=0;
	int su3=1;
	while(su3<10){
		if(su3%2!=0){
			sum3+=su3;
			System.out.print(su3);
		}else{
			System.out.print("+");
		}
		su3++;
	}
	System.out.println("="+sum3);
	System.out.println("Q4___________________________");
	int a,b;
	a=1;
	b=25;	
	while(a!=b+1){
		if(a%3==0){
		System.out.print(a+" ");
		}
		a++;
	}
	System.out.println("\nQ5___________________________");
	int temp=1;
	int cnt=0;
	while(cnt<5){
		temp+=temp;
		System.out.print(temp+" ");
		cnt++;
	}

  }


}












