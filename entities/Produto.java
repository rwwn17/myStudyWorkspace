package entities;

public class Produto{

    String name;

    public Produto(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String toString(){

        return String.format("Este é o produto: " + name);
    }
    
}