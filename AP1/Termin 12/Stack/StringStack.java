class StringStack {

  private String[] a = new String[20];

  private int top = 0;

  public void push(String x)
  {
    a[top++] = x;
  }

  public String pop()
  {
    return a[--top];
  }

  public boolean isEmpty()
  {
    return top == 0;
  }
}
