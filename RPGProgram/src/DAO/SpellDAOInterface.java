/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Spells;
import java.util.ArrayList;

/**
 *
 * @author Megatronus
 */
public interface SpellDAOInterface {
    public ArrayList<Spells> getAllSpells();
    public ArrayList<String> getAllSpellSchools(String casterClass);
    public ArrayList<Integer> getAllSpellslevels(String casterClass);
    public ArrayList<Spells> getAllSpellsByClass(String casterClass);
    public ArrayList<Spells> getAllSpellsByClassAndSchool(String casterClass, String school);
    public ArrayList<Spells> getAllSpellsByClassSchoolLevel(String casterClass, String school, int level);
}
