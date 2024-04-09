package kadai_26;
import java.util.Scanner;
import java.util.HashMap;

public  class Jyanken_Chapter26{
    Scanner s = new Scanner(System.in);
    HashMap <String,String> handMap = new HashMap<String,String>();
    
    public Jyanken_Chapter26(){
        handMap.put("r","グー");
        handMap.put("s","チョキ");
        handMap.put("p","パー");
        
    }
    
    public String getMyChoice(){
        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのｒを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");
        String jyanken = s.nextLine();
    
        if(handMap.containsKey(jyanken)){
            System.out.print("自分の手は"+handMap.get(jyanken) + "、");
        }else{
            System.out.println("正しい手を入力してください");
            return getMyChoice();
        }
        return jyanken;
    }
    public String getRandom(){
        String [] hands = {"r", "s", "p"};
        int random = (int)(Math.floor(Math.random() * 3));
        
        return hands[random];
    }
    public void playGame(String jyanken, String randomHand){ 
        
        String opponentHand = handMap.get(randomHand);
        System.out.println("対戦相手の手は" + opponentHand);
        
        
        if(jyanken.equals(randomHand)){
            System.out.println("あいこです");
        }else if((jyanken.equals("r") && randomHand.equals("s")) || 
                  (jyanken.equals("s") && randomHand.equals("p")) ||
                  (jyanken.equals("p") && randomHand.equals("r"))){
            System.out.println("自分の勝ちです");
         }else{
            System.out.println("自分の負けです");
            }
        
        }
    }