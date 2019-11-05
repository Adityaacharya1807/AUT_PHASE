package aditya;

import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.equalTo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class resttest {
	
@Test
public void class1() {
	
	RestAssured.baseURI="http://api.cfl.ca/v1";

	given().queryParam("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").when().get("/games/2015").then().assertThat()
			.statusCode(200).and().contentType(ContentType.JSON);
	
}
@Test
public void box() {

	RestAssured.baseURI = "http://api.cfl.ca/v1";
	given().queryParam("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").queryParam("include", "boxscore").when()
			.get("/games/2015/game/2221").then().assertThat().statusCode(200).and().contentType(ContentType.JSON);

}

@Test
public void box3() {
	RestAssured.baseURI = "http://api.cfl.ca/v1";
	given().queryParam("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").queryParam("include", "boxscore").when()
			.get("/games/2015/game/2221").then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
			.body("data[0].boxscore.teams.team_1.team_id", equalTo(1));
}

@Test
public void box4() {
	RestAssured.baseURI = "http://api.cfl.ca/v1";
	given().queryParam("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").queryParam("include", "boxscore")
			.queryParam("include", "play_by_play").when().get("/games/2015/game/2221").then().assertThat()
			.statusCode(200).and().contentType(ContentType.JSON)
			.body("data[0].play_by_play[0].play_id", equalTo(164815));
}

@Test
public void headers() {
	RestAssured.baseURI = "http://api.cfl.ca/v1";
	Response response = RestAssured.given().header("Content-Type", "application/json")
			.param("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").when().get("/games/2015");
	// JsonPath jsonBody = new JsonPath(response.getBody().asString());
	String Date = response.getHeader("Date");
	System.out.println(Date);

}

@Test
public void addLocation() {
	RestAssured.baseURI = "http://216.10.245.166";
	Response response = RestAssured.given().queryParam("key", "qaclick123")
			.body("{\r\n" + " \r\n" + "    \"location\":{\r\n" + " \r\n" + "        \"lat\" : -38.383494,\r\n"
					+ " \r\n" + "        \"lng\" : 33.427362\r\n" + " \r\n" + "    },\r\n" + " \r\n"
					+ "    \"accuracy\":50,\r\n" + " \r\n" + "    \"name\":\"Frontline house\",\r\n" + " \r\n"
					+ "    \"phone_number\":\"(+91) 983 893 3937\",\r\n" + " \r\n"
					+ "    \"address\" : \"29, side layout, cohen 09\",\r\n" + " \r\n"
					+ "    \"types\": [\"shoe park\",\"shop\"],\r\n" + " \r\n"
					+ "    \"website\" : \"http://google.com\",\r\n" + " \r\n"
					+ "    \"language\" : \"French-IN\"\r\n" + " \r\n" + "}\r\n" + "")
			.when().post("/maps/api/place/add/json");
	response.getStatusCode();
	response.prettyPrint();
}

@Test
public void apitest1() {
	RestAssured.baseURI = "http://api.cfl.ca/v1";
	given().queryParam("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").queryParam("include", "boxscore")
			.queryParam("include", "sort=date_start,temperature").queryParam("include", "play_by_play").when()
			.get("/games/2015").then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
			.body("data[0].weather.sky", equalTo("Overcast")).and()
			.body("data[0].weather.temperature", equalTo(21));
}

@Test
public void apitest2() {
	RestAssured.baseURI = "http://api.cfl.ca/v1";
	Response response = RestAssured.given().header("Content-Type", "application/json")
			.queryParam("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").queryParam("include", "boxscore")
			.queryParam("include", "sort=date_start,temperature").queryParam("include", "play_by_play")
			.queryParam("include", "sort=-attendance").when().get("/games/2015");
	String con = response.getHeader("Connection");
	System.out.println(con);

	String ser = response.getHeader("Server");
	System.out.println(ser);

	String cac = response.getHeader("Cache-Control");
	System.out.println(cac);

	String cant = response.getHeader("Content-Encoding");
	System.out.println(cant);

	String vary = response.getHeader("Vary");
	System.out.println(vary);

	String trans = response.getHeader("Transfer-Encoding");
	System.out.println(trans);

}
@Test
public void apitest3() {
	RestAssured.baseURI = "http://api.cfl.ca/v1";
	given().queryParam("key", "T8Mv9BRDdcB7bMQUsQvHqtCGPewH5y8p").when()
			.get("/leaders/2015/category/converts").then().assertThat().statusCode(200).and().contentType(ContentType.JSON)
			.body("data[0].first_name", equalTo("Justin")).and()
			.body("data[0].birth_date", equalTo("1983-10-23")).body("data[0].games_played", equalTo(17));
}
}
