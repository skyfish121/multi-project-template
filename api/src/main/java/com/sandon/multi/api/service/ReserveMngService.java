package com.sandon.multi.api.service;


import com.sandon.db.base.dao.ReserveMngDao;
import com.sandon.util.DateUtils;
import com.sandon.db.base.entity.ReserveMng;
import com.sandon.multi.api.controller.form.ReserveMngForm;
import com.sandon.util.CommonUtil;
import java.time.LocalDateTime;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ReserveMngService {

  private final ReserveMngDao reserveMngDao;

  public ReserveMngForm select(Long orderReserveMngId) {
    return CommonUtil
        .copyProperties(reserveMngDao.selectById(orderReserveMngId), () -> new ReserveMngForm());
  }

  public ReserveMng insert(ReserveMngForm form) {
    ReserveMng reserveMng = CommonUtil.copyProperties(form, () -> new ReserveMng());

    LocalDateTime now = DateUtils.now();
    reserveMng.setCreateDate(now);
    reserveMng.setCreateId(1L);
    reserveMng.setUpdateDate(now);
    reserveMng.setUpdateId(1L);
    reserveMngDao.insert(reserveMng);
    return reserveMng;
  }

}
