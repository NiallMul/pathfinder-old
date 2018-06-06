/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Spells;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author Megatronus
 */
public class SpellDAO extends DAO implements SpellDAOInterface {

    @Override
    public ArrayList<Spells> getAllSpells() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Spells> spellList = new ArrayList();
        Spells spell = null;
        try {
            con = getConnection();
            String query = "Select * from spells;";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                spell = new Spells();
                spell.setSpellName(rs.getString("spellName"));
                spell.setSpellClass(rs.getString("spellClass"));
                spell.setSpellSchool(rs.getString("spellSchool"));
                spell.setSpellDesc(rs.getString("spellDesc"));
                spell.setSpellLevel(rs.getInt("spellLevel"));
                spellList.add(spell);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellList;
    }

    @Override
    public ArrayList<Spells> getAllSpellsByClass(String casterClass) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Spells> spellList = new ArrayList();
        Spells spell = null;
        try {
            con = getConnection();
            String query = "Select * from spells where spellClass = ?;";
            ps = con.prepareStatement(query);
            ps.setString(1, casterClass);
            rs = ps.executeQuery();
            while (rs.next()) {
                spell = new Spells();
                spell.setSpellName(rs.getString("spellName"));
                spell.setSpellClass(rs.getString("spellClass"));
                spell.setSpellSchool(rs.getString("spellSchool"));
                spell.setSpellDesc(rs.getString("spellDesc"));
                spell.setSpellLevel(rs.getInt("spellLevel"));
                spellList.add(spell);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellList;
    }

    @Override
    public ArrayList<Spells> getAllSpellsByClassAndSchool(String casterClass, String school) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Spells> spellList = new ArrayList();
        Spells spell = null;
        try {
            con = getConnection();
            String query = "Select * from spells where spellClass = ? and spellSchool = ?;";
            ps = con.prepareStatement(query);
            ps.setString(1, casterClass);
            ps.setString(2, school);
            rs = ps.executeQuery();
            while (rs.next()) {
                spell = new Spells();
                spell.setSpellName(rs.getString("spellName"));
                spell.setSpellClass(rs.getString("spellClass"));
                spell.setSpellSchool(rs.getString("spellSchool"));
                spell.setSpellDesc(rs.getString("spellDesc"));
                spell.setSpellLevel(rs.getInt("spellLevel"));
                spellList.add(spell);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellList;
    }

    @Override
    public ArrayList<Spells> getAllSpellsByClassSchoolLevel(String casterClass, String school, int level) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Spells> spellList = new ArrayList();
        Spells spell = null;
        try {
            con = getConnection();
            String query = "Select * from spells where spellClass = ? and spellSchool = ? and spellLevel = ?;";
            ps = con.prepareStatement(query);
            ps.setString(1, casterClass);
            ps.setString(2, school);
            ps.setInt(3, level);
            rs = ps.executeQuery();
            while (rs.next()) {
                spell = new Spells();
                spell.setSpellName(rs.getString("spellName"));
                spell.setSpellClass(rs.getString("spellClass"));
                spell.setSpellSchool(rs.getString("spellSchool"));
                spell.setSpellDesc(rs.getString("spellDesc"));
                spell.setSpellLevel(rs.getInt("spellLevel"));
                spellList.add(spell);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellList;
    }

    @Override
    public ArrayList<String> getAllSpellSchools(String casterClass) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<String> spellSchoolList = new ArrayList();
        try {
            con = getConnection();
            String query = "Select DISTINCT spellSchool from spells where spellClass = ?;";
            ps = con.prepareStatement(query);
            ps.setString(1, casterClass);
            rs = ps.executeQuery();
            while (rs.next()) {
                spellSchoolList.add(rs.getString("spellSchool"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellSchoolList;
    }

    @Override
    public ArrayList<Integer> getAllSpellslevels(String casterClass) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Integer> spellLevelList = new ArrayList();
        try {
            con = getConnection();
            String query = "Select DISTINCT spellLevel from spells where spellClass = ?;";
            ps = con.prepareStatement(query);
            ps.setString(1, casterClass);
            rs = ps.executeQuery();
            while (rs.next()) {
                spellLevelList.add(rs.getInt("spellLevel"));
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return spellLevelList;
    }

}
