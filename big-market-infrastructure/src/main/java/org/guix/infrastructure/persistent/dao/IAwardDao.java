package org.guix.infrastructure.persistent.dao;

import org.apache.ibatis.annotations.Mapper;
import org.guix.infrastructure.persistent.po.Award;

import java.util.List;

@Mapper
public interface IAwardDao {
    List<Award> queryAwardList();

}
