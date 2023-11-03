package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int n = chars.length;
        String s = "";
        int cnt = 0;


        while (cnt < n) {
            s = s + chars[cnt];
            cnt++;
        }

        System.out.println(s);

    }
}
