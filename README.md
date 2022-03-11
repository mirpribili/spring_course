#BB
##  Comparable & Comparator
* Comparable - для сравнения по естественному порядку
* -> int compareTo(Element e)
* For compareTo(a1, a2) == 0 Let's do equals(a1, a2) == 1
### Interface Comparator for not nature order
* -> compare(Employee02 emp1, Employee02 emp2)
###  Generics
### Type Safe & Reusable Code
#### Parametrized Method and Class (method)
#### Type erasure - стирание типов для обратной совместимости
# Collections
## Иерархия
>
- Iterable
  - Collection
    - List - упорядоченная последовательность элементов, позволяющая хранить дубликаты и null. Каждый элемент имеет индекс.
      - ArrayList
      - LinkedList
      - Vector
        - Stack
    - Queue (очередь)
      - Deque
        - LinkedList
        - ArrayDeque
      - AbstractQueue
        - PriorityQueue
    - Set
      - HashSet
        - LinkedHashSet
      - SortedSet
        - NavigableSet
          - TreeSet
>
- Map
  - HashMap
    - LinkedHashMap
  - SortedMap
    - NavigableMap
      - TreeMap
  - HashTable

### ArrayList
- ArrayList - способен изменять свою длину
- ArrayList <DataType> list = new ArrayList <DataType>();
- в основе лежит класс Object
- имеет initialCapacity позволяющий сократить затрачиваемое время на пересоздание массивов при добавлении элементов.
- по умолчанию initialCapacity = 10
### ArrayList Methods
- add(DataType element) -----------------> boolean
- add(int index, DataType element) ------> boolean
- get(int index) ------------------------> DataType
- set(int index, DataType element) ------> DataType (like REPLACE)
- remove(Object element) ----------------> boolean
- remove(int index) ---------------------> DataType
- addAll(ArrayList aL) ------------------> boolean (в конец)
- addAll(int index, ArrayList aL) -------> boolean 
- clear() -------------------------------> void
- indexOf(Object element) ---------------> int (-1 если нет, первое вхождение)
- lastIndexOf(Object element) -----------> int (последний индекс)
- size() --------------------------------> int (размер)
- isEmpty() -----------------------------> boolean
- contains(Object element) --------------> boolean (work with equals)
- toString() ----------------------------> String
- .
- Arrays.asList(DataType []) ------------> List<DataType> (новый лист СВЯЗАН с массивом!)
- removeAll(Collection <?> c) -----------> boolean (arrayList1.removeAll(arrayList2))
- retainAll(Collection <?> c) -----------> boolean (оставит в мас1 **только** элем. мас2)
- containsAll(Collection <?> c) ---------> boolean содержит или нет все элементы передан. в парам-ре.
- subList(int fromIndex, in toIndex) ----> List<E> (СВЯЗАН + ОГРАНИЧИВАЕТ структурные изменения масс. - это не отдельная сущность View)
- toArray() -----------------------------> Object[]
- toArray(new String[n]) ----------------> String[]
- toArray(T [] a) -----------------------> T []
- >Java8
- List.of(E.. elements) -----------------> List<E> (неизменяемые)
- List.copyOf(Collection <E> c) ---------> List<E> (неизменяемые)
#### Iterator
- arrayList1.iterator()
- .hasNext()
- .remove()
### LinkedList
- элементы LinkedList - звенья одной цепочки. Эти элементы хранят данные, ссылки на пред. и след. элементы.
- хвост (tail) массивы ссылается на null
- head на 1‑й элемент
- данный масс doubly тк каждый элем. имеет ссылку на пред. и след.
  - singly - имеет только на послед.
- Плюсы: операции добавл.\удал. элем. быстрые
- Минусы: получение элемента по индексу медленное.
### ListIterator
- hasPrevious() + previous()
- hasNext() + next()
### Binary search
- для 80 000 элементов максимум 16 шагов потребуется
### Big O notation
- O(n) - линейный
- O(1) - самый быстрый
- O(logN) - лучше чем O(n)
### Vector (ancient)
- не synchronized класс, устаревший и непригодный для многопоточности.
- в основе массив Object
- add()
- get()
- remove()
- firstElement()
- lastElement()
#### Stack (ancient)
- не synchronized класс, устаревший и непригодный для многопоточности.
- использует принцип LIFO. (Last in, first out)
- push()
- pop()
- peek()
- isEmpty()
#### HashMap
- Элементы - пары ключ\значение
- методы очень быстро работают
- не помнить порядок добавления элем.
- ключи должны быть уникальными
- можно добавлять null
- putIfAbsent() - добавь если отсутствует
- put() == add()
- get()
- remove()
- containsValue("значение, а не ключ") ----> boolean
- containsKey() ---------------------------> boolean
- keySet() --------------------------------> Set[]
- values() --------------------------------> Array[]
- entrySet() ------------------------------> Returns a Set view of the mappings contained in this map.
#### hashcode() equals()
- equals()
- hashcode()
- **если переопределили equals() то переопределите hashcode()**
- Для хэш коллекций сравнение элементов массива также **сначала** идет по хэш методу
- коллизии неизбежны)
### HashMap details part 1
- в основе HashMap лежит массив. Элементами данного массива являются структуры LinkedList.
- Данные структуры LinkedList и заполняются элементами которые мы добавляем в HashMap
### HashMap details part 2
#### при создании HashMap можно повлиять на производительность
- initial capacity - начальный размер массива
- Load factor - коэффициент заполнения после которого массив увеличивается в двое
- для ключа необходимо использовать не мутабельные типы ( для классов с final например)
### TreeMap
- элементы - ключ\значение
- хранятся в отсортированном по возрастанию порядке
- в основе красно черное дерево, но не так быстро как HashMap
- put
- get
- remove
- descendingMap() - разворачивает массив. возвращая в порядке убывания
- tailMap() - срез. например только с оценки 5
- headMap() - также срез, но вверх.
- lastEntry() - последний
- firstEntry() - первый
### LinkedHashMap
- Плюс: хранит информацию о порядке добавления
- Минус: производительность методов ниже чем HashMap
- accessOrder - параметр в конструктор, позволяет порядок элементов менять обращением к элементам(прочитал = поместил в конец)
#### HashTable
- устаревший класс, теже принципы что и в HashMap
- но synchronized --> поэтому медленнее работают методы
- ни ключ ни значение не могут быть null
## Set
- Set
  - HashSet
    - LinkedHashSet
  - SortedSet
    - NavigableSet
      - TreeSet
