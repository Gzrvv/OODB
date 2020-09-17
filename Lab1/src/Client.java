import java.util.List;

public class Client extends Person {
    private List<Product> productsList;

    public Client(String firstName, String lastName, String phoneNumber, String email, List<Product> productsList) {
        super(firstName, lastName, phoneNumber, email);
        this.productsList = productsList;
    }

    public void showProductsList(){
        for (Product item : productsList){
            item.toString();
        }
    }
}
