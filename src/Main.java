public class Main {
    public static void main(String[] args) {
        Address myAddress = new Address();

        myAddress.setIndex("12345");
        myAddress.setCountry("Україна");
        myAddress.setCity("Дніпро");
        myAddress.setStreet("пр. Слабожанський");
        myAddress.setHouse("7");
        myAddress.setApartment("77");
        
        System.out.println("Індекс: " + myAddress.getIndex());
        System.out.println("Країна: " + myAddress.getCountry());
        System.out.println("Місто: " + myAddress.getCity());
        System.out.println("Вулиця: " + myAddress.getStreet());
        System.out.println("Будинок: " + myAddress.getHouse());
        System.out.println("Квартира: " + myAddress.getApartment());
    }
}