/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Equipment;
import java.util.ArrayList;

/**
 *
 * @author Megatronus
 */
public interface EquipmentDAOInterface {
    public ArrayList<Equipment> getEquipmentByType(String type);
    public ArrayList<Equipment> getWeaponEquipmentByType(String type);
    public ArrayList<Equipment> getEquipmentBySubType(String subtype);
    public ArrayList<String> getEquipmentTypeNames();
    public ArrayList<String> getEquipmentSubtypeNames();
    public ArrayList<Equipment> getEquipmentTypeAndSubtype(String type, String subtype);
}
