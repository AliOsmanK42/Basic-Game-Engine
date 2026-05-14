public class GameObjectFactory {
    public static GameObject create(String Type,String Name){
        if (Type.equals("player") || Type.equals("enemy") || Type.equals("object")){

            return new GameObject(Type,Name);
        }
        else {
            throw new IllegalArgumentException("Unknown type : " + Type);
        }
    }
}
