package java8.example;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONCompare;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

public class JsonCompare {

	public static void main(String[] args) throws JSONException {
		JSONArray array = new JSONArray();
		array.put(new String[]{"1","2"});
		
		
		JSONObject json = new JSONObject();
		json.put("a", 1);
		json.put("b","2");
		
		JSONObject json2 = new JSONObject();
		
		json2.put("b","2");
		json2.put("array", array);
		json2.put("a", 99);
		
		
		/*
		{\"a\":1,\"array\":[[\"1\",\"2\"]],\"b\":\"2\"}
		{\"a\":99,\"b\":\"2\",\"array\":[[\"1\",\"2\"]]}
		 */


		
		System.out.println(json.toString());
		
		System.out.println(json2.toString());
		
		JSONCompareResult result = JSONCompare.compareJSON("{\"a\":1,\"b\":\"2\"}", "{\"b\":\"2\",\"a\":1}",JSONCompareMode.LENIENT);
		System.out.println(result.passed());
		
		
		result = JSONCompare.compareJSON("{\"a\":1,\"array\":[[\"1\",\"2\"]],\"b\":\"2\"}","{\"a\":1,\"b\":\"2\",\"array\":[[\"1\",\"2\"]]}",JSONCompareMode.LENIENT);
		System.out.println(result.passed());
	}

}
