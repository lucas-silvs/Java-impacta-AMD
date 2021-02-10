package ac_01;

public class Metodos {
	
	// Criação dos metodos com retorno int
	
	
	//Metodo que percorre o array e retorna o menor número, e utiliza o primeiro item do array para a verficação
	public int menor ( int a[]) {
		int b = a[0];
		for (int i=0; i<a.length;i++){
			if (b>=a[i]) {
				b=a[i];
				
			}
		}
		return b;
		
		
	}
	//Metodo que percorre o array e retorna o maior número, e utiliza o primeiro item do array para a verficação
	public int maior ( int a[]) {
		int b = a[0];
		for (int i=0; i<a.length;i++){
			if (b<=a[i]) {
				b=a[i];
				
			}
		}
		return b;
		
		
	}
	// Metodo que percorre cada elemento do array e acumula em uma variavel soma
	public int soma (int a[]) {
		
		int soma = 0;
		
		for(int i=0;i<a.length;i++) {
			soma = soma+a[i];
			
		}
		
		return soma;
		
		
	}
	
	
	
	
	
	
	
	
	
	
	

}
