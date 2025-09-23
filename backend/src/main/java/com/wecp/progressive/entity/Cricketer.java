package com.wecp.progressive.entity;


import java.util.Comparator;

public class Cricketer implements Comparable<Cricketer> {
    private int cricketerId;
    private int teamId;
    private int age;
    private String cricketerName;
    private String nationality;
    private String role;
    private int experience;
    private int totalRuns;
    private int totalWickets;

    
    
    public Cricketer() {
    }
    public Cricketer(int cricketerId, int teamId, int age, String cricketerName, String nationality, String role,
            int experience, int totalRuns, int totalWickets) {
        this.cricketerId = cricketerId;
        this.teamId = teamId;
        this.age = age;
        this.cricketerName = cricketerName;
        this.nationality = nationality;
        this.role = role;
        this.experience = experience;
        this.totalRuns = totalRuns;
        this.totalWickets = totalWickets;
    }
    public int getCricketerId() {
        return cricketerId;
    }
    public void setCricketerId(int cricketerId) {
        this.cricketerId = cricketerId;
    }
    public String getCricketerName() {
        return cricketerName;
    }
    public void setCricketerName(String cricketerName) {
        this.cricketerName = cricketerName;
    }
    public String getNationality() {
        return nationality;
    }
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    public int getExperience() {
        return experience;
    }
    public void setExperience(int experience) {
        this.experience = experience;
    }
    public int getTotalRuns() {
        return totalRuns;
    }
    public void setTotalRuns(int totalRuns) {
        this.totalRuns = totalRuns;
    }
    public int getTotalWickets() {
        return totalWickets;
    }
    public void setTotalWickets(int totalWickets) {
        this.totalWickets = totalWickets;
    }
    public int getAge() {
        return age;
    }public int getTeamId() {
        return teamId;
    }public void setAge(int age) {
        this.age = age;
    }public void setTeamId(int teamId) {
        this.teamId = teamId;
    }
   

    @Override
    public int compareTo(Cricketer o) {
        return Comparator.comparingInt(Cricketer::getExperience).compare(this,o);
    }





    
}