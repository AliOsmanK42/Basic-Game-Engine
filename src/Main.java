public class Main {
    public static  void main(String[] args){
    GameObject goblin = new GameObject("enemy","goblin");
    GameObject player = new GameObject("player","human");
        System.out.println(goblin.getAll());;
        goblin.render();
        goblin.update();
        goblin.interact(player);
    }
}
