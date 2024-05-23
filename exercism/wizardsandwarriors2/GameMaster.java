package pl.globallogic.exercism.wizardsandwarriors2;

public class GameMaster {

    public String describe(Character character) {
        return "You're a level "+character.getLevel()+" "+character.getCharacterClass()+" with "
                +character.getHitPoints()+" hit points.";
    }
    public String describe(Destination destination) {
        return "You've arrived at "+destination.getName()+", which has "+destination.getInhabitants()+" inhabitants.";
    }
    public String describe(TravelMethod travelMethod) {
        String travelMode = travelMethod == TravelMethod.WALKING ? "by walking" : "on horseback";
        return "You're traveling to your destination "+travelMode+".";
    }
    public String describe(Character character, Destination destination, TravelMethod travelMethod) {
        return describe(character)+" "+describe(travelMethod)+" "+describe(destination);
    }
    public String describe(Character character, Destination destination) {
        return describe(character)+" You're traveling to your destination by walking. "+describe(destination);
    }
}
