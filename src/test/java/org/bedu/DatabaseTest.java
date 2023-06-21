package org.bedu;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DatabaseTest {

    //Arrage
    private Database db;

    @BeforeEach
    public void setup() {
        db = new Database();
    }

    @Test
    @DisplayName("The size of an empty satabase is 0")
    public void sizeZero() {
        assertEquals(db.size(), 0);
    }

    @Test
    @DisplayName("Database can insert data")
    public void insert() {
        db.insert(new Product(1, "Coca Cola 3lt"));
        db.insert(new Product(2, "Gansito"));

        assertEquals(db.size(), 2);
    }

    @Test
    @DisplayName("Search by id")
    public void findById() {
        db.insert(new Product(1, "Coca Cola 3lt"));
        db.insert(new Product(2, "Gansito"));
        db.insert(new Product(3, "Mordisko"));
        db.insert(new Product(4, "Sabritas 30g"));

        Product p = db.getById(3);

        assertEquals(p.getId(), 3);
        assertEquals(p.getName(), "Mordisko");
    }

    @Test
    @DisplayName("Database can be cleared")
    public void clear() {
        db.insert(new Product(1, "Coca Cola 3lt"));
        db.insert(new Product(2, "Gansito"));
        db.insert(new Product(3, "Mordisko"));
        db.insert(new Product(4, "Sabritas 30g"));

        assertEquals(db.size(), 4);

        db.clear();

        assertEquals(db.size(), 0);
    }
}
