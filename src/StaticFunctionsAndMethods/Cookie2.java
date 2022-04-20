package StaticFunctionsAndMethods;

public class Cookie2 {

    private String id;
    private String userName;
    private String sessionKey;
    private int itemsCart;

    private  static int cookieCount = 0;
    private static String cookieType = "SESSION_COOKIE";
    private  static int uniqueIDGenerator = 10001;

    // This static field will continue to build on the idea of an AutoIncrement field from a database table.
    // And then each time a new obj is constructed,we will save the value of its unique ID as a member variable
    //inside that particular object



    public Cookie2(String id,String userName,String sessionKey, int itemsCart){


        this.id = "cookieId-" + uniqueIDGenerator++;

        /* i.e is a String concatenated with the value of the uniqueIDGenerator.
         this is then saved in the field this.id also note the post increment operator ++ , so after this value has been saved in this.id,
         the value of the static uniqueIDGenerator variable is incremented by one.*/

        this.userName = userName;
        this.sessionKey = sessionKey;
        this.itemsCart = itemsCart;

//         cookieCount++;

         // its increment cookieCount and in this way by accessing the value of the cookie count Static field,we can
         // get an easy and quick indications of how many objects of the cookie2 class have been instantiated.
        // Cookie count is a private field, so will need to provide a getter method.
        // We don't need a setter method bcz cookie count it going to be increment only in the constructor of the
        // cookie2 class.
    }

    public static int getCookieCount(){
        return  cookieCount;
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

    @Override
    public String toString(){

        return String.format("Cookie Id: %s, UserName: %s , SessionKey: %s, ItemsCart: %d ",
                id,userName,sessionKey,itemsCart);
    }


}
