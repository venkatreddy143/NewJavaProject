package swiggy;

public class Product {

        private String type;
        private int price;

    public void setType(String type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Product(String type, int price) {
            this.type = type;
            this.price = price;
        }

        public String getType() {
            return type;
        }

    @Override
    public String toString() {
        return "Product{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }

    public int getPrice() {
            return price;
        }
    }


