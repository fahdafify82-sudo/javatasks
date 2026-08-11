//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    Queue<Integer> queue=new LinkedList<>();
    queue.offer(3);
    queue.offer(4);
    queue.offer(5);
    queue.offer(6);
    System.out.println(queue);
    queue.poll();
    System.out.println(queue);
    System.out.println(queue.peek());
    System.out.println(queue);
   
}
