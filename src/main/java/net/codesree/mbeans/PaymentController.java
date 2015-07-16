package net.codesree.mbeans;

import java.io.Serializable;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@SessionScoped
public class PaymentController implements Serializable {

  private boolean registerCompleted=true;
  private int orderQty=99;
  
  public boolean getRegisterCompleted() { return this.registerCompleted; }
  public void setRegisterCompleted(boolean _registerCompleted) { this.registerCompleted=_registerCompleted; }
  
  public int getOrderQty() { return this.orderQty; }
  public void setOrderQty(int _orderQty) { this.orderQty=_orderQty; }
  
}