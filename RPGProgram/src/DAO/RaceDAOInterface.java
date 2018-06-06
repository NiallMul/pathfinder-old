/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Race;
import java.util.ArrayList;

/**
 *
 * @author Megatronus
 */
public interface RaceDAOInterface {
    public ArrayList<Race> getRaces();
    public Race getRace(int id);
    public Race getRace(String name);
    public ArrayList<String> getRaceNames();
}
