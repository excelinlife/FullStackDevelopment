package excel.in.week1.day4;

interface Living{
    void breathing();
    void eat();
}


class Plant implements Living{

    @Override
    public void breathing() {
        System.out.println("breath through leaves");
    }

    @Override
    public void eat() {
        System.out.println("eat through photo synthesis");
    }
}

class Animal implements Living{
    public int noOfLegs;
    public String colour;
    public boolean isVegetarian;

    public Animal(){
        System.out.println("Animal object created");
    }

    public void breathing(){
        System.out.println("breath through nose");
    }

    public void eat(){
        System.out.println("Eating whatever is good for your health...");
    }

    public void sleep(){
        System.out.println("Sleep as much as you want because yo don't have to go to office...");
    }
}

class Lion extends Animal{
    public void eat(){
        System.out.println("Eating nonveg only...");
    }

    public void sleep(){
        System.out.println("Sleep but be attentive all the time because you are the king...");
    }
}

public class Cow extends Animal {

    public Cow(){
        System.out.println("cow object created");
    }
    public void eat(){
        super.eat();
        System.out.println("Eating only veggies");
    }

    public static void main(String[] args) {
        Cow nandi = new Cow();
        nandi.eat();
        Lion sher = new Lion();
        sher.sleep();

        Plant rose = new Plant();
        rose.breathing();
        rose.eat();
    }
}