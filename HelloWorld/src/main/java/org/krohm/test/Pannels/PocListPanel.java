/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.krohm.test.Pannels;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import org.apache.wicket.markup.html.basic.Label;
import org.apache.wicket.markup.html.link.BookmarkablePageLink;
import org.apache.wicket.markup.html.list.ListItem;
import org.apache.wicket.markup.html.list.ListView;
import org.apache.wicket.markup.html.panel.Panel;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.krohm.test.Index;
import org.krohm.test.pages.DatastoreTestPage;
import org.krohm.test.pages.PropertiesTestPage;
import org.krohm.test.pages.WicketTestPage;

/**
 *
 * @author arnaud
 */
public class PocListPanel extends Panel {

    private static final Logger logger = LoggerFactory.getLogger(Index.class);

    public PocListPanel(String id) {
        super(id);
        /*
        add(new BookmarkablePageLink("HomeLink", Index.class));
        add(new BookmarkablePageLink("JfcLink", JfcTestPage.class));
        add(new BookmarkablePageLink("DaoLink", DaoTestPage.class));
        /**/

        add(new ListView<ClassLinkLabel>("pocList", getClassLinkLabel()) {

            @Override
            protected void populateItem(ListItem<ClassLinkLabel> listItem) {
                ClassLinkLabel currentPageClass = listItem.getModelObject();
                BookmarkablePageLink link = new BookmarkablePageLink("link", currentPageClass.getLinkClass());
                link.add(new Label("label", currentPageClass.getLinkLabel()));
                listItem.add(link);
            }
        });/**/

    }

    private List<ClassLinkLabel> getClassLinkLabel() {
        List<ClassLinkLabel> returnList = new ArrayList<ClassLinkLabel>();
        returnList.add(new ClassLinkLabel(Index.class, "HomeLink"));
        returnList.add(new ClassLinkLabel(WicketTestPage.class, "WicketLink"));
        returnList.add(new ClassLinkLabel(PropertiesTestPage.class, "PropLink"));
        returnList.add(new ClassLinkLabel(DatastoreTestPage.class, "DataStore"));

        return returnList;
    }

    private class ClassLinkLabel implements Serializable {

        private Class linkClass;
        private String linkLabel;

        public ClassLinkLabel(Class linkClass, String linkLabel) {
            this.linkClass = linkClass;
            this.linkLabel = linkLabel;
        }

        public Class getLinkClass() {
            return linkClass;
        }

        public void setLinkClass(Class linkClass) {
            this.linkClass = linkClass;
        }

        public String getLinkLabel() {
            return linkLabel;
        }

        public void setLinkLabel(String linkLabel) {
            this.linkLabel = linkLabel;
        }
    }
}
