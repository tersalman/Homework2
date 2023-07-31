public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1 () {
        System.out.println("Задача 1");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);


    }
    public static void task3 () {
        System.out.println("Задача 3");
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);
    }
    public static void task4 () {
        System.out.println("Задача 4");
         var friend = 19;
         System.out.println(friend);
         friend = friend + 2;
         System.out.println(friend);
         friend = friend / 7;
         System.out.println(friend);
    }
    public static void task5 () {
        System.out.println("Задача 5");
         var frog = 3.5;
         System.out.println(frog);
         frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);
    }
    public static void task6 () {
        System.out.println("Задача 6");
         var firstBoxer = 78.2;
         var secondBoxer = 82.7;
         var totalWeightBoxers = firstBoxer + secondBoxer;
         System.out.println(totalWeightBoxers);
         var weightDiff = secondBoxer - firstBoxer;
        System.out.println(weightDiff);
    }
    public static void task7 () {
        System.out.println("Задача 7");
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var weightDiff = secondBoxer - firstBoxer;
        System.out.println(weightDiff);
        var weightDiff2 = secondBoxer % firstBoxer;
        System.out.println(weightDiff2);
    }
    public static void task8 () {
        System.out.println("Задача 8");
         var workingHours = 640;
         var workerHours = 8;
         var workersAmount = workingHours / workerHours;
         System.out.println(workersAmount);
         workersAmount = workersAmount + 94;
         workerHours = workingHours / workersAmount;
         System.out.println("Если в компании работает " + workersAmount + " человек, то всего " + workerHours + " часa работы может быть поделено между сотрудниками.");
    }
}