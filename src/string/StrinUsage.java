package string;
import java.util.HashMap;
import java.util.Set;

public class StrinUsage {
    public static void main(String[] args) {
            String text="Text Text Text hfrug grtjie jgirtj lsrthtrhrgi hty";

            System.out.println(text.toUpperCase());

            System.out.println(text.toLowerCase());

            System.out.println("Lungimea textului "+text.length());

            char[] vocalArr = new char[]{'a', 'i', 'e', 'o', 'u'};
            int v = 0;
            char[] textChar = text.toCharArray();
            for (char ch : textChar) {
                for (char ch2 : vocalArr) {
                    if (ch == ch2){
                        v++;
                    }
                }
            }
            System.out.println("Vocale in text "+v);

            int c=0;
            for (char ch : textChar) {
                if (ch == ' '){
                    c++;
                }
            }
            System.out.println("Consoane in text "+(text.length()-c-v));
            System.out.println("Cuvinte in text "+(c+1));

            String words[] = text.split(" ");
            String max = "";
            for(String w:words) {
                if(w.length() > max.length()) {
                    max = w;
                }
            }
            System.out.println("Cel mai lung cuvant "+max);

            String min = max;
            for(String w:words) {
                if(w.length() < min.length()) {
                    min = w;
                }
            }
            System.out.println("Cel mai scurt cuvant "+min);

            HashMap<String, Integer> map = new HashMap<>();
            for (String t : words) {
                if (map.containsKey(t)) {
                    map.put(t, map.get(t) + 1);
                } else {
                    map.put(t, 1);
                }
            }
            Set<String> keys = map.keySet();
            for (String key : keys) {
            if(map.get(key)>1){
                System.out.print(key);
                System.out.println(" "+map.get(key));
            }
            }

    }
    }
