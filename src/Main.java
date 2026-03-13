import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

//        Lesson5 task1 = new Lesson5 ();
//        task1.method("Nigar");
//
//        Lesson5 task1=new Lesson5();
//        int[] nums = {5, 12, 8, 20, 3};
//        task1.method(nums);

//          Lesson5 task1=new Lesson5();
//          task1.method("Nigar");

//        Lesson5 task = new Lesson5();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("1 reqem daxil edin:");
//        int number= sc.nextInt();
//        int result = task.method(number);
//        System.out.println("Sonuncu reqem:"+ result);

//        Lesson5 task = new Lesson5();
//        int[] nums = {5, 12, 8, 5, 3};
//        task.method(nums);

//        Lesson6 task =new Lesson6() ;
//        System.out.println(task.Palindrome(121));

//        Lesson6 task = new Lesson6();
//        int netice = task.edediOrta(3, 5, 7);
//
//        System.out.println(netice);
//    }

//        Lesson6 task = new Lesson6();
//        task.faktorial(4);

//        Lesson6 task = new Lesson6();
//        task.sadeMurekkeb(12);

//        Lesson6 task = new Lesson6("Nigar");
//        task.sayHi();
//        task.sayBye();

//        Lesson7 telebe1 = new Lesson7("Nigar",21);
//        Lesson7 telebe2 = new Lesson7("Fidan" ,19);

//        Engine engine = new Engine("V6");
//        CarDetails car = new CarDetails(
//                "BMW",
//                2020,
//                35000,
//                "Black",
//                engine
//        );
//
//        car.showInfo();
//
//        Adress adress1 = new Adress("Baku", "Nizami Street");
//        Adress adress2 = new Adress("Sumgait","Saray");
//        Student student1 = new Student("Nigar", 21, adress1);
//        Student student2= new Student("Fidan",19,adress2);
//-----------------------------------------------------------------------------------------------------
//        Lesson7 obj = new Lesson7();
//
//        int[] numbers = {5, 12, 3, 8, 21, 7};
//        int max = obj.Arr(numbers);
//
//        System.out.println("Max: " + max);
//
//-----------------------------------------------------------------------------------------------------
//    Lesson7 child = new Lesson7();
//   child.method();
//

//        Student s = new Student( "Alisa",5);
//        s.sayHi();
//        s.showGrade();


//        Director d = new Director("Nigar", 3000, 500, 100000);
//
//        System.out.println("Name: " + d.name);
//        System.out.println("Salary: " + d.salary);
//        System.out.println("Bonus: " + d.bonus);
//        System.out.println("Company Budget: " + d.companyBudget);


//                Car car = new Car();
//                car.move();
//                car.drive();


//        Square s = new Square("Red",5);
//        s.printColor();
//        s.printSquareInfo();
//        System.out.println("Area result: "+s.area());
//
//        Circle c =new Circle("Blue",4);
//        c.printColor();
//        c.printCircleInfo();
//        System.out.println("Area result: "+c.area());


//        EBook electron = new EBook("Java Guide", "Education", 250, 5.2, "PDF");
//        electron.bookInfo();
//        PrintedBook printed = new PrintedBook("Harry Potter", "Fantasy", 400, 0.8, "Hardcover");
//        printed.bookInfo();


//        Scanner sc = new Scanner(System.in);
//        AdvancedCalculator calc = new AdvancedCalculator();
//        System.out.print("Birinci ədədi daxil edin: ");
//        int a = sc.nextInt();
//        System.out.print("İkinci ədədi daxil edin: ");
//        int b = sc.nextInt();
//        System.out.print("Əməliyyatı daxil edin (add, sub, mul, div): ");
//        String operation = sc.next();
//        switch (operation) {
//            case "add":
//                System.out.println("Nəticə: " + calc.add(a, b));
//                break;
//            case "sub":
//                System.out.println("Nəticə: " + calc.subtract(a, b));
//                break;
//            case "mul":
//                System.out.println("Nəticə: " + calc.multiply(a, b));
//                break;
//            case "div":
//                System.out.println("Nəticə: " + calc.divide(a, b));
//                break;
//            default:
//                System.out.println("Yanlış əməliyyat daxil etdiniz!");
//        }


