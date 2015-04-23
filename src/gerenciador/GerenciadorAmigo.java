package gerenciador;

import java.util.LinkedList;
import java.util.List;

import excecoes.PersonalCollectionsException;
import tipos.Amigo;

public class GerenciadorAmigo implements Gerenciador<Amigo> {

    private List<Amigo> listaDeAmigos;

    public GerenciadorAmigo() {
        listaDeAmigos = new LinkedList<Amigo>();
    }

    @Override
    public List<Amigo> listar() throws PersonalCollectionsException {
        return listaDeAmigos;
    }

    @Override
    public void save(Amigo o) throws PersonalCollectionsException {
        listaDeAmigos.add(o);
    }

    @Override
    public void atualizar(Amigo o) throws PersonalCollectionsException {
        if (!listaDeAmigos.isEmpty()) {
            Amigo a = pesquisar(o);
            if (a != null) {
                listaDeAmigos.set(listaDeAmigos.indexOf(a), o);
            }
        }
    }

    @Override
    public boolean remove(Amigo o) throws PersonalCollectionsException {
        return listaDeAmigos.remove(o);
    }

    /**
     * Procura Amigo pelo título. Caso não seja encontrado nenhum amigo, a lista
     * é retornada vazia. Método útil quando se quer listar todas os amigos que
     * tem nome igual ou parecido, mais que são diferentes
     *
     * @param nome O nome do amigo a ser procurado
     * @return Lista com Amigos encontradas
     */
    public List<Amigo> pesquisar(String nome) {
        List<Amigo> amigosEncontrados = new LinkedList<Amigo>();
        if (!listaDeAmigos.isEmpty()) {
            for (Amigo a : listaDeAmigos) {
                /**
                 * Verifica se o nome do Amigo estar contido no amigo da vez Se
                 * estiver contido o amigo é adicionada na lista de amigos
                 * encontrados
                 */
                if (a.getNome().toLowerCase().indexOf(nome.toLowerCase()) != -1) {
                    amigosEncontrados.add(a);
                }
            }
        }
        return amigosEncontrados;
    }

    /**
     * Procura por Amigo utilizando o equals. Caso não seja encontrado o amigo,
     * é retornado null.
     *
     * @param o O objeto Amigo a ser procurado
     * @return O objeto Amigo encontrado ou null caso não seja
     */
    public Amigo pesquisar(Amigo o) {
        if (!listaDeAmigos.isEmpty()) {
            for (Amigo a : listaDeAmigos) {
                if (a.equals(o)) {
                    return a;
                }
            }
        }
        return null;
    }
}
