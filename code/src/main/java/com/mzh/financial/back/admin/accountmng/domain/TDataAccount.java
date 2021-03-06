package com.mzh.financial.back.admin.accountmng.domain;

import java.io.Serializable;

public class TDataAccount implements Serializable {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_account.id
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    private Integer id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_account.account_name
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    private String accountName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_account.pwd
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    private String pwd;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_account.tel
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    private String tel;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_data_account.email
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_account.id
     *
     * @return the value of t_data_account.id
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_account.id
     *
     * @param id the value for t_data_account.id
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_account.account_name
     *
     * @return the value of t_data_account.account_name
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public String getAccountName() {
        return accountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_account.account_name
     *
     * @param accountName the value for t_data_account.account_name
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public void setAccountName(String accountName) {
        this.accountName = accountName == null ? null : accountName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_account.pwd
     *
     * @return the value of t_data_account.pwd
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public String getPwd() {
        return pwd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_account.pwd
     *
     * @param pwd the value for t_data_account.pwd
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public void setPwd(String pwd) {
        this.pwd = pwd == null ? null : pwd.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_account.tel
     *
     * @return the value of t_data_account.tel
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public String getTel() {
        return tel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_account.tel
     *
     * @param tel the value for t_data_account.tel
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_data_account.email
     *
     * @return the value of t_data_account.email
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_data_account.email
     *
     * @param email the value for t_data_account.email
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountName=").append(accountName);
        sb.append(", pwd=").append(pwd);
        sb.append(", tel=").append(tel);
        sb.append(", email=").append(email);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
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
        TDataAccount other = (TDataAccount) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAccountName() == null ? other.getAccountName() == null : this.getAccountName().equals(other.getAccountName()))
            && (this.getPwd() == null ? other.getPwd() == null : this.getPwd().equals(other.getPwd()))
            && (this.getTel() == null ? other.getTel() == null : this.getTel().equals(other.getTel()))
            && (this.getEmail() == null ? other.getEmail() == null : this.getEmail().equals(other.getEmail()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_data_account
     *
     * @mbg.generated Wed Feb 02 08:20:20 UTC 2022
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAccountName() == null) ? 0 : getAccountName().hashCode());
        result = prime * result + ((getPwd() == null) ? 0 : getPwd().hashCode());
        result = prime * result + ((getTel() == null) ? 0 : getTel().hashCode());
        result = prime * result + ((getEmail() == null) ? 0 : getEmail().hashCode());
        return result;
    }
}