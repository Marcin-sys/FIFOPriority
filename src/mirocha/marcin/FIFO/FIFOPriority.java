package mirocha.marcin.FIFO;

import java.util.ArrayList;

public class FIFOPriority {

    public final ArrayList< Pacjent > dataBaseFIFO = new ArrayList<>();

    public  void push(String element, int priorityNumber){
        Pacjent pacjent = new Pacjent();
        pacjent.name = element;
        pacjent.numberPriority = priorityNumber;
        this.dataBaseFIFO.add(pacjent);
    }
    public  String popFirst() {
        if (this.dataBaseFIFO.isEmpty()){
            return "Queue is Empty";
        }
        Pacjent temp;
        temp = this.dataBaseFIFO.get(0);
        this.dataBaseFIFO.remove(0);
        return temp.toString();
    }

    public  String popHighTree() {


        if (this.dataBaseFIFO.isEmpty()){
            return "Queue is Empty";
        }

        if (this.dataBaseFIFO.size() < 3){
            return "Queue dont have 3 Patient";
        }
        String result = " ";
        for (int i = 0; i < 3; i++){
            result = result + findTopPriority() + " ";
        }
        return result;
    }

    public String findTopPriority(){
        Pacjent temp;
        int index = 0;
        Pacjent pacjentTopPriority = this.dataBaseFIFO.get(0);
        for (int i = 1; i < this.dataBaseFIFO.size(); i++){
            temp = this.dataBaseFIFO.get(i);
            if (temp.numberPriority > pacjentTopPriority.numberPriority){
                pacjentTopPriority = temp;
                index = i;
            }
        }
        this.dataBaseFIFO.remove(index);
        return pacjentTopPriority.toString();
    }
}
