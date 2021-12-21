package com.example.friendlypatterns.MVC.UI

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.friendlypatterns.MVC.pojo.MVCModel
import com.example.friendlypatterns.MVP.UI.MVPActivity
import com.example.friendlypatterns.R
import com.example.friendlypatterns.databinding.ActivityMvcBinding


/**Controller: This component establishes the relationship between the View and the Model.
 * It contains the core application logic and gets informed of the user’s behavior and updates the Model as per the need.**/
class Controller : AppCompatActivity() {


    //ViewBinding
    private lateinit var binding: ActivityMvcBinding

    /**In this pattern View and Controller both depend upon the Model. **/
    private var  mymodel : MVCModel? = null
    private var index : Int = 0


    /** In MVC architecture, application data is updated by the controller and View gets the data.
     *  Since the Model component is separated, it could be tested independently of the UI.**/
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMvcBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mymodel =  MVCModel()


        /** Controller and View will be handled by the Activity.
         *  Whenever the user clicks the buttons, activity directs the Model to handle the further operations.
         *  The activity will act as an observer.**/
        binding.next.setOnClickListener {
            if (mymodel!!.getLength() > index){


                binding.text.text = mymodel!!.getValueAtIndex(index)
                index++



                if (index == 1){
                    binding.imageView.setImageResource(R.drawable.mvc2)
                }

            }else {
                startActivity(Intent(this,MVPActivity::class.java))
            }
        }
    }
}