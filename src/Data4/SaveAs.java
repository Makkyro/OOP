package Data4;

import Data4.Applications.Notepad;
import Data4.Format.Doc;
import Data4.Format.Md;
import Data4.Format.TextFormat;
import Data4.Format.Txt;

public class SaveAs<T> {
    private T fileFormat;
    private String text;
    private String fileName;

    public SaveAs(T fileFormat, String fileName, String text) {
        Notepad notes = new Notepad();
        notes.newFile();
        notes.currentDocument().addAllText(text);
        if (fileFormat == TextFormatS.doc) {
            notes.SaveAs(fileName, new Doc());
        } else if ((fileFormat == TextFormatS.txt)) {
            notes.SaveAs(fileName, new Txt());
        } else if ((fileFormat == TextFormatS.md)) {
            notes.SaveAs(fileName, new Md());
        }
    }

}