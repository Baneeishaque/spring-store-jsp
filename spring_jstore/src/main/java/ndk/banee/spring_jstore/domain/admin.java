package ndk.banee.spring_jstore.domain;

public class admin {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.ADMINID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer adminid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.ADMINNAME
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String adminname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.ADMINPASSWORD
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String adminpassword;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column admin.ADMINEMAIL
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String adminemail;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.ADMINID
     *
     * @return the value of admin.ADMINID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getAdminid() {
        return adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.ADMINID
     *
     * @param adminid the value for admin.ADMINID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setAdminid(Integer adminid) {
        this.adminid = adminid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.ADMINNAME
     *
     * @return the value of admin.ADMINNAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getAdminname() {
        return adminname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.ADMINNAME
     *
     * @param adminname the value for admin.ADMINNAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setAdminname(String adminname) {
        this.adminname = adminname == null ? null : adminname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.ADMINPASSWORD
     *
     * @return the value of admin.ADMINPASSWORD
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getAdminpassword() {
        return adminpassword;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.ADMINPASSWORD
     *
     * @param adminpassword the value for admin.ADMINPASSWORD
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setAdminpassword(String adminpassword) {
        this.adminpassword = adminpassword == null ? null : adminpassword.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column admin.ADMINEMAIL
     *
     * @return the value of admin.ADMINEMAIL
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getAdminemail() {
        return adminemail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column admin.ADMINEMAIL
     *
     * @param adminemail the value for admin.ADMINEMAIL
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setAdminemail(String adminemail) {
        this.adminemail = adminemail == null ? null : adminemail.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
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
        admin other = (admin) that;
        return (this.getAdminid() == null ? other.getAdminid() == null : this.getAdminid().equals(other.getAdminid()))
                && (this.getAdminname() == null ? other.getAdminname() == null : this.getAdminname().equals(other.getAdminname()))
                && (this.getAdminpassword() == null ? other.getAdminpassword() == null : this.getAdminpassword().equals(other.getAdminpassword()))
                && (this.getAdminemail() == null ? other.getAdminemail() == null : this.getAdminemail().equals(other.getAdminemail()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table admin
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getAdminid() == null) ? 0 : getAdminid().hashCode());
        result = prime * result + ((getAdminname() == null) ? 0 : getAdminname().hashCode());
        result = prime * result + ((getAdminpassword() == null) ? 0 : getAdminpassword().hashCode());
        result = prime * result + ((getAdminemail() == null) ? 0 : getAdminemail().hashCode());
        return result;
    }
}
