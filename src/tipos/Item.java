package tipos;

import enums.Estado;
import enums.TipoItem;

/**
 * Representa um item
 *
 * @author Douglas Rafael
 *
 */
public class Item {

    private static int auto_increment = 0;

    private int id;
    private String titulo;
    private String observacao;
    private String dataDeCompra;
    private double precoDeCompra;
    private double nota;
    private int totalEmprestado;
    private Estado estado;
    private boolean emprestado;
    private TipoItem tipo;

    /**
     * Método construtor da classe.
     *
     * @param titulo
     * @param observacao
     * @param dataDeCompra
     * @param precoDeCompra
     * @param totalEmprestado
     * @param nota
     * @param estado
     * @param emprestado
     */
    public Item(String titulo, String observacao, String dataDeCompra, double precoDeCompra,
            int totalEmprestado, double nota, Estado estado, boolean emprestado, TipoItem tipo) {
        super();
        setId(++auto_increment);
        setTitulo(titulo);
        setObservacao(observacao);
        setDataDeCompra(dataDeCompra);
        setPrecoDeCompra(precoDeCompra);
        setTotalEmprestado(totalEmprestado);
        setNota(nota);
        setEstado(estado);
        setEmprestado(emprestado);
        setTipo(tipo);
    }

    /**
     * Recupera o título do item.
     *
     * @return O título do item
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * Seta o título do item.
     *
     * @param título
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Recupera a observação do item.
     *
     * @return A observação do item
     */
    public String getObservacao() {
        return observacao;
    }

    /**
     * Seta a observação do item.
     *
     * @param observacao
     */
    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    /**
     * Recupera a data que o item foi comprado.
     *
     * @return A data de compra do item.
     */
    public String getDataDeCompra() {
        return dataDeCompra;
    }

    /**
     * Seta a data em que o item foi comprado.
     *
     * @param dataDeCompra
     */
    public void setDataDeCompra(String dataDeCompra) {
        this.dataDeCompra = dataDeCompra;
    }

    /**
     * Recupera o preço de compra do item.
     *
     * @return
     */
    public double getPrecoDeCompra() {
        return precoDeCompra;
    }

    /**
     * Seta o preço pago pela compra do item.
     *
     * @param precoDeCompra
     */
    public void setPrecoDeCompra(double precoDeCompra) {
        this.precoDeCompra = precoDeCompra;
    }

    /**
     * Recupera o total de vezes que o item foi emprestado.
     *
     * @return O total de empréstimos
     */
    public int getTotalEmprestado() {
        return totalEmprestado;
    }

    /**
     * Seta o total de vezes que o item foi emprestado.
     *
     * @param totalEmprestado
     */
    public void setTotalEmprestado(int totalEmprestado) {
        this.totalEmprestado = +totalEmprestado;
    }

    /**
     * Recupera a nota atribuída ao item.
     *
     * @return A nota do item
     */
    public double getNota() {
        return nota;
    }

    /**
     * Atribui um anota ao item.
     *
     * @param nota
     */
    public void setNota(double nota) {
        this.nota = nota;
    }

    /**
     * Recupera o Estado (novo, rasurado, defeituoso, quebrado...) do item.
     *
     * @return O Estado do item
     */
    public Estado getEstado() {
        return estado;
    }

    /**
     * Seta o Estado (novo, rasurado, defeituoso, quebrado...) do item.
     *
     * @param estado
     */
    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    /**
     * Recupera o status do item: true se estiver emprestado e false se não;
     *
     * @return O status do item.
     */
    public boolean isEmprestado() {
        return emprestado;
    }

    /**
     * Seta o status do item: true se estiver emprestado e false se não;
     *
     * @param emprestado
     */
    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }

    /**
     * Recupera o id
     *
     * @return O id
     */
    public int getId() {
        return id;
    }

    /**
     * Seta o id
     *
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Recupera o Tipo de item.
     *
     * @return O tipo de item
     */
    public TipoItem getTipo() {
        return tipo;
    }

    /**
     * Seta o tipo de item.
     *
     * @param tipo o tipo de item
     */
    public void setTipo(TipoItem tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Id: " + getId()
                + "\nTítulo: " + getTitulo()
                + "\nOBS.: " + getObservacao()
                + "\nEstado: " + getEstado().getTitulo()
                + "\nData da compra: " + getDataDeCompra()
                + "\nPreço de Compra: " + getPrecoDeCompra()
                + "\nNota: " + getNota()
                + "\nTotal de Empréstimos: " + getTotalEmprestado()
                + "\nEstá emprestado? " + isEmprestado();
    }
}