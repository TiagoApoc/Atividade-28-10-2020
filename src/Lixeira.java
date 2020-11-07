public class Lixeira {
    private boolean condição; //false fechada.
    private String cor;


//Método construtor.
public Lixeira (boolean condição, String cor) {
    this.condição = true;
    this.cor = "Cinza";
}
//getters
public boolean getCondição(){
    return condição;
}
public String getCor(){
    return cor;
}
//setters
public void setCondição (boolean condição){
    this.condição = condição;
}
public void setCor (String cor){
    this.cor = cor;
}
}
