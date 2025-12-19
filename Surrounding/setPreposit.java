package Surrounding;
import Enums.Preposition;

import java.util.ArrayList;

public class setPreposit {
    public setPreposit(Preposition p){
        ArrayList<String> prep = new ArrayList<String>();
        prep.add(" но ");
        prep.add(" а ");
        prep.add(", ");
        prep.add(" Только ");
        prep.add(" Хотя ");
        prep.add(" как ");
        prep.add(". ");
        prep.add(" и ");
        prep.add("\n");
        try {
            switch (p) {
                case comma -> System.out.print(prep.get(2));
                case dot -> System.out.print(prep.get(6));
                case despite -> System.out.print(prep.get(4));
                case but -> System.out.print(prep.get(0));
                case however -> System.out.print(prep.get(1));
                case only -> System.out.print(prep.get(3));
                case like -> System.out.print(prep.get(5));
                case and -> System.out.print(prep.get(7));
                case space-> System.out.print(prep.get(8));

            }
        }catch(IndexOutOfBoundsException ex){System.out.print("Нет такого в словаре");}
    }

}
