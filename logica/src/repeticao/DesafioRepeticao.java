package repeticao;

import javax.swing.JOptionPane;

public class DesafioRepeticao {

	public static void main(String[] args) {
		
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero"));
		int chute = 0;
		int tentativas=0;
		do {
			chute = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero a ser descoberto"));
			if (chute>numero) {
				System.out.println("Digite um n�mero menor");
			}else if(chute<numero) {
				System.out.println("Digite um n�mero maior");
			}
			tentativas = tentativas+1;
			//tentativas++;
			//tentativas+=1;
		}while(numero!=chute);
		System.out.println("Parab�ns voc� acertou usando " + tentativas + " tentativas!");
	}
}
