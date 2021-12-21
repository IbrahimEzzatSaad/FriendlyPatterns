package com.example.friendlypatterns.MVP.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.friendlypatterns.MVP.Model.MVPModel
import com.example.friendlypatterns.mvvm.ui.MVVMActivity
import com.example.friendlypatterns.databinding.ActivityMvpactivityBinding



/** The View class is responsible for updating the UI according to the changes triggered by the Presenter layer.
 *  The data provided by the Model will be used by View and the appropriate changes will be made in the activity.
 **/
class MVPActivity : AppCompatActivity(), Contract.View {


    private lateinit var binding: ActivityMvpactivityBinding
    private var presenter : Presenter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMvpactivityBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // instantiating object of Presenter Interface
        presenter = Presenter(this, MVPModel())



        binding.next.setOnClickListener {
            presenter!!.getText()
        }

    }

    override fun onDestroy() {
        presenter?.onDestroy()
        super.onDestroy()
    }

    override fun UpdateText(string: String?) {
        if(!string.isNullOrEmpty()){
            binding.text.text = string
        }else{
            startActivity(Intent(this,MVVMActivity::class.java))
        }

    }


}