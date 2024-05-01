public class MinhaClasse {
    public static void main(String[] args) {

        String meuNome;
        meuNome = "Felipe";
        String meuEstado;
        final String BR = "Brasil"; // Regrinha básica: Quando uma variável for nomeada toda em maiúsculo, podemos supor que ela é do tipo 'final', ou seja, não poderá sofrer alterações durante o código.
        final int ESTADOS_BR = 27; // Mais um exemplo de uma variável imutável e sua sintaxe padrão recomendada.

            System.out.println("Nome do aluno é " + meuNome + " e ele reside no " + BR + ".");
            System.out.println("O " + BR + " possui " + ESTADOS_BR + " estados."); 

    }
}