//        Laptop myLaptop = new Laptop("Laptop");
//        myLaptop.analyzeRAM();


//        Admin admin = new Admin(3);
//        admin.inputUsernames();
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Login yoxlaması üçün username daxil edin: ");
//        String loginName = sc.nextLine();
//        admin.checkLogin(loginName);


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Bildiriş növü daxil edin (email/sms): ");
//        String type = sc.nextLine();
//        System.out.println("Mesaj daxil edin: ");
//        String msg = sc.nextLine();
//        if(type.equals("email")){
//            EmailNotification email = new EmailNotification(msg);
//            email.send();
//        } else if (type.equals("sms")) {
//            SmsNotification sms = new SmsNotification(msg);
//            sms.send();
//        } else {
//            System.out.println("Yanlış növ daxil etdiniz!");
//        }


//        Shape s1 = new Circle("Red", 3.5);
//        Shape s2 = new Square("Blue", 4);
//        s1.draw();
//        s2.draw();


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nə sürürsüz? (car/bike): ");
//        String type = sc.nextLine();
//        if (type.equals("car")){
//            Car car = new Car();
//            car.start();
//        } else if (type.equals("bike")) {
//            Bike bike = new Bike();
//            bike.start();
//        }else {
//            System.out.println("Yanlis secim!");
//            return;
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter payment type (cash/card): ");
//        String type = sc.nextLine();
//        if (type.equals("cash")) {
//            Payment pay = new CashPayment();
//            pay.pay();
//        } else if (type.equals("card")) {
//            Payment pay = new CardPayment();
//            pay.pay();
//        } else {
//            System.out.println("Invalid payment type!");
//            return;
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Birinci ədədi daxil edin: ");
//        double a = sc.nextInt();
//        System.out.print("İkinci ədədi daxil edin: ");
//        double b = sc.nextInt();
//        System.out.print("Əməliyyat seç (+, -, *, /): ");
//        String op = sc.next();
//        Operation operation;
//        switch (op) {
//            case "+":
//                operation = new AddOperation();
//                break;
//            case "-":
//                operation = new SubOperation();
//                break;
//            case "*":
//                operation = new MulOperation();
//                break;
//            case "/":
//                operation = new DivOperation();
//                break;
//            default:
//                System.out.println("Yanlış əməliyyat seçimi!");
//                return;
//        }
//        double result = operation.calculate(a, b);
//        System.out.println("Nəticə: " + result);


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Fayl tipini daxil edin (pdf/word/txt): ");
//        String type = sc.nextLine();
//        Document doc;
//        if (type.equals("pdf")) {
//            doc = new PdfDocument();
//        } else if (type.equals("word")) {
//            doc = new WordDocument();
//        } else if (type.equals("txt")) {
//            doc = new TextDocument();
//        } else {
//            System.out.println("Yanlış tip daxil edildi! Default document seçildi.");
//            doc = new Document();
//        }
//        doc.read();


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Məhsul tipi seçin (regular/student/vip): ");
//        String type = sc.nextLine();
//        System.out.print("Məhsulun baza qiymətini daxil edin: ");
//        double price = sc.nextDouble();
//        Product product;
//        if (type.equals("regular")) {
//            product = new RegularProduct(price);
//        } else if (type.equals("student")) {
//            product = new StudentProduct(price);
//        } else if (type.equals("vip")) {
//            product = new VipProduct(price);
//        } else {
//            System.out.println("Yanlış məhsul tipi! Default: RegularProduct seçildi.");
//            product = new RegularProduct(price);
//        }
//        System.out.println("Son qiymət: " + product.getPrice());


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Username: ");
//        String username = sc.nextLine();
//        System.out.print("Password: ");
//        String password = sc.nextLine();
//        Auth a;
//        if (username.equals("admin") && password.equals("1234")) {
//            a = new AdminAuth();
//        } else if(username.equals("user") && password.equals("0000")) {
//            a = new UserAuth();
//        }else{
//            a= new Auth();
//        }
//        boolean result = a.authenticate(username, password);
//        if (result) {
//            System.out.println("Login successful!");
//        } else {
//            System.out.println("Login failed!");
//        }


