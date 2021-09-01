package Round1;

import java.util.ArrayList;
import java.util.List;

public class FastReading {

    public static void main(String[] args) {

        String state =  "{\n" +
                        "  \"timestamp\": 0,\n" +
                        "  \"book\": \"AAPL\",\n" +
                        "  \"bids\": [],\n" +
                        "  \"asks\": [\n" +
                        "    {\n" +
                        "      \"price\":600,\n" +
                        "      \"volume\":10\n" +
                        "    }\n" +
                        "  ]\n" +
                        "} ";

        double maxPrice = 700;
        double minPrice = 900;
        System.out.println(fastRead(maxPrice, minPrice, state));
    }

    public static String fastRead(double maxBuyPrice, double minSellPrice, String marketState)
    {
        List<String> keywords = new ArrayList<String>();
        keywords.add("{\"timestamp\":");
        keywords.add("\"book\":\"");
        keywords.add(",\"bids\":[");
        keywords.add(",\"asks\":[");
        keywords.add("\"price\":");

        List<String> values = new ArrayList<String>();


        //replace all spaces
        //marketState = marketState.replaceAll(" ", "");

        for (int i = 0; i < keywords.size() - 1; i++)
        {
            System.out.println(marketState.substring(marketState.indexOf(keywords.get(i))));

            //values.add(marketState.substring(marketState.indexOf(keywords.get(i)), marketState.indexOf(keywords.get(i)) + keywords.get(i).length()));
            //System.out.println(keywords.get(i) + " -> " + values.get(i));
        }
        //System.out.println(marketState.indexOf("timestamp"));
        return "";
    }

}
