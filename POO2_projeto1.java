/* *******************************************************************
 * Colegio Técnico Antônio Teixeira Fernandes (Univap)
 * Curso Técnico em Informática - Data de Entrega: 20/03/2023
 * Autores do Projeto: Arthur Kinderman Peres de Oliveira
 *                     Henrique Curtis Correa Marques
 * Turma: 3F  POOO2: Java - II
 * Avaliação parcial referente ao 1 - Bimestre
 * Observação: <colocar se houver>
 *
 * POO2_projeto1.java
 * ******************************************************************/
public class POO2_projeto1 {
    public static void main(String args[]) {

        if (args.length == 0) {
            System.out.println("Falta argumentos!!");
            System.exit(0);
        }

        int dados = args.length / 3;
        int mulher = 0;
        int homem = 0;
        int x = 0;
        int sexo = 0;
        int anos;
        double habitanteInt = 0;
        double fmenor = 0;
        double menoridade = 0;
        double porcentomenor;
        double porcentomulher;
        double porcentohomem;
        double mediaf;
        double mediam;



        for (int cont = 0; cont <= dados - 1; cont++) {

            int nascimento = Integer.parseInt(args[x]);
            anos = 2023 - nascimento;
            if (anos <= 21) {
                menoridade++;
            }

            if (anos >= 60) {
                System.out.printf("IDOSO DE MERDA\n");
            }else{
                System.out.printf("NOVINHO LINDO\n");
            }

            sexo = Integer.parseInt(args[x + 1]);
            if (sexo == 1) {
                homem++;
            } else if (sexo == 2) {
                mulher++;
                if (anos < 21) {
                    fmenor++;
                }
            }

            int procedencia = Integer.parseInt(args[x + 2]);
            if (procedencia == 1) {
                habitanteInt++;
            }

            x += 3;
        }

        porcentomenor = (menoridade * 100) / dados;
        porcentomulher = (mulher * 100) / dados;
        porcentohomem = (homem * 100) / dados;
        mediaf =   (mulher / sexo);
        mediam =   (homem / sexo);


        System.out.printf("Porcentagem de motoristas com menos de 21 anos: %2.2f \n", porcentomenor);
        System.out.printf("Total de mulheres com menos de 21 anos: %2.2f \n", fmenor);
        System.out.printf("Total de habitantes no interior: %2.2f \n", habitanteInt);

        System.out.printf("A média de mulheres é %2.2f e a média de homens é %2.2f \n", mediaf ,mediam );

        System.out.printf("A porcentagem de mulheres é %2.2f e a porcentagem de homens é %2.2f \n", porcentomulher, porcentohomem);
    }
}