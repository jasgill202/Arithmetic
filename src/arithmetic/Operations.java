/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arithmetic;

/**
 *
 * @author jasme
 */
public class Operations {
    
    public enum Ops{
        PLUS, MINUS, DIVIDE, TIMES
    }
private Ops ops;

public Operations(Ops ops){
    this.ops=ops;
}
public Ops getOps(){
    return this.ops;
}
public void setOps(Ops ops){
    this.ops=ops;
}
}
