# ITEA
## HW-05-01

Створіть проєкт з класом Main.java.
Потрібно: Створити клас AbstractHandler. У тілі класу створити методи void open(), void create(), void change(), void save(). Створити похідні класи XMLHandler, TXTHandler, DOCHandler від базового класу AbstractHandler. Створити три екземпляри XMLHandler, TXTHandler, DOCHandler.

Методи мають мати інформацію що саме за хендлер виконує роботу.

Для прикладу

…. xmlHandler= new XMLHandler();
xmlHandler.open();

В консолі буде

XMLHandler opens a document