### Set and HashSet - не synchronized
      > Set - коллекция, хранящая уникуальные элементы.
- методы коллекц. Set  - очень быстры
- set это урезанная map
#### HashSet
- не запоминает порядок добавления
- в основе HashSet - HashMap (где ключ - элементы HashSet, а значения константа заглушка)
- add()
- remove()
- size()
- isEmpty()
- contains() bool = содержит ли
- NOT EXIST get(key)
> тк Set это множество то можно их логически вычитать, объединять итд
- addAll() = объединение
- retainAll() = intersect - пересечение
- removeAll() = subtract - вычитание множеств
### TreeSet
- TreeSet - хранит элементы в отсортированном по возрастанию порядке.
- в основе TreeMap = ключи это элементы, а значения заглушка.
- null не может хранить
- first()
- last()
- headSet(элемент) = с начала до переданного элемента
- tailSet() = c конца
- subSet() = чтобы выбрать студентов между 3 и 5 курсом
### LinkedHashSet
- LinkedHashSet наследник HashSet (а в основе HasMap)
- хранит порядок добавления
- производительность ниже родителя
- не может хранить порядок вызова
- add(), remove()
## Queue (principal FIFO) BUT it is not synchronized
  - Queue (очередь)
    - Deque
      - LinkedList
      - ArrayDeque
    - AbstractQueue
      - PriorityQueue
#### LinkedList
      > имплементирует не только интерфейс List но и Deque
- add() в конец очереди
- add() **выбросит исключение** при добавлении в ограниченную очередь переполняющего элемента
- offer() - **не выбросит исключения** для ограниченной очереди, но и не добавит
- remove() - **выбросит исключение** возвращает последний элемент и удаляет
  - может удалить из середины очереди
- poll() - **не выбросит исключение** тоже что remove
- peek() - **не выбросит исключение** **не удаляет**
#### PriorityQueue
- очередь формируется по приоритету. (наприм. для студентов можно реализовать по возрасту)
- или натуральная сортировка
- или та что описана с помощью Comparable или Comparator
- **println()** может НЕ показать упорядочность!!
#### Deque and ArrayDeque
- Deque   = double ended queue
- можно 2 правила применять благо двунаправленности. FIFO and LIFO
- интерфейс Deque реализуется классами LinkedList и ArrayDeque
- addFirst()
- addLast()
- offerFirst()
- offerLast()
- removeFirst()
- removeLast()
- pollFirst()
- pollLast()
- getFirst() - throw exeption
- getLast()
- peekFirst()
- peekLast()
# Nested Classes влож.
# 4 type of classes
> static, inner, local, anonymous.
> 
> как правило nested классы имеют доступ к полям out class даже private
#
    public class Nbb26NestedClasses {
      static class MyStaticNestedClass{
        //
      }
      class InnerClass{}
      void method(){
        class LocalClass{}
      }
      // and anonymous class
      
        // 4 type of classes
    }
## StaticClass
- static nested class (SNC) ведет себя как обычный внешний класс
- создавая SNC нужно указывать и содержащий его класс
- может содержать статичные и не статичные элементы(наприм. счетчик двигателей для класса двигатель)
## InnerClass
    this.engine = this.new Engine(horsePower);
    Nbb28InnerClassCar.Engine engine = car.new Engine(100);
    Nbb28InnerClassCar.Engine engine2 =
      new Nbb28InnerClassCar("yellow", 4).new Engine(1);
- если хотите создать объект внутреннего класса вам нужно сначала создать объект внешнего класса
- может содержать только non-static элементы кроме final
- внешний класс может обратиться к private элементам inner'a если сначала создаст его объект
## Local Inner class (редкое явление)
- может содержать только non-static элементы
- Local Inner class - располагается в блоках как-то метод, конструктор.
- может обратиться к private (final or effective final)элементам внешнего класса
## Anonymous Class
- не имеет имени
- анонимный класс это объявление и одновременно создание объекта
- невозможно написать конструктор 
- может обратиться к private внешнего
- Lambda expressions - это краткая форма для написания анонимных классов
- анонимных интерфейсов не существует
# Lambda Expression
- попробуем отфильтровать массив студентов
- Польза 1: чтобы воспользоваться интерфейсом (например для фильтрации) особенно ОДИН раз 
  - то можно не создавать отдельный класс, а сделать анонимный и забыть 
#
    interface StudentChecks{  // -  функциональный интерфейс
    // для лямбды тут должен быть 1  абстрактный метод!!!!
    boolean check(Student student);
    }
    // ДАВАЙТЕ ЗАМЕНИМ ЭТОТ _ КЛАС АНОНИМНЫМ!! ТОГДА НЕ НАДО БУДЕТ ПЛОДИТЬ ЕГО РЕАЛИЗАЦИИ
    class CheckOverGrade implements StudentChecks{
        @Override
        public boolean check(Student student) {
            return student.avgGrade > 8;
        }
    }
    // ГОТОВ
    studentInfo.testStudents(students, (Student s) -> {return s.age < 20;});
    //--------------------------------------
    public class Nbb33LambdaExampleTwo {
      public static void main(String[] args) {
          def((String s) -> {return s.length();});
      }
        static void def(I i){
            System.out.println(i.abc("Hi"));
        }
      }
      interface  I{
        int abc(String s);
      }
