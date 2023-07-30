package com.example.kidsdrawingapp

import android.app.Dialog
import android.os.Bundle
import android.view.Window
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    private var drawingView: DrawingView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportRequestWindowFeature(Window.FEATURE_NO_TITLE) //will hide the title
        supportActionBar?.hide()//Hides the android title bar
        setContentView(R.layout.activity_main)
        drawingView = findViewById(R.id.drawing_view)
        drawingView?.setSizeForBrush(20.toFloat())
    }

    private fun showBrushSizeChooserDialog() {
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)

        brushDialog.setTitle("Brush Size")
        val smallBtn = brushDialog.ib_small_brush   //TODO - check this error


        smallBtn.setOnClickListner {
            drawingView?.setSizeForBrush(10.toFloat())
            brushDialog.dismiss()

        }
        brushDialog.show()


    }

}
