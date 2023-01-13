package Data4.Interface;

import Data4.Document.TextDocument;

public interface Saveable {
    void SaveAs(TextDocument document, String path);
}