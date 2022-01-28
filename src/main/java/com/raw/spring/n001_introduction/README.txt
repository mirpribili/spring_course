// BB
    //  Comparable & Comparator
        // Comparable - для сравнения по естественному порядку
            -> int compareTo(Element e)
                * For compareTo(a1, a2) == 0 Let's do equals(a1, a2) == 1
        // Interface Comparator for not nature order
            -> compare(Employee02 emp1, Employee02 emp2)
    //  Generics
        // Type Safe & Reusable Code


// Spring
    // Inversion of Control:
        //      Functions:
        //          IoC - инверсия управления. Создание и управление объектами.
        //          DI - Dependency Injection.
        // Example:
        // ----------------------------------
        //                _ Please give me object of Pet
        // Class Test1 <-()-> Spring Container     -> configuration file   [ -> Dog
        //                ^ Get the object of Pet                            -> Cat ]
        // ----------------------------------
        //      Configurations:
        //          XML (old)
        //          Annotation + XML
        //          Java code

        Inversion of Control
        Spring Bean (или просто bean) - это объект, который создается и управляется Spring Container(SP).
        ApplicationContext(AC) представляет собой Spring Container.
        AC нужен для получения bean из SP.

            ClassPathXmlApplicationContext context =
                        new ClassPathXmlApplicationContext("applicationContext.xml");
                Pet pet = context.getBean("myPet", Pet.class);

    // Dependency Injection (DI)
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
        //  DI - аутсорсинг добавления\внедрения зависимостей.
            DI -  делает объекты нашего прилож. слабо зависимыми друг от друга.
                // Methods injection dependency:
                    with  construct
                    setters
                    'Autowiring'