//        Scanner sc = new Scanner(System.in);
//        System.out.print("Encoder tipi seçin (upper/lower/reverse): ");
//        String type = sc.nextLine().toLowerCase();
//        System.out.print("Mətni daxil edin: ");
//        String text = sc.nextLine();
//        Encoder encoder;
//        if (type.equals("upper")) {
//            encoder = new UpperCaseEncoder();
//        } else if (type.equals("lower")) {
//            encoder = new LowerCaseEncoder();
//        } else if (type.equals("reverse")) {
//            encoder = new ReverseEncoder();
//        } else{
//            encoder = new Encoder();
//        }
//        String result = encoder.encode(text);
//        System.out.println("Encoded text: " + result);


//
//        FullTimeEmployee emp = new FullTimeEmployee("Nigar", 2000.0);
//        emp.printInfo();


//        Car car = new Car("Toyota", 220);
//        car.printInfo();

//        Device phone = new Phone("Redmi", "14");
//        phone.info();


//        Scanner sc = new Scanner(System.in);
//        System.out.println("Transport adi daxil edin (train/Plane");
//        String type = sc.nextLine().toLowerCase();
//        Transport t;
//        if (type.equals("train")) {
//            t = new Train();
//        } else if (type.equals("plane")) {
//            t = new Plane();
//        } else {
//            System.out.println("Yanlış tip daxil edildi! Default Transport seçildi.");
//            t = new Transport();
//        }
//        t.move();
//
//        Encapsulation encapsulation = new Encapsulation();
//        encapsulation.setAge(21);
//        System.out.println( "Yas: "+ encapsulation.getAge());
//        encapsulation.setName("Nigar");
//        System.out.println("Ad: "+ encapsulation.getName());
//        encapsulation.callPrivateMethod();

//        Person person = new Person();
//        person.setName("Nigar");
//        person.sayHi();

//
//        Calculator c = new Calculator();
//        System.out.println("2 qati: " + c.privDouble(5));
//        System.out.println("3 qati: " + c.tripleNumber( 5));


//        Dog dog = new Dog();
//        dog.sound();

//        Tools t = new Tools();
//        t.printMessage();

//        Student s = new Student();
//        s.setName("Nigar");
//        System.out.println("Ad: "+ s.getName());
//        s.setAge(21);
//        System.out.println("Yas: "+ s.getAge());

//        BankAccount acoount = new BankAccount();
//        acoount.setBalance(50);
//        acoount.deposit(20);
//        acoount.withdraw(30);
//        System.out.println("Balans: "+acoount.getBalance());


//        Product p = new Product();
//        p.setPrice(-10);
//        p.getPrice();

//        System.out.println( Abstract.name);
//        Abstract.sayHi();

//        Shape s = new Square ("Red", 20) ;
//        System.out.println( s.area());
//        Shape c = new Circle("Blue", 10);
//        System.out.println( c.area());


//        Student s1 = new Student();
//        Student s2 = new Student();
//        Student s3 = new Student();
//
//        System.out.println("Student count: " + Student.count);

//        Config.printName();


//        Device device = new Phone("Xiaomi", "Redmi");
//
//        device.info1();
//        device.start();


//        Employee dev = new Developer("Nigar", 1500);
//        Employee des = new Designer("Kamran", 1200);
//        Employee emp = new Employee("Aygun", 1000);
//        HRUtils.printEmployeeInfo(dev);
//        HRUtils.printEmployeeInfo(des);
//        HRUtils.printEmployeeInfo(emp);


//        Student s1 = new Student("Nigar");
//        Student s2 = new Student("Aysel");
//        Student s3 = new Student("Gunay");
//        System.out.println(s1.getName() + " - " + s1.university);
//        System.out.println(s2.getName() + " - " + s2.university);
//        System.out.println(s3.getName() + " - " + s3.university);
//        System.out.println("Umumi say: "+Student.count);


//        Animal[] arr= {new Dog(),new Cat()};
//for(int i=0; i < arr.length;i++){
//    arr[i].sound();
//}

