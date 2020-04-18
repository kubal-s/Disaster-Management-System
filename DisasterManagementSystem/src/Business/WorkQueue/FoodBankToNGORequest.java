/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

public class FoodBankToNGORequest extends WorkRequest{
    private WorkRequest VictimHelpRequest;
    
    
    public WorkRequest getVictimHelpRequest() {
        return VictimHelpRequest;
    }

    public void setVictimHelpRequest(WorkRequest VictimHelpRequest) {
        this.VictimHelpRequest = VictimHelpRequest;
    }
}
