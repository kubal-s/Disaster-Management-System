/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

public class VictimHelpRequest extends WorkRequest{

    private int peopleAffected;

    public int getPeopleAffected() {
        return peopleAffected;
    }


    public void setPeopleAffected(int peopleAffected) {
        this.peopleAffected = peopleAffected;
    }


}
