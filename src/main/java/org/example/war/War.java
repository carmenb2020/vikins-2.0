package org.example.war;
import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

import java.util.ArrayList;
import java.util.List;

public class War {

    static List VikingArmy = new ArrayList<>();
    List SaxonArmy = new ArrayList<>();
    public List<Vikings> getVikingArmy() {
      return(VikingArmy);
    }
    public List<Saxon> getSaxonArmy() {
        return(SaxonArmy);
    }

    public static void addViking(Vikings viking) { VikingArmy.add(viking);}

    public void addSaxon(Saxon saxon) {
        SaxonArmy.add(saxon);
    }

    public String vikingAttack(){
        int vikingRandom = (int)(Math.random()*VikingArmy.size());
        int saxonRandom = (int)(Math.random()*SaxonArmy.size());
        Saxon saxonSoldier = (Saxon) SaxonArmy.get(saxonRandom);
        Vikings vikingSoldier = (Vikings) VikingArmy.get(vikingRandom);
        int result = saxonSoldier.receiveDamage(vikingSoldier.getStrength());
        if (saxonSoldier.health <= 0){
            SaxonArmy.remove(saxonRandom);
            return ("A Saxon has died in combat");
        }
        else return ("A saxon has received" + vikingSoldier.getStrength() + "points of damage");
    }

    public String saxonAttack(){
        int vikingRandom = (int)(Math.random()*VikingArmy.size());
        int saxonRandom = (int)(Math.random()*SaxonArmy.size());
        Saxon saxonSoldier = (Saxon) SaxonArmy.get(saxonRandom);
        Vikings vikingSoldier = (Vikings) VikingArmy.get(vikingRandom);
        int result = vikingSoldier.receiveDamage(saxonSoldier.getStrength());
        if (vikingSoldier.health <= 0){
            VikingArmy.remove(vikingRandom);
            return (vikingSoldier.getName() + "has died in act of combat");
        }
        return(vikingSoldier.getName() + "has received" + saxonSoldier.getStrength() + "points of damage");
    }
}
