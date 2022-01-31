#BB
##  Comparable & Comparator
* Comparable - для сравнения по естественному порядку
* -> int compareTo(Element e)
* For compareTo(a1, a2) == 0 Let's do equals(a1, a2) == 1
### Interface Comparator for not nature order
* -> compare(Employee02 emp1, Employee02 emp2)
###  Generics
#### Type Safe & Reusable Code


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




