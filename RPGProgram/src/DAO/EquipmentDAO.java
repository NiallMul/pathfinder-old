/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.ArmourEquipment;
import DTO.Equipment;
import DTO.WeaponEquipment;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Megatronus
 */
public class EquipmentDAO extends DAO implements EquipmentDAOInterface {

    @Override
    public ArrayList<Equipment> getEquipmentByType(String type) {
        if (type.equalsIgnoreCase("weapons")) {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            ArrayList<Equipment> equipmentList = new ArrayList();
            WeaponEquipment equipment = null;
            try {
                con = getConnection();
                String query = "Select * from weapons;";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    equipment = new WeaponEquipment();
                    equipment.setName(rs.getString("itemName"));
                    equipment.setCost(rs.getString("itemCost"));
                    equipment.setItemWeaponType(rs.getString("itemWeaponType"));
                    equipment.setItemSubType(rs.getString("itemSubType"));
                    equipment.setItemDmgS(rs.getString("itemDmgS"));
                    equipment.setItemDmgM(rs.getString("itemDmgM"));
                    equipment.setItemCritical(rs.getString("itemCritical"));
                    equipment.setItemRange(rs.getString("itemRange"));
                    equipment.setItemWeight(rs.getString("itemWeight"));
                    equipment.setItemType(rs.getString("itemType"));
                    equipment.setItemSpecial(rs.getString("itemSpecial"));
                    equipmentList.add(equipment);
                }
            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return equipmentList;
        } else if (type.equalsIgnoreCase("armour")) {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            ArrayList<Equipment> equipmentList = new ArrayList();
            ArmourEquipment equipment = null;
            try {
                con = getConnection();
                String query = "Select * from armour;";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    equipment = new ArmourEquipment();
                    equipment.setName(rs.getString("itemName"));
                    equipment.setCost(rs.getString("itemCost"));
                    equipment.setBonus(rs.getString("itemArmourBonus"));
                    equipment.setDexBonus(rs.getString("itemDexBonus"));
                    equipment.setArmPenality(rs.getString("armPenality"));
                    equipment.setArcaneFail(rs.getString("arcaneFail"));
                    equipment.setWeight(rs.getString("itemWeight"));
                    equipment.setArmourType(rs.getString("armourType"));
                    equipmentList.add(equipment);
                }
            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return equipmentList;
        } else if (type.equalsIgnoreCase("goods")) {
            Connection con = null;
            PreparedStatement ps = null;
            ResultSet rs = null;
            ArrayList<Equipment> equipmentList = new ArrayList();
            Equipment equipment = null;
            try {
                con = getConnection();
                String query = "Select * from goods;";
                ps = con.prepareStatement(query);
                rs = ps.executeQuery();
                while (rs.next()) {
                    equipment = new WeaponEquipment();
                    equipment.setName(rs.getString("itemName"));
                    equipment.setCost(rs.getString("itemCost"));
                    equipmentList.add(equipment);
                }
            } catch (SQLException se) {
                se.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return equipmentList;
        }
        return null;
    }

    @Override
    public ArrayList<Equipment> getWeaponEquipmentByType(String type) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Equipment> equipmentList = new ArrayList();
        WeaponEquipment equipment = null;

        try {
            con = getConnection();
            String query = "Select * from Weapons where itemWeaponType = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, type);
            rs = ps.executeQuery();
            while (rs.next()) {
                equipment = new WeaponEquipment();
                equipment.setName(rs.getString("itemName"));
                equipment.setCost(rs.getString("itemCost"));
                equipment.setItemWeaponType(rs.getString("itemWeaponType"));
                equipment.setItemSubType(rs.getString("itemSubType"));
                equipment.setItemDmgS(rs.getString("itemDmgS"));
                equipment.setItemDmgM(rs.getString("itemDmgM"));
                equipment.setItemCritical(rs.getString("itemCritical"));
                equipment.setItemRange(rs.getString("itemRange"));
                equipment.setItemWeight(rs.getString("itemWeight"));
                equipment.setItemType(rs.getString("itemType"));
                equipment.setItemSpecial(rs.getString("itemSpecial"));
                equipmentList.add(equipment);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return equipmentList;
    }

    @Override
    public ArrayList<Equipment> getEquipmentBySubType(String subtype) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Equipment> equipmentList = new ArrayList();
        WeaponEquipment equipment = null;

        try {
            con = getConnection();
            String query = "Select * from Weapons where itemSubType = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, subtype);
            rs = ps.executeQuery();
            while (rs.next()) {
                equipment = new WeaponEquipment();
                equipment.setName(rs.getString("itemName"));
                equipment.setCost(rs.getString("itemCost"));
                equipment.setItemWeaponType(rs.getString("itemWeaponType"));
                equipment.setItemSubType(rs.getString("itemSubType"));
                equipment.setItemDmgS(rs.getString("itemDmgS"));
                equipment.setItemDmgM(rs.getString("itemDmgM"));
                equipment.setItemCritical(rs.getString("itemCritical"));
                equipment.setItemRange(rs.getString("itemRange"));
                equipment.setItemWeight(rs.getString("itemWeight"));
                equipment.setItemType(rs.getString("itemType"));
                equipment.setItemSpecial(rs.getString("itemSpecial"));
                equipmentList.add(equipment);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return equipmentList;
    }

    @Override
    public ArrayList<String> getEquipmentTypeNames() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<String> typeList = new ArrayList();
        String type = null;
        try {
            con = getConnection();
            String query = "Select DISTINCT itemWeaponType from weapons";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                type = rs.getString("itemWeaponType");
                typeList.add(type);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeList;
    }

    @Override
    public ArrayList<String> getEquipmentSubtypeNames() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<String> typeList = new ArrayList();
        String type = null;
        try {
            con = getConnection();
            String query = "Select DISTINCT itemSubType from weapons";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                type = rs.getString("itemSubType");
                typeList.add(type);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return typeList;
    }

    public ArrayList<Equipment> getEquipmentTypeAndSubtype(String type, String subtype) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Equipment> equipmentList = new ArrayList();
        WeaponEquipment equipment = null;

        try {
            con = getConnection();
            String query = "Select * from weapons where itemWeaponType = ? AND itemSubType = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, type);
            ps.setString(2, subtype);
            rs = ps.executeQuery();
            while (rs.next()) {
                equipment = new WeaponEquipment();
                equipment.setName(rs.getString("itemName"));
                equipment.setCost(rs.getString("itemCost"));
                equipment.setItemWeaponType(rs.getString("itemWeaponType"));
                equipment.setItemSubType(rs.getString("itemSubType"));
                equipment.setItemDmgS(rs.getString("itemDmgS"));
                equipment.setItemDmgM(rs.getString("itemDmgM"));
                equipment.setItemCritical(rs.getString("itemCritical"));
                equipment.setItemRange(rs.getString("itemRange"));
                equipment.setItemWeight(rs.getString("itemWeight"));
                equipment.setItemType(rs.getString("itemType"));
                equipment.setItemSpecial(rs.getString("itemSpecial"));
                equipmentList.add(equipment);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return equipmentList;
    }

}
