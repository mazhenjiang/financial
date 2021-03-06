package com.mzh.financial.back.personinfo.domain;

import java.io.Serializable;
import java.util.Date;

public class TDataUser implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.id
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.user_name
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private String userName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.age
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private Boolean age;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.sex
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private String sex;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.email
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.tel
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.account_id
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private Integer accountId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_user.create_time
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private Date createTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_data_user
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.id
     *
     * @return the value of t_data_user.id
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.id
     *
     * @param id the value for t_data_user.id
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.user_name
     *
     * @return the value of t_data_user.user_name
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.user_name
     *
     * @param userName the value for t_data_user.user_name
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.age
     *
     * @return the value of t_data_user.age
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public Boolean getAge() {
        return age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.age
     *
     * @param age the value for t_data_user.age
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setAge(Boolean age) {
        this.age = age;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.sex
     *
     * @return the value of t_data_user.sex
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public String getSex() {
        return sex;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.sex
     *
     * @param sex the value for t_data_user.sex
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setSex(String sex) {
        this.sex = sex == null ? null : sex.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.email
     *
     * @return the value of t_data_user.email
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.email
     *
     * @param email the value for t_data_user.email
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.tel
     *
     * @return the value of t_data_user.tel
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.tel
     *
     * @param tel the value for t_data_user.tel
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.account_id
     *
     * @return the value of t_data_user.account_id
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public Integer getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.account_id
     *
     * @param accountId the value for t_data_user.account_id
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setAccountId(Integer accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_user.create_time
     *
     * @return the value of t_data_user.create_time
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_user.create_time
     *
     * @param createTime the value for t_data_user.create_time
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_user
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userName=").append(userName);
        sb.append(", age=").append(age);
        sb.append(", sex=").append(sex);
        sb.append(", email=").append(email);
        sb.append(", tel=").append(tel);
        sb.append(", accountId=").append(accountId);
        sb.append(", createTime=").append(createTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_user
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        TDataUser other = (TDataUser) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserName() == null ? other.getUserName() == null : this.getUserName().equals(other.getUserName()))
            && (this.getAge() == null ? other.getAge() == null : this.getAge().equals(other.getAge()))
            && (this.getSex() == null ? other.getSex() == null : this.getSex().equals(other.getSex()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getAccountId() == null ? other.getAccountId() == null : this.getAccountId().equals(other.getAccountId()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_user
     *
     * @mbg.generated Thu Feb 03 06:21:35 UTC 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserName() == null) ? 0 : getUserName().hashCode());
        result = prime * result + ((getAge() == null) ? 0 : getAge().hashCode());
        result = prime * result + ((getSex() == null) ? 0 : getSex().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        return result;
    }
}