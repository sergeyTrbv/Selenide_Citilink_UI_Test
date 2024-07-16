package helpers;

import org.junit.jupiter.params.provider.Arguments;

import java.util.stream.Stream;

/**
 * Класс {@code DataProvider} предоставляет данные для тестовых методов.
 *
 * @author sergeyTrbv
 */
public class DataProvider {

    /**
     * Метод {@code providerChecking} для поставки данных продукции в тесты.
     * Возвращает поток аргументов, содержащий информацию о компании-поставщике, описании,
     * категории и URL страницы продукта.
     *
     * @return поток аргументов с информацией о тестируемом продукте.
     */
    public static Stream<Arguments> providerChecking() {
        return Stream.of(
                Arguments.of(
                        "https://www.citilink.ru/", // Тестируемый сайт
                        "Ситилинк - интернет-магазин техники, электроники, товаров для дома и ремонта", // Описание сайта в поисковике
                        "Каталог товаров", // Категория
                        "Смартфоны и планшеты", // Подкатегория
                        "Смартфоны", // Тип товара
                        "Бренд", // Фильтр
                        "APPLE", // Значение фильтра
                        "iPhone" // Модель
                )
//                ,
//                Arguments.of(
//                        "citilink", // Тестируемый сайт
//                        "Ситилинк - интернет-магазин техники, электроники ...", // Описание сайта в поисковике
//                        "Каталог товаров", // Категория
//                        "Техника для кухни", // Подкатегория
//                        "Холодильники", // Тип товара
//                        "Бренд", // Фильтр
//                        "INDESIT", // Значение фильтра
//                        "Indesit"
//                )
        );
    }
}