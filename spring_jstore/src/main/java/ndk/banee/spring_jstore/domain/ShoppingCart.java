package ndk.banee.spring_jstore.domain;

import java.math.BigDecimal;
import java.util.Date;

public class ShoppingCart {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.cartID
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private Long cartid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.removeitem
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private String removeitem;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.cartDate
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private Date cartdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.cartQuant
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private Integer cartquant;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.CUSTOMERIID
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private Integer customeriid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.cartTotalprice
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private BigDecimal carttotalprice;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.productid
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private Integer productid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column shoppingcart.price
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    private BigDecimal price;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.cartID
     *
     * @return the value of shoppingcart.cartID
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public Long getCartid() {
        return cartid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.cartID
     *
     * @param cartid the value for shoppingcart.cartID
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setCartid(Long cartid) {
        this.cartid = cartid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.removeitem
     *
     * @return the value of shoppingcart.removeitem
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public String getRemoveitem() {
        return removeitem;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.removeitem
     *
     * @param removeitem the value for shoppingcart.removeitem
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setRemoveitem(String removeitem) {
        this.removeitem = removeitem == null ? null : removeitem.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.cartDate
     *
     * @return the value of shoppingcart.cartDate
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public Date getCartdate() {
        return cartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.cartDate
     *
     * @param cartdate the value for shoppingcart.cartDate
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setCartdate(Date cartdate) {
        this.cartdate = cartdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.cartQuant
     *
     * @return the value of shoppingcart.cartQuant
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public Integer getCartquant() {
        return cartquant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.cartQuant
     *
     * @param cartquant the value for shoppingcart.cartQuant
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setCartquant(Integer cartquant) {
        this.cartquant = cartquant;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.CUSTOMERIID
     *
     * @return the value of shoppingcart.CUSTOMERIID
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public Integer getCustomeriid() {
        return customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.CUSTOMERIID
     *
     * @param customeriid the value for shoppingcart.CUSTOMERIID
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setCustomeriid(Integer customeriid) {
        this.customeriid = customeriid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.cartTotalprice
     *
     * @return the value of shoppingcart.cartTotalprice
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public BigDecimal getCarttotalprice() {
        return carttotalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.cartTotalprice
     *
     * @param carttotalprice the value for shoppingcart.cartTotalprice
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setCarttotalprice(BigDecimal carttotalprice) {
        this.carttotalprice = carttotalprice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.productid
     *
     * @return the value of shoppingcart.productid
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public Integer getProductid() {
        return productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.productid
     *
     * @param productid the value for shoppingcart.productid
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setProductid(Integer productid) {
        this.productid = productid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column shoppingcart.price
     *
     * @return the value of shoppingcart.price
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column shoppingcart.price
     *
     * @param price the value for shoppingcart.price
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
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
        ShoppingCart other = (ShoppingCart) that;
        return (this.getCartid() == null ? other.getCartid() == null : this.getCartid().equals(other.getCartid()))
                && (this.getRemoveitem() == null ? other.getRemoveitem() == null : this.getRemoveitem().equals(other.getRemoveitem()))
                && (this.getCartdate() == null ? other.getCartdate() == null : this.getCartdate().equals(other.getCartdate()))
                && (this.getCartquant() == null ? other.getCartquant() == null : this.getCartquant().equals(other.getCartquant()))
                && (this.getCustomeriid() == null ? other.getCustomeriid() == null : this.getCustomeriid().equals(other.getCustomeriid()))
                && (this.getCarttotalprice() == null ? other.getCarttotalprice() == null : this.getCarttotalprice().equals(other.getCarttotalprice()))
                && (this.getProductid() == null ? other.getProductid() == null : this.getProductid().equals(other.getProductid()))
                && (this.getPrice() == null ? other.getPrice() == null : this.getPrice().equals(other.getPrice()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table shoppingcart
     *
     * @mbg.generated Wed Jun 03 02:00:40 CST 2020
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getCartid() == null) ? 0 : getCartid().hashCode());
        result = prime * result + ((getRemoveitem() == null) ? 0 : getRemoveitem().hashCode());
        result = prime * result + ((getCartdate() == null) ? 0 : getCartdate().hashCode());
        result = prime * result + ((getCartquant() == null) ? 0 : getCartquant().hashCode());
        result = prime * result + ((getCustomeriid() == null) ? 0 : getCustomeriid().hashCode());
        result = prime * result + ((getCarttotalprice() == null) ? 0 : getCarttotalprice().hashCode());
        result = prime * result + ((getProductid() == null) ? 0 : getProductid().hashCode());
        result = prime * result + ((getPrice() == null) ? 0 : getPrice().hashCode());
        return result;
    }
}
