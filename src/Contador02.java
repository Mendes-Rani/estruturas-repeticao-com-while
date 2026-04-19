
// mudando o fluxo de um laço de repetição com o comando continue
public class Contador02 {
    public static void main(String[] args) {
        int cc = 0;
        while(cc < 10){
            cc ++;
            if(cc == 5 || cc == 8){

                // O comando continue é utilizado para pular a execução do código abaixo dele e voltar para o início do laço de repetição
                continue;
            }
            System.out.println("Contando " + cc);
        }
    }
}
