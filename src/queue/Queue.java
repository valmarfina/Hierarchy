package queue;

import pets.*;

import java.io.IOException;
import java.io.OutputStream;
import java.util.LinkedList;

public class Queue<T> {
  private final int size;
  private final LinkedList<T> queue;

  public Queue(int size) {
    this.size = size;
    queue = new LinkedList<>();
  }

  private Queue(LinkedList<T> list) {
    this.queue = list;
    this.size = list.size();
  }

  public T get() {
    if (isEmpty()) {
      throw new RuntimeException("Queue is empty!");
    } else {
      T temp = queue.get(0);
      queue.remove(temp);
      return temp;
    }
  }

  public void add(T elem) {
    if (!isFull()) {
      queue.add(elem);
    } else {
      throw new RuntimeException("Queue is full!");
    }
  }

  public boolean isEmpty() {
    return queue.isEmpty();
  }

  public boolean isFull() {
    return queue.size() == this.size;
  }

  public void print(OutputStream out, String className) throws IOException {
    out.write(String.format("queue of %s:\n", className).getBytes());
    for (T pets : queue) {
      String str = pets.getClass().getName();
      out.write(String.format("%s\n", str).getBytes());
    }
    out.write('\n');
  }

  public static Queue<? extends A> produce() {
    Queue<A> petsQueue = new Queue<>(11);

    petsQueue.add(new AB());
    petsQueue.add(new ABC());
    petsQueue.add(new ABCD());
    petsQueue.add(new AB_D());
    petsQueue.add(new AB_DE());
    petsQueue.add(new AB_DEF());
    petsQueue.add(new AB_DEFG());
    petsQueue.add(new A_C());
    petsQueue.add(new A_CDE());
    petsQueue.add(new A_CDF());
    petsQueue.add(new A_CDEF());

    return petsQueue;
  }

  public static void consume(Queue<? extends A> petsQueue, OutputStream out) throws IOException {
    if (petsQueue.isEmpty()) {
      return;
    }
    LinkedList<A> list_1 = new LinkedList<>();
    LinkedList<A> list_2 = new LinkedList<>();

    for (A pet : petsQueue.queue) {
      if ((isParent(pet, AB_DEFG.class))) {
        list_1.add(pet);
      }
      if ((isParent(pet, ABCDE.class))) {
        list_2.add(pet);
      }
    }

    Queue<? super AB_DEFG> queue_1 = new Queue<>(list_1);
    queue_1.print(out, AB_DEFG.class.getName());

    Queue<? super ABCDE> queue_2 = new Queue<>(list_2);
    queue_2.print(out, ABCDE.class.getName());
  }

  private static boolean isParent(A parent, Class<? extends A> child) {
    if (parent == null) {
      return false;
    }
    Class<?> current = child;
    while (current != A.class) {
      if (current == parent.getClass()) {
        return true;
      }
      current = current.getSuperclass();
    }
    return false;
  }
}
