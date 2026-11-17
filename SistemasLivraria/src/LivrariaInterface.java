public interface LivrariaInterface {
    public void abrirlivro(String Nome_Livro) throws LivroNExisteException;
    public void fecharlvro(String Nome_Livro) throws LivroNExisteException;
    public String autor(String Nome_Livro) throws LivroNExisteException;
    public void CadastrarLivro(String Nome_Livro, String Nome_Autor, int tot_pg, String editora) throws LivroJaCriadoException;
    public Livro PesquisarLivro(String Nome_Livro, String Nome_Autor, String tot_pg);
}
