// 01_LibrarySystem.java
interface Library {
void setDue(String dueDate);
void updateDue(String newDueDate);
int calculateDue(); // returns number of days until due (simple stub)
}


class Book implements Library {
private String title;
private String dueDate; // format: YYYY-MM-DD (not parsed strictly)


public Book(String title) {
this.title = title;
this.dueDate = "";
}


@Override
public void setDue(String dueDate) {
this.dueDate = dueDate;
System.out.println(title + " due date set to " + dueDate);
}


@Override
public void updateDue(String newDueDate) {
this.dueDate = newDueDate;
System.out.println(title + " due date updated to " + newDueDate);
}


@Override
public int calculateDue() {
// Simple placeholder: return fixed value
return 7; // assume 7 days until due
}


public static void main(String[] args) {
Book b = new Book("Clean Code");
b.setDue("2025-11-15");
b.updateDue("2025-11-22");
System.out.println("Days until due (approx): " + b.calculateDue());
}
}
