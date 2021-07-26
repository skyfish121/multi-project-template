package com.sandon.util;

import java.util.Objects;
import java.util.function.Supplier;
import org.springframework.beans.BeanUtils;

public abstract class CommonUtil {
  public static <T> T copyProperties(Object source, Supplier<T> targetSupplier) {
    T target = targetSupplier.get();
    if (!Objects.isNull(source)) {
      BeanUtils.copyProperties(source, target);
    }
    return target;
  }

}
