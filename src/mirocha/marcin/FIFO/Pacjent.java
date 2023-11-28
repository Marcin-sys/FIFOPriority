package mirocha.marcin.FIFO;

public class Pacjent {

    int numberPriority;
    String name;


    @Override
    public String toString() {
        return "Pacjent{" +
                "numberPriority=" + numberPriority +
                ", name='" + name + '\'' +
                '}';
    }

    public int getNumberPriority() {
        return numberPriority;
    }

    public void setNumberPriority(int numberPriority) {
        this.numberPriority = numberPriority;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
