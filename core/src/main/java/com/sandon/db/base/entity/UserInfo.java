package com.sandon.db.base.entity;

import java.time.LocalDateTime;
import org.seasar.doma.Column;
import org.seasar.doma.Entity;
import org.seasar.doma.GeneratedValue;
import org.seasar.doma.GenerationType;
import org.seasar.doma.Id;
import org.seasar.doma.Table;

/**
 * ユーザ情報
 */
@Entity
@Table(name = "user_info")
public class UserInfo {

    /** ユーザID */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    Long userId;

    /** 姓 */
    @Column(name = "last_name")
    String lastName;

    /** 名 */
    @Column(name = "first_name")
    String firstName;

    /** ログイン名 */
    @Column(name = "login_name")
    String loginName;

    /** パスワード */
    @Column(name = "password")
    String password;

    /** メールアドレス */
    @Column(name = "mail_address")
    String mailAddress;

    /** ロールID */
    @Column(name = "role_id")
    Long roleId;

    /** 作成日時 */
    @Column(name = "create_timestamp")
    LocalDateTime createTimestamp;

    /** 作成ID */
    @Column(name = "create_id")
    Long createId;

    /** 作成機能 */
    @Column(name = "create_function")
    String createFunction;

    /** 更新日時 */
    @Column(name = "update_timestamp")
    LocalDateTime updateTimestamp;

    /** 更新ID */
    @Column(name = "update_id")
    Long updateId;

    /** 更新機能 */
    @Column(name = "update_function")
    String updateFunction;

    /** 
     * Returns the userId.
     * 
     * @return the userId
     */
    public Long getUserId() {
        return userId;
    }

    /** 
     * Sets the userId.
     * 
     * @param userId the userId
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /** 
     * Returns the lastName.
     * 
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /** 
     * Sets the lastName.
     * 
     * @param lastName the lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /** 
     * Returns the firstName.
     * 
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /** 
     * Sets the firstName.
     * 
     * @param firstName the firstName
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /** 
     * Returns the loginName.
     * 
     * @return the loginName
     */
    public String getLoginName() {
        return loginName;
    }

    /** 
     * Sets the loginName.
     * 
     * @param loginName the loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /** 
     * Returns the password.
     * 
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /** 
     * Sets the password.
     * 
     * @param password the password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * Returns the roleId.
     * 
     * @return the roleId
     */
    public Long getRoleId() {
        return roleId;
    }

    /** 
     * Sets the roleId.
     * 
     * @param roleId the roleId
     */
    public void setRoleId(Long roleId) {
        this.roleId = roleId;
    }

    /** 
     * Returns the createTimestamp.
     * 
     * @return the createTimestamp
     */
    public LocalDateTime getCreateTimestamp() {
        return createTimestamp;
    }

    /** 
     * Sets the createTimestamp.
     * 
     * @param createTimestamp the createTimestamp
     */
    public void setCreateTimestamp(LocalDateTime createTimestamp) {
        this.createTimestamp = createTimestamp;
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
     * Returns the updateTimestamp.
     * 
     * @return the updateTimestamp
     */
    public LocalDateTime getUpdateTimestamp() {
        return updateTimestamp;
    }

    /** 
     * Sets the updateTimestamp.
     * 
     * @param updateTimestamp the updateTimestamp
     */
    public void setUpdateTimestamp(LocalDateTime updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
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