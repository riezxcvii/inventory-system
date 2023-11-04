package Server;

import java.util.Date;

public class InquiryData {

    private int salesId;
    private Date iDate;
    private String iProject;
    private int iQuantity;
    private String iDescription;
    private String iSupplier;
    private double iSupplierPrice;
    private double iSrp;
    private String iRemarks;
    private Date iDateAccomplished;
    private Date iLastUpdate;
    private Date iDeadline;
    private int userID;

    public int getSalesId() {
        return salesId;
    }

    public void setSalesId(int salesId) {
        this.salesId = salesId;
    }

    public Date getIDate() {
        return iDate;
    }

    public void setIDate(Date iDate) {
        this.iDate = iDate;
    }

    public String getIProject() {
        return iProject;
    }

    public void setIProject(String iProject) {
        this.iProject = iProject;
    }

    public int getIQuantity() {
        return iQuantity;
    }

    public void setIQuantity(int iQuantity) {
        this.iQuantity = iQuantity;
    }

    public String getIDescription() {
        return iDescription;
    }

    public void setIDescription(String iDescription) {
        this.iDescription = iDescription;
    }

    public String getISupplier() {
        return iSupplier;
    }

    public void setISupplier(String iSupplier) {
        this.iSupplier = iSupplier;
    }

    public double getISupplierPrice() {
        return iSupplierPrice;
    }

    public void setISupplierPrice(double iSupplierPrice) {
        this.iSupplierPrice = iSupplierPrice;
    }

    public double getISrp() {
        return iSrp;
    }

    public void setISrp(double iSrp) {
        this.iSrp = iSrp;
    }

    public String getIRemarks() {
        return iRemarks;
    }

    public void setIRemarks(String iRemarks) {
        this.iRemarks = iRemarks;
    }

    public Date getIDateAccomplished() {
        return iDateAccomplished;
    }

    public void setIDateAccomplished(Date iDateAccomplished) {
        this.iDateAccomplished = iDateAccomplished;
    }

    public Date getILastUpdate() {
        return iLastUpdate;
    }

    public void setILastUpdate(Date iLastUpdate) {
        this.iLastUpdate = iLastUpdate;
    }

    public Date getIDeadline() {
        return iDeadline;
    }

    public void setIDeadline(Date iDeadline) {
        this.iDeadline = iDeadline;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }
}
