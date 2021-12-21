package com.example.friendlypatterns.mvvm.Model;

import java.util.ArrayList



/** Model: This layer is responsible for the abstraction of the data sources.
 *  Model and ViewModel work together to get and save the data. **/
class MvvMModel {



    val txt : MutableList<String>


    /**This array is holding the dialogue for MVVM Pattern for the controller.**/
    init {

        txt = ArrayList(5)

        txt.add("Oh here we go. Hello there! I hope you having a good day. I'm MvvM, its nice to meet you.. what is your name? Actually doesn't matter.")

        txt.add("As you can see I'm a bit different.. I'm more alive than those before me. I have a ViewModel and Model and View, you may think that looks like MVP right?")

        txt.add("Actually I'm not like MVP completely. My ViewModel don't know anything about the view but the view can observe the data.")

        txt.add("and that made me able to.. ")

        txt.add("Save the DATAAAAAAA!")

        txt.add("Anyhow you must get me some libs that I need so you can work with me. You must go now, its too late. I hope you enjoyed our tour!")
    }

    @Throws(IndexOutOfBoundsException::class)
    fun getNextText(Index: Int): String  {
        return txt[Index]
    }

    fun getLength(): Int {
        return txt.size
    }

}
