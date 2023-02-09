package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        int length = chars.length;
        int spaceCount= 0;
        for(int i = 0; i < chars.length; i++){
            if(chars[i] == ' '){
                spaceCount++;
            }
        }
        spaceCount--;
        while(spaceCount != 0){
            System.out.print(chars);
            spaceCount--;
        }
    }
}
