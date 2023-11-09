package Tests;

import Pages.Titel;
import TestBase.TestBase;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TitelTest extends TestBase {

    @Test
    void GetTitle(){
        Titel title= new Titel(page);
        title.GetTitle();
        assertEquals(title.getTitle(), page.title());
    }
}
