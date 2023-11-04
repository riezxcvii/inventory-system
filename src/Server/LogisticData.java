package Server;

import java.util.Date;

public class LogisticData {

    private String productName;
    private String pType;
    private double pPrice;
    private Date dateReceived;
    private Date dateRelease;
    private String euPoNumber;
    private String poRefNumber;
    private String brand;
    private String pDesc;
    private String model;
    private String supplier;
    private int quantity;
    private String customer;
    private String warranty;
    private String warrantyCustomer;
    private int productId;
    private int userId;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int id) {
        this.productId = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int id) {
        this.userId = id;
    }

    public String getName() {
        return productName;
    }

    public void setName(String name) {
        this.productName = name;
    }

    public String getType() {
        return pType;
    }

    public void setType(String type) {
        this.pType = type;
    }

    public double getPrice() {
        return pPrice;
    }

    public void setPrice(double price) {
        this.pPrice = price;
    }

    public Date getDateReceived() {
        return dateReceived;
    }

    public void setDateReceived(Date received) {
        this.dateReceived = received;
    }

    public Date getDateRelease() {
        return dateRelease;
    }

    public void setDateRelease(Date release) {
        this.dateRelease = release;
    }

    public String getEuPoNumber() {
        return euPoNumber;
    }

    public void setEuPoNumber(String euPoNumber) {
        this.euPoNumber = euPoNumber;
    }

    public String getPoRefNumber() {
        return poRefNumber;
    }

    public void setPoRefNumber(String poRefNumber) {
        this.poRefNumber = poRefNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getPDesc() {
        return pDesc;
    }

    public void setPDesc(String pDesc) {
        this.pDesc = pDesc;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getWarranty() {
        return warranty;
    }

    public void setWarranty(String warranty) {
        this.warranty = warranty;
    }

    public String getWarrantyCustomer() {
        return warrantyCustomer;
    }

    public void setWarrantyCustomer(String warrantyCustomer) {
        this.warrantyCustomer = warrantyCustomer;
    }
}
