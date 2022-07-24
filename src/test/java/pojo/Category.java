package pojo;

public class Category{
	private Usertype usertype;
	private String category;

	public void setUsertype(Usertype usertype){
		this.usertype = usertype;
	}

	public Usertype getUsertype(){
		return usertype;
	}

	public void setCategory(String category){
		this.category = category;
	}

	public String getCategory(){
		return category;
	}

	@Override
 	public String toString(){
		return 
			"Category{" + 
			"usertype = '" + usertype + '\'' + 
			",category = '" + category + '\'' + 
			"}";
		}
}
