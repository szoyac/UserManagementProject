/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usermanagement;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

/**
 * Stores and manages a map of users.
 * 
 * @author Java Foundations
 * @version 4.0
 */
public class Users
{
    Scanner scan = new Scanner(System.in);
	private HashMap<String, User> userMap;

	/**
	 * Creates a user map to track users.
	 */
	public Users()
	{
		userMap = new HashMap<String, User>();
	}

	/**
	 * Adds a new user to the user map.
	 * 
	 * @param user the user to add
	 */
	public void addUser(User user)
	{
		userMap.put(user.getUserId(), user);
	}

	/**
	 * Retrieves and returns the specified user.
	 * 
	 * @param userId the user id of the target user
	 * @return the target user, or null if not found
	 */
	public User getUser(String userId)
	{
		return userMap.get(userId);
	}

	/**
	 * Returns a set of all user ids.
	 * 
	 * @return a set of all user ids in the map
	 */
	public Set<String> getUserIds()
	{
		return userMap.keySet();
	}
        
        /**
	 * Removes a user from the user map.
	 * 
	 * @param user the userID to remove
	 */
        
        public void removeUser(String userID){
            
            userMap.remove(userID);
        }
 
}
