/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package citybyui.cit260.cirtyofaaron.exceptions;

/**
 *
 * @author Meroko
 */
public class BuyLandException extends Exception{

    public BuyLandException() {
    }

    public BuyLandException(String message) {
        super(message);
    }

    public BuyLandException(String message, Throwable cause) {
        super(message, cause);
    }

    public BuyLandException(Throwable cause) {
        super(cause);
    }

    public BuyLandException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
