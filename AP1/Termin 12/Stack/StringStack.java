class StringStack {

  private String[] items;
  private int size = 0;

  public StringStack(final int stackSize) {
    items = new String[stackSize];
  }

  public void push(String x) {
    items[size++] = x;
  }

  public String pop() {
    return items[--size];
  }

  public boolean isEmpty() {
    return size == 0;
  }
}
