class Ex05{

  public static void main(String[] args){

	int a=-11;
	if(a>=0){
	  System.out.print("����̰� ");
	}
	if(a<0){
	  System.out.print("�����̰� ");
	}

	if(a%2==0){
	  System.out.println("¦���Դϴ�");
	}
	if(a%2!=0){
	  System.out.println("Ȧ���Դϴ�");
	}
	System.out.println("------------------");
	if(a>=0&&a%2==0){
	System.out.println("����̰� ¦���Դϴ�");
	}
	if(a>=0&&a%2==1){
	System.out.println("����̰� Ȧ���Դϴ�");
	}
	if(a<0&&a%2==0){
	System.out.println("�����̰� ¦���Դϴ�");
	}
	if(a<0&&a%2!=0){
	System.out.println("�����̰� Ȧ���Դϴ�");
	}
	System.out.println("------------------");
	if(a>=0){
	  if(a%2==0){
	    System.out.println("����̰� ¦���Դϴ�");
	  }else{
	    System.out.println("����̰� Ȧ���Դϴ�");
	  }
	}else{
	  if(a%2==0){
	    System.out.println("�����̰� ¦���Դϴ�");
	  }else{
	    System.out.println("�����̰� Ȧ���Դϴ�");
	  }
	}
	System.out.println("------------------");
	if(a>=0&&a%2==0){
	System.out.println("����̰� ¦���Դϴ�");
	}else if(a>=0&&a%2!=0){
	System.out.println("����̰� Ȧ���Դϴ�");
	}else if(a%2==0){
	System.out.println("�����̰� ¦���Դϴ�");
	}else{
	System.out.println("�����̰� Ȧ���Դϴ�");
	}

  }

}














