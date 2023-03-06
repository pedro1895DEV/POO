package lista6.atividade3;

public class BimestreTesteMain {
    public static void main(String[] args) {
        Prova pro = new Prova();
        Seminário sem = new Seminário();
        EstudoDirigido est = new EstudoDirigido();

        //Prova
        pro.setNome("João");
        pro.setNota(8);
        pro.setTempoDuracao(4);
        pro.setQuantidadeDeQuestoes(25);
        pro.setConsultaAutorizada(false);

        //Seminário
        sem.setNome("Marlon");
        sem.setNota(8);
        sem.setTema("Revolução Inglesa");
        sem.setTempoDuracao(15);

        //Estudo dirigido
        est.setNome("Carlos");
        est.setNota(8);
        est.setTema("Revolução Francesa");
        est.setNumeroDePaginas(30);

        System.out.println("### Prova ###\n" + "\nNome do estudante: " + pro.getNome() + "\nNota do estudante: " + pro.getNota() + "\nTempo de duração da prova em horas: " + pro.getTempoDuracao() + "\nConsulta permitida: " + pro.isConsultaAutorizada());
        System.out.println("\n### Seminário ###\n" + "\nNome do estudante: " + sem.getNome() + "\nNota do estudante: " + sem.getNota() + "\nTema do seminário: " + sem.getTema() + "\nTempo de duração do seminário: " + sem.getTempoDuracao() + " minutos");
        System.out.println("\n### Estudo dirigido ###\n" + "\nNome do estudante: " + est.getNome() + "\nNota do estudante: " + est.getNota() + "\nTema do estudo dirigido: " + est.getTema() + "\nNúmero de páginas do estudo dirigido: " + est.getNumeroDePaginas());
    }
}
