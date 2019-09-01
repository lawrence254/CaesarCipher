public class CaesarCipher {




    public String getText() {
        return text;

    }

   private String text;
    private Integer key;

    public CaesarCipher(String text,Integer key){
        this.key = key;
        this.text = text;
    }

}
