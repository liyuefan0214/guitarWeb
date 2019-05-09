package com.xmz.dao;

import com.xmz.pojo.Music;
import com.xmz.pojo.MusicExample;
import com.xmz.pojo.MusicWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface MusicMapper {
    long countByExample(MusicExample example);

    int deleteByExample(MusicExample example);

    int deleteByPrimaryKey(Integer mid);

    int insert(MusicWithBLOBs record);

    int insertSelective(MusicWithBLOBs record);

    List<MusicWithBLOBs> selectByExampleWithBLOBs(MusicExample example);

    List<Music> selectByExample(MusicExample example);

    MusicWithBLOBs selectByPrimaryKey(Integer mid);

    int updateByExampleSelective(@Param("record") MusicWithBLOBs record, @Param("example") MusicExample example);

    int updateByExampleWithBLOBs(@Param("record") MusicWithBLOBs record, @Param("example") MusicExample example);

    int updateByExample(@Param("record") Music record, @Param("example") MusicExample example);

    int updateByPrimaryKeySelective(MusicWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(MusicWithBLOBs record);

    int updateByPrimaryKey(Music record);
}