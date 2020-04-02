package com.zxdmjr.stroketextview

import android.content.Context
import android.util.DisplayMetrics




object ConvertUtil {

    @JvmStatic
    fun spToPx(context: Context, sp: Float): Float {
        val scale: Float = context.resources.displayMetrics.scaledDensity
        return (sp * scale + 0.5f)
    }

    @JvmStatic
    fun pxToDp(context: Context, px: Float): Float{
        return px / (context.resources
            .displayMetrics.densityDpi.toFloat() / DisplayMetrics.DENSITY_DEFAULT)
    }
}