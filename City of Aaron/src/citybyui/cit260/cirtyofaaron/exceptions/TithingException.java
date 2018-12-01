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
public class TithingException extends Exception {

    public TithingException() {
    }

    public TithingException(String message) {
        super(message);
    }

    public TithingException(String message, Throwable cause) {
        super(message, cause);
    }

    public TithingException(Throwable cause) {
        super(cause);
    }

    public TithingException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
    
}
