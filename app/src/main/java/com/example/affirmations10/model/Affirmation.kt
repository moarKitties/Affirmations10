package com.example.affirmations10.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Affirmation (@StringRes val stringResourceId: Int,
                        @DrawableRes val imageResourceId: Int
                        ) {
}