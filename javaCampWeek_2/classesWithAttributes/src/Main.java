public class Main {

    public static void main(String[] args){

        Product product2 = new Product(2,"Telefon","Apple Telefon",8261,23,"Gri");
        Product product = new Product();
        product.setId(1);
        product.setName("Laptop");
        product.setDescriptions("Dell Laptop");
        product.setPrice(5432);
        product.setStockAmount(54);
        product.setRenk("Siyah");


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        productManager.Delete(product);

        productManager.Add(product2);

        System.out.println(product.getKod());
    }
}
