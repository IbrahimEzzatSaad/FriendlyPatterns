package com.example.friendlypatterns.mvvm.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.friendlypatterns.R
import com.example.friendlypatterns.databinding.ActivityMvvmactivityBinding



/** View: The purpose of this layer is to inform the ViewModel about the user’s action.
 *  This layer observes the ViewModel and does not contain any kind of application logic.**/
class MVVMActivity : AppCompatActivity() {


    private lateinit var binding : ActivityMvvmactivityBinding
    private var index = 0
    private lateinit var myViewModel: MvvMViewModel


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //DataBinding
        binding = DataBindingUtil.setContentView(this, R.layout.activity_mvvmactivity)
        myViewModel = ViewModelProvider(this)[MvvMViewModel::class.java]
        binding.viewModel = myViewModel
        binding.lifecycleOwner = this


        binding.next.setOnClickListener {
            if(index == 4) binding.imageView.setImageResource(R.drawable.mvvm2)
            else if(index == 6) finishAffinity()
            myViewModel.updateText(index);
            index++

        }
    }
}