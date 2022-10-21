package lab2;

public class CoisaBonus {
    public static void main(String[] args) {
        disciplinaBonus();
        System.out.println("---");
        resumosBonus();
        System.out.println("---");
        descansoBonus();
    }

    private static void disciplinaBonus() {
        Disciplina prog2 = new Disciplina("Programacao 2", 3);
        prog2.cadastraNota(1, 6.0);
        prog2.cadastraNota(2, 9.0);
        prog2.cadastraNota(3, 7.0);
        prog2.cadastraHoras(9);
        
        System.out.println(prog2.toString());

        Disciplina fmcc = new Disciplina("FMCC II", 5, new int[] {2, 4, 1, 2, 1});
        fmcc.cadastraNota(1, 5.0);
        fmcc.cadastraNota(2, 8.0);
        fmcc.cadastraNota(3, 4.0);
        fmcc.cadastraNota(4, 7.0);
        fmcc.cadastraNota(5, 9.0);
        fmcc.cadastraHoras(7);

        System.out.println(fmcc.toString());
    }

    private static void resumosBonus() {
        RegistroResumos meusResumos = new RegistroResumos(100);  // 100 resumos

        meusResumos.adiciona("Classes", "Classes definem um tipo e a base de código para criação de objetos.");
        meusResumos.adiciona("Tipo", "Identifica a semântica (operações e significados) de um conjunto de dados.");
        meusResumos.adiciona("Informatica", "ciência que se dedica ao tratamento da informação mediante o uso de computadores e demais dispositivos de processamento de dados.");
        
        System.out.println(meusResumos.busca("dAdoS"));
        System.out.println(meusResumos.busca("TipO"));
    }

    private static void descansoBonus() {
        Descanso descanso = new Descanso();

        descanso.defineHorasDescanso(30);
        descanso.defineNumeroSemanas(1);
        descanso.definirEmoji(":)");
        System.out.println(descanso.getStatusGeral());

        descanso.defineHorasDescanso(50);
        descanso.defineNumeroSemanas(2);
        
        System.out.println(descanso.getStatusGeral());
        descanso.definirEmoji("<(^_^<)");
        System.out.println(descanso.getStatusGeral());

        descanso.defineHorasDescanso(130);
        descanso.defineNumeroSemanas(5);
        System.out.println(descanso.getStatusGeral());
    }
}
