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
public class CharacterClass {
    private String name,desc,role,alignment,hitDie,skills,features;

    public CharacterClass() {
    }

    public CharacterClass(String name, String desc, String role, String alignment, String hitDie, String skills, String features) {
        this.name = name;
        this.desc = desc;
        this.role = role;
        this.alignment = alignment;
        this.hitDie = hitDie;
        this.skills = skills;
        this.features = features;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAlignment() {
        return alignment;
    }

    public void setAlignment(String alignment) {
        this.alignment = alignment;
    }

    public String getHitDie() {
        return hitDie;
    }

    public void setHitDie(String hitDie) {
        this.hitDie = hitDie;
    }

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }

    public String getFeatures() {
        return features;
    }

    public void setFeatures(String features) {
        this.features = features;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.name);
        hash = 97 * hash + Objects.hashCode(this.desc);
        hash = 97 * hash + Objects.hashCode(this.role);
        hash = 97 * hash + Objects.hashCode(this.alignment);
        hash = 97 * hash + Objects.hashCode(this.hitDie);
        hash = 97 * hash + Objects.hashCode(this.skills);
        hash = 97 * hash + Objects.hashCode(this.features);
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
        final CharacterClass other = (CharacterClass) obj;
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.desc, other.desc)) {
            return false;
        }
        if (!Objects.equals(this.role, other.role)) {
            return false;
        }
        if (!Objects.equals(this.alignment, other.alignment)) {
            return false;
        }
        if (!Objects.equals(this.hitDie, other.hitDie)) {
            return false;
        }
        if (!Objects.equals(this.skills, other.skills)) {
            return false;
        }
        if (!Objects.equals(this.features, other.features)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Class{" + "name=" + name + ", desc=" + desc + ", role=" + role + ", alignment=" + alignment + ", hitDie=" + hitDie + ", skills=" + skills + ", features=" + features + '}';
    }
    
    
}