//
//        Product[] items = {
//                new Electronics("Laptop", 2000),
//                new Clothes("Jacket", 100)
//        };
//
//        for (int i = 0; i < items.length; i++) {
//            System.out.println(items[i].name + " final price: " + items[i].getFinalPrice());
//        }


//
//        System.out.println("Sum: " + DataTools.sum(5, 10, 15));
//        System.out.println("Average: " + DataTools.average(5, 10, 15));
//        System.out.println("Max: " + DataTools.max(5, 10, 15));
//        System.out.println("Min: " + DataTools.min(5, 10, 15));

//        PaymentProcessor cc = new CreditCardProcessor();
//        PaymentProcessor pp = new PayPalProcessor();
//        cc.process(50);
//        pp.process(100);

//        UserLogger logger= new UserLogger();
//        UserService service = new UserService(logger);
//        User1 u1 = new User1("Nigar");
//        service.createUser(u1);
//        service.deleteUser(u1);


//        ReverseText text = new ReverseText();
//        System.out.println(text.reverseString("Nigar").toLowerCase());

//        String word = "hELLo";
//        String result = "";
//        for (int i = 0; i < word.length(); i++) {
//            char ch = word.charAt(i);
//
//            if (i == 0) {
//                result += Character.toUpperCase(ch);
//            } else {
//                result += Character.toLowerCase(ch);
//            }
//        }
//        System.out.println(result);

//     FirstChar("Nigar");

//        Scanner sc = new Scanner(System.in);
//        System.out.print("3 reqemli eded daxil edin: ");
//        int n = sc.nextInt();
//        int sum =0;
//    for(; n>0;n/=10){
//        sum+=n%10;
//    }
//        System.out.println(sum);

//
//ucreqemli(123);

//        int[] arr={2,5,54,6,4,8,67};
//        enBoyuk(arr);


//        int[] arr={1,2,3,4,5,6,7,8,9};
//        for(int a: arr){
//            if(a%2==0){
//                System.out.println(a);
//            }
//        }


//        String[] arr={"Aysel","Nigar","Fidan"};
//        for(String a:arr){
//            if(a.equals("Nigar")){
//                System.out.println(a);
//            }
//        }

//        Scanner sc = new Scanner(System.in);
//        System.out.println("Ad,Soyad,Yas daxil edin: ");
//        String text = sc.nextLine();
//        String[] arr = text.split(" ");
//        for (String s : arr) {
//            System.out.println(s);
//        }


//
//        System.out.println(FirstSymbolToUpper("niGAr"));


//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Svetafor rəngi daxil et: ");
//        String input = scanner.nextLine().toUpperCase();
//        if (input.equals("RED")) {
//            System.out.println(TrafficLight.RED.getMeaning());
//        }
//        else if (input.equals("YELLOW")) {
//            System.out.println(TrafficLight.YELLOW.getMeaning());
//        }
//        else if (input.equals("GREEN")) {
//            System.out.println(TrafficLight.GREEN.getMeaning());
//        }
//        else {
//            System.out.println("Yanlış rəng daxil etdiniz!");
//        }


//
//        String text = null;
//        try {
//            System.out.println(text.length());
//        } catch (NullPointerException e) {
//            System.out.println(e.getMessage());
//        }

//        Random rand = new Random();
//        int randomNumber = rand.nextInt(1, 10);
//        System.out.println(randomNumber);
//        Scanner sc = new Scanner(System.in);
//        boolean tekrarlanir = false;
//        int[] numbers = new int[5];
//        int index = 0;
//        int heal = 5;
//        while (heal > 0) {
//            System.out.println("1-10 arasinda 1 reqem daxil et: ");
//            int choice = sc.nextInt();
//            try {
//                for (int s : numbers) {
//                    if (choice == s) {
//                        tekrarlanir = true;
//                    }
//                }
//                if (tekrarlanir) {
//                    tekrarlanir = false;
//                    System.out.println("Bu eded daha once daxil olunub qalan haqq: " + heal);
//                    continue;
//                }
//                if (choice == randomNumber) {
//                    System.out.println("Duzgundur");
//                    break;
//                } else {
//                    heal--;
//                    numbers[index] = choice;
//                    index++;
//                    throw new ValidGuessException("daxil edilen eded texminle ust uste dusmur qalan haqq: " + heal);
//                }
//            }catch (ValidGuessException e){
//                System.out.println(e.getMessage());
//            }
//        }


