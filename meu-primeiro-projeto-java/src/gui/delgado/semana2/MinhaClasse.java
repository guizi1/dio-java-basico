package gui.delgado.semana2;
public class MinhaClasse {

    public static void main (String [] args) {

        String primeiroNome = "Luis";
        String segundoNome = "Delgado";
        String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
        System.out.println(nomeCompleto);

    }

    public static String nomeCompleto (String primeiroNome, String segundoNome){
        return "Resultado do metodo ".concat(primeiroNome).concat(" ").concat(segundoNome);
    }

}
