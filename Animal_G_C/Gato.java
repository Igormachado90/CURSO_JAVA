public class Gato extends Animal_1 {
    private String cor;
    //construtor
public Gato( String nome, int idade, String cor){
    super(nome, idade);
    this.cor = cor;
}
    //getter e setter
public String getCor() {
    return cor;
}
public void setCor(String cor) {
    this.cor = cor;
}
    //Metodo
public void fazerSom(){
    System.out.println("Nome Gato: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Cor: " + cor);
    System.out.println("Miau!");
}
private String getIdade() {
    return null;
}
private String getNome() {
    return null;
}
}
