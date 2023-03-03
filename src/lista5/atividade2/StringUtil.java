package lista5.atividade2;

public class StringUtil {
    String texto1;
    String texto2;
    String texto3;

    String retorna2(){
        return texto1 + texto2;
    }
    String retorna3(){
        return texto1 + texto2 + texto3;
    }

    String verifica2(){
        if(texto1 == texto2){
            return "Textos iguais!";
        }
        else{
           return "Textos diferentes";
        }
    }

    String verifica3(){
        if(texto1 == texto2 && texto2 == texto3 && texto3 == texto1){
            return "Textos iguais!";
        }
        else{
            return "Textos diferentes";
        }
    }

    StringUtil(String texto1, String texto2, String texto3){
        this.texto1 = texto1;
        this.texto2 = texto2;
        this.texto3 = texto3;
    }

}
