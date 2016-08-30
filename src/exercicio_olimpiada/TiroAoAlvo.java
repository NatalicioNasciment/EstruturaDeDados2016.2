package exercicio_olimpiada;

public class TiroAoAlvo {
    private String categoria;
    private String nome;
    private String pais;
    private int distancia;
    private int tiros;
    private static int totalPontuacao = 0;
   
    public TiroAoAlvo(){}
   
    public TiroAoAlvo(String categoria, String nome, int tiros) {
        this.setCategoria(categoria);
        this.setNome(nome);
        this.setPais(pais);
        this.setTiro(tiros);
    }
   
    public String getCategoria() {
        return categoria;
    }
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getDistancia() {
        return distancia;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public int  getTiros() {
        return tiros;
    }
    public void setTiro(int  tiros) {
        this.tiros = tiros;
    }
   
    public int somarPontuacaoTiro(){
        for(int i = 0; i< 5; i++){
            totalPontuacao = totalPontuacao + tiros;
        }
        return totalPontuacao;
    }
}
