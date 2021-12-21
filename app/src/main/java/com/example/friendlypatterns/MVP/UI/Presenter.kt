package com.example.friendlypatterns.MVP.UI

import android.content.Intent


/** Presenter: Fetch the data from the model and applies the UI logic to decide what to display.
 *  It manages the state of the View and takes actions according to the user’s input notification from the View.**/
class Presenter(private var mainView: Contract.View?,
                private val model: Contract.Model) : Contract.Presenter {

    var Index : Int = 0
    var txt: String = ""


    override fun getText() {
        if (mainView != null && model.getLength() > Index) {
            txt = model.getNextText(Index)
            updateUI()
            Index++
        }else{
            txt = ""
            updateUI()
        }
    }

    override fun updateUI() {
        mainView?.UpdateText(txt)
    }


    override fun onDestroy() {
        mainView = null
    }


}