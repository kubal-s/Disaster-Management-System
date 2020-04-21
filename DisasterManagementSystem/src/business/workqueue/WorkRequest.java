/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package business.workqueue;

import business.enterprise.Enterprise;
import business.useraccount.UserAccount;
import business.address.Address;
import java.util.Date;


public abstract class WorkRequest {
    private int requestID;
    private String summary;
    private String description;
    private UserAccount sender;
    private UserAccount receiver;
    private String status;
    private Date requestDate;
    private Date resolveDate;
    private Enterprise.EnterpriseType requestedEnterprise;
    private Address address;
    private Enterprise assignedEnterprise;
    
    
    
    public WorkRequest(){
        requestDate = new Date();
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }

    public UserAccount getReceiver() {
        return receiver;
    }

    public void setReceiver(UserAccount receiver) {
        this.receiver = receiver;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Date getRequestDate() {
        return requestDate;
    }

    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    public Date getResolveDate() {
        return resolveDate;
    }

    public void setResolveDate(Date resolveDate) {
        this.resolveDate = resolveDate;
    }

    public int getRequestID() {
        return requestID;
    }

    public void setRequestID(int requestID) {
        this.requestID = requestID;
    }

    public Enterprise.EnterpriseType getRequestedEnterprise() {
        return requestedEnterprise;
    }

    public void setRequestedEnterprise(Enterprise.EnterpriseType requestedEnterprise) {
        this.requestedEnterprise = requestedEnterprise;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Enterprise getAssignedEnterprise() {
        return assignedEnterprise;
    }

    public void setAssignedEnterprise(Enterprise assignedEnterprise) {
        this.assignedEnterprise = assignedEnterprise;
    }

    @Override
    public String toString() {
        return String.valueOf(requestID);
    }

}
