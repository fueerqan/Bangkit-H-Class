package com.muhammadfurqan.bangkithclass

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.muhammadfurqan.bangkithclass.model.Car
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val textview: TextView by lazy {
        findViewById<TextView>(R.id.textview_main)
    }

    private val btn: AppCompatButton by lazy {
        findViewById<AppCompatButton>(R.id.btn_click)
    }

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Dagger Injection
//        (application as MyApplication).appComponent.inject(this)

        btn.setOnClickListener {
            textview.text = car.getType()
        }

    }
}