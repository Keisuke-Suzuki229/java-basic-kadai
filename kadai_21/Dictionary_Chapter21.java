package kadai_21;
import java.util.HashMap;

public class Dictionary_Chapter21{
    private String[] searchWords;

    public Dictionary_Chapter21(String[]searchWords){
        this.searchWords = searchWords;
    }

    public void dictionary(){
        HashMap<String,String> dictionaryMap = new HashMap<String,String>();

        dictionaryMap.put("apple","りんご");
        dictionaryMap.put("peach","桃");
        dictionaryMap.put("banana","バナナ");
        dictionaryMap.put("lemon","レモン");
        dictionaryMap.put("pear","梨");
        dictionaryMap.put("kiwi","キウィ");
        dictionaryMap.put("strawberry","いちご");
        dictionaryMap.put("grape","ぶどう");
        dictionaryMap.put("muscat","マスカット");
        dictionaryMap.put("charry","さくらんぼ");

    
        for(String fruits : searchWords){
            if (dictionaryMap.containsKey(fruits)){
                String meaning = dictionaryMap.get(fruits);
                System.out.println(fruits + "の意味は" + meaning);

                }else{
                System.out.println(fruits + "は辞書に存在しません");
                }
        }
    }
}