## Lambda Expression part 2
- В лямбде выражении оператор **стрелка разделяет** параметры метода и тело метода.
- В лямбда выражении **справа от оператора стрелка** находится тело метода,
  - которое было бы у метода соответствующего класса,
    - имплеменировавшего наш интерфейс с **единственным** методом.
- {} == add "return"
- def( ()-> 5 );
- def( (x)->x.length() );
- def( (String x)-> x.length() );
- def( (x,y)->x.length() );
- def( (String x, String y)->x.length() );
## java.util.function
### Predicate<T> from java.util.function
- функциональный интерфейс сразу заложен в Predicate 
  - и его абстрактный метод test()
- and()
- or()
- negate()
### Supplier<T>
- T get();
### Consumer
- void accept(T t)
- void forEach()
### Function <T, R> 
- // задача вернуть среднее арифметическое по произвольным полям студентов
- R apply(T t);
#
      Function<Student, Double> function = student -> student.avgGrade;
      
    double result = avgOfSmth(students, function);
    
    private static double avgOfSmth(List<Student> list, Function<Student, Double> function){
      double result = 0;
      for (Student student: list){
        result+=function.apply(student);
      }
      return result/list.size();
    }
# Stream интерфейс
> Последовательность элементов, поддерживающих последовательные и парцелльные операции над ними.
> 
> Не меняют саму коллекции от которой были созданы
> 
> аа
- .map() (i)
- .collect(Collectors.toList());
- .filter() (i)
- .forEach() (t) [void]
- .reduce() (t) {wrap to optional}.get() \ optional.isPresent()
####
    int result =  list.stream().reduce(
            (accumulator, element) -> accumulator * element
            ).get();
- .sorted() (i)
- .concat() (static)
- .distinct() (i) исп-я equals  уникальные выделяет
- .count() (t) long returned
- .peek() (i) аля println на каждом этапе или (i) версия forEach()
- .flatMap() (i) для матрешек? Ж-) смог выбрать из мас факультетов выбрать потоками студентов с кажд. фак. и всех вывести.
- .collect() (t)
  - .groupingBy() можно например сгруппировать студентов в листы по курсу, где ключ это курс)
  - .partitioningBy() - разгруппировать по
- .findFirst() (t)
- .min() .max() (t)
- .limit() (i)
- .skip() (i) отличается от limit тем что не оставляет N элем., а ПРОПУСКАЕТ n элементов
- .mapToInt() (i)
  - .sum()
  - .average() == opion double .getAsDouble()
  - .min().getAsInt()
- .boxed() for convert IntStream to Stream<Integer>
### chaining in stream
- Source(напр. коллекции, массив) 
  - -> intermediate methods(lazy) [принимают поток и возвращают поток + не стартуют без терминального]
    - -> Terminal method (eager - не терпеливый)
### concat()
## Parallel Stream
- По умолчанию в java stream последовательные если спец. не указать распараллеливание
- list.parallelStream().
- Stream<T> s = Stream.of(...);
  - s.parallel(). ...
- у stream's много противников, наущают порядок
# Multithreading
- Основная цель не скорость, а Concurrency
## Варианты создания
- class MyThread2 extends Thread{  public void run(){...}}
  - MyThread2 myThread2 = new MyThread2();
  - myThread2.start();
- class MyThread3 implements Runnable{ public void run(){...}}
  - Thread myThread3 = new Thread(new MyThread3());
  - myThread3.start();
- new Thread(new Runnable() {
  - @Override
  - public void run() {
  - ...
  - }
  - }).start();
- new Thread(()-> System.out.println()).start();
## Методы Thread
- SetName
- getName
- setPriority
- getPriority
- run **Внимание использование вместо start() приводит не к созданию нового потока, а как обычный метод в основном потоке**
- start()
- sleep()
- join(n) поток main будет ждать окончания работы(n mills sec) этого дочернего потока
## Thread state --> getState();
- new (before start())
- runnable (after start())
  - ready (ждет операц. систему когда его вызовут)
  - running
