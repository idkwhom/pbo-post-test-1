class Bottle {

    String colour;
    int size;
    
    public Bottle(String colour, int size) {
        this.colour = colour;
        this.size = size;
    }
}

public class Main {
    public static void main(String[] args) throws Exception {
        
        Bottle[] bottles = new Bottle[5];
        
        bottles[0] = new Bottle("merah", 250);
        bottles[1] = new Bottle("hijau", 100);
        bottles[2] = new Bottle("biru", 300);
        bottles[3] = new Bottle("kuning", 300);
        bottles[4] = new Bottle("hitam", 500);

        for (Bottle bottle : bottles) {
            System.out.println("Botol berwarna " + bottle.colour + " memiliki ukuran " + bottle.size + " ml");
        }
    }
}
