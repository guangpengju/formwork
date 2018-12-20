package com.gpj.springcloud.formwork.mapper;

import java.util.HashMap;
import org.springframework.stereotype.Repository;

@Repository
public interface FormworkMapper {
    public HashMap getUserByLoginId(String loginId);
}
