package Lesson_1.Calculator;

import org.junit.jupiter.api.Test;

class CalculatorTest {

    @Test
    void testCalculateDiscountWithValidInput() {
        // Проверка суммы покупки со скидкой при валидных аргументах
        assert Calculator.calculateDiscount(100.0, 10) == 90.0;
        assert Calculator.calculateDiscount(50.0, 25) == 37.5;
        assert Calculator.calculateDiscount(200.0, 0) == 200.0;
    }

    @Test
    void testCalculateDiscountWithInvalidInput() {
        // Проверка выбрасывания исключения при недопустимых аргументах
        assertThrows(ArithmeticException.class, () -> Calculator.calculateDiscount(-100.0, 10));
        assertThrows(ArithmeticException.class, () -> Calculator.calculateDiscount(100.0, -10));
        assertThrows(ArithmeticException.class, () -> Calculator.calculateDiscount(100.0, 110));
    }

    private void assertThrows(Class<? extends Throwable> exceptionClass, Runnable runnable) {
        try {
            runnable.run();
            assert false : "Expected " + exceptionClass.getName() + " but no exception was thrown.";
        } catch (Throwable e) {
            assert exceptionClass.isInstance(e) : "Expected " + exceptionClass.getName() + " but got " + e.getClass().getName();
        }
    }
}

