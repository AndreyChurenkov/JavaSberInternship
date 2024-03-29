Решение этой задачи – комплексный процесс, который состоит из 4 этапов:


1 часть:

У нас есть справочник городов. Он представлен в текстовом виде и состоит из следующих полей:

Порядковый номер записи справочника;
Наименование города;
Регион;
Федеральный округ;
Количество жителей;
Дата основания или первое упоминание

Необходимо реализовать класс Main, используя java.util.Scanner, прочесть информацию из текстового представления справочника и разложить данные в модель City с полями:

name – наименование города;
region – регион;
district – федеральный округ;
population – количество жителей города;
foundation – дата основания или первое упоминание;

2 часть:

Теперь нам нужно реализовать несколько вариантов сортировки данных справочника:
Сортировка списка городов по наименованию в алфавитном порядке по убыванию без учета регистра;
Сортировка списка городов по федеральному округу и наименованию города внутри каждого федерального округа в алфавитном порядке по убыванию с учетом регистра;

Затем вывести полученный список объектов City в консоль. При реализации сортировки нужно обратить внимание на возможные варианты реализации: Comparator, lambda-выражения.

3 часть:

Необходимо преобразовать список городов в массив. А затем путем перебора массива найти индекс элемента и значение с наибольшим количеством жителей города.

Пример полученного результата:
[489] = 11 514 330

4 часть:

Осталось только реализовать поиск количества городов в разрезе регионов. Необходимо определить количество городов в каждом регионе.

Пример полученного результата:
Вологодская область - 15;
Татарстан - 22;
Хабаровский край – 7;
