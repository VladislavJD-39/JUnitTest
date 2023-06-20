import org.example.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @Test
    @DisplayName("СКЛАДЫВАЕТСЯ")
    void plus() {
        //given
        final int x = 2;
        final int y = 3;
        final int expected = 5;
        //when
        final int result = calc.plus.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("ВЫЧИТАЕТСЯ")
    void minus() {
        //given
        final int x = 6;
        final int y = 2;
        final int expected = 4;
        //when
        final int result = calc.minus.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("УМНОЖАЕТСЯ")
    void multipy() {
        //given
        final int x = 6;
        final int y = 6;
        final int expected = 36;
        //when
        final int result = calc.multiply.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    @DisplayName("ДЕЛИТСЯ")
    void devide() {
        //given
        final int x = 36;
        final int y = 6;
        final int expected = 6;
        //when
        final int result = calc.devide.apply(x, y);
        //then
        Assertions.assertEquals(expected, result);
    }


    @Test
    @DisplayName("ВОЗВЕДЕНИЕ В СТЕПЕНЬ")
    void pow() {
        //given
        Calculator calc = new Calculator();
        final int x = 10;
        final int expected = 100;
        //when
        final int result = calc.pow.apply(x);
        //then
        Assertions.assertEquals(expected, result);

    }


    @Test
    @DisplayName("ПРОВЕРКА НА ЦЕЛОЕ ЧИСЛО")
    void isPositive() {
        //given
        Calculator calc = new Calculator();
        final int x = -5;
        final Boolean expected = false;
        //when
        final Boolean result = calc.isPositive.test(x);
        //then
        Assertions.assertEquals(expected, result);
    }
    @Test
    @DisplayName("ДЕЛЕНИЕ НА 0")
    void devideByZero() {
        //given
        final int x = 5;
        final int y = 0;

        //when
        final  ArithmeticException exception = Assertions.assertThrows(
                ArithmeticException.class,
                () -> calc.devide.apply(x, y)
        );
        //then
        Assertions.assertEquals( "Деление на 0!", " Деление на 0! ");
    }

}
