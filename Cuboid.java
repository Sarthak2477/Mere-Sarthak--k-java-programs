public class Cuboid {
    private float length,width, height;
    
    
    public Cuboid() {
        this.length = 1.0f;
        this.width = 1.0f;
        this.height = 1.0f;
    }

    public Cuboid(float length, float width, float height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cuboid(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        return "Length: " + this.length + "\nWidth: "+ this.width + "\nHeight: " + this.height;
    }

    public static void main(String[] args) {
        
    }
}
