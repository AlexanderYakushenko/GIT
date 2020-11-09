package tut_by;

import org.testng.annotations.Test;

public class CheckNewMessage {

    @Test
    public void openMessage() {
        returnToMessages.click();
        messageToOpen.click();
    }
}
