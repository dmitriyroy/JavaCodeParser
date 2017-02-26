package ua.com.juja.codeparser.parser;


import java.io.File;
import java.util.Collection;

public interface FileParser {

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во строк в файле
     */
    Integer getRowCount(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов в файле
     */
    Integer getMethodCount(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во переменных в файле
     */
    Integer getVariableCount(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return
     */
    Integer getRowCountInAllMehods(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во строк в наименьшем методе
     */
    Integer getRowCountInSmallMehod(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во строк в наибольшем методе
     */
    Integer getRowCountInBigMehod(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов с кол-вом строк от 0 до 10
     */
    Integer getMethodCountRows_0_10(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов с кол-вом строк от 11 до 20
     */
    Integer getMethodCountRows_11_20(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов с кол-вом строк от 21 до 30
     */
    Integer getMethodCountRows_21_30(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов с кол-вом строк от 31 до 50
     */
    Integer getMethodCountRows_31_50(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов с кол-вом строк от 51 до 100
     */
    Integer getMethodCountRows_51_100(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов с кол-вом строк от 101 до 500
     */
    Integer getMethodCountRows_101_500(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return кол-во методов с кол-вом строк от 500 до бесконечности
     */
    Integer getMethodCountRows_501_Plus(File file);

    /**
     *
     * @param file - java-файл для парсинга
     * @return колекцию номеров строк, в которых объявлен блок TODO
     */
    Collection<Integer> getTODOBlockInfo(File file);
}
