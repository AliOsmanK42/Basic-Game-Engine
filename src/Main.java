public class Main {
    public static  void main(String[] args){
    GameObject goblin = GameObjectFactory.create("enemy","goblin");
    GameObject player = GameObjectFactory.create("player","human");
        System.out.println(goblin.getAll());;
        goblin.render();
        goblin.update();
        goblin.interact(player);
    }
}
