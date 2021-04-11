package com.njsr.leetcode.exercises;

/**
 * Given a valid (IPv4) IP address, return a defanged version of that IP address.
 * <p>
 * A defanged IP address replaces every period "." with "[.]".
 */
public class DefangingAnIPAddress {

  public static String defangIPaddr(String address) {
    return address.replace(".", "[.]");
  }
}
