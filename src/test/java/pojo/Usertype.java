package pojo;

public class Usertype{
	private String usertype;

	public void setUsertype(String usertype){
		this.usertype = usertype;
	}

	public String getUsertype(){
		return usertype;
	}

	@Override
 	public String toString(){
		return 
			"Usertype{" + 
			"usertype = '" + usertype + '\'' + 
			"}";
		}
}
