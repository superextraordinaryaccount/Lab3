package Objects;
import Enums.Action;
import Interfaces.Adverbs;
import Interfaces.Property;

import java.io.IOException;
import java.util.Objects;

public class Entity extends Obj implements Property, Adverbs {

    @Override
    public boolean equals(Object o){
        if (this == o) return true;
        if (o== null || getClass() != o.getClass()) return false;
        Entity entity = (Entity) o;
        return Objects.equals(name.toLowerCase(), entity.name.toLowerCase());
    }
    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

    @Override
    public String toString(){
        return name;
    }

    private String name;

    public Entity(String name) {
        super(name);
        this.name = name;
    }
    public void verb(Action act) {
        try {

            switch (act) {
                case beep -> System.out.print(this.name + " запищали.");
                case nothatched -> System.out.print(this.name + " не вывел(а) .");
                case fly -> System.out.print(this.name + " летала ");
                case had -> System.out.print(" у " + this.name + " были  " + " .");
                case teach -> System.out.print(this.name + " учила .");
                case feed -> System.out.print(this.name + " должны кормить " + ". ");
                case swim -> System.out.print(this.name + " будут учиться " + " плавать .");
                case walk -> System.out.print(this.name + " будут учиться " + " ходить. ");
                case dive -> System.out.print(this.name + " будут учиться " + " нырять .");
            }
        } catch(Exception ex){System.out.print(" Что -то пошло не так!!! ");}
        }
    public void verb(Action act, Obj o){
        switch (act){

            case beep -> System.out.print(this.name + " запищали " + " на " +o + ".");
            case nothatched -> System.out.print(this.name + " не вывела(а) " + o + " .");
            case had -> System.out.print(" у " + this.name + " были  " + o + " .");
            case teach -> System.out.print(this.name + o + " учила ");
            case feed -> System.out.print(this.name +" должны кормить "+ o + " ");
            case swim -> System.out.print(this.name +" будут учить "+ o + " плавать ");
            case walk -> System.out.print(this.name +" будут учить "+ o + " ходить ");
            case dive -> System.out.print(this.name +" будут учить "+ o + " нырять ");

        }
    }
    @Override
    public void propertyes(String property){
        this.name = " " + property + " " + this.name;
    }

    @Override
    public void adverbs(String adverb, Action act){
            System.out.print(adverb);
            verb(act);
    }


}
