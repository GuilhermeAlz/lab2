package lab2;

/**
 * Classe que registra resumos de temas específicos e os gerencia
 */
public class RegistroResumos {
    /**
     * Array com os temas dos resumos.
     */
    private String[] temas;
    /**
     * Array com o conteúdo de cada resumo
     */
    private String[] resumos;
    /**
     * Indice usado em vários metodos para adicionar e gerenciar os resumos.
     * Zera após o número de resumos exceder o permitido e começa a substituir os resumos existentes.
     */
    private int indiceVariavel;
    /**
     * Indice usado em vários metodos para adicionar e gerenciar os resumos.
     * Não zera.
     */
    private int indiceFinal;

    /**
     * Constrói um registro de resumos com um número limite específico.
     *
     * @param numeroDeResumos Limite de resumos a serem armazenados
     */
    public RegistroResumos(int numeroDeResumos) {
        this.temas = new String[numeroDeResumos];
        this.resumos = new String[numeroDeResumos];
        this.indiceVariavel = 0;
        this.indiceFinal = 0;
    }

    /**
     * Adiciona resumos, recebendo o tema e o conteúdo separadamente
     *
     * @param tema Tema do resumo.
     * @param resumo Conteúdo do resumo.
     */
    public void adiciona(String tema, String resumo) {
        if (this.indiceVariavel >= this.resumos.length) {
            this.indiceVariavel = 0;
            this.indiceFinal = this.resumos.length;
            this.temas[indiceVariavel] = tema;
            this.resumos[indiceVariavel] = resumo;
            this.indiceVariavel += 1;
        } else {
            this.temas[indiceVariavel] = tema;
            this.resumos[indiceVariavel] = resumo;
            this.indiceVariavel += 1;
            this.indiceFinal += 1;
        }
    }

    /**
     * Pega todos os resumos já formatados com tema e título e joga em um array.
     *
     * @return Array com todos os resumos já registrados.
     */
    public String[] pegaResumos() {
        String[] resumosCompletos = new String[this.indiceFinal];

        for (int i = 0; i < this.indiceFinal; i++) {
            resumosCompletos[i] = this.temas[i] + ": " + this.resumos[i];
        }
        return resumosCompletos;
    }

    /**
     * Imprime a quantidade de resumos cadastrados e os temas de cada um.
     *
     * @return String com a quantidade de resumos cadastrados e o tema de cada um.
     */
    public String imprimeResumos() {
        String retorno = "- " + this.indiceFinal + " resumo(s) cadastrado(s)\n" + "-";
        for (int i = 0; i < this.indiceFinal; i++) {
            if (i == (this.indiceFinal - 1)) {
                retorno += " " + this.temas[i];
            } else {
                retorno += " " + this.temas[i] + " |";
            }
        }
        return retorno;
    }

    /**
     * Conta a quantidade de resumos cadastrados.
     *
     * @return Quantidade de resumos cadastrados.
     */
    public int conta() {
        return this.indiceFinal;
    }

    /**
     * Procura um resumo de um tema específico e retorna um valor booleano dizendo se esse resumo existe ou não.
     *
     * @param tema Tema a ser pesquisado.
     * @return Boolean dizendo se o resumo foi encontrado ou não.
     */
    public boolean temResumo(String tema) {
        for (int i = 0; i < this.indiceFinal; i++) {
            if (tema.equals(this.temas[i])) {
                return true;
            }
        }
        return false;
    }
    
    /**
     * Busca uma string no texto dos resumos.
     * 
     * @param chaveDeBusca Texto a ser pesquisado nos resumos.
     * @return String contendo os temas dos resumos onde a chave de busca fo encontrada.
     */
    public String busca(String chaveDeBusca) {
        int[] chaves = new int[indiceFinal];
        int indiceChaves = 0;
        String out = "";

        for (int i = 0; i < indiceFinal; i++) {
            if (this.resumos[i].toLowerCase().contains(chaveDeBusca.toLowerCase())) {
                chaves[indiceChaves] = i;
                indiceChaves += 1;
            }
        }
        
        for (int i = 0; i < indiceChaves; i++) {
            if (i != indiceChaves - 1) {
                out += temas[chaves[i]] + " | ";
            } else {
                out += temas[chaves[i]];
            }
        }
        return out.strip();
    }
}
