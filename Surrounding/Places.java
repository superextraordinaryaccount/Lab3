package Surrounding;
import Objects.Obj;

public record Places(String place, Obj owner) {
    public String getplace(){
        return place  +" "+ owner;
    }
}
