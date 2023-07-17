package org.example.war;

import org.example.saxon.Saxon;
import org.example.vikins.Vikings;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;

public class War {

    private List VikingArmy = new ArrayList<>();
    private List SaxonArmy = new ArrayList<>();
    public List<Vikings> getVikingArmy() {
      return(VikingArmy);
    }
    public List<Saxon> getSaxonArmy() {
        return(SaxonArmy);
    }

    public void addViking(Vikings viking) { VikingArmy.add(viking);}

    public void addSaxon(Saxon saxon) {
        SaxonArmy.add(saxon);
    }

    public String vikingAttack(){
        SecureRandom rand = new SecureRandom();
        int VikingArmyL = VikingArmy.size();
        int vikingRandom = rand.nextInt(VikingArmyL);
        int saxonRandom = (int)(Math.random()*SaxonArmy.size());
        Saxon saxonSoldier = (Saxon) SaxonArmy.get(saxonRandom);
        Vikings vikingSoldier = (Vikings) VikingArmy.get(vikingRandom);
        saxonSoldier.receiveDamage(vikingSoldier.getStrength());
        if (saxonSoldier.getHealth() <= 0){
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
        if (vikingSoldier.getHealth() <= 0){
            VikingArmy.remove(vikingRandom);
            return (vikingSoldier.getName() + "has died in act of combat");
        }
        return(vikingSoldier.getName() + "has received" + saxonSoldier.getStrength() + "points of damage");
    }
}
