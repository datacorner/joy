/*
 * Copyright (C) 2016 Benoit CAYLA (benoit@famillecayla.fr)
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.joy.api;

import java.util.Locale;
import java.util.ResourceBundle;

/**
 *
 * @author Benoit CAYLA (benoit@famillecayla.fr)
 */
public class ActionLocaleMgnt {
    private ResourceBundle messages;
    private String language;
    private String country;
    
    /**
     *
     */
    public ActionLocaleMgnt() {
        this.messages = null;
        this.language = "en";
        this.country = "US";
    }

    /**
     *
     * @param _Label
     * @return
     */
    public String getMessage(String _Label) {
        return messages.getString(_Label);
    }
    
    /**
     *
     * @return
     */
    public boolean isInitilized() {
        return (this.messages != null);
    }
    
    /**
     *
     * @param Language
     * @param Country
     */
    public ActionLocaleMgnt(String Language, String Country) {
        this.language = Language;
        this.country = Country;
        messages = null;
    }

    /**
     *
     * @param fileMessage
     * @return
     */
    public boolean init(String fileMessage) {
        try {
            Locale currentLocale;
            currentLocale = new Locale(getLanguage(), getCountry());
            messages = ResourceBundle.getBundle(fileMessage, currentLocale);
            return true;
            
        } catch( Exception e) {
            messages = null;
            return false;
        }
    }
    
    /**
     *
     * @return
     */
    public ResourceBundle getMessages() {
        return messages;
    }

    /**
     *
     * @param Messages
     */
    public void setMessages(ResourceBundle Messages) {
        this.messages = Messages;
    }

    /**
     *
     * @return
     */
    public String getLanguage() {
        return language;
    }

    /**
     *
     * @param Language
     */
    public void setLanguage(String Language) {
        this.language = Language;
    }

    /**
     *
     * @return
     */
    public String getCountry() {
        return country;
    }

    /**
     *
     * @param Country
     */
    public void setCountry(String Country) {
        this.country = Country;
    }
    
            
}
