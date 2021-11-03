package com.example.month_name.data

import com.example.month_name.R
import com.example.month_name.model.month

 class Datasource {
    fun loadMonth(): List<month> {
        return listOf<month>(
                    month(R.string.month1),
                    month (R.string.month2),
                    month (R.string.month3),
                    month (R.string.month4),
                    month (R.string.month5),
                    month (R.string.month6),
                    month (R.string.month7),
                    month (R.string.month8),
                    month (R.string.month9),
                    month (R.string.month10),
                    month (R.string.month11),
                    month (R.string.month12)
        )
    }
}
