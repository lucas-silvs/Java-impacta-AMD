package ac_01;

public class Princi {

	public static void main(String[] args) {
	
			Metodos met = new Metodos();
			
			int a[] = {940, 880, 830, 790, 750, 660, 650, 590, 510,940};
			int maior = met.maior(a);
			int menor = met.menor(a);
			int soma = met.soma(a);
			
			
			System.out.printf("Menor número: %s!",menor);
			System.out.printf("\nMaior número: %s!",maior);
			System.out.printf("\nSoma dos números do vetor Integer: %s!",soma);
			
			
			
			// TODO Auto-generated method stub

		}

	

		
		

}
