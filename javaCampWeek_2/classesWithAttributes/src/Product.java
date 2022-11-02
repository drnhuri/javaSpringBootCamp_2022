public class Product {

   private int id;
   private String name;
   private String descriptions;
   private double price;
   private int stockAmount;
   private String renk;
   private String kod;

   public Product(){

   }

   public Product(int id, String name, String descriptions, double price, int stockAmount, String renk){
       this.id = id;
       this.name = name;
       this.descriptions = descriptions;
       this.price = price;
       this.stockAmount = stockAmount;
       this.renk = renk;
       System.out.println("Yapici blok calisti");
   }

   public int getId(){
       return id;
   }

   public void setId(int id){
       this.id = id;
   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(String descriptions) {
        this.descriptions = descriptions;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return this.name.substring(0,1) + id;
    }

}
