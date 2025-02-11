package DEC_20;

public class Product implements Comparable<Product> {
    private Integer productNumber;
    private String productName;
    private Double productPrice;

    public Product(Integer productNumber, String productName, Double productPrice) {
        this.productNumber = productNumber;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public Integer getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public Double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public int compareTo(Product other) {
        return this.productName.compareTo(other.productName);
    }

    @Override
    public String toString() {
        return "Product [productNumber=" + productNumber + ", productName=" + productName + ", productPrice=" + productPrice + "]";
    }
}
