public class TryWithResources {
    static class Resource implements AutoCloseable {
        public void doWork() {
            System.out.println("Resource doing work");
        }

        @Override
        public void close() {
            System.out.println("Resource closed automatically");
        }
    }

    public static void main(String[] args) {
        try (Resource res = new Resource()) {
            res.doWork();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
