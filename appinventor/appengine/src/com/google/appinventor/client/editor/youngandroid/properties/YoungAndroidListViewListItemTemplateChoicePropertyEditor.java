package com.google.appinventor.client.editor.youngandroid.properties;

import com.google.appinventor.client.widgets.properties.ChoicePropertyEditor;

import static com.google.appinventor.client.Ode.MESSAGES;

/**
 * Created by evan on 4/7/15.
 */
public class YoungAndroidListViewListItemTemplateChoicePropertyEditor extends ChoicePropertyEditor {

    // Button shape choices
    private static final Choice[] templates = new Choice[] {
            new Choice(MESSAGES.ListViewTextTemplate(), "0"),
            new Choice(MESSAGES.ListViewImageTemplate(), "1"),
            new Choice(MESSAGES.ListViewImageLabelTemplate(), "2")
    };

    public YoungAndroidListViewListItemTemplateChoicePropertyEditor() {
        super(templates);
    }

}
