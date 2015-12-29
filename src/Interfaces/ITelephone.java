package Interfaces;

/**
 * Created by robertsg on 12/29/2015.
 */
public interface ITelephone {
    void powerOn();

    void dial(int phoneNumber);

    void answer();

    boolean callPhone(int phoneNumber);

    boolean isRinging();
}
