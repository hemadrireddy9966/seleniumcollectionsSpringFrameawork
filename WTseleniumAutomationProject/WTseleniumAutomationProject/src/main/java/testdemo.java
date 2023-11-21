public class testdemo {
    public static void main(String[] args) {
      String s="<script type=\"text/javascript\" src=\"https://d1wrgmw2jqph3l.cloudfront.net/web-translate/on-the-fly.min.js\"></script>\n" +
              "<script>\n" +
              "\t\tdocument.addEventListener(\"DOMContentLoaded\", function () {\n" +
              "\t\t\tnew VitraOnTheFly({\n" +
              "\t\t\t\tapi_key: \"vitra.cN0UncU48Pglp4znVzhE_aSQrTHIhY\",\n" +
              "\t\t\t\tglossaryId: \"ef0a30a8-67f6-4e70-9925-44ceb407f6c1\",\n" +
              "\t\t\t\tposition: \"center-right\",\n" +
              "\t\t\t\ttheme: \"dark\",\n" +
              "\t\t\t});\n" +
              "\t\t});\n" +
              "</script>";
         String s1=s.replace("on-","staging-on-");
              System.out.println(s1);
    }

}
