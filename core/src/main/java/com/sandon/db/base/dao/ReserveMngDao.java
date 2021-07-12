package com.sandon.db.base.dao;

import com.sandon.db.base.entity.ReserveMng;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;

/**
 */
@Dao
public interface ReserveMngDao {

    /**
     * @param orderReserveMngId
     * @return the ReserveMng entity
     */
    @Select
    ReserveMng selectById(Long orderReserveMngId);

    /**
     * @param entity
     * @return affected rows
     */
    @Insert
    int insert(ReserveMng entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Update
    int update(ReserveMng entity);

    /**
     * @param entity
     * @return affected rows
     */
    @Delete
    int delete(ReserveMng entity);
}