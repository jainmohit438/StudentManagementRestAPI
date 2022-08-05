package com.API.RelationAPI.controller;

import com.API.RelationAPI.entity.Guardian;
import com.API.RelationAPI.service.GuardianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class GuardianController {
    @Autowired
    private GuardianService guardianService;

    @GetMapping("/AllGuardian")
    public List<Guardian> getGuardians(){
        return guardianService.getGuardians();
    }

    @GetMapping("/Guardian/{gid}")
    public Guardian getGuardian(@PathVariable String gid){
        return guardianService.getGuardian(Long.parseLong(gid));
    }

    @PostMapping("/AddGuardian")
    public Guardian addGuardian(@RequestBody Guardian guardian){
        return guardianService.addGuardian(guardian);
    }

    @PutMapping("/UpdateGuardian")
    public Guardian updateGuardian(@RequestBody Guardian guardian){
        return guardianService.updateGuardian(guardian);
    }

    @DeleteMapping("/DeleteGuardian/{gid}")
    public void deleteGuardian(@PathVariable String gid){
        guardianService.deleteGuardian(Long.parseLong(gid));
    }
}
