/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Konorat
 *  * Classe que representa um item no carrinho de compras.
 */
public class Item {
    private Product product;
    private double unitP;
    private double totalP;
    private double qty;

    public Item() {
    }

    public Item(Product product, double qty) {
        this.product = product;
        this.qty = qty;
        this.unitP = product.getPrice();
    }
    
    

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double getUnitP() {
        return unitP;
    }

    public void setUnitP(double unitP) {
        this.unitP = unitP;
    }

    public double getTotalP() {
        return unitP * qty;
    }

    public void setTotalP(double totalP) {
        this.totalP = totalP;
    }

    public double getQty() {
        return qty;
    }

    public void setQty(double qty) {
        this.qty = qty;
    }

    @Override
    public String toString() {
        return "Item{" + "product=" + product + ", unitP=" + unitP + ", totalP=" + totalP + ", qty=" + qty + '}';
    }
    
}
