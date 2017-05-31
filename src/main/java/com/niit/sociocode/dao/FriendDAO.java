package com.niit.sociocode.dao;

import java.util.List;

import com.niit.sociocode.model.Friend;

public interface FriendDAO
{
	
	public boolean insertFriend(Friend friend);
	
	public List<Friend> list();
	
	public boolean deleteFriend(String id);
	
	public Friend getFriendById(String id);

}
