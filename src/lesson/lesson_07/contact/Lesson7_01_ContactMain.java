package lesson.lesson_07.contact;

/**
 * Created by admin on 17.05.2016.
 */
public class Lesson7_01_ContactMain {
    public static void main(String[] args) {
        Contact myFriendContact = new Contact();
        myFriendContact.setFirstName("Ivan");
        myFriendContact.setLastName("Ivanov");
        myFriendContact.setMobile("89231111111");

        System.out.printf("My friend %s %s, phone %s",
                myFriendContact.getLastName(),
                myFriendContact.getFirstName(),
                myFriendContact.getMobile());
    }
}
