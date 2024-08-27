package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdmissionService {



    @Autowired
    private AdmissionRepository admissionRepository;


    public Admission saveAdmission(Admission admission){
        return admissionRepository.save(admission);
    }

    public List<Admission> getAllApplicants(){
        return admissionRepository.findAll();
    }



}
