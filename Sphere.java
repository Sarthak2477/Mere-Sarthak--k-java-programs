public class Sphere{
    private float radius;
    
    
    public float getRadius() {
        return radius;
    }
    
    public void setRadius(float radius) {
        this.radius = radius;
    }

    
    public Sphere(float radius) {
        this.radius = radius;
    }

    
    public Sphere() {
        this.radius = 3.25f;
    }

    @Override
    public String toString() {
        return "Radius of " + this.getClass().getName() + " is " + this.radius;
    }

    public static void main(String[] args) {
        Sphere ball = new Sphere(5.25f);
        System.out.println(ball);
    }
}