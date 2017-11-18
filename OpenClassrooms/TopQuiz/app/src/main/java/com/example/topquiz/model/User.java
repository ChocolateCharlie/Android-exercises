package com.example.topquiz.model;



/**         User
 * Modelize a user.
 * @author ChocolateCharlie
 * @version 1.0
 * @param mFirstName    the username
 */
public class User {

    private String mFirstName;

/** getFirstName
 * Getter of mFirstName
 * @author ChcolateCharlie
 * @version 1.0
 * @param (none)
 * @return  a [String] : the content of mFirstName
 */
    public String getFirstName() {
        return mFirstName;
    }

/** getFirstName
 * Setter of mFirstName
 * @author ChcolateCharlie
 * @version 1.0
 * @param mFirstName    a [String] to set mFirstName
 * @return (void)
 */
    public void setFirstName(String mFirstName) {
        this.mFirstName = mFirstName;
    }
}
