package VorOrt;

public class Übung1_1 {
    public static void main(String[] args) {
        String input = "String";
        String Vokale = "aeiouAEIOU";

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            sb.append(c);

            if (Vokale.contains(String.valueOf(c))) {
                sb.append('s').append(c);
            }
        }

        // String snakeText = sb.toString();
        System.out.println(sb);
    }
}
