package L4HWJava;

public class FDemo {
    int x;
    FDemo (int i) {
        x = i;
    }

        protected void finalize() {
            System.out.println("Finalization " + x);
        }
            void generator(int i){
                FDemo o = new FDemo(i);
            }
        }
