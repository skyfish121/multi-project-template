package com.sandon.multi.api.controller.form;

import com.fasterxml.jackson.annotation.JsonFormat;
import java.time.LocalDateTime;
import javax.validation.constraints.NotNull;
import lombok.Data;

/**
 * 予約管理
 */
@Data
public class ReserveMngForm {

    /** 順番予約管理ID */
    Long orderReserveMngId;

    /** 開始日時 */
    @NotNull
    @JsonFormat(pattern = "yyyyMMddHHmmss")
    LocalDateTime startDate;

    /** 終了日時 */
    @NotNull
    @JsonFormat(pattern = "yyyyMMddHHmmss")
    LocalDateTime endDate;

    /** メールアドレス */
    @NotNull
    String mailAddress;

    /** 見出し */
    @NotNull
    String title;

    /** 概要 */
    @NotNull
    String overview;
}