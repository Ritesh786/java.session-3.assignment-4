import java.util.Scanner;

public class Calci2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calci math = new Calci();
		double c,t,answer=0;
		String ht; 
		System.out.println(" Enter one number");
		c=s.nextDouble();
		System.out.println(" Enter another number");
		t=s.nextDouble();
		Scanner d = new Scanner(System.in);
		System.out.println(" Enter operator");
		ht=d.next();
		switch(ht){
		case "+": answer= Calci.add(c,t);break;
		case "-": answer= Calci.sub(c,t);break;
		case "*": answer= Calci.mul(c,t);break;
		case "/": answer= Calci.div(c,t);break;
		}
		
		System.out.println(+answer);
		
		
	}

}
