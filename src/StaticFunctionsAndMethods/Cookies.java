package StaticFunctionsAndMethods;

public class Cookies {

    private String id;
    private String userName;
    private String sessionKey;
    private int itemsCart;

    public static String cookieType = "SESSION_COOKIE";
    private static String cookieType_PRT = "SESSION_COOKIE_PRIVATE";

    /* This static Field is going to be just one copy of this variable cookie type.Its only going to occupy one
       string location and all objects of the cookie class are going to share references to this one location.      */

    public Cookies(String id,String userName,String sessionKey, int itemsCart){

        this.id = id;
        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsCart = itemsCart;

    }

    public void setId(String id)
    {
        this.id = id;
    }
    public void setUserName(String userName)
    {
        this.userName = userName;
    }
    public void setSessionKey(String sessionKey)
    {
        this.sessionKey = sessionKey;
    }
    public void setItemsCart(int itemsCart)
    {
        this.itemsCart = itemsCart;
    }


    public String getId() {
        return id;
    }
    public String getUserName() {
        return userName;
    }

    public String getSessionKey() {
        return sessionKey;
    }

    public int getItemsCart() {
        return itemsCart;
    }

    public static String getCookieType_PRT(){
        return cookieType_PRT;
    }
    public static void setCookieType_PRT(String cookieType_PRT){
        Cookies.cookieType_PRT = cookieType_PRT;

    }


    // This is telling Java that we are Explicitly Overriding the toString method from Java.lang.object.
    // It a good practice to use @Override Annotation every time time you override a method

    @Override
    public String toString(){

        return String.format("Cookie Id: %s, UserName: %s , SessionKey: %s, ItemsCart: %d ",
                id,userName,sessionKey,itemsCart);
    }

}
