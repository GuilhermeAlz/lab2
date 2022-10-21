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
     * Emoji do aluno.
     */
    private String emoji;
    /**
     * Estado de descanso do aluno.
     */
    private String estado;
    /*
     * Atributo usado para controlar o emoji.
     */
    private String estadoEmoji;

    
    public Descanso() {
        this.horasDescanso = 0;
        this.numerosSemanas = 0;
        this.estado = "cansado";
    }
    /**
     * Define a quantidade de horas que o aluno descansou.
     *
     * @param valor A quantidade inteira de horas descansadas.
     */
    public void defineHorasDescanso(int valor) {
        this.horasDescanso = valor;
        
        if (this.numerosSemanas == 0 || (this.horasDescanso / this.numerosSemanas) < 26) {
            this.estado = "cansado";
        } else {
            this.estado = "descansado";
        }
    }

    /**
     * Define a quantidade de semanas que o aluno vem estudando.
     *
     * @param valor A quantidade inteira de semanas estudadas.
     */
    public void defineNumeroSemanas(int valor) {
        this.numerosSemanas = valor;

        if (this.numerosSemanas == 0 || (this.horasDescanso / this.numerosSemanas) < 26) {
            this.estado = "cansado";
        } else {
            this.estado = "descansado";
        }
    }

    /**
     * Retorna uma string que diz se o aluno descansou o suficiente ou não e controla o emoji que representa o estado do aluno.
     *
     * @return Se o aluno está cansado ou descansado.
     */
    public String getStatusGeral() {
        if (emoji != null) {
            if (this.estado.equals("cansado")) {
                if (this.estado.equals(this.estadoEmoji)) {
                    return this.estado + " - " + this.emoji;
                } else {
                    this.emoji = null;
                    return this.estado;
                }
            } else {
                if (this.estado.equals(this.estadoEmoji)) {
                    return this.estado + " - " + this.emoji;
                } else {
                    this.emoji = null;
                    return this.estado;
                }
            }
        } else {
            return this.estado;
        }
    }

    /**
     * Define o emoji que representa o estado do aluno.
     * 
     * @param valor Emoji.
     */
    public void definirEmoji(String valor) {
        this.emoji = valor;
        this.estadoEmoji = this.estado;
    }
}

