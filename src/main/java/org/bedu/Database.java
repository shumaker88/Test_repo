package org.bedu;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Database {

    private List<Product> db;

    public Database() {
        db = new LinkedList<>();
    }
    public void insert(Product data) {
        db.add(data);
    }

    public int size() {
        return db.size();
    }

    public Product getById(long id) {
        for (Product product : db) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    public void clear() {
        db.clear();
    }

    public boolean deleteProduct(long id) {
        for(Product product : db) {
            if(product.getId() == id) {
                return  db.remove(product);
            }
        }
        return false;
    }

    public void  updateProduct(long id, Product prod) {
       for(int i = 0; i < db.size(); i++) {
           if (db.get(i).getId() == prod.getId()) {
                db.set(i, prod);
           }
       }
    }

}