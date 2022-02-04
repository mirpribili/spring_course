#BB
##  Comparable & Comparator
* Comparable - для сравнения по естественному порядку
* -> int compareTo(Element e)
* For compareTo(a1, a2) == 0 Let's do equals(a1, a2) == 1
### Interface Comparator for not nature order
* -> compare(Employee02 emp1, Employee02 emp2)
###  Generics
#### Type Safe & Reusable Code
#### Parametrized Method and Class (method)
#### Type erasure - стирание типов для обратной совместимости

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
=

=

=

=

=

=

=

=