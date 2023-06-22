package org.bedu;

public class Main {

    public static void main(String[] args) {
        Database db = new Database();
        db.insert(new Product(1, "Coca Cola 3lt"));
        db.insert(new Product(2, "Gansito"));
        db.insert(new Product(3, "Mordisko"));
        db.insert(new Product(4, "Sabritas 30g"));

        if(db.deleteProduct(1))
            System.out.println("Tamaño de la lista " + db.size());
    }
}
