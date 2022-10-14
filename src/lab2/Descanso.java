package lab2;

/** Classe que controla e contabiliza o descanso do aluno;
 * O descanso é contado em horas por semana.
 *
 * @author Guilherme Alberto
 */
public class Descanso {
    /**
     * Quantidade de horas que o aluno descansou.
     */
    private int horasDescanso;
    /**
     * Número de semanas.
     */
    private int numerosSemanas;

    /**
     * Define a quantidade de horas que o aluno descansou.
     *
     * @param valor A quantidade inteira de horas descansadas.
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
    }

    /**
     * Define a quantidade de semanas que o aluno vem estudando.
     *
     * @param valor A quantidade inteira de semanas estudadas.
     */
    public void defineNumeroSemanas(int valor) {
        this.numerosSemanas = valor;
    }

    /**
     * Retorna uma string que diz se o aluno descansou o suficiente ou não.
     *
     * @return Se o aluno está cansado ou descansado.
     */
    public String getStatusGeral() {
        if (this.numerosSemanas == 0 || (this.horasDescanso / this.numerosSemanas) < 26) {
            return "cansado";
        } else {
            return "descansado";
        }
    }
}
