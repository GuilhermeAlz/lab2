package lab2;
import java.util.Arrays;

public class Disciplina {
    private String nomeDisciplina;
    private int horas;
    private double[] notas = {0, 0, 0, 0};

    public Disciplina(String nomeDisciplina) {
        this.nomeDisciplina = nomeDisciplina;
        this.horas = 0;
    }

    public void cadastraHoras(int horas) {
        this.horas += horas;
    }

    public void cadastraNota(int nota, double valorNota) {
        this.notas[nota - 1] = valorNota;
    }

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

    public String toString() {
        double soma = 0;

        for (double ch : notas) {
            soma += ch;
        }

        double media = soma / 4;

        return this.nomeDisciplina + " " + this.horas + " " + media + " " + Arrays.toString(this.notas);
    }
}
