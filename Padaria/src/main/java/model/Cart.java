/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
/**
 *
 * @author Konorat
 *  * Classe que representa o carrinho de compras de um cliente.
 */
public class Cart {
    private List<Item> listItens;

    
/**
* Retorna a lista de itens do carrinho de compras.
*
* @return Collection<Itens>
*/

    public void addItem(Product product, double qty) {
    	int posE = -1;
        //double unitP = 0;
    	
    	for(int pos = 0; pos < getItens().size() & posE < 0; pos++) {
    		Item itemTemp = listItens.get(pos);
    		
    		if(itemTemp.getProduct().equals(product)){
    			posE = pos;
    		}    		
    	}
    	
    	try {	    	
    	    if(posE < 0) {
    		   Item item = new Item(product, qty);
    		   item.setTotalP(item.getTotalP());
    		   getItens().add(item);    		
    	    } else {
			  Item itemTemp = listItens.get(posE);
			  qty = itemTemp.getQty()+ qty;
			  double unitP = itemTemp.getUnitP();
			  Item item = new Item(product, qty);
			  item.setTotalP(item.getTotalP());
			
			  listItens.set(posE, item);
		    }
    	}   catch(RuntimeException e) {
    		  e.getStackTrace();
    	    }  
    }
    
public Collection<Item> getItens() {
    if(listItens == null) {
    	listItens = new ArrayList<>();
    }
    return listItens;
}

public double getTotalP() {
    double total = 0;
    for(Item n : listItens){
        total+= n.getTotalP();
    }
    return total;
}
    
    
    
}
