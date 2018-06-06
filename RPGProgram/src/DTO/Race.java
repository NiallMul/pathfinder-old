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
public class Race {
    private String name, raceDesc, physicalDesc, SocietyDesc, relationsDesc, alignmentReligionDesc, adventurerDesc, mNamesDesc, fNamesDesc, raceSkills;
    private int str,dex,intelligence,con,wis,cha;
    public Race() {
    }

    public Race(String name, String raceDesc, String physicalDesc, String SocietyDesc, String relationsDesc, String alignmentReligionDesc, String adventurerDesc, String mNamesDesc, String fNamesDesc, String raceSkills, int str, int dex, int intelligence, int con,int wis, int cha) {
        this.name = name;
        this.raceDesc = raceDesc;
        this.physicalDesc = physicalDesc;
        this.SocietyDesc = SocietyDesc;
        this.relationsDesc = relationsDesc;
        this.alignmentReligionDesc = alignmentReligionDesc;
        this.adventurerDesc = adventurerDesc;
        this.mNamesDesc = mNamesDesc;
        this.fNamesDesc = fNamesDesc;
        this.raceSkills = raceSkills;
        this.str = str;
        this.dex = dex;
        this.intelligence = intelligence;
        this.con = con;
        this.wis = wis;
        this.cha = cha;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRaceDesc() {
        return raceDesc;
    }

    public void setRaceDesc(String raceDesc) {
        this.raceDesc = raceDesc;
    }

    public String getPhysicalDesc() {
        return physicalDesc;
    }

    public void setPhysicalDesc(String physicalDesc) {
        this.physicalDesc = physicalDesc;
    }

    public String getSocietyDesc() {
        return SocietyDesc;
    }

    public void setSocietyDesc(String SocietyDesc) {
        this.SocietyDesc = SocietyDesc;
    }

    public String getRelationsDesc() {
        return relationsDesc;
    }

    public void setRelationsDesc(String relationsDesc) {
        this.relationsDesc = relationsDesc;
    }

    public String getAlignmentReligionDesc() {
        return alignmentReligionDesc;
    }

    public void setAlignmentReligionDesc(String alignmentReligionDesc) {
        this.alignmentReligionDesc = alignmentReligionDesc;
    }

    public String getAdventurerDesc() {
        return adventurerDesc;
    }

    public void setAdventurerDesc(String adventurerDesc) {
        this.adventurerDesc = adventurerDesc;
    }

    public String getmNamesDesc() {
        return mNamesDesc;
    }

    public void setmNamesDesc(String mNamesDesc) {
        this.mNamesDesc = mNamesDesc;
    }

    public String getfNamesDesc() {
        return fNamesDesc;
    }

    public void setfNamesDesc(String fNamesDesc) {
        this.fNamesDesc = fNamesDesc;
    }

    public String getRaceSkills() {
        return raceSkills;
    }

    public void setRaceSkills(String raceSkills) {
        this.raceSkills = raceSkills;
    }

    public int getStr() {
        return str;
    }

    public void setStr(int str) {
        this.str = str;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getCon() {
        return con;
    }

    public void setCon(int con) {
        this.con = con;
    }
    public int getWis() {
        return wis;
    }

    public void setWis(int wis) {
        this.wis = wis;
    }

    public int getCha() {
        return cha;
    }

    public void setCha(int cha) {
        this.cha = cha;
    }


    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.name);
        hash = 59 * hash + Objects.hashCode(this.raceDesc);
        hash = 59 * hash + Objects.hashCode(this.physicalDesc);
        hash = 59 * hash + Objects.hashCode(this.SocietyDesc);
        hash = 59 * hash + Objects.hashCode(this.relationsDesc);
        hash = 59 * hash + Objects.hashCode(this.alignmentReligionDesc);
        hash = 59 * hash + Objects.hashCode(this.adventurerDesc);
        hash = 59 * hash + Objects.hashCode(this.mNamesDesc);
        hash = 59 * hash + Objects.hashCode(this.fNamesDesc);
        hash = 59 * hash + Objects.hashCode(this.raceSkills);
        hash = 59 * hash + Objects.hashCode(this.str);
        hash = 59 * hash + Objects.hashCode(this.dex);
        hash = 59 * hash + Objects.hashCode(this.intelligence);
        hash = 59 * hash + Objects.hashCode(this.con);
        hash = 59 * hash + Objects.hashCode(this.wis);
        hash = 59 * hash + Objects.hashCode(this.cha);
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
        final Race other = (Race) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.raceDesc, other.raceDesc)) {
            return false;
        }
        if (!Objects.equals(this.physicalDesc, other.physicalDesc)) {
            return false;
        }
        if (!Objects.equals(this.SocietyDesc, other.SocietyDesc)) {
            return false;
        }
        if (!Objects.equals(this.relationsDesc, other.relationsDesc)) {
            return false;
        }
        if (!Objects.equals(this.alignmentReligionDesc, other.alignmentReligionDesc)) {
            return false;
        }
        if (!Objects.equals(this.adventurerDesc, other.adventurerDesc)) {
            return false;
        }
        if (!Objects.equals(this.mNamesDesc, other.mNamesDesc)) {
            return false;
        }
        if (!Objects.equals(this.fNamesDesc, other.fNamesDesc)) {
            return false;
        }
        if (!Objects.equals(this.raceSkills, other.raceSkills)) {
            return false;
        }
        if (this.str != other.str) {
            return false;
        }
        if (this.dex != other.dex) {
            return false;
        }
        if (this.intelligence != other.intelligence) {
            return false;
        }
        if (this.con != other.con) {
            return false;
        }
        if (this.wis != other.wis) {
            return false;
        }
        if (this.cha != other.cha) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Race{" + "name=" + name + ", raceDesc=" + raceDesc + ", physicalDesc=" + physicalDesc + ", SocietyDesc=" + SocietyDesc + ", relationsDesc=" + relationsDesc + ", alignmentReligionDesc=" + alignmentReligionDesc + ", adventurerDesc=" + adventurerDesc + ", mNamesDesc=" + mNamesDesc + ", fNamesDesc=" + fNamesDesc + ", raceSkills=" + raceSkills + ", str=" + str + ", dex=" + dex + ", intelligence=" + intelligence + ", con=" + con + ", wis=" + wis + ", cha=" + cha + '}';
    }

    
}
