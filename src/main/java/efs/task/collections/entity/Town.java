package efs.task.collections.entity;

import java.util.List;
import java.util.Objects;

public class Town implements Comparable{
    private String townName;
    private List<String> startingHeroClasses;

    public Town(String townName, List<String> startingHeroesClass) {
        this.townName = townName;
        startingHeroClasses = startingHeroesClass;
    }

    public String getTownName() {
        return townName;
    }

    public List<String> getStartingHeroClasses() {
        return startingHeroClasses;
    }

    //TODO implementacja metody equal porównująca obiekty Town na podstawie tylko townName.
    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(obj.getClass() != this.getClass())
            return false;
        if(this.townName.equals(((Town) obj).townName))
            return true;
        return false;
    }

    //TODO implementacja metody equal biorąca pod uwagę tylko townName.
    @Override
    public int hashCode() {
        return Objects.hash(this.townName);
    }

    @Override
    public String toString() {
        return "Miasto :" + townName;
    }
    @Override
    public int compareTo(Object obj) {
        return this.getTownName().compareTo(((Town) obj).getTownName());
    }
}
