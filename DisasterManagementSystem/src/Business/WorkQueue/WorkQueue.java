/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.UserAccount.UserAccount;
import java.util.ArrayList;
import java.util.List;


public class WorkQueue {
    
    private ArrayList<WorkRequest> workRequestList;
    private int lastRequestID;

    public WorkQueue() {
        workRequestList = new ArrayList();
        lastRequestID = 0;
    }

    public ArrayList<WorkRequest> getWorkRequestList() {
        return workRequestList;
    }
    
    public ArrayList<WorkRequest> getWorkRequestListForUser(UserAccount u) {
        ArrayList<WorkRequest> workRequests = new ArrayList<WorkRequest>();
        
        for(WorkRequest w: workRequestList){
            if(w.getSender().getUsername().equals(u.getUsername())){
                workRequests.add(w);
            }
        }
        
        return workRequests;
    }
    
    public void add(WorkRequest wr){
        workRequestList.add(wr);
    }
    
    public int getRequestID(){
        int requestID = lastRequestID + 1;
        lastRequestID = requestID;
        return requestID;
    }
    
    public WorkRequest getWorkRequestByID(int requestID){
        for(WorkRequest w: workRequestList){
            if(w.getRequestID() == requestID){
                return w;
            }
        }
        return null;
    }
}