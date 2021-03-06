import java.util.ArrayList;

/**
 * A ssytem of voice mailboxes.
 * @author Akeel
 *
 */
public class MailSystem {

	public MailSystem(int mailboxCount) {
		mailboxes = new ArrayList<Mailbox>();
		
		// Init mailboxes
		for (int i = 0; i < mailboxCount; i++) {
			String passcode = "" + (i + 1);
			String greeting = "You have reached mailbox " + (i + 1)
				+ ". \nPlease leave a message now.";
			mailboxes.add(new Mailbox(passcode, greeting));
		}
	}
	
	public Mailbox findMailbox(String ext) {
		int i = Integer.parseInt(ext);
		if (1 <= i && i <= mailboxes.size())
			return mailboxes.get(i - 1);
		else return null;
	}
	
	private ArrayList<Mailbox> mailboxes;
}
