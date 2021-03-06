package br.edu.uepb.personalcollections;

import br.edu.uepb.personalcollections.enums.Estado;
import br.edu.uepb.personalcollections.enums.TipoItem;

/**
 * Representa uma HQ
 *
 * @author Douglas Rafael
 *
 */
public class HQ extends Item {

    private static final long serialVersionUID = 5886700636491703531L;

    private int numero;
    private String editora;
    private String saga;
    private String universo;
    private boolean lido;

    /**
     * Método construtor.
     * Para o id é utilizado o auto-increment do classe mãe.
     *
     * @param titulo O título
     * @param observacao As observações
     * @param dataDeCompra A data de compra
     * @param precoDeCompra O preço que foi pago
     * @param totalEmprestado O total de vezes que o item foi emprestado
     * @param nota A nota do item
     * @param estado O estado em que o item se encontra
     * @param emprestado Se o item encontra-se emprestado (true), caso contrário (false)
     * @param tipo O tipo do item
     * @param numero O número
     * @param editora A editora
     * @param saga A saga
     * @param universo O universo
     * @param lido Se foi lido (true), caso contrário (false)
     */
    public HQ(String titulo, String observacao, String dataDeCompra, double precoDeCompra, int totalEmprestado, double nota, Estado estado, boolean emprestado, TipoItem tipo, int numero, String editora, String saga, String universo, boolean lido) {
        super(titulo, observacao, dataDeCompra, precoDeCompra, totalEmprestado, nota, estado, emprestado, tipo);
        this.numero = numero;
        this.editora = editora;
        this.saga = saga;
        this.universo = universo;
        this.lido = lido;
    }

    /**
     * Costrutor que recebe também o id como parametro. Não usa o auto_icrement
     * para o id
     *
     * @param id o id
     * @param titulo O titulo
     * @param observacao As observações
     * @param dataDeCompra A data em que foi realizada a compra
     * @param precoDeCompra O preço pago pelo item
     * @param totalEmprestado O total de vez que o item foi emprestado
     * @param nota A nota
     * @param estado O estado que se encontra
     * @param emprestado Se estar emprestado (true), caso contrário (false)
     * @param tipo O tipo do item
     * @param numero O número
     * @param editora A editora
     * @param saga A saga
     * @param universo O universo
     * @param lido Se foi lido (true), caso contrário (false)
     */
    public HQ(int id, String titulo, String observacao, String dataDeCompra, double precoDeCompra, int totalEmprestado, double nota, Estado estado, boolean emprestado, TipoItem tipo, int numero, String editora, String saga, String universo, boolean lido) {
        super(id, titulo, observacao, dataDeCompra, precoDeCompra, totalEmprestado, nota, estado, emprestado, tipo);
        this.numero = numero;
        this.editora = editora;
        this.saga = saga;
        this.universo = universo;
        this.lido = lido;
    }

    /**
     * Recupera o nome da HQ.
     *
     * @return O nome da HQ
     */
    public int getNumero() {
        return numero;
    }

    /**
     * Seta o nome da HQ.
     *
     * @param numero O número
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    /**
     * Recupera a editora da HQ.
     *
     * @return A editora da HQ
     */
    public String getEditora() {
        return editora;
    }

    /**
     * Seta a editora da HQ.
     *
     * @param editora A editora
     */
    public void setEditora(String editora) {
        this.editora = editora;
    }

    /**
     * Recupera a saga da HQ.
     *
     * @return A saga da HQ
     */
    public String getSaga() {
        return saga;
    }

    /**
     * Seta a saga da HQ.
     *
     * @param saga A saga
     */
    public void setSaga(String saga) {
        this.saga = saga;
    }

    /**
     * Recupera o universo da HQ.
     *
     * @return A saga
     */
    public String getUniverso() {
        return universo;
    }

    /**
     * Seta o universo da HQ.
     *
     * @param universo o universo
     */
    public void setUniverso(String universo) {
        this.universo = universo;
    }

    /**
     * Recupera se a HQ foi lida ou não: true se foi lida e false se não.
     *
     * @return Se a HQ foi lida ou não
     */
    public boolean isLido() {
        return lido;
    }

    /**
     * Seta o status de leitura da HQ: true se foi lida e false se não.
     *
     * @param lido true ou false
     */
    public void setLido(boolean lido) {
        this.lido = lido;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof HQ)) {
            return false;
        } else {
            HQ outroHQ = (HQ) o;
            return getId() == outroHQ.getId();
        }
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nNúmero: " + getNumero()
                + "\nEditora: " + getEditora()
                + "\nSaga: " + getSaga()
                + "\nJá foi lido? " + isLido();
    }
}