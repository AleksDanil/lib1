package lib.declarations.sam;

public class SAM {
    public interface SAMInterface {
        void onEvent(int event);
    }

    public static class SomeJavaClass {
        public void setListener(SAMInterface listener) {}
    }
}
