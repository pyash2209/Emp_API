package com.springbootcrud_jdbc.springboot_jdbc.Dao;

import java.util.List;

public interface DAO<Y,key> {

   int save(Y y);
   int update(Y y,key id);
   int delete(key id);
   List<Y> getAll();
   Y getById( key id);

}
