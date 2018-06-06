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
public class WeaponEquipment extends Equipment{
    

    private String itemWeaponType, itemSubType, itemDmgS, itemDmgM, itemCritical, itemRange, itemWeight, itemType, itemSpecial;

    public WeaponEquipment() {
    }

    public WeaponEquipment(String name, String cost, String itemWeaponType, String itemSubType, String itemDmgS, String itemDmgM, String itemCritical, String itemRange, String itemWeight, String itemType, String itemSpecial) {
        super(name, cost);
        this.itemWeaponType = itemWeaponType;
        this.itemSubType = itemSubType;
        this.itemDmgS = itemDmgS;
        this.itemDmgM = itemDmgM;
        this.itemCritical = itemCritical;
        this.itemRange = itemRange;
        this.itemWeight = itemWeight;
        this.itemType = itemType;
        this.itemSpecial = itemSpecial;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getItemWeaponType() {
        return itemWeaponType;
    }

    public void setItemWeaponType(String itemWeaponType) {
        this.itemWeaponType = itemWeaponType;
    }

    public String getItemSubType() {
        return itemSubType;
    }

    public void setItemSubType(String itemSubType) {
        this.itemSubType = itemSubType;
    }

    public String getItemDmgS() {
        return itemDmgS;
    }

    public void setItemDmgS(String itemDmgS) {
        this.itemDmgS = itemDmgS;
    }

    public String getItemDmgM() {
        return itemDmgM;
    }

    public void setItemDmgM(String itemDmgM) {
        this.itemDmgM = itemDmgM;
    }

    public String getItemCritical() {
        return itemCritical;
    }

    public void setItemCritical(String itemCritical) {
        this.itemCritical = itemCritical;
    }

    public String getItemRange() {
        return itemRange;
    }

    public void setItemRange(String itemRange) {
        this.itemRange = itemRange;
    }

    public String getItemWeight() {
        return itemWeight;
    }

    public void setItemWeight(String itemWeight) {
        this.itemWeight = itemWeight;
    }

    public String getItemType() {
        return itemType;
    }

    public void setItemType(String itemType) {
        this.itemType = itemType;
    }

    public String getItemSpecial() {
        return itemSpecial;
    }

    public void setItemSpecial(String itemSpecial) {
        this.itemSpecial = itemSpecial;
    }

    /**
     * For use when printing equipment objects in the JTable in the character
     * creation section of the application
     *
     * @return A string array with all the information on the object
     */
    public String[] toStringArray() {
        String[] e = {name, cost, itemWeaponType, itemSubType, itemDmgS, itemDmgM, itemCritical, itemRange, itemWeight, itemType, itemSpecial};
        return e;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.name);
        hash = 23 * hash + Objects.hashCode(this.cost);
        hash = 23 * hash + Objects.hashCode(this.itemWeaponType);
        hash = 23 * hash + Objects.hashCode(this.itemSubType);
        hash = 23 * hash + Objects.hashCode(this.itemDmgS);
        hash = 23 * hash + Objects.hashCode(this.itemDmgM);
        hash = 23 * hash + Objects.hashCode(this.itemCritical);
        hash = 23 * hash + Objects.hashCode(this.itemRange);
        hash = 23 * hash + Objects.hashCode(this.itemWeight);
        hash = 23 * hash + Objects.hashCode(this.itemType);
        hash = 23 * hash + Objects.hashCode(this.itemSpecial);
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
        final WeaponEquipment other = (WeaponEquipment) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.cost, other.cost)) {
            return false;
        }
        if (!Objects.equals(this.itemWeaponType, other.itemWeaponType)) {
            return false;
        }
        if (!Objects.equals(this.itemSubType, other.itemSubType)) {
            return false;
        }
        if (!Objects.equals(this.itemDmgS, other.itemDmgS)) {
            return false;
        }
        if (!Objects.equals(this.itemDmgM, other.itemDmgM)) {
            return false;
        }
        if (!Objects.equals(this.itemCritical, other.itemCritical)) {
            return false;
        }
        if (!Objects.equals(this.itemRange, other.itemRange)) {
            return false;
        }
        if (!Objects.equals(this.itemWeight, other.itemWeight)) {
            return false;
        }
        if (!Objects.equals(this.itemType, other.itemType)) {
            return false;
        }
        if (!Objects.equals(this.itemSpecial, other.itemSpecial)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        String format = " \t ";
        return super.toString() + format + itemWeaponType + format + itemSubType + format + itemDmgS + format + itemDmgM + format + itemCritical + format + itemRange + format + itemWeight + format + itemType + format + itemSpecial;
    }


}