//        int heal = 5;
//        Scanner sc = new Scanner(System.in);
//
//        while (heal>0) {
//            try {
//                System.out.println("1 deyer daxil edin: ");
//                String value = sc.nextLine();
//                int a = Integer.parseInt(value);
//                System.out.println("daxil edilen eded: " + a);
//                break;
//            } catch (NumberFormatException e) {
//                heal--;
//                System.out.println(e.getMessage() + "  can: "+ heal);
//            }
//        }


//int[] array ={1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};
//int target=6;
//int left=0;
//int right= array.length-1;
//while (left<=right){
//    int mid= left+(right-left)/2;
//    if (array[mid] == target){
//        System.out.println("hedef tapildi");
//        break;
//    } else if (array[mid]<target) {
//        left=mid+1;
//    }else{
//        right=mid-1;
//    }
//}


//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(21);
//        numbers.add(16);
//        numbers.add(22);
//        numbers.add(73);
//        numbers.add(86);
//        numbers.add(35);
//        List<Integer> tekler = new ArrayList<>();
//        List<Integer> cutler = new ArrayList<>();
//        for (Integer num : numbers) {
//            if (num % 2 == 0) {
//                cutler.add(num);
//            } else {
//                tekler.add(num);
//            }
//        }
//        System.out.println("Siyahi " + numbers);
//        System.out.println("Cutler: " + cutler);
//        System.out.println("Tekler: " + tekler);


