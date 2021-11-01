package lab3;

import pets.*;
import queue.*;

import java.io.PrintStream;
import java.io.IOException;
import java.io.OutputStream;

class Main {

  public static void main(String[] args) {
    try {
      OutputStream stream = new PrintStream(System.out);

      Queue<? extends A> testQueue = Queue.produce();
      testQueue.print(stream, "Produced queue:");
      stream.write('\n');

      stream.write("Consumed queue:\n".getBytes());
      Queue.consume(testQueue, stream);

    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}