package Screens.Input;

import Bases.PageBase;


public class InputScreen extends PageBase {

    public void swipe(int qtdSwipe) {

        for (int i = 1; i < qtdSwipe; i++) {
            scrollUsingTouchActionsE(5);
        }

    }
}
