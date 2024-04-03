package kadai_018;

	abstract public class Kato_Chapter18{
	    
	    public String familyName = "加藤";
	    public String givenName;
	    public String address = "住所は東京都中野区〇×です";
	    
	    public Kato_Chapter18(String givenName){
	        this.givenName = givenName;
	    }
	    
	    public void commonIntroduce(){
	        System.out.println("名前は"+ familyName + givenName + "です");
	        System.out.println("住所は東京都中野区〇×です");
	    }
	    
	    abstract public void eachIntroduce();
	    
	    public void execIntroduce(){
	        commonIntroduce();
	        eachIntroduce();        
	    }


}
