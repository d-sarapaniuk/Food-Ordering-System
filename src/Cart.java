import java.util.List;

public class Cart {
    private List<Product> products;
    public List<Product> getProducts() {
        return products;
    }

    public void addToCart(Product p){
        products.add(p);
    }
    public void removeFromCart(Product p){
        products.remove(p);
    }
    public void clear(){
        products.clear();
    }

}
