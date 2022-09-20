package com.example.dicerroler

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

var buttonRoll:Button=findViewById(R.id.roll_button)

        buttonRoll.setOnClickListener {

            roll()
        }



    }

    private fun roll() {

       var objDice=Dice(6)
        var rng=objDice.rngside()


        var imgDice:ImageView=findViewById(R.id.imageView)

        var drawableResource=when(rng){
            1->R.drawable.dice_1
            2->R.drawable.dice_2
            3->R.drawable.dice_3
            4->R.drawable.dice_4
            5->R.drawable.dice_5
            else->R.drawable.dice_6


        }
        imgDice.setImageResource(drawableResource)


    }




class Dice(var sideNum:Int){

   fun rngside():Int{

       return (1..sideNum).random()
   }
}

    }
