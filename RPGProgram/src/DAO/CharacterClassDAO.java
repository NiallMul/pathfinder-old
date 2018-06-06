/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.CharacterClass;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Megatronus
 */
public class CharacterClassDAO extends DAO implements CharacterClassDAOInterface{
    private CharacterClass cClass;
    
    @Override
    public CharacterClass getClass(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        cClass = new CharacterClass();

        try {
            con = getConnection();
            String query = "Select * from classes where classId = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while(rs.next()){
                cClass.setName(rs.getString("className"));
                cClass.setDesc(rs.getString("classDesc"));
                cClass.setRole(rs.getString("classRole"));
                cClass.setAlignment(rs.getString("classAlignment"));
                cClass.setHitDie(rs.getString("classHitDie"));
                cClass.setSkills(rs.getString("classSkills"));
                cClass.setFeatures(rs.getString("classFeatures"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CharacterClassDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cClass;
    }

    @Override
    public CharacterClass getClass(String name) {
    Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        cClass = new CharacterClass();

        try {
            con = getConnection();
            String query = "Select * from classes where className = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while(rs.next()){
                cClass.setName(rs.getString("className"));
                cClass.setDesc(rs.getString("classDesc"));
                cClass.setRole(rs.getString("classRole"));
                cClass.setAlignment(rs.getString("classAlignment"));
                cClass.setHitDie(rs.getString("classHitDie"));
                cClass.setSkills(rs.getString("classSkills"));
                cClass.setFeatures(rs.getString("classFeatures"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(CharacterClassDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return cClass;}

    @Override
    public ArrayList<CharacterClass> getClasses() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<CharacterClass> classList = new ArrayList();

        try {
            con = getConnection();
            String query = "Select * from classes";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                cClass = new CharacterClass();
                cClass.setName(rs.getString("className"));
                cClass.setDesc(rs.getString("classDesc"));
                cClass.setRole(rs.getString("classRole"));
                cClass.setAlignment(rs.getString("classAlignment"));
                cClass.setHitDie(rs.getString("classHitDie"));
                cClass.setSkills(rs.getString("classSkills"));
                cClass.setFeatures(rs.getString("classFeatures"));

                classList.add(cClass);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classList;
    }

    @Override
    public ArrayList<String> getClassNames() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String name = "";
        ArrayList<String> classNameList = new ArrayList();

        try {
            con = getConnection();
            String query = "Select className from classes";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("className");
                classNameList.add(name);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return classNameList;
    }
    
}
