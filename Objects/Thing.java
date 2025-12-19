package Objects;
import Enums.Action;
import Enums.Action;
import Interfaces.Adverbs;
import Interfaces.Property;


public class Thing extends Obj implements Property, Adverbs {
    public Thing(String name) {
        super(name);
    }

    public void condition(Action cond) {
        switch (cond){
            case appear -> System.out.print(" " + this.name + " появилось .");
            case had -> System.out.print(" " + this.name + " было .");
        }
    }

    @Override
    public void propertyes(String property) {
        this.name = " " + property + " " + this.name;
    }

    @Override
    public void adverbs(String adverb, Action cond) {
        System.out.print(adverb);
        condition(cond);
    }
    @Override
    public String toString(){
        return name;
    }


}
