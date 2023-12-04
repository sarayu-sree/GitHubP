package interview;

public class ThisKeyword {

	int a = 300;

	public ThisKeyword(int i) {
		// TODO Auto-generated constructor stub
		i = this.a;
		int b = 30;
		b = b *i;
		System.out.println(b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 20;
		ThisKeyword tk = new ThisKeyword(20);
		tk.tingtong();
	}

	public void tingtong() {
		// TODO Auto-generated method stub
		//int a = 4;
		
	//	this.a = a;
		int b = this.a * 3;
		System.out.println(b);
		b = a * 5;
		System.out.println(b);
	}

}
