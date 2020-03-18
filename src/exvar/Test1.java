package exvar;
public class Test1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte a1=67;
		char a2='A';
		byte tt = (byte)a2;
		a1++;
		char a3=(char)a1;
		
		
		System.out.println((char)a1);
		System.out.println(a3);
		System.out.println((byte)a3);
		System.out.println((byte)a2+2);
		System.out.println((char)tt+3);
		System.out.println((char)(tt+3));

	}

}
