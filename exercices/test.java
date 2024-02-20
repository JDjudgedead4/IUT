package exercices;
import pile.*;

public class test {

	public static void main(String[] args) {
		Pile p=new PileParTableau(100);
		
		int n=0;
		p.empiler(1);
		p.empiler(2);
		p.empiler(3);
		p.empiler(25);
		p.empiler(12000);
		while (n <=5){
		System.out.println(p.depiler());
		n=n+1;

	}
	}
}

		