package com.yaypay.api.dto.address;

/*************************************************************************
 * * Yaypay CONFIDENTIAL   2018
 * * All Rights Reserved. * *
 * NOTICE: All information contained herein is, and remains the property of Yaypay Incorporated and its suppliers, if any.
 * The intellectual and technical concepts contained  herein are proprietary to Yaypay Incorporated
 * and its suppliers and may be covered by U.S. and Foreign Patents, patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material  is strictly forbidden unless prior written permission is obtained  from Yaypay Incorporated.
 * Author : AKuzovchikov
 * Date Created: 7/25/2018 17:49
 */
public class Address {
    private String country;
    private String state;
    private String city;
    private String line1;
    private String line2;
    private String zip;
    private String phone;
    private String mobile;
    private String email;
    private String www;

    public Address() {
    }

    public String getCountry() {
        return this.country;
    }

    public String getState() {
        return this.state;
    }

    public String getCity() {
        return this.city;
    }

    public String getLine1() {
        return this.line1;
    }

    public String getLine2() {
        return this.line2;
    }

    public String getZip() {
        return this.zip;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getMobile() {
        return this.mobile;
    }

    public String getEmail() {
        return this.email;
    }

    public String getWww() {
        return this.www;
    }

    public Address setCountry(String country) {
        this.country = country;
        return this;
    }

    public Address setState(String state) {
        this.state = state;
        return this;
    }

    public Address setCity(String city) {
        this.city = city;
        return this;
    }

    public Address setLine1(String line1) {
        this.line1 = line1;
        return this;
    }

    public Address setLine2(String line2) {
        this.line2 = line2;
        return this;
    }

    public Address setZip(String zip) {
        this.zip = zip;
        return this;
    }

    public Address setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Address setMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    public Address setEmail(String email) {
        this.email = email;
        return this;
    }

    public Address setWww(String www) {
        this.www = www;
        return this;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Address)) return false;
        final Address other = (Address) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$country = this.getCountry();
        final Object other$country = other.getCountry();
        if (this$country == null ? other$country != null : !this$country.equals(other$country)) return false;
        final Object this$state = this.getState();
        final Object other$state = other.getState();
        if (this$state == null ? other$state != null : !this$state.equals(other$state)) return false;
        final Object this$city = this.getCity();
        final Object other$city = other.getCity();
        if (this$city == null ? other$city != null : !this$city.equals(other$city)) return false;
        final Object this$line1 = this.getLine1();
        final Object other$line1 = other.getLine1();
        if (this$line1 == null ? other$line1 != null : !this$line1.equals(other$line1)) return false;
        final Object this$line2 = this.getLine2();
        final Object other$line2 = other.getLine2();
        if (this$line2 == null ? other$line2 != null : !this$line2.equals(other$line2)) return false;
        final Object this$zip = this.getZip();
        final Object other$zip = other.getZip();
        if (this$zip == null ? other$zip != null : !this$zip.equals(other$zip)) return false;
        final Object this$phone = this.getPhone();
        final Object other$phone = other.getPhone();
        if (this$phone == null ? other$phone != null : !this$phone.equals(other$phone)) return false;
        final Object this$mobile = this.getMobile();
        final Object other$mobile = other.getMobile();
        if (this$mobile == null ? other$mobile != null : !this$mobile.equals(other$mobile)) return false;
        final Object this$email = this.getEmail();
        final Object other$email = other.getEmail();
        if (this$email == null ? other$email != null : !this$email.equals(other$email)) return false;
        final Object this$www = this.getWww();
        final Object other$www = other.getWww();
        if (this$www == null ? other$www != null : !this$www.equals(other$www)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $country = this.getCountry();
        result = result * PRIME + ($country == null ? 43 : $country.hashCode());
        final Object $state = this.getState();
        result = result * PRIME + ($state == null ? 43 : $state.hashCode());
        final Object $city = this.getCity();
        result = result * PRIME + ($city == null ? 43 : $city.hashCode());
        final Object $line1 = this.getLine1();
        result = result * PRIME + ($line1 == null ? 43 : $line1.hashCode());
        final Object $line2 = this.getLine2();
        result = result * PRIME + ($line2 == null ? 43 : $line2.hashCode());
        final Object $zip = this.getZip();
        result = result * PRIME + ($zip == null ? 43 : $zip.hashCode());
        final Object $phone = this.getPhone();
        result = result * PRIME + ($phone == null ? 43 : $phone.hashCode());
        final Object $mobile = this.getMobile();
        result = result * PRIME + ($mobile == null ? 43 : $mobile.hashCode());
        final Object $email = this.getEmail();
        result = result * PRIME + ($email == null ? 43 : $email.hashCode());
        final Object $www = this.getWww();
        result = result * PRIME + ($www == null ? 43 : $www.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Address;
    }

    public String toString() {
        return "Address(country=" + this.getCountry() + ", state=" + this.getState() + ", city=" + this.getCity() + ", line1=" + this.getLine1() + ", line2=" + this.getLine2() + ", zip=" + this.getZip() + ", phone=" + this.getPhone() + ", mobile=" + this.getMobile() + ", email=" + this.getEmail() + ", www=" + this.getWww() + ")";
    }
}
