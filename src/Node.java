public class Node {

    String personagem;
    String pergunta;
    Node sim, nao;

    public void setSim(Node n){
        this.sim = n;
    }

    public void setNao(Node n){
        this.nao = n;
    }

    public void  setPersonagem(String personagem){
        this.personagem = personagem;
        this.pergunta = null;
    }

    public void setPergunta(String pergunta){
        this.pergunta = pergunta;
        this.personagem = null;
    }

    public Node getSim(){
        return sim;
    }

    public Node getNao(){
        return nao;
    }

    public String getPersonagem(){
        return personagem;
    }

    public String getPergunta(){
        return pergunta;
    }

}
