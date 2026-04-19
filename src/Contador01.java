/** Programa simples que conta de 1 a 4 e exibe o resultado no console, utilizando um loop while para realizar a contagem. O programa inicia a variável cc com o valor 1 e, enquanto cc for menor ou igual a 4, ele imprime a mensagem "Cambalhota " seguida do valor de cc e incrementa cc em 1. O resultado é a exibição das mensagens "Cambalhota 1", "Cambalhota 2", "Cambalhota 3" e "Cambalhota 4" no console.
 *  Utilizando Estrutura de repetição com teste lógico no início
 */
public class Contador01 {
    public static void main(String[] args) {
        int cc = 1;

        // Estrutura de repetição com teste lógico no início
        while(cc <= 4){
            // O código dentro do laço de repetição será executado enquanto a condição cc <= 4 for verdadeira
            System.out.println("Cambalhota " + cc);
            cc++;
        }
    }
}
