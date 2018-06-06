/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CharacterClass;
import java.util.ArrayList;

/**
 *
 * @author Megatronus
 */
public interface CharacterClassDAOInterface {
    public CharacterClass getClass(int id);
    public CharacterClass getClass(String name);
    public ArrayList<CharacterClass> getClasses();
    public ArrayList<String> getClassNames();
}
