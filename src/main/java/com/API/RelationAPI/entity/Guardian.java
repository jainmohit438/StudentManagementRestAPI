package com.API.RelationAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Guardian {
    @Id
    private Long gid;
    private String guardianName;
    private String city;

    public Guardian() {
    }

    public Guardian(Long gid, String guardianName, String city) {
        this.gid = gid;
        this.guardianName = guardianName;
        this.city = city;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getGuardianName() {
        return guardianName;
    }

    public void setGuardianName(String guardianName) {
        this.guardianName = guardianName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Guardian{" +
                "gid=" + gid +
                ", guardianName='" + guardianName + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
