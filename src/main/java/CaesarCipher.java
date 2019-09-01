public class CaesarCipher {

    private String text;
    private Integer key;

    public CaesarCipher(String text,Integer key){
        this.key = key;
        this.text = text;
    }


    public String getText() {
        return text;

    }


    public Integer getKey() {
        return key;
    }

    public String encode() {
        String resultText = "";

            key = key % 26;

        return resultText;
        }


}
