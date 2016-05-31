package aufgabe1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Calculator Test
		

				Calculator calc = new Calculator();
				
				//calc.setInputStream("4 5~6c ~78 ~9cw");
				calc.setInputStream("3 2 6 7+-*");
				calc.executeInput();		
				System.out.println(calc.getOutputStream());

	}

}
