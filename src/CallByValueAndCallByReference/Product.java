package CallByValueAndCallByReference;

public  class Product {


    public int id;
    public String name;
    public float price;
    public String category;


    public Product(int id, String name, float price, String category ) {

        this.id = id;
        this.name = name;
        this.price = price;
        this.category = category;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString(){

        return String.format("Id: %d, Name: %s , Price: %f, category: %s ",
                id,name,price,category);
    }


}