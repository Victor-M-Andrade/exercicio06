package exercicio06;

public class Main {

	public static void main(String[] args) {
		
		Main app = new Main();
		app.start();

	}
	
	private void start() {
		
		String[] array = new String[5];
		
		array [0] = " Civic ";
		array [1] = " Gol ";
		array [2] = " Palio ";
		array [3] = " Uno ";
		array [4] = "  ";
		
		System.out.println("Nome do carro : " + array[0] + array[1] + array[2] + array[3]);
		
		for (int i = 0; i< array.length; i++);
			
			array[1] = "L200";
			System.out.println("Nome do carro : " + array[0] + array[1] + array[2] + array[3]);
			array[4] = "Gol";
			System.out.println("Nome do carro : " + array[0] + array[1] + array[2] + array[3] + array[4]);
		
	}

}