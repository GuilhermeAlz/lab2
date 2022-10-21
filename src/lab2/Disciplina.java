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
    private double[] notas;
    public int[] pesos;

    /**
     * Constrói uma disciplina com o nome e define o atributo horas igual a 0.
     *
     * @param nomeDisciplina Nome da disciplina
     */
    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[4];
    }

    /**
     * Constrói uma disciplina e define o nome e o número de notas que ela possui.
     * 
     * @param nomeDisciplina Nome da disciplina.
     * @param numeroNotas Quantidade de notas que a disciplina possui.
     */
    public Disciplina(String nomeDisciplina, int numeroNotas) {
        this.nomeDisciplina = nomeDisciplina;
        this.notas = new double[numeroNotas];
        this.horas = 0;
    }

    /**
     * Constrói uma disciplina e define o nome, o número de notas que ela possui e o peso de cada nota para uma média ponderada.
     * 
     * @param nomeDisciplina Nome da disciplina.
     * @param numeroNotas Numero de notas que a disciplina possui.
     * @param pesos Array de inteiros com o pso de cada nota.
     */
    public Disciplina(String nomeDisciplina, int numeroNotas, int[] pesos) {
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
        this.notas = new double[numeroNotas];
        this.pesos = pesos;
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
        if (this.pesos == null) {
            double soma = 0;

            for (double ch : notas) {
                soma += ch;
            }
    
            if ((soma / this.notas.length) >= 7.0) {
                return true;
            } else {
                return false;
            }
        } else {
            double somaPonderada = 0;

            for (int i = 0; i < this.notas.length; i++) {
                somaPonderada += this.notas[i] * this.pesos[i];
            }

            if ((somaPonderada / 10) >= 7.0) {
                return true;
            } else {
                return false;
            }
        }

    }

    /**
     * Retorna a string que representa a disciplina.
     * Segue o formato "Nome da disc. - horasEstudadas - média - [notas] - [pesos](se houver)"
     *
     * @return String que representa a disciplina
     */
    public String toString() {
        if (this.pesos == null) {
            double soma = 0;

            for (double ch : notas) {
                soma += ch;
            }
    
            double media = soma / this.notas.length;
            return this.nomeDisciplina + " " + this.horas + " " + media + " " + Arrays.toString(this.notas);
        } else {
            double somaPonderada = 0;

            for (int i = 0; i < this.notas.length; i++) {
                somaPonderada += this.notas[i] * this.pesos[i];
            }

            double media = somaPonderada / 10;
            return this.nomeDisciplina + " " + this.horas + " " + media + " " + Arrays.toString(this.notas) + " " + Arrays.toString(this.pesos);
        }
    }
}
