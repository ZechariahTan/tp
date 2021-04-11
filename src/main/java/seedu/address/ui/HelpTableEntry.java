package seedu.address.ui;

/**
 * The model for the help table shown in the help command
 */
public class HelpTableEntry {
    private String action = "";
    private String format = "";

    public HelpTableEntry() {
        this("", "");
    }

    /**
     * @param action description of the action
     * @param format description of the format
     */
    public HelpTableEntry(String action, String format) {
        setAction(action);
        setFormat(format);
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

}
