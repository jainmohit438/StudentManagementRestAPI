package com.API.RelationAPI.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Student {
    @Id
    private Long sid;
    private Long cid;
    private Long gid;
    private String studentName;

    public Student() {
    }

    public Student(Long sid, Long cid, Long gid, String studentName) {
        this.sid = sid;
        this.cid = cid;
        this.gid = gid;
        this.studentName = studentName;
    }

    public Long getSid() {
        return sid;
    }

    public void setSid(Long sid) {
        this.sid = sid;
    }

    public Long getCid() {
        return cid;
    }

    public void setCid(Long cid) {
        this.cid = cid;
    }

    public Long getGid() {
        return gid;
    }

    public void setGid(Long gid) {
        this.gid = gid;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "sid=" + sid +
                ", cid=" + cid +
                ", gid=" + gid +
                ", studentName='" + studentName + '\'' +
                '}';
    }
}
