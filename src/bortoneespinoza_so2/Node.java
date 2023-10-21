/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bortoneespinoza_so2;

/**
 *
 * @author isabe
 */
public class Node {
    
    private boolean automaticName = true;
    private String displayName;
    
   private int state;
   private int componentNumber;
    
    private int discoveryTime;
    
    private int lowTime;
    
    private int finishingTime;
    
    //private Node dfsParent;
    
    private Node next;
    
    private Object element;
    
    private int value;

    public Node() {

    }
    
    /**
     * @author isabe
     * @param next 
     */
    public void setNext(Node next){
        this.next = next;
    }
    
    /**
     * @author isabe
     * @return 
     */
    public Object getElement(){
        return element;
    }
    
    /**
     * @author isabe
     * @return 
     */
    public Node getNext(){
        return next;
    }
    
    /**
     * @author isabe
     * @param name 
     */
     public Node(String name) {
         automaticName = false;
       this.displayName = name; 
    }
     
     
    /**
     * @author isabe
     * @param name
     * @param componentNumber 
     */
     public Node(String name, int componentNumber) {
         automaticName = false;
       this.displayName = name; 
       this.componentNumber = componentNumber;
    }
    

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
     
     

     /**
      * @author isabe
      * @return componentNumber
      */
    public int getComponentNumber() {
        return componentNumber;
    }
    
    /**
     * @author isabe
     * @param componentNumber 
     */
    public void setComponentNumber(int componentNumber) {
        this.componentNumber = componentNumber;
    }

    /**
     * @author isabe
     * @return state
     */
    public int getState() {
        return state;
    }

    /**
     * @author isabe
     * @param state 
     */
    public void setState(int state) {
        this.state = state;
    }

    /**
     * @author isabe
     * @param displayName 
     
    public void setDisplayName(String displayName) {
        automaticName = false;
        this.displayName = displayName;
    }
    * */

    /**
     * @author isabe
     * @return automaticName
     */
    public boolean isAutomaticName() {
        return automaticName;
    }

    /**
     * @author isabe
     * @return displayName
     
    public String getDisplayName() {
        if (isAutomaticName()) {
            displayName = NameUtil.getInstance().getName();
        }
        return displayName;
    }
    */


    /**
     * @author isabe
     * @param i 
     */
    void setDiscoveryTime(int i) {
        this.discoveryTime = i;
    }
    
    /**
     * @author isabe
     * @param i 
     */
    void setFinishingTime(int i) {
        this.finishingTime = i;
    }

    /**
     * @author isabe
     * @return discoveryTime
     */
    public int getDiscoveryTime() {
        return discoveryTime;
    }

    /**
     * @author isabe
     * @return finishingTime
     */
    public int getFinishingTime() {
        return finishingTime;
    }

    /**
     * @author isabe
     * @param i 
     */
    void setLowTime(int i) {
        this.lowTime = i;
    }

    /**
     * @author isabe
     * @return lowTime
     */
     public int getLowTime() {
        return lowTime;
    }

 
}
