package com.example.android2

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.MotionEvent
import android.view.View

class DrawView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0
) : View(context, attrs, defStyleAttr) {

    private var currentX = 40f
    private var currentY =  50f

    private var p =  Paint()

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        p.color = Color.RED
        canvas?.drawCircle(currentX,currentY,15F,p)
    }

    override fun onTouchEvent(event: MotionEvent?): Boolean {

        currentX = event!!.x
        currentY = event!!.y
        invalidate()
        return true

    }

}