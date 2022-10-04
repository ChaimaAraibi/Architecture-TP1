

public class Pool
{
    public void run()
    {
        IDuck donaldDuck = new Duck();
        IDuck electricDuck = new ElectronicDuck();
        quack(donaldDuck, electricDuck);
        swim(donaldDuck, electricDuck);
    }

    private void quack(Duck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
            duck.quack();
            }
            catch(Exception e){
                print (e.getMessage())
                }
        }
    }

    private void swim(IDuck... ducks)
    {
        for (IDuck duck : ducks) {
            try {
            duck.swim();
            }
             catch(Exception e){
                print (e.getMessage())
                }
        }
    }

    public static void main(String[] args)
    {
        Pool pool = new Pool();
        pool.run();
    }
}
