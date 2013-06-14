/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.test.pages;

import org.apache.wicket.markup.html.WebPage;
import org.apache.wicket.request.mapper.parameter.PageParameters;
import org.krohm.test.Pannels.HeaderPanel;
import org.krohm.test.Pannels.PocListPanel;

/**
 *
 * @author arnaud
 */
public class PocMainPage extends WebPage {

    public PocMainPage() {
        super();
        add(new PocListPanel("PocList"));
        add(new HeaderPanel("HeaderPanel"));
    }
}
