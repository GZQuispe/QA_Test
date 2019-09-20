package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object STRANGERLIST_URL
     
    /**
     * <p></p>
     */
    public static Object DEFAULT_WAIT
     
    /**
     * <p></p>
     */
    public static Object DIRECTORY_PATH
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += RunConfiguration.getOverridingParameters()
    
            STRANGERLIST_URL = selectedVariables['STRANGERLIST_URL']
            DEFAULT_WAIT = selectedVariables['DEFAULT_WAIT']
            DIRECTORY_PATH = selectedVariables['DIRECTORY_PATH']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
