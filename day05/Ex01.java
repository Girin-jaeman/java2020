class Ex01{
/*
class Ŭ������{}
Ŭ������ 
- ù���� ���� Ư������ �Ұ� (���� _$)
- ù���ڰ� �빮�ڷ� ����
- �ΰ��̻��� �ܾ���� 
	�ι�° �ܾ��� ù���ڸ� �빮��
- ���� ��Ű������ Ŭ������ �̸��ߺ��� �Ұ�

- Ŭ������ �������
	1. �޼���
*/
  public static void func1(){
	System.out.println("�޼���1");
	func2();
	System.out.println("�޼���1��");
  }

  public static void main(String[] args){
	System.out.println("����");
	func1();
	System.out.println("��");
  }
	// �޼���
	// �޼���� �ߺ� �Ұ�(�޼��� �����ε� ����)
	// public static �ڷ��� �޼����([�Ű�����])
	// �޼����� ȣ����
	// ��������, ���ڰ���, ����Ÿ�� ��ġ ȣ�Ⱑ��


  public static void func2(){
	System.out.println("�޼���2");
	return;
  }

} // class end












