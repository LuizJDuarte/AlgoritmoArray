package LEDA;

import java.util.Arrays;

public class arrayFunc {

	public static void main(String [] args ) {
		//O array ou vetor é a lista abaixo:
		int[] Vetor= {27, 43, 8, 29, 51, 73, 16, 87, 8, 43, 71, 48, 21, 31, 4, 91, 17, 46, 60, 12, 76, 26, 7, 15, 100, 88, 60, 29, 26, 37, 97, 81, 36, 2, 53, 32, 94, 80, 75, 70, 17, 26, 83, 38, 72, 33, 999, 68, 77, 60};
		//Aqui eu coloquei todos os elementos que precisam ser usados nas funções , tudo isso também poderia ser inserido com scanners
		int Elemento = 15; int ElementoInserir = 5; int PosicaoInserir = -1;int PosicaoExcluir = 2;
		
		//Interface feita para deixar a execução mais bonita e organizada
		System.out.println("===========Pesquisar Elemento===========");
		pesquisarElemento(Vetor, Elemento);
		System.out.println("========================================");
		System.out.println("==============Menor & Maior=============");
		System.out.println("O menor elemento é: "+menorElemento(Vetor));
		System.out.println("O maior elemento é: "+maiorElemento(Vetor));
		System.out.println("========================================");
		System.out.println("=========Sucessor & Antecessor==========");
		Sucessor(Vetor, Elemento);
		System.out.println("----------------------------------------");
		Antecessor(Vetor, Elemento);
		System.out.println("========================================");
		System.out.println("============Inserir Elemento============");
		Inserir(Vetor, ElementoInserir, PosicaoInserir);
		System.out.println("O array/vetor apos a inserção ficou assim:\n"+ Arrays.toString(Vetor));
		System.out.println("========================================");
		System.out.println("============Excluir Elemento============");
		Excluir(Vetor, PosicaoExcluir);
		System.out.println("O array/vetor apos excluir o elemento que estava na determinada posição fica assim:\n"+ Arrays.toString(Vetor));
		System.out.println("========================================");
	}

	private static void pesquisarElemento(int []Vetor, int Elemento) {
		//Função de pesquisa de elementos , ele percorre todo o array e printa os valores
		for(int x = 0; x < Vetor.length; x++) {
			if(Vetor[x]== Elemento) {
				System.out.println("O elemento pesquisado foi o: "+Elemento);
				System.out.println("A posição do elemento no array era: "+ x);
			}
		}
	}

	private static int menorElemento(int []Vetor) {
		//Função de detectar o menor elemento , ele compara todos enquanto pesquisa e armazena o menor na variavel
		int MenorValor = Vetor[0];
		for(int x = 0; x < Vetor.length; x++) {
			
			if(Vetor[x]<MenorValor) {
				MenorValor = Vetor[x];
			}
		}
		//Retorna o menor valor que tá armazenado na variavel
		return MenorValor;
	}
	
	private static int maiorElemento(int []Vetor) {
		//Função que detecta o maior valor comparando com todos os outros e armazena na variavel
		int MaiorValor = Vetor[0];
		for(int x = 0; x < Vetor.length; x++) {
			
			if(Vetor[x]>MaiorValor) {
				MaiorValor = Vetor[x];
			}
		}
		//Retor o maior valor que está na variavel MaiorValor
		return MaiorValor;
	}
	
	private static void Sucessor(int Vetor[],int Elemento) {
		//Faz algo parecido com o pesquisar elemento , só que pega o elemento e posição do sucessor
		for(int x = 0; x < Vetor.length; x++) {
			if(Vetor[x]== Elemento) {
				Elemento = Vetor[x+1];			
				System.out.println("O elemento sucessor ao escolhido é o: "+Elemento);
				System.out.println("A posição do sucessor no array é: "+(x+1));
				x = Vetor.length;//Fiz isso pra não usar break
			}
		}
	}
		
	private static void Antecessor(int Vetor[],int Elemento) {
		//Faz algo parecido com o pesquisar elemento , só que pega o elemento e posição do antecessor
		for(int x = 0; x < Vetor.length; x++) {
			if(Vetor[x]== Elemento) {
				Elemento = Vetor[x-1];
				System.out.println("O elemento antecessor ao escolhido é o: "+Elemento);
				System.out.println("A posição do antecessor no array é: "+(x-1));
				x = Vetor.length;
			}
		}
	}
	
	private static void Inserir(int Vetor[],int ElementoInserir, int PosicaoInserir) {
		//Função para inserir elemento na lista 
		//If para não permetir elementos menores de 0 e maiores que o tamanho da lista , sejam inseridos
		if (PosicaoInserir < 0 || PosicaoInserir >= Vetor.length) {
            System.out.println("Valor não pode ser usado.");
            return;
        }
		else{
			for(int x = Vetor.length - 1;x > PosicaoInserir; x--) {//Feito para mandar os elementos pra prox posição
				Vetor[x]= Vetor[x-1];
		}
		Vetor[PosicaoInserir] = ElementoInserir;
		}
	}
	
	private static void Excluir(int Vetor[], int PosicaoExcluir) {
		if (PosicaoExcluir < 0 || PosicaoExcluir >= Vetor.length) {
            System.out.println("Valor não pode ser usado.");
            return;
        }
		else{
			for(int x = PosicaoExcluir; x < Vetor.length - 1; x++) {//Feito para puxar os elemetos que estavam na frente do elemento removido
				Vetor[x]= Vetor[x+1];
			}
		Vetor[Vetor.length - 1] = 0;//Colocando o elemento do que foi removido por ultimo e = a 0
		}
	}
}

