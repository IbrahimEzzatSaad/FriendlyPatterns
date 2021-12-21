package com.example.friendlypatterns.mvvm.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.friendlypatterns.mvvm.Model.MvvMModel


/** ViewModel: It exposes those data streams which are relevant to the View.
 *  Moreover, it servers as a link between the Model and the View.**/
class MvvMViewModel : ViewModel() {

    // Create a LiveData with a String
    val currentText: MutableLiveData<String> by lazy {
        MutableLiveData<String>()

    }

    init {
        currentText.value = "... Model.. can you update the text please? yeah don't call me I will call you. Alright thanks dear if anything bad happened just don't tell anyone."
    }
    private var model: MvvMModel = MvvMModel()


    fun updateText(index : Int){
        if(model.getLength() > index){
            currentText.value = model.getNextText(index)
        }else
            currentText.value = ""
    }

}