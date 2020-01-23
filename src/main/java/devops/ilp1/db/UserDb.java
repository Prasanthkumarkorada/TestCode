package devops.ilp1.db;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import devops.ilp1.model.User;

public class UserDb {
	
	public static String[][] users;
	public static List<User>  usersData;
	
	public static Map<String, User> userProfile=new HashMap<String,User>();
	
	public UserDb(){
		
		User u1=new User("Prasanth","kumar","1234","prasanthkumarmpcs@gmail.com	");
		User u2=new User("gupta","srinath","abcd","srinath@gmail.com");
		
	
		
		userProfile.put(u1.getEmail(), u1);
		userProfile.put(u2.getEmail(), u2);
		
		
//		String[] user1 ={"Prasanth","kumar","1234","prasanthkumarmpcs@gmail.com"};
//		String[] user2 ={"gupta","srinath","abcd","srinath@gmail.com"};
//		
//		
//		users[0]=user1;
//		users[1]=user2;
	
//		
//		usersData=new ArrayList<User>();
	
//		usersData.add(u1);
//		usersData.add(u2);

	}
	


}

