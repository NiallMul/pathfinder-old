/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DTO.Race;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

/**
 * RaceDAO allows the front end of the application to communicate with the
 * database in regards the race table at the moment
 *
 * @author Megatronus
 */
public class RaceDAO extends DAO implements RaceDAOInterface {

    private Race race;

    /**
     * Method to get all races stored in the database
     *
     * @return An arraylist of type race
     */
    @Override
    public ArrayList<Race> getRaces() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        ArrayList<Race> raceList = new ArrayList();

        try {
            con = getConnection();
            String query = "Select * from race";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                race = new Race();
                race.setName(rs.getString("raceName"));
                race.setRaceDesc(rs.getString("raceDesc"));
                race.setPhysicalDesc(rs.getString("physicalDesc"));
                race.setSocietyDesc(rs.getString("SocietyDesc"));
                race.setRelationsDesc(rs.getString("relationsDesc"));
                race.setAlignmentReligionDesc(rs.getString("alignmentReligionDesc"));
                race.setAdventurerDesc(rs.getString("adventurerDesc"));
                race.setmNamesDesc(rs.getString("mNamesDesc"));
                race.setfNamesDesc(rs.getString("fNamesDesc"));
                race.setStr(rs.getInt("str"));
                race.setDex(rs.getInt("dex"));
                race.setIntelligence(rs.getInt("intelligence"));
                race.setCon(rs.getInt("con"));
                race.setWis(rs.getInt("wis"));
                race.setCha(rs.getInt("cha"));
                raceList.add(race);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return raceList;

    }

    /**
     * Method to retrieve a race object based on its id
     *
     * @param id The id of the race entry we wish to retrieve
     * @return A race object with an id matching that of the parameter
     */
    @Override
    public Race getRace(int id) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        race = new Race();

        try {
            con = getConnection();
            String query = "Select * from race where raceId = ?";
            ps = con.prepareStatement(query);
            ps.setInt(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                race.setName(rs.getString("raceName"));
                race.setRaceDesc(rs.getString("raceDesc"));
                race.setPhysicalDesc(rs.getString("physicalDesc"));
                race.setSocietyDesc(rs.getString("SocietyDesc"));
                race.setRelationsDesc(rs.getString("relationsDesc"));
                race.setAlignmentReligionDesc(rs.getString("alignmentReligionDesc"));
                race.setAdventurerDesc(rs.getString("adventurerDesc"));
                race.setmNamesDesc(rs.getString("mNamesDesc"));
                race.setfNamesDesc(rs.getString("fNamesDesc"));
                race.setRaceSkills(rs.getString("raceSkills"));
                race.setStr(rs.getInt("str"));
                race.setDex(rs.getInt("dex"));
                race.setIntelligence(rs.getInt("intelligence"));
                race.setCon(rs.getInt("con"));
                race.setWis(rs.getInt("wis"));
                race.setCha(rs.getInt("cha"));

            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return race;
    }

    /**
     * Method to retrieve a race object based on its name
     *
     * @param name The name of the race entry we wish to retrieve
     * @return A race object with a name matching that of the parameter
     */
    @Override
    public Race getRace(String name) {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        race = new Race();

        try {
            con = getConnection();
            String query = "Select * from race where raceName = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, name);
            rs = ps.executeQuery();
            while (rs.next()) {
                race.setName(rs.getString("raceName"));
                race.setRaceDesc(rs.getString("raceDesc"));
                race.setPhysicalDesc(rs.getString("physicalDesc"));
                race.setSocietyDesc(rs.getString("SocietyDesc"));
                race.setRelationsDesc(rs.getString("relationsDesc"));
                race.setAlignmentReligionDesc(rs.getString("alignmentReligionDesc"));
                race.setAdventurerDesc(rs.getString("adventurerDesc"));
                race.setmNamesDesc(rs.getString("mNamesDesc"));
                race.setfNamesDesc(rs.getString("fNamesDesc"));
                race.setRaceSkills(rs.getString("raceSkills"));
                race.setStr(rs.getInt("str"));
                race.setDex(rs.getInt("dex"));
                race.setIntelligence(rs.getInt("intelligence"));
                race.setCon(rs.getInt("con"));
                race.setWis(rs.getInt("wis"));
                race.setCha(rs.getInt("cha"));

            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return race;
    }

    /**
     * Method to retrieve a list of all race names in the database
     *
     * @return A string arraylist containing the names of all races stored in
     * the database.
     */
    @Override
    public ArrayList<String> getRaceNames() {
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        String name = "";
        ArrayList<String> raceNameList = new ArrayList();

        try {
            con = getConnection();
            String query = "Select raceName from race";
            ps = con.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                name = rs.getString("raceName");
                raceNameList.add(name);
            }
        } catch (SQLException se) {
            se.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return raceNameList;
    }
}
