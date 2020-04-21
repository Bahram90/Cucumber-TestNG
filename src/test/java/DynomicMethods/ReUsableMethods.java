package DynomicMethods;

import org.junit.Assert;
import org.omg.CORBA.CurrentOperations;
import org.openqa.selenium.WebElement;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ReUsableMethods {

//    private static Logger logger = LoggerFactory.getLogger("Cu");

    public void enterText(WebElement element, String text) throws Exception {
        if(text==null){
            throw new Exception("Expected Text Field is not present/populated on page");
        }else{
            if(element.isEnabled()){
                if(!text.equalsIgnoreCase("")){
                    element.click();
                    element.sendKeys(text);
//                    Assert.assertEquals("Text was not successfully entered into text box",
//                            text.replaceAll(" ","").replaceAll("-","")
//                                    .replaceAll(",","")
//                            ,element.getText()
//                                    .replaceAll(" ","").replaceAll("-","")
//                                              .replaceAll(",",""));
                    Thread.sleep(1000);
                }
            }else{
//                logger.info("Expected text is not enabled on Page");
                throw  new RuntimeException();
            }
        }
    }
}
