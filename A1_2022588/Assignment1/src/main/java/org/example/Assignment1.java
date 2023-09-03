package org.example;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Assignment1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("1:Enter as a librarian");
        System.out.println("2:Enter as a member");
        System.out.println("3:Exit");

        List<String> books = new ArrayList<>();
        List<String> author = new ArrayList<>();
        List<Integer> bno = new ArrayList<>();
        List<Integer> bookid = new ArrayList<>();
        List<String> stu = new ArrayList<>();
        List<Integer> stuage = new ArrayList<>();
        List<Long> stuno = new ArrayList<Long>();
        List<List<String>> stubooks = new ArrayList<>();


        System.out.println(books);
        int n = sc.nextInt();
        while (true) {
            if (n == 1) {
                while (true) {
                    System.out.println("1: Register a member");
                    System.out.println("2: Remove a member");
                    System.out.println("3: Add a book");
                    System.out.println("4: Remove a book");
                    System.out.println("5: View all members along with their books and fines to be paid");
                    System.out.println("6: View all books");
                    System.out.println("7: Back");
                    int l = sc.nextInt();
                    if (l == 1) {
                        System.out.print("Name: ");
                        String name = sc.next();
                        stu.add(name);
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        stuage.add(age);
                        System.out.print("Phone No.: ");
                        long no = sc.nextLong();
                        stuno.add(no);
                        List<String> booklist = new ArrayList<String>();
                        stubooks.add(booklist);
                        System.out.println("Member Successfully Registered with " + name);
                    } else if (l == 2) {
                        System.out.print("Name: ");
                        String name = sc.next();
                        int a = stu.indexOf(name);
                        stu.remove(name);
                        System.out.print("Age: ");
                        int age = sc.nextInt();
                        stuage.remove(a);
                        System.out.print("Phone No.: ");
                        int no = sc.nextInt();
                        stuno.remove(a);
                        stubooks.remove(a);
                        System.out.println("Member Successfully Removed with " + name);
                    } else if (l == 3) {

                        System.out.print("Book title:");
                        String b = sc.next();
                        System.out.print("Author:");
                        String a = sc.next();
                        System.out.print("Copies:");
                        int c = sc.nextInt();
                        books.add(b);
                        author.add(a);
                        bno.add(c);
                        System.out.println("Book added Successfully!!!");
                    } else if (l == 4) {
                        System.out.print("Enter the name of book to delete:");
                        String a = sc.next();
                        int i = books.indexOf(a);
                        books.remove(i);
                        bno.remove(i);
                        author.remove(i);
                    } else if (l == 5) {
                        System.out.println();
                        System.out.println("STUDENT RECORD:-");
                        for (int i = 0; i < stu.size(); i++) {
                            System.out.print("NAME: " + stu.get(i) + " | ");
                            System.out.print("BOOKS ISSUED: " + stubooks.get(i) + " | ");
                        }
                        System.out.println();
                    } else if (l == 6) {
                        System.out.println();
                        for (int i = 0; i < books.size(); i++) {
                            System.out.print("BOOKS: " + books.get(i) + " | ");
                            System.out.print("AUTHORS: " + author.get(i) + " | ");
                            System.out.println("NO.OF COPIES: " + bno.get(i));
                        }
                        System.out.println();

                    } else if (l == 7) {
                        System.out.println("1:Enter as a librarian");
                        System.out.println("2:Enter as a member");
                        System.out.println("3:Exit");
                        break;
                    } else {
                        System.out.println("Enter valid choice");
                        ;
                    }
                }
            } else if (n == 2) {
                System.out.print("Enter Name:");
                String st = sc.next();
                System.out.print("Enter Phone no.:");
                int no = sc.nextInt();
                if (!stu.contains(st) && !stuno.contains(no)) {
                    System.out.println("Member with Name: " + st + " and Phone No.: " + no + " doesn't exist.");
                } else {
                    while (true) {
                        System.out.println("Welcome " + st + " Member ID: " + no);
                        System.out.println("1: List Available Books");
                        System.out.println("2: List my books");
                        System.out.println("3: Issue book");
                        System.out.println("4: Return book");
                        System.out.println("5: Pay fine");
                        System.out.println("6: Back");

                        int o = sc.nextInt();
                        if (o == 1) {
                            for (int i = 0; i < books.size(); i++) {
                                System.out.println(books.get(i));
                            }
                        } else if (o == 2) {
                            for (int i = 0; i < stubooks.size(); i++) {
                                System.out.println(stubooks.get(i));
                            }
                        } else if (o == 3) {
                            System.out.print("Enter book to add: ");
                            String name = sc.next();
                            System.out.print("Enter book Id: ");
                            int id = sc.nextInt();
                            int i = stu.indexOf(st);
                            List<String> a = stubooks.get(i);
                            int l = a.size();
                            if (l <= 2) {
                                a.add(name);
                                stubooks.set(i, a);
                                bookid.add(id);
                                System.out.println("Book added successfully!!!");
                            } else {
                                System.out.println("You already have 2 books issued.");
                            }
                        } else if (o == 4) {
                            System.out.println("Enter book id to remove:");
                            int id = sc.nextInt();
                            int in = bookid.indexOf(id);
                            bookid.remove(in);
                            stubooks.remove(in);
                            System.out.println("Book returned successfully!!!");

                        } else if (o == 5) {
                            int in = stu.indexOf(st);
                        } else if (o == 6) {
                            System.out.println("1:Enter as a librarian");
                            System.out.println("2:Enter as a member");
                            System.out.println("3:Exit");
                            break;
                        } else {
                            System.out.println("Enter valid choice");
                        }
                    }
                }
            } else if (n == 3) {
                System.out.println("Thanks for visiting!!!");
                break;
            } else {
                System.out.println("Enter valid choice");
            }
            n = sc.nextInt();

        }
        sc.close();
    }
}