//        ArrayList<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(2);
//        list.add(2);
//        list.add(3);
//        list.add(1);
//        list.add(3);
//        list.add(3);
//        for (int i = 0; i < list.size(); i++) {
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(i).equals(list.get(j))) {
//                    list.remove(j);
//                    j--;
//                }
//            }
//        }
//        System.out.println(list);


//
//            ArrayList<String> fruits = new ArrayList<>();
//            fruits.add("alma");
//            fruits.add("armud");
//            fruits.add("armud");
//            fruits.add("banan");
//            fruits.add("alma");
//            fruits.add("banan");
//            fruits.add("banan");
//
//            Scanner scanner = new Scanner(System.in);
//            System.out.print("Meyvenin adin daxil et: ");
//            String fruitName = scanner.nextLine();
//
//            int count = 0;
//            for (String fruit : fruits) {
//                if (fruit.equals(fruitName)) {
//                    count++;
//                }
//            }
//
//            System.out.println(fruitName +" "+ count + " dene var.");


//        int[][] numbers = {
//                {1, 2, 3},
//                {4, 5, 6},
//                {7, 8, 9}
//        };
//        for (int i = 0; i < numbers.length; i++) {
//            for (int j = 0; j < numbers[i].length; j++) {
//                System.out.print(numbers[i][j] + " ");
//            }
//        }

//        int[][][] array = {
//                {
//                        {1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}
//                },
//                {
//                        {13, 1, 4, 15, 16}, {17, 18, 19, 20}
//                },
//                {
//                        {21, 22, 23, 24, 25}
//                }
//        };
//        System.out.println(array[2][0][3]);


//        Map<String, Map<String,Integer>> orders = new HashMap<>();
//        orders.put("Nigar",Map.of("Telefon",5));
//        orders.put("Fidan",Map.of("Planset",3));
//        orders.put("Gunay",Map.of("Komputer",7));
//        orders.put("Gunel",Map.of("Komputer",1));
//        int sum=0;
//        int maxOrder=0;
//        String topCustomer="";
//for (  Map.Entry<String, Map<String,Integer>> order: orders.entrySet()){
//    String customer = order.getKey();
//    Map<String, Integer> products = order.getValue();
//
//    for (Map.Entry<String, Integer> product : products.entrySet()) {
////        System.out.println(
////                customer + " -> " +
////                        product.getKey() + " : " +
////                        product.getValue()
////        );
//         sum+=product.getValue();
//        if (product.getValue() > maxOrder) {
//            maxOrder = product.getValue();
//            topCustomer = customer;
//        }
//        if (product.getValue()<=2){
//            orders.remove(order.getKey());
//        }
//    }
//}
//int average = sum/ orders.size();
//        System.out.println("Ortalama: " + average);
//        System.out.println("Ən çox məhsul alan istifadəçi: " + topCustomer);
//        System.out.println(orders);


//    public static String FirstSymbolToUpper(String name){
//        return name.substring(0,1).toUpperCase()+name.substring(1).toLowerCase();
//    }


//    public static void enBoyuk(int arr[]){
//        int max=arr[0];
//        for (int i=0; i< arr.length;i++){
//            if(arr[i]>max){
//                max=arr[i];
//            }
//        }
//        System.out.println(max);
//    }

//        System.out.println(min);
//    public static  void ucreqemli(int n){
//        int sum =0;
//        for(; n>0;n/=10){
//            sum+=n%10;
//        }
//        System.out.println(sum);
//    }

//    public static void FirstChar(String str) {
//        String result = "";
//        for (int i = 0; i < str.length(); i++) {
//            char ch = str.charAt(i);
//
//            if (i == 0) {
//                result += Character.toUpperCase(ch);
//            } else {
//                result += Character.toLowerCase(ch);
//            }
//        }
//
//        System.out.print(result);
//
//    }


//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.stream()
//                .filter(n -> n % 2 != 0)
//                .forEach(System.out::println);


//        List<String> words = new ArrayList<>();
//        words.add("ADA");
//        words.add("UNEC");
//        words.add("AZTU");
//        words.add("BDU");
//        words.stream()
//                .filter(n-> n.startsWith("A"))
//                .forEach(System.out::println);

//
//        List<Integer> numbers = new ArrayList<>();
//        numbers.add(1);
//        numbers.add(2);
//        numbers.add(3);
//        numbers.add(4);
//        numbers.add(4);
//        numbers.add(5);
//        numbers.add(5);
//        numbers.add(6);
//        numbers.add(6);
//        numbers.add(7);
//        numbers.stream()
//                .distinct().forEach(System.out::println);


//        List<Integer> numbers=List.of(1,2,3,4,5,6,7);
//        numbers.stream().forEach(
//                (e) -> {
//                   if (e>max){
//                       max=e;
//                   }
//                }
//        );
//        System.out.println(max);
//

//List<Integer> list =List.of(1,2,3,4,5,6,7,8,9);
//for(int i: list){
//    System.out.println( i%2==0 ? i + " Cut":  i +  " Tek");


//        List<Integer> list =List.of(1,2,3,4,6,9,2,5,6,7,8,9);
//        List<Integer> tekrarlananlar= new ArrayList<>();
//        list.stream().forEach(
//                (e)-> {
//                    if (Collections.frequency(list, e) > 1 && !tekrarlananlar.contains(e)) {
//                        tekrarlananlar.add(e);
//                    }
//                }
//        );


//        List<String> list = List.of("asd","asdf","asdfghy","qwer","qwertyu");
//        var s = list.stream()
//                .reduce((s1,s2)->s1.length()>=s2.length()?s1:s2);
//        System.out.println(s);


//        List<String> list = List.of("asd","asdf","asdfghy","qwer","qwertyu","adsfghj","zxxcvbnm");
//        list.stream()
//                .limit(5)
//                .forEach(System.out::println);


//        List<Integer> list =List.of(1,2,3,4,6,9,2,5,6,7,8,9);
//        list.stream().forEach(e -> m = e * m);
//        System.out.println("Hasil: " + m);
//
//        list.stream().forEach(e -> s = s + e);
//        System.out.println("Cəm: " + s);
//
//    }
//
//    static int m = 1;
//    static int s = 0;


//        Map<String, Integer> students = Map.of(
//                "Ali", 75,
//                "Nigar", 90,
//                "Murad", 82,
//                "Aysel", 68,
//                "Kamal", 95
//        );
//        students.entrySet().stream().filter(e->e.getValue()>80).forEach(
//                (e) -> System.out.println(e.getKey()+" "+e.getValue())
//        );


//
//        Map<String, Integer> students = Map.of(
//                "Ali", 45,
//                "Nigar", 90,
//                "Murad", 38,
//                "Aysel", 68,
//                "Kamal", 95
//        );
//
//        students.entrySet()
//                .stream()
//                .filter(e -> e.getValue() < 50)
//
//                .forEach(e ->
//                        System.out.println(e.getKey() + " - kesildiniz")
//                );
//      long kesilenSayi = students.entrySet()
//                .stream()
//                .filter(e -> e.getValue() < 50)
//                .count();
//
//        System.out.println("Kesilenlerin sayi: " + kesilenSayi);


//        Map<String, Integer> students = Map.of(
//                "Ali", 45,
//                "Nigar", 90,
//                "Murad", 38,
//                "Aysel", 68,
//                "Kamal", 95
//        );
//        List<String> key= new ArrayList<>();
//
//        students.entrySet()
//                .stream()
//                .forEach(e->{
//                    if (e.getValue()<50){
//                        key.add(e.getKey());
//                    }
//                });
//        System.out.println(key);
//
//        for (String a:key){
//            students.remove(a);
//        }
//        System.out.println(students );


//
//        Map<String, Double> employees = new HashMap<>();
//        employees.put("Ali", 850.0);
//        employees.put("Nigar", 1200.5);
//        employees.put("Murad", 950.0);
//        employees.put("Aysel", 1500.0);
//        employees.put("Kamal", 1000.0);
//
//    employees.entrySet()
//            .stream().filter(e->e.getValue()>=1000)
//            .forEach(e-> System.out.println(e.getKey()+" " +e.getValue()));


//        Map<String, Double> employees = new HashMap<>();
//        employees.put("Ali", 850.0);
//        employees.put("Nigar", 1200.5);
//        employees.put("Murad", 950.0);
//        employees.put("Aysel", 1500.0);
//        employees.put("Kamal", 1000.0);
//        employees.entrySet()
//                .stream()
//                .filter((e)->e.getValue()>1000)
//                .map((e) ->  e.getKey())
//                .toList()
//                        .forEach((e) -> employees.remove(e));
//
//        employees.entrySet()
//                .stream().forEach(e-> sum+=e.getValue());
//
//int average=sum/ employees.size();
//        System.out.println(average);


//        IntStream.rangeClosed(1, 100)
//                .map(n -> n * 10)
//                .filter(n->n>300)
//                .boxed().sorted(Collections.reverseOrder())
//                .forEach(System.out::println);


//        List<Integer> numbers = new ArrayList<>();
//        for (int i=0; i<=100;i++){
//            int value = i * 10;
//            if (value > 300) {
//                numbers.add(value);
//            }
//        }
//        Collections.sort(numbers, Collections.reverseOrder());
//        for (int n : numbers) {
//            System.out.println(n);
//        }


//        List<String> list = new ArrayList<>();
//        list.add("Java");
//        list.add("Python");
//        list.add("C++");
//        Iterator<String> iterator = list.iterator();
//        while (iterator.hasNext()) {
//            String element = iterator.next();
//            System.out.println(element);
//        }


//        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9);
//        Iterator<Integer> iterator= list.iterator();
//        int max = 0;
//        int min = list.get(0);
//
//
//        while (iterator.hasNext()) {
//            int current = iterator.next();
//
//
//                if (current > max) {
//                    max = current;
//                }
//                if (current<min){
//                    min = current;
//                }
//
//        }
//        System.out.println("Max: " + max);
//        System.out.println("Min: " + min);




        Scanner sc = new Scanner(System.in);
        ArrayList<String> adlar = new ArrayList<>();

        while (true) {
            String ad = sc.nextLine();
            if (ad.equals("exit")) break;
            if (!adlar.contains(ad)) adlar.add(ad);
        }

        String enUzun = "";
        for (String ad : adlar)
            if (ad.length() > enUzun.length()) enUzun = ad;

        System.out.println(adlar);
        System.out.println(adlar.size());
        System.out.println(enUzun);



    }
}