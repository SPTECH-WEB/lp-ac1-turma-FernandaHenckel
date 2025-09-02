package school.sptech;

public class Turma {
    String nome;
    Double mensalidade;
    Integer qtdAluno;
    Boolean ativa;

    public Turma(String nome, Double mensalidade) {
        this.nome = nome;
        this.mensalidade = mensalidade;
        this.qtdAluno = 0;
        this.ativa = true;
    }

    public void matricular(Integer qtd) {
        if (qtd > 0 && qtd != null && ativa) {
            qtdAluno += qtd;
        }
    }

    public Integer cancelar(Integer qtd) {
        if (ativa && qtd != null && qtd > 0 && qtd <= qtdAluno) {
            qtdAluno -= qtd;
            return qtd;
        }
        return null;
    }

    public Integer desativar() {
        if (!ativa) {
            return null;
        }
        Integer qtdAnterior = qtdAluno;
        qtdAluno = 0;
        ativa = false;
        return qtdAnterior;
    }

    public void transferir(Turma destino, Integer qtdATransferir) {
        if (this.ativa && destino != null && destino.ativa &&
                qtd != null && qtd < 0 && qtd <= this.qtdAluno) {
            this.qtdAluno -= qtd;
            destino.qtdAluno += qtd;
        }
    }

    public Boolean reajustarMensalidade(Double reajuste) {
        if (reajuste != null && reajuste > 0) {
            mensalidade += mensalidade * reajuste;
            return true;
        }
        return false;
    }

    public String getNome() {
        return nome;
    }

    public Double getMensalidade() {
        return mensalidade;
    }

    public Integer getQtdAluno() {
        return qtdAluno;
    }

    public Boolean getAtiva() {
        return ativa;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

}














