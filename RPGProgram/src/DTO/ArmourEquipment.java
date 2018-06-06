/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Objects;

/**
 *
 * @author Megatronus
 */
public class ArmourEquipment extends Equipment{
    String bonus, dexBonus, armPenality, arcaneFail, weight, armourType;

    public ArmourEquipment() {
        super();
    }

    public ArmourEquipment(String bonus, String dexBonus, String armPenality, String arcaneFail, String weight, String name, String cost, String armourType) {
        super(name, cost);
        this.bonus = bonus;
        this.dexBonus = dexBonus;
        this.armPenality = armPenality;
        this.arcaneFail = arcaneFail;
        this.weight = weight;
        this.armourType = armourType;
    }

    public String getBonus() {
        return bonus;
    }

    public void setBonus(String bonus) {
        this.bonus = bonus;
    }

    public String getDexBonus() {
        return dexBonus;
    }

    public void setDexBonus(String dexBonus) {
        this.dexBonus = dexBonus;
    }

    public String getArmPenality() {
        return armPenality;
    }

    public void setArmPenality(String armPenality) {
        this.armPenality = armPenality;
    }

    public String getArcaneFail() {
        return arcaneFail;
    }

    public void setArcaneFail(String arcaneFail) {
        this.arcaneFail = arcaneFail;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getArmourType() {
        return armourType;
    }

    public void setArmourType(String armourType) {
        this.armourType = armourType;
    }
    
    /**
     * For use when printing equipment objects in the JTable in the character
     * creation section of the application
     *
     * @return A string array with all the information on the object
     */
    public String[] toStringArray() {
        String[] e = {name, cost, bonus, dexBonus, armPenality, arcaneFail, weight, armourType};
        return e;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 83 * hash + Objects.hashCode(this.bonus);
        hash = 83 * hash + Objects.hashCode(this.dexBonus);
        hash = 83 * hash + Objects.hashCode(this.armPenality);
        hash = 83 * hash + Objects.hashCode(this.arcaneFail);
        hash = 83 * hash + Objects.hashCode(this.weight);
        hash = 83 * hash + Objects.hashCode(this.armourType);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ArmourEquipment other = (ArmourEquipment) obj;
        if (!Objects.equals(this.bonus, other.bonus)) {
            return false;
        }
        if (!Objects.equals(this.dexBonus, other.dexBonus)) {
            return false;
        }
        if (!Objects.equals(this.armPenality, other.armPenality)) {
            return false;
        }
        if (!Objects.equals(this.arcaneFail, other.arcaneFail)) {
            return false;
        }
        if (!Objects.equals(this.weight, other.weight)) {
            return false;
        }
        if (!Objects.equals(this.armourType, other.armourType)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String format = " \t ";
        return super.toString() + format +  bonus + format + dexBonus + format + armPenality + format + arcaneFail + format + weight + format + armourType;
    }
    
    
}
