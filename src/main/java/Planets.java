public class Planets {

    private int size;
    private String name;


    //constructor
    public Planets(String name, int size){
        this.name = name;
        this.size = size;
    }

    //methods
    public String getName() {
        return this.name;
    }

    public int getSize() {
        return this.size;
    }

    public String explode() {
        return "Boom!" + this.name + " has exploded!";
    }

}
