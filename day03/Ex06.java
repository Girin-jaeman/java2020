/*

������ ����Ͻÿ�
����:86
����:93
����:74
�հ�:000
���:8x.00
����:B����
	��������
	���100~90�̻�:A����
	���90�̸�~80�̻�:B����
	���80�̸�~70�̻�:C����
	���70�̸�~60�̻�:D����
	���60�̸�:F����
*/
class Ex06{

  public static void main(String[] args){

    int kor=86;
    int eng=93;
    int math=74;

    int total=kor+eng+math;
    double avg=total/3.0;

    System.out.println("------------------");
    System.out.println("|����|"+kor+"\t|");
    System.out.println("|����|"+eng+"\t|");
    System.out.println("|����|"+math+"\t|");
    System.out.println("------------------");
    System.out.println("|�հ�|"+total+"\t|");
    System.out.println("------------------");
    System.out.println("|���|"+avg+"\t|");
    System.out.println("------------------");
    char grade='A';
    if(avg>=90){
	 grade='A';
    }else if(avg>=80){
	 grade='B';	//grade+=1;	// grade=grade+1;
    }else if(avg>=70){
	 grade='C';	//grade+=2;	// grade=grade+1;
    }else if(avg>=60){
	 grade='D';	//grade+=3;	// grade=grade+1;
    }else{
	grade='F';
    }

    System.out.println("|����|"+grade+"����\t|");
    System.out.println("------------------");

  }

}




















