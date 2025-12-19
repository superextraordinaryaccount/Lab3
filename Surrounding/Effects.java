package Surrounding;

public record Effects(String effect, String when) {
    public String geteffect(){
        return when + "было "+ effect + ".";
    }
}
