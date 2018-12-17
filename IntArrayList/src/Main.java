public class Main {
    public Main() {
    }

    public static void main(String[] args) {
        IntArrayList intList = new IntArrayList();
        intList.add(1);// Добавление элемента
        intList.add(2);// Добавление элемента
        intList.add(3);// Добавление элемента
        intList.add(4);// Добавление элемента
        for (int i = 0; i < intList.size(); i++) {
            System.out.println(intList.get(i));
        }
        System.out.println();
        IntArrayList testArrayList = new IntArrayList();
        testArrayList.add(423);// Добавление элемента
        testArrayList.add(1);// Добавление элемента
        testArrayList.add(12);// Добавление элемента
        intList.add(8, 7);// Добавление элемента под индексом 5
        intList.remove(0);// Удаление элемента
        intList.addAll(testArrayList, 4);// Добавление всех элементов 2 массива начиная с индекса 4
        //intList.sort(); // Сортировка массива
//        for (int i = 0; i < intList.size(); i++) {
//            System.out.println(intList.get(i))}
        System.out.println(intList.contains(1));// Проверка на содержание элемента в массиве
        System.out.println(intList.get(6));// Получение элемента под индексом 7
        System.out.println();

        GenericArrayList<String> list = new GenericArrayList<>();
        list.add("q");
        list.add("w");
        list.add("e");
        list.add("r");
        list.add("t");
        list.add("y");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
