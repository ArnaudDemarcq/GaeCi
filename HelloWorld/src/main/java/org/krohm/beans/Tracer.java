/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.beans;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author arnaud
 */
public class Tracer {

    private static final Logger LOGGER = LoggerFactory.getLogger(Tracer.class);
    private String key;
    private String value;

    public void setKey(String key) {
        this.key = key;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public final void init() {
        LOGGER.error("############################ KEY :<" + key +"> VALUE :<" + value + ">");
    }
}
