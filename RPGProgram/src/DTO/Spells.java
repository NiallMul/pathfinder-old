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
public class Spells {
    private String spellName, spellClass, spellSchool, spellDesc;
    private int  spellLevel;

    public Spells() {
    }

    public Spells(String spellName, String spellClass, String spellSchool, String spellDesc, int spellLevel) {
        this.spellName = spellName;
        this.spellClass = spellClass;
        this.spellSchool = spellSchool;
        this.spellDesc = spellDesc;
        this.spellLevel = spellLevel;
    }

    public String getSpellName() {
        return spellName;
    }

    public void setSpellName(String spellName) {
        this.spellName = spellName;
    }

    public String getSpellClass() {
        return spellClass;
    }

    public void setSpellClass(String spellClass) {
        this.spellClass = spellClass;
    }

    public String getSpellSchool() {
        return spellSchool;
    }

    public void setSpellSchool(String spellSchool) {
        this.spellSchool = spellSchool;
    }

    public String getSpellDesc() {
        return spellDesc;
    }

    public void setSpellDesc(String spellDesc) {
        this.spellDesc = spellDesc;
    }

    public int getSpellLevel() {
        return spellLevel;
    }

    public void setSpellLevel(int spellLevel) {
        this.spellLevel = spellLevel;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + Objects.hashCode(this.spellName);
        hash = 67 * hash + Objects.hashCode(this.spellClass);
        hash = 67 * hash + Objects.hashCode(this.spellSchool);
        hash = 67 * hash + Objects.hashCode(this.spellDesc);
        hash = 67 * hash + this.spellLevel;
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
        final Spells other = (Spells) obj;
        if (!Objects.equals(this.spellName, other.spellName)) {
            return false;
        }
        if (!Objects.equals(this.spellClass, other.spellClass)) {
            return false;
        }
        if (!Objects.equals(this.spellSchool, other.spellSchool)) {
            return false;
        }
        if (!Objects.equals(this.spellDesc, other.spellDesc)) {
            return false;
        }
        if (this.spellLevel != other.spellLevel) {
            return false;
        }
        return true;
    }
    
    @Override
    public String toString() {
        return "Spells{" + "spellName=" + spellName + ", spellClass=" + spellClass + ", spellSchool=" + spellSchool + ", spellDesc=" + spellDesc + ", spellLevel=" + spellLevel + '}';
    }
    /**
     * For use when printing spell objects in the JTable in the character
     * creation section of the application
     *
     * @return A string array with all the information on the object
     */
    public String[] toStringArray() {
        String[] e = {spellName, spellDesc};
        return e;
    }
}