- terminated
## Разница между Concurrency \ Parallelism != Asynchronous \ Synchronous
- Concurrency = совпадение или согласованность (петь и кушать) **И** (петь и готовить)
- \ Параллелизм (петь и готовить) частный случай Concurrency
- Асинхронный = помогает достичь Concurrency. каждая следующая задача **НЕ ЖДЕТ** окончания предыдущей 
- Синхронный = пишем письма по очереди (в программировании означает последовательно)
## Volatile
- public class Nbb54Volatile extends Thread{
  - boolean b = true; <------------- каждый CPU сделает копию себе в КЕШ!!
  - и изменение не сработает!
- volatile boolean b = true; - для пометки "хранение только в main memory"
  - **только для случая** 1 поток может писать Остальные только читают
- i++ не атомарная!
  1. прочесть
  2. увеличить
  3. записать
## Data race(гонка данных) and synchronized methods
- почти замок на метод для много пот. synchronized
## Монитор и synchronized блоки
- монитор как сущность есть у любого объекта и класса, но не метода в java
### блоки
- synchronized (this) {}
- static final Object lock = new Object();
  - public void abc(){ ... synchronized(lock) {target block} ... }
# Конструктор гарантированно обрабатывается только 1 потоком
## wait() and notify()
- методы для извещения потоков
  - wait(n) - **освобождает** монитор и переводит вызывающий поток в "ожидание" до вызова notify() другим
  - notify() - **НЕ освобождает** монитор и будит поток в "ожидании" после wait()
    - notifyAll() - **+** будет все потоки
### wait() НЕЛЬЗЯ помещать в IF только в WHILE тк есть шанс что поток сам проснется
    for:  
      synchronized (lock){ lock.notify() and lock.wait()}
    for:
    public synchronized void getBread(){
      while (breadCount<1){
        try {
          wait();
## DeadLock - взаимное блокирование потоков без возможности выйти( ожидая и не работая)
- если в двух классах захват мониторов в одном порядке, то можно избежать
- LiveLocl - тоже что deadLock только потоки не ожидают, а работают(один пишет в файл а второй сразу стирает и появляется цикл)
- LockStarvation - при малом приоритете "голодный" поток никогда не получит окно работы

## Lock and ReentrantLock
- Lock - интерфейс который имплементируется классом ReentrantLock
- так же ка ключевое слово synchronized помогает синхронизации потоков
- private Lock lock = new ReentrantLock();
  - lock.lock();
  - lock.unlock();
  - tryLock()
## Daemon потоки
- daemon потоки предназначены для выполнения фоновых задач и оказания сервисов User потокам
- при завершении User потока - программа завершается не дожидаясь "слуг" 
  - если нет пользователя, то и обслуживать некого
- setDaemon()
- isDaemon()
## Interruption
- .stop(); [OLD]
- .interrupt(); [norm]
- .isInterrupted()
- try {
  - sleep(100);
    - } catch (InterruptedException e) {
  - e.printStackTrace();
## Thread pool and ExecutorService
- Thread pool - это множество потоков, каждый для своей задачи.
  - работаем с ними с помощью ExecutorService
- Thread pool создают с помощью factory методы класса Executors
- Executors.newFixedThreadPool(int count); - для pool с N потоками
- Executors.newSingleThreadExecutor(); - pool  с 1 потоком
  - .shutdown() - ExecutorService понимает что новых заданий не будет и завершает работу.
  - executors **.execute**(new RunnableImpExecutors()); передает новое задание thread pool
  - .awaitTermination(5, TimeUnit.SECONDS); - like as join();
## ScheduledExecutorService
  - нужен для расписания на запуск потоков из пула
  - вариант создания = Executors.newScheduledThreadPool(5);
  - Между методами schedule() и scheduleAtFixedRate() 
    - есть небольшая разница, которая заключается в разном 
    - поведении, которое зависит от стартовой точки запуска. 
    - Так второй метод работает как 
    - startTime + iterationNumber * delayTime и помнит время запуска.
    - 
    - А обычный метод schedule() помнит последнее время выполнения
    - и работает по формуле lastExecutionTime + delayTime.
  - scheduleWithFixedDelay() = позволит обеспечить паузу между задачами - тк дождется завершения, чтобы вставить паузу.
  - newCachedThreadPool - создает по мере надобности и может завершать не успевших за отведеннео время
# Callable and Future
  > почти как интерфейс runnable НО может бросать исключение и возвращать значение!!
- call() == run()
- submit(factorial) == execute(factorial);
  - submit() - возвращает Future
- future.isDone() - проверка готов ли поток вернуть значение
## Semaphore
- это более высокоуровневая организация работы с потоками.
- это синхронизатор позволяющий ограничить доступ к ресурсу.
  - В конструктор Semaphore нужно передать кол-во потоков, которым можно работать с ресурсом.
- acquire()
- release()
## CountDownLatch
> habr.com/en/post/277669/
- замок с обратным отсчетом
- это синхронизатор, позволяющий любому кол-ву потоков ждать завершения ОБОЗНАЧЕНЫХ ранее операций.
- в CountDownLatch нужно передавать кол-во операций, которые должны завершиться, чтобы потоки продолжили работу.
- Блокировка потоков снимается с помощью счётчика: 
  - любой действующий поток, 
  - при выполнении определенной операции уменьшает значение счётчика.
  - Когда счётчик достигает 0, все ожидающие потоки разблокируются
- await()
- countDown()
- getCount()
- void await() throws InterruptedException;
- boolean await(long wait, TimeUnit unit) throws InterruptedException;
  - В первом методе ожидание длится до тех пор, пока счетчик CountDownLatch не достигнет нуля. А во втором методе ожидание длится только в течение определенного периода времени, определяемого параметром ожидание wait
- **Получается потоки ждут команды! на одновременный запуск!**
## Exchanger
- это синхронизатор позволяющий обмениваться ин-йе потокам **в одно и то же время**!
- exchange()
# AtomicInteger
- класс для работы с int используя **атомарные** операции.
- incrementAndGet() увеличить и получить
- getAndIncrement() получить и увеличить
- addAndGet(n) увеличить на n и получить
- decrementAndGet()
## Synchronized collection
 > Работают медленнее тк помимо основной функции обеспечивают и синхронизацию.
 - Synchronized collection - получаются из традиц-х коллекций через обертывание
   - Collections.synchronizedXYZ(коллекция)
 - Concurrent collections - созданы для многопоточности. Более скоростные
   - ConcurrentHashMap имплементируют интерфейс ConcurrentMap которой им. от Map
     - делит множество хранимых элементов на сегменты (bucket), что позволяет считывать и записывать сегментно параллельно!!
   - CopyOnWriteArrayList - имплементируют List
     - Следует использовать для потокобезопасного чтения с минимальным количеством изменений.  
# итераторы подвержены сбоям в многопоточном режиме

## ConcurrentHashMap
- нельзя key or value == null
## CopyOnWriteArrayList
- при каждом изменении создается копия
## ArrayBlockingQueue - FIFO
- потокобезопасная очередь с ограниченным размером (capacity restricted)
- обычно один поток добавляет в очередь (producer) а второй поток забирает (consumer)
- .put() - producer
- .take() - consumer
# FileWriter
## Character Streams and Byte Streams
- Stream для работы с файлами это упорядочная последованность данных.
- Файлы бывают
  - читабельные - text files
  - не читабельные - binary files
- Для текстовых и Бинарных файлов используют разные потоки.
## FileReader и  FileWriter - для тестовых файлов
### FileReader
- new FileReader("resources/Nbb77FileWrite.txt");
### Try with resources
### BufferedReader & BufferedWriter
- это обертки
  - BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))
  - BufferedReader reader = new BufferedReader(new FileReader("file.txt"))
# FileInputStream & FileOutputStream 
- для бинарных файлов

#
#
> .
> ....................................................................
> ....................................................................
> ....................................................................
> ....................................................................
> .

# Spring
## Inversion of Control:
###      Functions:
* IoC - инверсия управления. Создание и управление объектами передается Spring-у.
* DI - Dependency Injection. Делает объекты слабо зависимыми.
* // Example:
* // ----------------------------------
* //____________ _ Please give me object of Pet
* // Class Test1 <-()-> Spring Container     -> configuration file   [ -> Dog
* //____________^ Get the object of Pet                            -> Cat ]
* // ----------------------------------
###      Configurations:
*          XML (old)
*         Annotation + XML
*          Java code

### Inversion of Control
        
* Spring Bean (или просто bean) - это объект, который создается и управляется Spring Container(SP).
* ApplicationContext(AC) представляет собой Spring Container.
  * AC нужен для получения bean из SP.
  * 
              ClassPathXmlApplicationContext context =
                          new ClassPathXmlApplicationContext("applicationContext.xml");
                  Pet pet = context.getBean("myPet", Pet.class);

###  Dependency Injection (DI)
          //  Employee ->
                       -> Car,
                       -> House, ->
                                 -> Windows,
                                 -> Door,
                                 -> Wall.
                       -> Pet.
              // Old way:
                  Employee emp = new Employee();
                  Car car = new Car();
                      emp.setCar(car);
                  House house = new House();
                  Door door = new Door();
                      house.setDoor(door);
* DI - аутсорсинг добавления\внедрения зависимостей.
* DI -  делает объекты нашего прилож. слабо зависимыми друг от друга.
                  
#### Methods injection dependency:
* with  construct
* setters
* 'Autowiring'
#### DI with constructor:
                    <bean id = "myPet"
                          class="com.raw.spring.n001_introduction.Dog">
                    </bean>

                        * This equal === Cat myPet = new Cat();

                    <bean id = "myPerson"
                          class="com.raw.spring.n001_introduction.Person">
                        <constructor-arg ref="myPet"/><!-- Injection dependency. old xml way. -->
                    </bean>
                        * This equal === Person myPerson = new Person(myPet);

#### DI with setter:
                    <bean id = "myPerson"
                          class="com.raw.spring.n001_introduction.Person">
                        <property name="pet" ref="myPet"/>
                    </bean>
#### DI - внедрение строк и других значений:
                    <bean id = "myPerson"
                          class="com.raw.spring.n001_introduction.Person">
                        <property name="pet" ref="myPet"/>
                        <property name="surname" value="Smith"/>
                        <property name="age" value="33"/>
                    </bean>

#### DI - injection strings and another values from file: properties

                    <context:property-placeholder location="classpath:myApp.properties"/>
                    <bean id = "myPerson"
                          class="com.raw.spring.n001_introduction.Person">
                        <property name="pet" ref="myPet"/>
                        <property name="surname" value="${person.surname}"/>
                        <property name="age" value="${person.age}"/>
                    </bean>
#### Bean scope - рамки ( область видимость)
- жизненный цикл Bean;
- возможное количество создаваемых Bean;

##### Variety of Bean scope:
- singleton;
- prototype;
- request;
- session;
- global-session;

#### Singleton - default scope;
- такой Bean создается сразу после прочтения Spring Container-ом конфиг файла;
- является общим для всех, кто запросит его у Spring Container-а;
- подходит для stateless объектов; Объектов состояние которых мы не хотим менять.;

#### Prototype - scope;
- Такой бин создается только после обращения к Spring Container-у с помощью метода getBean;
- Для каждого обращения создается новый бин в Spring Container-е;
- подходит для stateful объектов. Наприм. хранящим состояние, как то имя собаки;
#### Жизненный цикл Bean + Methods init and destroy
- Запуск приложения;
- Начало работы Spring Container-а;
- Создание бина;
- DI - внедрение зависимостей;
- init-method; Открытие соединений и файлов;
- бин готов для использования;
- Использование нами этого бина;
- Конец работы Spring Container-а;
- destroy-method; закрытие файлов и соединений;
- остановка приложения;

          <bean id = "myPet"
             class="com.raw.spring.n001_introduction.Dog"
             init-method="init"
             destroy-method="destroy">
          </bean>       

          public void init(){
                  System.out.println("Class Dog: init method");
          }
          public void destroy(){
                  System.out.println("Class Dog: destroy method");
          }           
#### Methods init and destroy
- access modifier - может быть любой даже private;
- return также может быть любой; Но возвращаемое значение мы не можем использовать поэтому чаще void;
- название методов может быть любым.;
- не должно быть параметров!;
- если у бина scope = prototype, то init() вызван для КАДОГО бина, НО destroy() не вызовется!(пиши сам освобождение\закрытие реусрсов);           
#### Configuration with annotation
>Конфигурация с помощью аннотаций более короткий и быстрый способ, чем XML;
        
    <context:component-scan base-package="com.raw.spring.n001_introduction"/>
    
    @Component("catBean")
    public class Cat implements Pet{
- Если id не прописать к аннотации, то будет присвоена дефолт. ИмяКласса -> имяКласса
- Если SQLTest -> SQLTest !!! тк 2 и более заглавных
#### Процесс состоит из 2-х этапов:
1. Сканирование классов и поиск аннотации @Component;
2. Создание(регистрация) бина в Spring Container-е;
   1. Если находится 1 подходящий бин, то происходит внедрение зависимости;
   2. Если походящих нет - выбрасывается исключение;
   3. Если подходящих по типу бинов больше одного, тоже исключение;
### @Autowired
- Примен. для внедрения зависимостей с пом. аннотаций
#### Типы Autowiring-а или где можно применять данный DI:
- конструктор;
- сеттер;
- полек класса;
#### @Autowired for setters\anyMethodName 
- > This one leads to DI
#### @Autowired for field 
- > This one leads to DI
#### @Autowired, @Qualifier
#### @Autowired, @Value
- Для внедрения строк и других значений можно использовать аннотацию @Value;
- для @Value  нет необходимости в сеттерах, как то при XML;
#### @Scope, @PostConstruct, @PreDestruct
- @PostConstruct == init method
- @PreDestruct == destroy method
### Configuration Spring Container only with Java code. Part 1.

    @Configuration
    @ComponentScan("com.raw.spring.n001_introduction")
    public class MyConfig{
    }

### Configuration Spring Container only with Java code. Part 2.
- Without scanning pockets;
- Данный способ не использует аннотацию @Autowired. Те зависимости прописываются вручную;
- Название метода это bean id;
- Аннотация @Bean перехватывает все обращения к бин и регулирует создание;

### @PropertySource
    @Configuration
    @PropertySource("classpath:myApp.properties")
    public class N6aMyConfig {
## Aspect Oriented Programming
- направлена против Code tangling.
  - Пример: методы взятьКнигу() и вернутьКнигу() обременяются проверкой прав, и логированием;
- Code scattering - рассеивание. 
  - Прим: логирование теперь нужно поменять, а оно не в одном месте!;
- AOP - парадигма основана на идее разделения основного и служебного ф-ла.;
- Служебный функционал записывается в Aspect-классы.;
  - В основе Aspect заключена сквозная логика (cross-cutting logic);
  - К сквозному ф-лу относят:
    - Логирование;
    - Проверка прав (security check);
    - Обработка транзакций;
    - Обр. исключений;
    - Кэширование;
    - И т.д.;
### AOP frameworks:
- Spring AOP (Прост в использовании \ только распростран-я функцион-ть);
- AspectJ (Более сложен в использовании \ Вся функциональность AOP);

### Методы в пакете aspects помечают как Advice (beforeGetBookAdvice)
#### Type of Advice
- тип @Before выполн. до метода с основной логикой(ОЛ);
- After returning - после нормального окончания метода ОЛ;
- After throwing - после окончания ОЛ если брошено исключение;
- After / After finally - после окончания метода ОЛ в любом случае;
- Around - до и после метода с ОЛ;
>
    @Before("execution(public void getBook())")>
    public void beforeGetBookAdvice(){
      Где "execution(public void getBook())" = называется Pointcut
- В аспектно-ориентированном компьютерном программировании pointcut — это набор точек соединения. Pointcut указывает, где именно следует применять рекомендации, это позволяет разделить проблемы и помогает в модуляции бизнес-логики.
#### Pointcut expression part 1
> это выражение, опис. где должен быть применен Advice.

> Spring AOP использует AspectJ Pointcut expression language.
#### Шаблон для Pointcut:
> **execution(** modifiers-pattern? **return-type-pattern** declaring-type-pattern? **method-name-pattern(parametrs-pattern)** throws-patter? **)**
  - something? == опциональные параметры
> Разберем шаблон:
> 
> @Before("execution(public void com.raw.spring.n002_aop.UniversityLibrary.getBook())")
  - **execution(** -> "execution(
  - modifiers-pattern? -> public 
  - **return-type-pattern** -> void 
  - declaring-type-pattern? -> com.raw.spring.n002_aop.UniversityLibrary.
  - **method-name-pattern(parameters-pattern)** ->getBook())
  - throws-patter? -> *None*
> **execution(public void** get* ()) : 
  - соответствует методу без параметров
  - где бы он не находился
  - access modifier = public
  - return type = void
  - и именем начинающимся с get*
> **execution(** * * ()) :

#### Pointcut expression part 2
> **execution(** * * (..)) :
- любой return type
- любое название метода
- любое количество принимаемых методом объектов
#### Объявление Pointcut
> @Pointcut("pointcut_expression")
> 
> private void pointcut_reference(){}

> @Before("pointcut_reference()")
> 
> public void advice_name(){ some code }
#### Плюсы: 
- можно комбинировать Pointcut
- объявить в одном месте
- нет дублирования кода

#### комбинирование Pointcut
- объединение с помощью лог. операторов &&, ||, !; 
#### Порядок выполнения Aspect-ов
- для соблюдения порядка необходимо размещать Advice в разные Aspects
- также необходима аннотация @Order(10) чем меньше число тем выше приоритет
#### Joint Point - точка наблюдения или соединения
- тут это точка\момент в прогр. когда следует применять Advice.
- те. это точка переплетения бизнес-логики и служеб. функц-лом. 
- Joint Point в параметре метода Advice дает доступ к сигнатуре и параметрах метода с бизнес-логикой.
####
    @Before("com.raw.spring.n002_aop.aspects.MyPointCuts.allAddMethods()")
    public void beforeAddLoginAdvice(JoinPoint joinPoint){
    MethodSignature methodSignature = (MethodSignature) 
                                        joinPoint.getSignature();
    Object[] arguments = joinPoint.getArgs();
### Advice @AfterReturning
- выполняется только после нормального окончания метода с основной логикой
- идеален для логирования
- ПОЗВОЛЯЕТ ИЗМЕНЯТЬ ВОЗВРАЩАЕМОЕ ЗАНЧАЕНИЕ МЕТОДА
####
    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
    public void afterReturningGetStudentsLoggingAdvice(
      JoinPoint joinPoint,
      List<Student> students){
    Student firstStudent = students.get(0);
### Advice @AfterThrowing
- Выполняется после выбрасывания исключения.
### Advice @After (this like finally) 
- выполняется после окончания метода с основной логикой, НЕЗАВИСИМО было или нет исключение брошено
- НЕЛЬЗЯ получить доступ к исключению
- НЕЛЬЗЯ изменить возвращаемое значение
#### 
    @After("execution(* getStudents())")
    public void afterGetStudentsLoggingAdvice(){
### Advice type @Around part 1
**ПОЗВОЛЯЕТ ВСЕ**
- произвести действия **ДО** target method
- произвести действия **ПОСЛЕ** target method
- **получить** результаты метода и **изменить их**
- обработать исключение
####
    @Around("execution(public String returnBook())")
    public Object aroundReturnBookLoggingAdvice(ProceedingJoinPoint proceedingJoinPoint)
        throws Throwable {
        // proceedingJoinPoint -> наша связь с target method
        System.out.println("[ar]-> aroundReturnBookLoggingAdvice. In the library trying to return a book");

        Long begin = System.currentTimeMillis();
        Object targetMethodResult = proceedingJoinPoint.proceed();
        Long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");

        targetMethodResult = "Hacked with @Around";

        System.out.println("[ar]-> aroundReturnBookLoggingAdvice. In library returned the book");
        return targetMethodResult;
    }
### Advice type @Around part 2
**Дополнительная работа с исключениями**
- ничего не делать
- обрабатывать
- пробрасывать
=
# Hibernate
- ORM (Object-to-Relational Mapping) - преобразование объекта в строку в таблице и обратно
- **save**
  - Собирает данные из полей объекта;
  - Написание INSERT выражений для добавления новой строки в таблицу с собранными данными.
- **get**
  - Написание SELECT выражения для получения необходимых данных.
  - Создание объектов Java класса и присвоения его полям значений, получ. из базы.
- **Плюсы**
  - предоставляет технологию ORM
  - регулирует SQL запросы
  - уменьшает кол-во кода для написания по сравнению JDBC (java data base connectivity)
- **CRUD**
  - create = insert
  - read = select
  - update = update
  - delete = delete
#### Install mysql
- sudo apt update
- sudo apt install mysql-server
- mysql --version
- sudo systemctl status mysql
  - sudo service mysql stop
  - sudo rm /var/lib/mysql/ib_logfile0
  - sudo rm /var/lib/mysql/ib_logfile1
  - *and comment out the line record_buffer=64M in /etc/mysql/my.cnf [1]*
  - sudo service mysql restart
- sudo mysql_secure_installation
- sudo mysql
  - CREATE USER bestuser@'localhost' IDENTIFIED BY 'bestuser';
  - GRANT ALL PRIVILEGES ON *. * TO bestuser@'localhost';
    - FLUSH PRIVILEGES;
  - **exit**
  - **mysql -u bestuser -p bestuser**
  - CREATE DATABASE my_db;
    - USE my_db;
    - CREATE TABLE employees (
    - id int NOT NULL AUTO_INCREMENT,
    - name varchar(15),
    - surname varchar(25),
    - department varchar(20),
    - salary int,
    - PRIMARY KEY (id)
    - );
  - **show databases;**
  - **SELECT * from my_db2.employees;**
  - **SELECT * from my_db2.details;**
  - **SELECT * from my_db_one_to_many.employees;**
  - **SELECT * from my_db_one_to_many.departments;**
> Root pwd: springcourse
> connection: my_connection
> user: bestuser
> pwd: bestuser
> DB: my_db
- sudo systemctl status mysql
- mysql -u bestuser -p
- sudo service mysql restart
- exit
- show databases;
- SELECT * from my_db.employees;
- use my_db2;
- show tables;
> 
### Hibernate settings
- xml
- java annotation
### Hibernate концепция
- Entity class - это java класс, который отображает инф-ю определенной таблицы в БД.
- Entity class - это POJO класс, в котором мы используем определенные Hibernate аннотации для связи класса с теблицей в БД.
- POJO (Plain\простой Old Java Objects) класс удов. ряду условий:
  - private поля
  - getters
  - setters
  - construct без аргументов
  - ...
> JPA (Java Persistence API) спецификация описывает систему управления сохранения Java объектов ДБ
> 
> Hibernate - реализация JPA (реализует то что описано в JPA)
> 
> import javax.persistence.Column;
> 
> import javax.persistence.Entity; /// !!!
> 
> **Поэтому используем javax.persistence**
### Hibernate save
#### SessionFactory - фабрика по производству сессий.
- читает hibernate.cfg.xml - как должны создаваться сессии.
- В Java приложении достаточно создать объект SF 1раз и затем можно переиспользовать.
#### Session
- Session это обертка вокруг подключения к базе с помощью JDBC
- Session мы получаем с помощью SessionFactory
- Session - основа для работы с БД. Именно с помощью добавляют, получают и делают другие операции с Jva объектами в БД.
#### Генерация значений для столбца Primary Key
- столбец Primary Key содержит уникальное значение и не может быть null
- @GeneratedValue - описывает стратегию генерации значений для столбца с Primary Key  
  - GenerationType.IDENTITY - полагается на автоматическое увеличение столбца по правилам, прописанным в БД
  - GenerationType.SEQUENCE - последовательность (нет в MySQL)
  - GenerationType.TABLE - полагается на значение столбца таблицы БД. Цель таблицы поддержка уникальности значений. (Устар)
  - GenerationType.AUTO - зависит от типа БД. (ненадежно)
#### Получение объекта из БД по ID
- для получения объектов из БД используются HQL (Hibernate Query Language). HQL очень схож c SQL
- **см N6HibernateGetAllEmployees**
### Hibernate update
- см commit
### Hibernate del

### Виды связей между таблицами
> три типа отношений
- One-to-One
  - School <-> Director \ в школе может быть только один директор и только одна школа может иметь директора
  - Employee <-> Details \ каждому работнику соответствует только 1 личные детали и наоборот
- One-to-Many \\ отношение Один-ко-Многим
  - Department <-> Employee \ <-> Employee \ <-> Employee
- Many-to-One \\ зеркальное. Много к одному. Много работников работает в одной организации
  - Employee <-> \ Employee <-> \ Employee <-> Department
- Many-to-Many \\ отношения Много-ко-Многим
  - кружок \ кружок \ <-> / ребенок / ребенок
### Foreign Key
  - исп. для связей между двумя таблицами
  - обычно FK это столбец, который ссылается на PK другой таблицы.
  - **FK столбец не может содержать инф. которой нет в столбце, на который он ссылается**
### One-to-One
- school <--> Director
- Uni and Bi-directional associations.
  - Uni-directional => class Parent { Child child; } class Child {}
    - > это отношения когда одна сторона о них не знает
    - uni-directional = однонаправленные 
  - Bi-directional => class Parent { Child child; } class Child { Parent parent; }
    - > отношения о которых знают оба. Те оба объекта имеют ссылки друг на друга.
#### new database
    CREATE DATABASE my_db2;
    USE my_db2;

    CREATE TABLE my_db2.details (
      id int NOT NULL AUTO_INCREMENT,
      city varchar(15),
      phone_number varchar(25),
      email varchar(30), PRIMARY KEY (id)
    );
    
    CREATE TABLE my_db2.employees (
      id int NOT NULL AUTO_INCREMENT,
      name varchar(15),
      surname varchar(25),
      department varchar(20), salary int, details_id int
      ,  PRIMARY KEY (id)
      , FOREIGN KEY (details_id) REFERENCES my_db2.details(id)
    );
### @OneToOne 
- аннотация @OneToOne указывает на отношения между объектами
- @JoinColumn - на столбец который осуществляет связь с другим объектом.
- Cascade - операции которые выполняются не только там где вызывается (на неком Entity), но и на связанных с ними Entity.
#### @OneToOne Bi-directional
- @OneToOne(mappedBy = "empDetail", cascade = CascadeType.ALL) // связь уже описана, ищи ее в empDetail
- В Bi-directional отношениях с помощью аннотаций @OneToOne и mappedBy мы показываем Hibernate, где искать связь между классами.
#### @OneToMany Uni-directional
- DB.employees.department_id(INT) --> DB.departments.id(int)
#### @OneToMany Bi-directional
    CREATE DATABASE my_db_one_to_many;
    USE my_db_one_to_many;

    CREATE TABLE my_db_one_to_many.departments (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(15),
    max_salary int,
    min_salary int,
    PRIMARY KEY (id)
    );
    
    CREATE TABLE my_db_one_to_many.employees (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(15),
    surname varchar(25),
    salary int,
    department_id int,
    PRIMARY KEY (id),
    FOREIGN KEY (department_id) REFERENCES my_db_one_to_many.departments(id));
#### @OneToMany Uni-directional
- только объект Департамент имеет ссылки на работников
#### Loading Types: eager and lazy
- Eager load - нетерпеливая загрузка. При ее использовании связанные сущности загружаются сразу с основной.
- Lazy load - ленивая загрузка. Связанные сущности загружаются только при первом обращении к ним!
#### Default relations:
- One-to-One ----> default relation = EAGER
- One-to_Many ----> LAZY
- Many-to-One ----> EAGER
- Many-to-Many ----> LAZY
> для EAGER можно получить данные даже после commit() !!
### Many-to-Many
- Задача посторить свзяь для модели: 
  - Ребенок1.. РебенокN <--> Кружок1.. КружокN
#### Join Table - таблица, которая отображает связь между строками 2-х таблиц.
- Cтолбцы: Join Table - Foreign Key, которые ссылаются на Primary Key связываемых таблиц.
> New tables:

    CREATE TABLE my_db.children (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(15),
    age int,
    PRIMARY KEY (id)
    );
    
    CREATE TABLE my_db.section (
    id int NOT NULL AUTO_INCREMENT,
    name varchar(15),
    PRIMARY KEY (id)
    );
    
    CREATE TABLE my_db.child_section (
    child_id int NOT NULL,
    section_id int NOT NULL,
    PRIMARY KEY (child_id, section_id),
    FOREIGN KEY (child_id) REFERENCES my_db.children(id),
    FOREIGN KEY (section_id) REFERENCES my_db.section(id));
- В аннотации @JoinTable
  - Мы прописываем название таблицы, которая выполняет роль Join Table
  - в **joinColumns** мы указываем столбец таблицы Join Table, который ссылается на **Primary Key source** таблицы
  - в **inverseJoinColumns** мы указываем столбец таблицы join Table, который ссылается на **Primary Key target**
#### Different CascadeType.PERSIST and CascadeType.SAVE_UPDATE from hibernate 
- Use session.save for CascadeType.All
- Use session.persist for Cascade.{PERSIST,MERGE,DETACH,REFRESH}
=
# MVC -  Model, View, Controller
<!--![Иллюстрация к проекту](https://github.com/mirpribili/spring_course/blob/master/resources/spring_mvc.jpg)-->
![Иллюстрация к проекту](https://raw.githubusercontent.com/mirpribili/spring_course/master/resources/spring_mvc.jpg)
- Front Controller также называется DispatcherServlet. 
  - является частью Spring
- пишем сами
  - Controller - центр управления, мозг Spring MVC приложения.
  - Model - контейнер для хранения данных.
  - View - страница отображения (часто html)
    - Создаем с помощью JSP - Java Server Page.
## Состав Spring MVC приложения:
- Конфигурация Spring
  - XML
  - java код для конфигурации 
- Описание Spring bean
  - не только аннотации компонентов
    - другие
- Web страницы

=

=

=