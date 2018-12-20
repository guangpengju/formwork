package com.gpj.springcloud.formwork.service;

import com.gpj.springcloud.formwork.mapper.FormworkMapper;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FormworkService {
    @Autowired
    public FormworkMapper mapper;
    
    public Map user(String loginId){
        return mapper.getUserByLoginId(loginId);
    }
}
