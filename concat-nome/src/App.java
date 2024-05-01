public class MinhaClasse {
    public static void main(String[] args) throws Exception {
        
        String primeiroNome = "Felipe";
        String segundoNome = "Venas"; 
        String terceiroNome = "Souza";

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome, terceiroNome);

            System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome) {
        return primeiroNome.concat(" " + segundoNome).concat(" " + terceiroNome);
    }
    
}