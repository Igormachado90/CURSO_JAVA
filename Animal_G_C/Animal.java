public class Animal {
    private String nome;
    private int idade;

public Animal(String nome, int idade){
    this.nome = nome;
    this.idade = idade;
    
}
    //getter e setter
public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public int getIdade() {
    return idade;
}

public void setIdade(int idade) {
    this.idade = idade;
}
//metodo fazer aqui
public void fazerSom(){
    System.out.println("Som animal: ");
}
}
