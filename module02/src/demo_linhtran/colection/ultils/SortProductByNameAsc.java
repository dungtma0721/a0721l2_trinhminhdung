package demo_linhtran.colection.ultils;

import demo_linhtran.colection.entity.Product;

import java.util.Comparator;

public class SortProductByNameAsc implements Comparator<Product> {
    @Override
    public int compare(Product p1, Product p2) {
        if (p1.getName().equals(p2.getName())) {
            return (int) (p1.getPrice() - p2.getPrice());
        }
        return p1.getName().compareTo(p2.getName());
    }
}
