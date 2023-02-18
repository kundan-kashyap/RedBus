package Resources;

import java.util.List;

import org.openqa.selenium.WebElement;

public class commonMethods {
	public static void forloopuse(List<WebElement>Elements, String y) {
		
for(WebElement z:Elements) {
	if(z.getText().equalsIgnoreCase(y)) {
		z.click();
		break;
	}
}
		
			
			
		}
	}


