package ndk.banee.spring_jstore.domain;

public class customer {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.CUSTOMERIID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer customeriid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.PAYMENTID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer paymentid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.WISHLISTID
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Integer wishlistid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.USERNAME
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String username;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.PASSWORDS
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String passwords;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.FULL_NAME
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String fullName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.GENDER
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private String gender;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column customer.PHONE
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    private Long phone;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.CUSTOMERIID
     *
     * @return the value of customer.CUSTOMERIID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getCustomeriid() {
        return customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.CUSTOMERIID
     *
     * @param customeriid the value for customer.CUSTOMERIID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setCustomeriid(Integer customeriid) {
        this.customeriid = customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.PAYMENTID
     *
     * @return the value of customer.PAYMENTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getPaymentid() {
        return paymentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.PAYMENTID
     *
     * @param paymentid the value for customer.PAYMENTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setPaymentid(Integer paymentid) {
        this.paymentid = paymentid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.WISHLISTID
     *
     * @return the value of customer.WISHLISTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Integer getWishlistid() {
        return wishlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.WISHLISTID
     *
     * @param wishlistid the value for customer.WISHLISTID
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setWishlistid(Integer wishlistid) {
        this.wishlistid = wishlistid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.USERNAME
     *
     * @return the value of customer.USERNAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getUsername() {
        return username;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.USERNAME
     *
     * @param username the value for customer.USERNAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.PASSWORDS
     *
     * @return the value of customer.PASSWORDS
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getPasswords() {
        return passwords;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.PASSWORDS
     *
     * @param passwords the value for customer.PASSWORDS
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setPasswords(String passwords) {
        this.passwords = passwords == null ? null : passwords.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.FULL_NAME
     *
     * @return the value of customer.FULL_NAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.FULL_NAME
     *
     * @param fullName the value for customer.FULL_NAME
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setFullName(String fullName) {
        this.fullName = fullName == null ? null : fullName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.GENDER
     *
     * @return the value of customer.GENDER
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public String getGender() {
        return gender;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.GENDER
     *
     * @param gender the value for customer.GENDER
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column customer.PHONE
     *
     * @return the value of customer.PHONE
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public Long getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column customer.PHONE
     *
     * @param phone the value for customer.PHONE
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    public void setPhone(Long phone) {
        this.phone = phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
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
        customer other = (customer) that;
        return (this.getCustomeriid() == null ? other.getCustomeriid() == null : this.getCustomeriid().equals(other.getCustomeriid()))
                && (this.getPaymentid() == null ? other.getPaymentid() == null : this.getPaymentid().equals(other.getPaymentid()))
                && (this.getWishlistid() == null ? other.getWishlistid() == null : this.getWishlistid().equals(other.getWishlistid()))
                && (this.getUsername() == null ? other.getUsername() == null : this.getUsername().equals(other.getUsername()))
                && (this.getPasswords() == null ? other.getPasswords() == null : this.getPasswords().equals(other.getPasswords()))
                && (this.getFullName() == null ? other.getFullName() == null : this.getFullName().equals(other.getFullName()))
                && (this.getGender() == null ? other.getGender() == null : this.getGender().equals(other.getGender()))
                && (this.getPhone() == null ? other.getPhone() == null : this.getPhone().equals(other.getPhone()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table customer
     *
     * @mbg.generated Sun May 24 14:31:24 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCustomeriid() == null) ? 0 : getCustomeriid().hashCode());
        result = prime * result + ((getPaymentid() == null) ? 0 : getPaymentid().hashCode());
        result = prime * result + ((getWishlistid() == null) ? 0 : getWishlistid().hashCode());
        result = prime * result + ((getUsername() == null) ? 0 : getUsername().hashCode());
        result = prime * result + ((getPasswords() == null) ? 0 : getPasswords().hashCode());
        result = prime * result + ((getFullName() == null) ? 0 : getFullName().hashCode());
        result = prime * result + ((getGender() == null) ? 0 : getGender().hashCode());
        result = prime * result + ((getPhone() == null) ? 0 : getPhone().hashCode());
        return result;
    }
}
