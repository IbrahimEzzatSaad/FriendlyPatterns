package com.example.friendlypatterns.MVC.pojo

import java.util.*


/** This component stores the application data. It has no knowledge about the interface.
 * The model is responsible for handling the domain logic(real-world business rules) and communication with the database and network layers. **/
class MVCModel  {


    val txt : MutableList<String>



    /**This array is holding the dialogue for MVC Pattern for the controller.**/
    init {
        txt = ArrayList(3)


        txt.add("Oh god! Do you know what happened?! The view was a snitch! She told the Controller that you clicked on the button! The controller got me right?.. that why you can see me. I'm so sorry..")
        txt.add("wait.. I'm not dead am I? oh I feel so alive don't get me wrong I'm not livedata! Lol. I was in the model but Idk the controller grabbed me and set me here in this UI thingy.")
        txt.add("Looks like we're fine now! you better move to the next patterns! they can't wait to see you.")
    }

    @Throws(IndexOutOfBoundsException::class)
    fun getValueAtIndex(the_index: Int): String {
        return txt[the_index]
    }


    fun getLength(): Int{
        return txt.size
    }
}