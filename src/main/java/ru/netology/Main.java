package ru.netology;

public class Main {
  public static void main(String[] args) {
    Server server = new Server();
    server.listen(10000);
  }
}