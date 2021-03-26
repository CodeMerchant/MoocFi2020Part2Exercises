/*
Sometimes one wants an application to have a permanent view whose parts are
swapped when needed.Typically applications that have some kind of menus function
in this manner.

In the following example, there is an application which contains a main menu and
an area with variable content. When pressing the buttons on the main menu the
content of the area changes. See ExampleApp class
*/
package com.mycompany.sandboxpart13_viewswiththesamemainalignment;

import javafx.application.Application;

/**
 *
 * @author musa
 */
public class Main{
    public static void main(String[] args) {
        Application.launch(ExampleApp.class);
    }
}
