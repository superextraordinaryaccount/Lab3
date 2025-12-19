import Enums.Action;
import Enums.Preposition;
import Objects.Entity;
import Objects.Thing;
import Surrounding.Effects;
import Surrounding.Places;
import Surrounding.setPreposit;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {


        Thing chores = new Thing("заботы");
        chores.propertyes("новые");
        chores.adverbs("скоро", Action.appear);
        new setPreposit(Preposition.space);

        Entity parents = new Entity( " родителей");
        Places gnez= new Places("в домах", parents);
        System.out.print(gnez.getplace());
        Entity chicks = new Entity(" птенцы ");
        chicks.verb(Action.beep);
        new setPreposit(Preposition.space);


        Entity bird = new Entity (" Акки Кебнекайсе");
        new setPreposit(Preposition.only);
        Places akhome = new Places("в гнезде", bird);
        System.out.print(akhome.getplace());
        Effects AKhEff = new Effects(" тихо", " ");
        System.out.print(AKhEff.geteffect());
        new setPreposit(Preposition.space);

        new setPreposit(Preposition.but);
        new setPreposit(Preposition.despite);
        Entity chick = new Entity(" птенцов ");
        bird.verb(Action.nothatched,chick);
        new setPreposit(Preposition.space);

        Thing worry = new Thing("хлопоты");
        bird.verb(Action.had,worry);
        new Thing("их").adverbs("хоть отбавляй", Action.had);
        new setPreposit(Preposition.space);


        parents.propertyes(" неопытных ");
        Places there= new Places("От гнезда к гнезду", parents);
        System.out.print(there.getplace());
        bird.verb(Action.fly);
        new setPreposit(Preposition.space);
        new setPreposit(Preposition.comma);
        new Entity("она").verb(Action.teach, new Entity(" их"));
        new setPreposit(Preposition.like);
        Entity parentch = new Entity(" родители ");


        parentch.verb(Action.feed, chick);
        new setPreposit(Preposition.space);
        new setPreposit(Preposition.comma);
        new setPreposit(Preposition.like);
        parentch.verb(Action.walk,chick);
        new setPreposit(Preposition.space);
        new setPreposit(Preposition.comma);
        new setPreposit(Preposition.like);
        parentch.verb(Action.swim,chick);
        new setPreposit(Preposition.space);
        new setPreposit(Preposition.comma);
        new setPreposit(Preposition.like);
        parentch.verb(Action.dive,chick);
    }

}


