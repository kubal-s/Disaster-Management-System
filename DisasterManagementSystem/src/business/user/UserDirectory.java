/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.user;

import java.util.ArrayList;


public class UserDirectory {
    
    private ArrayList<User> userList;

    public UserDirectory() {
        userList = new ArrayList();
    }

    public ArrayList<User> getUserList() {
        return userList;
    }
    
    public User createUser(String name){
        User user = new User();
        user.setName(name);
        userList.add(user);
        return user;
    }
}