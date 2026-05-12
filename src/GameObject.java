public class GameObject {
    private static int total = 1;
    private String type;
    private String name;
    private int id;
    GameObject(String Type,String Name){
        this.type = Type;
        this.name = Name;
        this.id = total;
        total++;
    }

    public void interact(GameObject o){
        if (type.equals("player") || type.equals("enemy") ){
            if (o.getType().equals("enemy") || o.getType().equals("player")){
                System.out.println(name + " is attacking the " + o.getName());
            }else if (o.getType().equals("object")){
                System.out.println(name + " is examining the " + o.getName());
            }
        }
    }

    public void update(){
        if (type.equals("player")){
            System.out.println(name + " moved");
        } else if (type.equals("enemy")) {
            System.out.println(name + " moved toward the player");
        } else if (type.equals("object")) {
            System.out.println(name + " is standing still");
        }
    }

    public  void render(){
        if (type.equals("player")){
            System.out.println(name + " rendered in blue");
        } else if (type.equals("enemy")) {
            System.out.println(name + " rendered in red");
        } else if (type.equals("object")) {
            System.out.println(name + " rendered in gray");
        }
    }

    public  String getType(){
        return type;
    }

    public String getName(){
        return name;
    }

    public String getAll(){
        return id +" " + type +" "+ name;
    }
}