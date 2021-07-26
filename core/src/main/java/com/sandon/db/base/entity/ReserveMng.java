package com.sandon.db.base.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * 予約管理
 */
@Entity
@Table(name = "reserve_mng")
public class ReserveMng {

    /** 順番予約管理ID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_reserve_mng_id")
    Long orderReserveMngId;

    /** 開始日時 */
    @Column(name = "start_date")
    LocalDateTime startDate;

    /** 終了日時 */
    @Column(name = "end_date")
    LocalDateTime endDate;

    /** メールアドレス */
    @Column(name = "mail_address")
    String mailAddress;

    /** 見出し */
    @Column(name = "title")
    String title;

    /** 概要 */
    @Column(name = "overview")
    String overview;

    /** 作成日時 */
    @Column(name = "create_date")
    LocalDateTime createDate;

    /** 作成ID */
    @Column(name = "create_id")
    Long createId;

    /** 作成機能 */
    @Column(name = "create_function")
    String createFunction;

    /** 更新日時 */
    @Column(name = "update_date")
    LocalDateTime updateDate;

    /** 更新ID */
    @Column(name = "update_id")
    Long updateId;

    /** 更新機能 */
    @Column(name = "update_function")
    String updateFunction;

    /** 
     * Returns the orderReserveMngId.
     * 
     * @return the orderReserveMngId
     */
    public Long getOrderReserveMngId() {
        return orderReserveMngId;
    }

    /** 
     * Sets the orderReserveMngId.
     * 
     * @param orderReserveMngId the orderReserveMngId
     */
    public void setOrderReserveMngId(Long orderReserveMngId) {
        this.orderReserveMngId = orderReserveMngId;
    }

    /** 
     * Returns the startDate.
     * 
     * @return the startDate
     */
    public LocalDateTime getStartDate() {
        return startDate;
    }

    /** 
     * Sets the startDate.
     * 
     * @param startDate the startDate
     */
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }

    /** 
     * Returns the endDate.
     * 
     * @return the endDate
     */
    public LocalDateTime getEndDate() {
        return endDate;
    }

    /** 
     * Sets the endDate.
     * 
     * @param endDate the endDate
     */
    public void setEndDate(LocalDateTime endDate) {
        this.endDate = endDate;
    }

    /** 
     * Returns the mailAddress.
     * 
     * @return the mailAddress
     */
    public String getMailAddress() {
        return mailAddress;
    }

    /** 
     * Sets the mailAddress.
     * 
     * @param mailAddress the mailAddress
     */
    public void setMailAddress(String mailAddress) {
        this.mailAddress = mailAddress;
    }

    /** 
     * Returns the title.
     * 
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /** 
     * Sets the title.
     * 
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /** 
     * Returns the overview.
     * 
     * @return the overview
     */
    public String getOverview() {
        return overview;
    }

    /** 
     * Sets the overview.
     * 
     * @param overview the overview
     */
    public void setOverview(String overview) {
        this.overview = overview;
    }

    /** 
     * Returns the createDate.
     * 
     * @return the createDate
     */
    public LocalDateTime getCreateDate() {
        return createDate;
    }

    /** 
     * Sets the createDate.
     * 
     * @param createDate the createDate
     */
    public void setCreateDate(LocalDateTime createDate) {
        this.createDate = createDate;
    }

    /** 
     * Returns the createId.
     * 
     * @return the createId
     */
    public Long getCreateId() {
        return createId;
    }

    /** 
     * Sets the createId.
     * 
     * @param createId the createId
     */
    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    /** 
     * Returns the createFunction.
     * 
     * @return the createFunction
     */
    public String getCreateFunction() {
        return createFunction;
    }

    /** 
     * Sets the createFunction.
     * 
     * @param createFunction the createFunction
     */
    public void setCreateFunction(String createFunction) {
        this.createFunction = createFunction;
    }

    /** 
     * Returns the updateDate.
     * 
     * @return the updateDate
     */
    public LocalDateTime getUpdateDate() {
        return updateDate;
    }

    /** 
     * Sets the updateDate.
     * 
     * @param updateDate the updateDate
     */
    public void setUpdateDate(LocalDateTime updateDate) {
        this.updateDate = updateDate;
    }

    /** 
     * Returns the updateId.
     * 
     * @return the updateId
     */
    public Long getUpdateId() {
        return updateId;
    }

    /** 
     * Sets the updateId.
     * 
     * @param updateId the updateId
     */
    public void setUpdateId(Long updateId) {
        this.updateId = updateId;
    }

    /** 
     * Returns the updateFunction.
     * 
     * @return the updateFunction
     */
    public String getUpdateFunction() {
        return updateFunction;
    }

    /** 
     * Sets the updateFunction.
     * 
     * @param updateFunction the updateFunction
     */
    public void setUpdateFunction(String updateFunction) {
        this.updateFunction = updateFunction;
    }
}