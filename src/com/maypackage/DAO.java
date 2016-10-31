package com.maypackage;

import java.util.ArrayList;
import java.util.List;

public class DAO {
	
	static List<Post> posts;  
		
	static {
		posts = new ArrayList<Post>();
		posts.add(new Post(1, "Hello 1"));
		posts.add(new Post(2, "Gogogog 2"));
		posts.add(new Post(3, "Sleep 3"));
	}
	
	public static List<Post> getPosts() {
		return posts;
	}
	
	public static void deletePost(int id) {
		for (Post p : posts) {
			if (p.getId() == id) {
				posts.remove(p);
			}
		}
	}
	
	

}
