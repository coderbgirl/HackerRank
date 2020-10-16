package General;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;
import java.util.HashMap;

/*import org.json.simple.*;
import org.json.simple.parser.JSONParser;

public class McKinsey {

	static int getCountries(String s, int p) throws Exception {

		int counter = 0;
		long pages = 1;
		int pagenum = 1;

		String url = "https://jsonmock.hackerrank.com/api/countries/search?name=";

		InputStream in = new URL(url + s).openStream();

		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(in));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null && !line.isEmpty()) {

				sb.append(line);
				line = br.readLine();
			}
			String js = sb.toString();

			JSONParser jp = new JSONParser();
			JSONObject json = (JSONObject) jp.parse(js);
			pages = (long) json.get("total_pages");
		} catch (Exception e) {
			return 0;
		}

		while (pages > 0) {
			try {
				InputStream ins = new URL(url + s + "&page=" + String.valueOf(pagenum)).openStream();
				pages--;
				pagenum++;

				BufferedReader br = new BufferedReader(new InputStreamReader(ins));
				StringBuilder sb = new StringBuilder();
				String line = br.readLine();
				while (line != null && !line.isEmpty()) {

					sb.append(line);
					line = br.readLine();
				}
				String js = sb.toString();

				JSONParser jp = new JSONParser();
				JSONObject json = (JSONObject) jp.parse(js);
				// System.out.print(json.get("total"));
				ArrayList<JSONObject> l = (ArrayList<JSONObject>) json.get("data");

				for (long i = 0; i < l.size(); i++) {
					JSONObject item = (JSONObject) l.get((int) i);
					// System.out.println(item);
					if ((long) item.get("population") > p)
						counter++;
				}
			} catch (Exception e) {
				return 0;
			}
		}
		return counter;
	}

	public static void main(String[] args) {

		try {
			System.out.println(getCountries("in", 1000000));
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}*/