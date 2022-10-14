package lab2;

/**
 * Define e controla quantidade de horas de internet que o aluno tem dedicado a uma disciplina remota.
 * Para cada disciplina, será criado um objeto para controle desse estado.
 */
public class RegistroTempoOnline {

    /**
     * Nome da disciplina que se deseja acompanhar as horas
     */
    private String nomeDisciplina;
    /**
     * Tempo online esperado que o aluno se dedique à disciplina.
     */
    private int tempoEsperado;
    /**
     * Tempo online que o aluno dedicou à disciplina.
     */
    private int tempoOnline;

    /**
     * Constrói um registro de tempo para uma disciplina com um tempo esperado padrão de 120 horas
     * e tempo online inicial igual a 0.
     *
     * @param nomeDisciplina Nome da disciplina que se deseja acompanhar.
     */
    public RegistroTempoOnline(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = 120;
        this.tempoOnline = 0;
    }

    /**
     * Constrói um registro de tempo para uma disciplina com um tempo esperado personalizado
     * e tempo online inicial igual a 0.
     *
     * @param nomeDisciplina Nome da disciplina que se deseja acompanhar.
     * @param tempoOnlineEsperado Tempo online esperado que o aluno se dedique à disciplina.
     */
    public RegistroTempoOnline(String nomeDisciplina, int tempoOnlineEsperado) {
        this.nomeDisciplina = nomeDisciplina;
        this.tempoEsperado = tempoOnlineEsperado;
        this.tempoOnline = 0;
    }

    /**
     * Atualiza o atributo tempoOnline somando o novo tempo estudado com o tempo já antes guardado nesse atributo.
     *
     * @param tempo Tempo estudado a ser adicionado.
     */
    public void adicionaTempoOnline(int tempo) {
        this.tempoOnline += tempo;
    }

    /**
     * Retorna um boolean que diz se o aluno atingiu a meta de horas online esperada.
     *
     * @return Boolean que indica se o aluno atingiu a meta
     */
    public boolean atingiuMetaTempoOnline() {
        if (this.tempoOnline >= this.tempoEsperado) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna uma string com o nome da disciplina e a quantidade de horas estudadas/quantidade de horas esperadas.
     *
     * @return String que indica quantas horas o aluno estudou e quantas horas ele tem que estudar para certa matéria.
     */
    public String toString() {
        return this.nomeDisciplina + " " + this.tempoOnline + "/" + this.tempoEsperado;
    }
}
