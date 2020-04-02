package com.zxdmjr.stroketextview

import android.content.Context
import android.graphics.Paint
import android.util.AttributeSet
import android.util.TypedValue
import android.view.View
import android.widget.FrameLayout
import kotlinx.android.synthetic.main.stroke_view.view.*

class StrokeTextView(
    context: Context,
    private val attrs: AttributeSet?
) : FrameLayout(context, attrs) {

    init {
        initialize()
    }

    private lateinit var view: View


    private var strokeColor: Int? = null
    private var textColor: Int? = null
    private var strokeWidth: Float = 6f
    private var textSize: Float = 24f

    private fun initialize(){
        view = inflate(
            context,
            R.layout.stroke_view, this
        )
        val attributes = context.obtainStyledAttributes(
            attrs,
            R.styleable.StrokeTextView
        )

        strokeColor  = attributes.getColor(R.styleable.StrokeTextView_strokeColor,
            view.tvStrokeTextPrimary.currentTextColor)
        textColor  = attributes.getColor(R.styleable.StrokeTextView_textColor,
            view.tvStrokeTextSecondary.currentTextColor)
        strokeWidth = attributes.getFloat(R.styleable.StrokeTextView_strokeWidth, 6f)
        val defaultTextSize = view.context.resources.getDimensionPixelSize(R.dimen.defaultTextSize)
        val textSizeInPx = attributes.getDimensionPixelSize(R.styleable.StrokeTextView_textSize, defaultTextSize)
        textSize = ConvertUtil.pxToDp(view.context, textSizeInPx.toFloat())
        val text = attributes.getText(R.styleable.StrokeTextView_text)

        view.tvStrokeTextPrimary.setTextColor(strokeColor!!)
        view.tvStrokeTextSecondary.setTextColor(textColor!!)

        view.tvStrokeTextPrimary.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize)
        view.tvStrokeTextSecondary.setTextSize(TypedValue.COMPLEX_UNIT_SP, textSize)

        view.tvStrokeTextPrimary.paint.strokeWidth = strokeWidth
        view.tvStrokeTextPrimary.paint.style = Paint.Style.STROKE

        view.tvStrokeTextPrimary.text = text
        view.tvStrokeTextSecondary.text = text

        attributes.recycle()
    }

}