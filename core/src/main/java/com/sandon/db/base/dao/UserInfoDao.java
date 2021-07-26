package com.sandon.db.base.dao;

import com.sandon.db.base.entity.UserInfo;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

/**
 */
@ConfigAutowireable
@Dao
public interface UserInfoDao {

    /**
     * @param userId
     * @return the UserInfo entity
     */
    @Select
    UserInfo selectById(Long userId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(UserInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(UserInfo entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(UserInfo entity);
}