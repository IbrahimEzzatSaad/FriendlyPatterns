package com.example.friendlypatterns.MVP.Model

import com.example.friendlypatterns.MVP.UI.Contract
import java.util.ArrayList



/** Model: Layer for storing data. It is responsible for handling the domain logic(real-world business rules)
 *  and communication with the database and network layers.
 **/
class MVPModel : Contract.Model {

    val txt : MutableList<String>

    /**This array is holding the dialogue for MVP Pattern for the controller.**/
    init {

        txt = ArrayList(3)

        txt.add("Here you deal with only one. The man of this pattern. The Presenter, Our middle man. The gangstar of the place. He deal with shit by himself and handle connections.")

        txt.add("Did you ever saw a dealer before? that him! Just.. don't call the cops okay?")

        txt.add("That it for me buddy. I hope you will enjoy your time with MVVM. Click the button!")
    }

    @Throws(IndexOutOfBoundsException::class)
    override fun getNextText(Index: Int): String  {
        return txt[Index]
    }

    override fun getLength(): Int {
        return txt.size
    }


}