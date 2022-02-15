package Day2;

//Interface is a Contract for number of classes

interface smartphone{
    void takephoto();
    void browse();
    void videoCall();
    void makecall();
}
interface ios extends smartphone{
    void featuredQualitySet();
}

public abstract class Interface implements ios {
    public static void main(String[] args) {
    }

    ios vivo = new ios() {

        public void takephoto() {
            System.out.println("Take a Photo.");

        }

        public void browse() {
            System.out.println("Browse specific information from user.");

        }

        public void videoCall() {
            System.out.println("Make a Video Call.");

        }

        public void makecall() {
            System.out.println("Make a call.");
        }

        public void featuredQualitySet() {
            System.out.println("Featured Quality Set.");
        }
    };
};