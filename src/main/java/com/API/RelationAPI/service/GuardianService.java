package com.API.RelationAPI.service;

import com.API.RelationAPI.entity.Guardian;

import java.security.Guard;
import java.util.List;

public interface GuardianService {
    public List<Guardian> getGuardians();

    public Guardian getGuardian(Long gid);

    public Guardian addGuardian(Guardian guardian);

    public Guardian updateGuardian(Guardian guardian);

    public void deleteGuardian(Long gid);
}
