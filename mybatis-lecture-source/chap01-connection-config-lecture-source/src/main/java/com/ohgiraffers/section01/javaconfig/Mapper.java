package com.ohgiraffers.section01.javaconfig;

import org.apache.ibatis.annotations.Select;
import java.util.Date;

public interface Mapper {

    @Select("SELECT SYSDATE FROM DUAL")
    Date selectSysdate();
}
