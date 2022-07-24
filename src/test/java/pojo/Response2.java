package pojo;

import io.restassured.specification.Argument;

import java.util.List;

public class Response2 {
	private int responseCode;
	private List<ProductsItem> products;

	public void setResponseCode(int responseCode) {
		this.responseCode = responseCode;
	}

	public int getResponseCode(){

		return responseCode;
	}

	public void setProducts(List<ProductsItem> products){

		this.products = products;
	}

	public List<ProductsItem> getProducts(){

		return products;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"responseCode = '" + responseCode + '\'' + 
			",products = '" + products + '\'' + 
			"}";
		}
}