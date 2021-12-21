package com.example.friendlypatterns.MVP.UI




/**To establish communication between View-Presenter and Presenter-Model, an interface is needed.
 * This interface class will contain all abstract methods which will be defined later in the View, Model, and Presenter class.**/
interface Contract {

    interface View {

        // method to set random
        // text on the TextView
        fun UpdateText(string: String?)

    }

    interface Model{
        fun getNextText(Index : Int) : String
        fun getLength():Int
    }

    interface Presenter {
        fun getText()
        fun updateUI()

        // method to destroy
        // lifecycle of MainActivity
        fun onDestroy()
    }
}
