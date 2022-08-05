package com.API.RelationAPI.service;

import com.API.RelationAPI.entity.Guardian;
import com.API.RelationAPI.repository.GuardianRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuardianServiceImpl implements GuardianService{
    @Autowired
    private GuardianRepository guardianRepository;

    @Override
    public List<Guardian> getGuardians() {
        return guardianRepository.findAll();
    }

    @Override
    public Guardian getGuardian(Long gid) {
        return guardianRepository.getOne(gid);
    }

    @Override
    public Guardian addGuardian(Guardian guardian) {
        guardianRepository.save(guardian);
        return guardian;
    }

    @Override
    public Guardian updateGuardian(Guardian guardian) {
        guardianRepository.save(guardian);
        return guardian;
    }

    @Override
    public void deleteGuardian(Long gid) {
        Guardian guardian=guardianRepository.getOne(gid);
        guardianRepository.delete(guardian);
    }


}
