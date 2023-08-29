class animal{
    public static void main (String[] args){
        bird bird = new bird();
        bird.fly();
        bird.walk();

        dog bulldog = new dog();
        bulldog.run();
        bulldog.bark();
    }
}

class dog extends animal{
    public void run(){
        System.out.println("I am running");
    }
    public void bark(){
            System.out.println("bark! bark!");
    }

}