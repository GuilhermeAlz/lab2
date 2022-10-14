package lab2;
import java.util.Arrays;

/**
 * Classe que representa uma disciplina, guarda e gerencia informações referentes a disciplina em questão
 */
public class Disciplina {
    /**
     * Nome da disciplina
     */
    private String nomeDisciplina;
    /**
     * Horas de estudo da disciplina.
     */
    private int horas;
    /**
     * Array com notas da disciplina
     */
    private double[] notas = {0, 0, 0, 0};

    /**
     * Constrói uma disciplina com o nome e define o atributo horas igual a 0.
     * 
     * @param nomeDisciplina Nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
    }

    /**
     * Cadastra horas de estudo da disciplina. É cumulativo.
     * 
     * @param horas Horas a serem acumuladas
     */
    public void cadastraHoras(int horas) {
        this.horas += horas;
    }

    /**
     * Cadastra as notas da disciplina
     * 
     * @param nota Qual a nota a ser cadastrada (varia de 1 a 4).
     * @param valorNota Valor da nota a ser cadastrada.
     */
    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

    /**
     * Faz a média do aluno e fala se ele foi aprovado.
     * 
     * @return Boolean falando se o aluno foi aprovado ou não
     */
    public boolean aprovado() {
        double soma = 0;

        for (double ch : notas) {
            soma += ch;
        }

        if ((soma / 4) >= 7.0) {
            return true;
        } else {
            return false;
        }
    }

    /**
     * Retorna a string que representa a disciplina.
     * Segue o formato "Nome da disc. - horasEstudadas - média - [notas]"
     * 
     * @return String que representa a disciplina
     */
    public String toString() {
        double soma = 0;

        for (double ch : notas) {
            soma += ch;
        }

        double media = soma / 4;

        return this.nomeDisciplina + " " + this.horas + " " + media + " " + Arrays.toString(this.notas);
    }
}
