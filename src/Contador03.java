// mudando o fluxo de um laço de repetição com o comando break

public class Contador03 {
    public static void main(String[] args) {
        int cc = 0;

        while(cc < 10){
            cc++;
            if(cc == 2 || cc == 3 || cc == 4){
                continue;
            }
            if(cc == 7){
                break; // O comando break é utilizado para interromper a execução do laço de repetição, ou seja, o código dentro do laço de repetição não será mais executado e o programa continuará a execução a partir da linha de código seguinte ao laço de repetição
            }
            System.out.println("Contando " + cc);
        }
    }
}
