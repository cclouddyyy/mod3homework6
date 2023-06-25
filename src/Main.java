public class Main {
    public static void main(String[] args) {
        PriorityQueue myQueue = new PriorityQueue(5);

        myQueue.insert(10);
        myQueue.insert(20);
        myQueue.insert(30);
        myQueue.insert(40);
        myQueue.insert(50);

        System.out.print("Элементы очереди: ");
        while (!myQueue.isEmpty()) {
            int item = myQueue.remove();
            System.out.print(item + " ");
        }
    }
}