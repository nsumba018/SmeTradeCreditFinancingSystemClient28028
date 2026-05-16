
package rw.rab.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 *
 * @author nsumba
 */

public class Invoice implements Serializable{
    private static final long serialVersionUID = 1L;
    private int invoiceId;
    private String invoiceNumber;
    private double amount;
    private String status;
    private Date issueDate;
    private Date dueDate;
    // Client Invoice.java — no annotations, just the field
    private Sme sme;


    public Invoice() {
    }

    public Invoice(int invoiceId, String invoiceNumber, double amount, String status, Date issueDate, Date dueDate, Sme sme) {
        this.invoiceId = invoiceId;
        this.invoiceNumber = invoiceNumber;
        this.amount = amount;
        this.status = status;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.sme = sme;
    }

    

    
    

    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }
    

    public int getInvoiveId() {
        return invoiceId;
    }

    public void setInvoiveId(int invoiveId) {
        this.invoiceId = invoiveId;
    }

    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    public void setInvoiceNumber(String invoiceNumber) {
        this.invoiceNumber = invoiceNumber;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }
    public Sme getSme() {
    return sme;
    }

    public void setSme(Sme sme) {
        this.sme = sme;
    }
    
}
