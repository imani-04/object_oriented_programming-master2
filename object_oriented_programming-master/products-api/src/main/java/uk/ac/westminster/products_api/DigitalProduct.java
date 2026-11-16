package uk.ac.westminster.products_api;

public class DigitalProduct extends Product {
    private String downloadUrl ;
    private double downloadSize;

    public DigitalProduct(long id, String name, double price, String downloadUrl, double downloadSize) {
        super(id, name, price);
        this.downloadUrl = downloadUrl;
        this.downloadSize = downloadSize;
    }

    ; // needed for when JSON is used
    public DigitalProduct() {}

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public double getDownloadSize() {
        return downloadSize;
    }

// end class DigitalProduct..


}