/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.shareok.data.redis.exceptions;

/**
 *
 * @author Tao Zhao
 */
public class NonExistingJobException extends Exception{
    /**
     *
     * @param message
     */
    public NonExistingJobException(String message){
        super(message);
    }
}
