import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShopTest {

    private Shop shop;

    @BeforeEach
    public void setUp() {
        shop = new Shop();
    }

    @Test
    public void testSortProductsByPrice() {
        // Создаем продукты с разными ценами
        Product product1 = new Product();
        product1.setCost(100);
        Product product2 = new Product();
        product2.setCost(50);
        Product product3 = new Product();
        product3.setCost(200);

        // Добавляем их в магазин
        shop.setProducts(List.of(product1, product2, product3));

        // Сортируем продукты по цене
        shop.sortProductsByPrice();

        // Получаем отсортированный список продуктов
        List<Product> sortedProducts = shop.getProducts();

        // Проверяем, что продукты отсортированы по цене в возрастающем порядке
        assertEquals(50, sortedProducts.get(0).getCost());
        assertEquals(100, sortedProducts.get(1).getCost());
        assertEquals(200, sortedProducts.get(2).getCost());
    }

    @Test
    public void testGetMostExpensiveProduct() {
        // Создаем продукты с разными ценами
        Product product1 = new Product();
        product1.setCost(100);
        Product product2 = new Product();
        product2.setCost(50);
        Product product3 = new Product();
        product3.setCost(200);

        // Добавляем их в магазин
        shop.setProducts(List.of(product1, product2, product3));

        // Получаем самый дорогой продукт
        Product mostExpensiveProduct = shop.getMostExpensiveProduct();

        // Проверяем, что это самый дорогой продукт
        assertEquals(200, mostExpensiveProduct.getCost());
    }
}

