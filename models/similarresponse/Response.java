package models.similarresponse;

import java.util.List;

import models.common.artist.Artist;
import models.common.user.User;

/**
 * reponse of a similar artist request.
 * @author Daniel
 *
 */
public class Response {
	
   	private Artist artist;
   	private List<Friends> friends;
   	private List<Similar> similar;
   	private User user;

 	public Artist getArtist(){
		return this.artist;
	}
	public void setArtist(Artist artist){
		this.artist = artist;
	}
 	public List<Friends> getFriends(){
		return this.friends;
	}
	public void setFriends(List<Friends> friends){
		this.friends = friends;
	}
 	public List<Similar> getSimilar(){
		return this.similar;
	}
	public void setSimilar(List<Similar> similar){
		this.similar = similar;
	}
 	public User getUser(){
		return this.user;
	}
	public void setUser(User user){
		this.user = user;
	}
}
