
package models;
import java.util.Date;

public class Produto {
    public int id;
    public String descricao;
public double preco;
public Date dataValidade;

public Produto(int id, String descricao, double preco, Date dataValidade) {
            this.id = id;
            this.descricao = descricao;
            this.preco = preco;
            this.dataValidade = dataValidade;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getId() {
        return id;
    }
    public String getDescricao() {
        return descricao;
    }
    public double getPreco() {
    return preco;
    }
    public Date getDataValidade() {
    return dataValidade;
    }
}
