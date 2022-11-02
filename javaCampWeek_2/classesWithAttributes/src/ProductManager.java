public class ProductManager {

    public void Add(Product product){
        System.out.println("Urun eklendi " + product.getName());
    }
    public void Delete(Product product){
        System.out.println("Urun silindi " + product.getName());
    }
}
