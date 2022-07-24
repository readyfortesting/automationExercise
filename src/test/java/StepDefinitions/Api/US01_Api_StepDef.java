package StepDefinitions.Api;

import io.cucumber.java.en.Given;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;

import io.restassured.response.Response;
import io.restassured.response.ResponseBody;
import io.restassured.specification.RequestSpecification;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.Assert;
import pojo.ProductsItem;
import pojo.Response2;
import utilities.ConfigReader;

import java.util.HashMap;
import java.util.List;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;


public class US01_Api_StepDef {



         Response response;
         ProductsItem productsItem=new ProductsItem();
         Response2 response1=new Response2();




        @Given("Kullanici {string} sayfasina gider")
        public void kullanici_sayfasina_gider (String apiUrl){
         /*   RestAssured.baseURI="https://automationexercise.com";
            RequestSpecification httpRequest=given();
            Response response=httpRequest.get("/api/productsList");
            ResponseBody body=response.getBody();
            String bodyStirng=body.asString();
            System.out.println("bodyStirng = " + bodyStirng); */


        response=given().contentType(ContentType.JSON).when().get(ConfigReader.getProperty("apiUrl"))
                  .then().statusCode(200).extract().response();

          response.jsonPath().prettyPrint();
            System.out.println("response.getContentType() = " + response.getContentType());


            //  String url = "https://automationexercise.com/api/productsList";
            //response = given().headers("Content-Type", ContentType.JSON, "Accept", ContentType.JSON)
              //      .when().get(url);

           List<Integer> idlist=response.getBody().jsonPath().getList("products.findAll");
            System.out.println("idlist.size() = " + idlist.size());

            Assert.assertEquals(34,idlist.size());

            try {

                Assert.assertEquals(43,idlist.size());

            } catch (AssertionError e) {
                System.out.println("Urun sayisi 43'ten daha az");
            }
        }
        @Given("Kullanici  GET islemi yapip  Response Code {int} kodunu dogrular")
        public void kullanici_get_islemi_yapip_kodunu_dogrular (Integer int1){

            // response=given().when().get(ConfigReader.getProperty("apiUrl")).then().assertThat().statusCode(200).extract().response();
           // Assert.assertEquals(200, response.statusCode());
          //  response.then().assertThat().statusCode(200);


            int responseCode=response.getBody().jsonPath().getInt("responseCode");
            System.out.println("responseCode = " + responseCode);
            Assert.assertEquals(responseCode,200);



        }
        @Given("Kullanici butun  products listesini getirir")
        public void kullanici_butun_products_listesini_getirir () {
            JsonPath jsonPath=response.getBody().jsonPath();
            System.out.println(jsonPath.getString("products"));
        }
    }
