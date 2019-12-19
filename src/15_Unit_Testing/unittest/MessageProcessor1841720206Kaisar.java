package unittest;

public class MessageProcessor1841720206Kaisar {

    private String mMessage, mRecipient, mSender;

    public String getMessageKaisar() {
        return mMessage;
    }

    public String getRecipientKaisar() {
        return mRecipient;
    }

    public String getSenderKaisar() {
        return mSender;
    }

    public void setMessageKaisar(String message) {
        this.mMessage = message;
    }

    public void setRecipientKaisar(String recipient) {
        this.mRecipient = recipient;
    }

    public void setSenderKaisar(String sender) {
        this.mSender = sender;
    }

    public String messageFormatKaisar() {
        String message = String.format("Hai %s, you have message from %s.\nThe message as follows : %s", this.mRecipient, this.mSender, this.mMessage);
        return message;
    }

    public void showMessageKaisar() {
        System.out.println(messageFormatKaisar());
    }
}
