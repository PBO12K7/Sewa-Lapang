/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.kelompok7.tubes.error;

/**
 *
 * @author Flow
 */
public class ScheduleException extends Exception {

    /**
     * Creates a new instance of <code>ScheduleException</code> without detail
     * message.
     */
    public ScheduleException() {
    }

    /**
     * Constructs an instance of <code>ScheduleException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ScheduleException(String msg) {
        super(msg);
    }
}
