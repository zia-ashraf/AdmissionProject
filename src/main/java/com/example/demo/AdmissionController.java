package com.example.demo;

import com.example.demo.Admission;
import com.example.demo.AdmissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/admission")
public class AdmissionController{

    @Autowired
    private AdmissionService admissionService;

    @PostMapping("/new")
    public Admission createAdmission(@RequestBody Admission admission){
        return admissionService.saveAdmission(admission);
    }

    @GetMapping("/all")
    public List<Admission> getAllAdmissions(){
        return admissionService.getAllApplicants();

    }



}
