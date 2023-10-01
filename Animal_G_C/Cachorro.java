public class Cachorro extends Animal {

    private String raca;
    //construtor
public Cachorro( String nome, int idade, String raca){
    super(nome, idade);
    this.raca = raca;
}
    //getter e setter
public String getRaca() {
    return raca;
}
public void setRaca(String raca) {
    this.raca = raca;
}
    //Metodo
public void fazerSom(){
    System.out.println("Nome Cachorro: " + getNome());
    System.out.println("Idade: " + getIdade());
    System.out.println("Raca: " + raca);
    System.out.println("Au Au!");
}    
}

