public class Drawing {
    private static Drawing instance;

    public Drawing(){
    }

    public void DrawShape(Shape shape){
        System.out.println("Drawing a " + shape.getClass().getSimpleName() + " with color: " + shape.getColor() + " and area: " + shape.calculateArea());
    }

    public static Drawing getInstance(){
        if (instance == null){
            instance = new Drawing();
        }

        return instance;
    }
}