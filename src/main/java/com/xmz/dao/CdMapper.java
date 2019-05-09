package com.xmz.dao;

import com.xmz.pojo.Cd;
import com.xmz.pojo.CdExample;
import com.xmz.pojo.CdWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CdMapper {
    long countByExample(CdExample example);

    int deleteByExample(CdExample example);

    int deleteByPrimaryKey(Integer cid);

    int insert(CdWithBLOBs record);

    int insertSelective(CdWithBLOBs record);

    List<CdWithBLOBs> selectByExampleWithBLOBs(CdExample example);

    List<Cd> selectByExample(CdExample example);

    CdWithBLOBs selectByPrimaryKey(Integer cid);

    int updateByExampleSelective(@Param("record") CdWithBLOBs record, @Param("example") CdExample example);

    int updateByExampleWithBLOBs(@Param("record") CdWithBLOBs record, @Param("example") CdExample example);

    int updateByExample(@Param("record") Cd record, @Param("example") CdExample example);

    int updateByPrimaryKeySelective(CdWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CdWithBLOBs record);

    int updateByPrimaryKey(Cd record);
}