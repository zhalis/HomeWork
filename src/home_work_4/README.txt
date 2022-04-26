DataContainer - Выполняет пункты 4 - 10
    метод int add(T item) - выполняет пункт 4
    метод T get(int index) - выполняет пункт 5
    метод T[] getItems() - выполняет пункт 6
    метод boolean deleteIndex(int index) - выполняет пункт 7
    метод boolean deleteItem(T item) - выполняет пункт 8
    метод void sort(Comparator<T> comparator) - выполняет пункт 9
    метод String toString() - выполняет пункт 10
    sort(DataContainer<T> dataContainer) - выполняет пункт 11
    sort(DataContainer<T> container, Comparator<T> comparator) - выполняет пункт 12
runners:
    DataContainerMain - тесты
comparator:
    IntegerСomparator - реализацию сравнения из переданного объекта интерфейса Comparator
    StringComparator - реализацию сравнения из переданного объекта интерфейса Comparator