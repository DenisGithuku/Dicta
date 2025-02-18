
/*
* Copyright 2025 Denis Githuku
*
* Licensed under the Apache License, Version 2.0 (the "License");
* you may not use this file except in compliance with the License.
* You may obtain a copy of the License at
*
* https://www.apache.org/licenses/LICENSE-2.0
*
* Unless required by applicable law or agreed to in writing, software
* distributed under the License is distributed on an "AS IS" BASIS,
* WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
* See the License for the specific language governing permissions and
* limitations under the License.
*/
package com.githukudenis.dicta.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.LineHeightStyle.Alignment
import androidx.compose.ui.text.style.LineHeightStyle.Trim
import androidx.compose.ui.unit.sp
import com.githukudenis.dicta.R

internal val PoppinsFamily =
    FontFamily(
        Font(resId = R.font.poppins_black, weight = FontWeight.Black),
        Font(resId = R.font.poppins_regular, weight = FontWeight.Normal),
        Font(resId = R.font.poppins_bold, weight = FontWeight.Bold),
        Font(resId = R.font.poppins_semibold, weight = FontWeight.SemiBold),
        Font(resId = R.font.poppins_light, weight = FontWeight.Light),
        Font(resId = R.font.poppins_medium, weight = FontWeight.Medium)
    )

/** Dicta typography. */
internal val DictaTypography =
    Typography(
        displayLarge =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 57.sp,
                lineHeight = 64.sp,
                letterSpacing = (-0.25).sp
            ),
        displayMedium =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 45.sp,
                lineHeight = 52.sp,
                letterSpacing = 0.sp
            ),
        displaySmall =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 36.sp,
                lineHeight = 44.sp,
                letterSpacing = 0.sp
            ),
        headlineLarge =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 32.sp,
                lineHeight = 40.sp,
                letterSpacing = 0.sp
            ),
        headlineMedium =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 28.sp,
                lineHeight = 36.sp,
                letterSpacing = 0.sp
            ),
        headlineSmall =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 24.sp,
                lineHeight = 32.sp,
                letterSpacing = 0.sp,
                lineHeightStyle = LineHeightStyle(alignment = Alignment.Bottom, trim = Trim.None)
            ),
        titleLarge =
            TextStyle(
                fontWeight = FontWeight.Bold,
                fontFamily = PoppinsFamily,
                fontSize = 22.sp,
                lineHeight = 28.sp,
                letterSpacing = 0.sp,
                lineHeightStyle = LineHeightStyle(alignment = Alignment.Bottom, trim = Trim.LastLineBottom)
            ),
        titleMedium =
            TextStyle(
                fontWeight = FontWeight.Medium,
                fontFamily = PoppinsFamily,
                fontSize = 18.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.1.sp
            ),
        titleSmall =
            TextStyle(
                fontWeight = FontWeight.Medium,
                fontFamily = PoppinsFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.1.sp
            ),
        // Default text style
        bodyLarge =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 16.sp,
                lineHeight = 24.sp,
                letterSpacing = 0.5.sp,
                lineHeightStyle = LineHeightStyle(alignment = Alignment.Center, trim = Trim.None)
            ),
        bodyMedium =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.25.sp
            ),
        bodySmall =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.4.sp
            ),
        // Used for Button
        labelLarge =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 14.sp,
                lineHeight = 20.sp,
                letterSpacing = 0.1.sp,
                lineHeightStyle = LineHeightStyle(alignment = Alignment.Center, trim = Trim.LastLineBottom)
            ),
        // Used for Navigation items
        labelMedium =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 12.sp,
                lineHeight = 16.sp,
                letterSpacing = 0.5.sp,
                lineHeightStyle = LineHeightStyle(alignment = Alignment.Center, trim = Trim.LastLineBottom)
            ),
        // Used for Tag
        labelSmall =
            TextStyle(
                fontWeight = FontWeight.Normal,
                fontFamily = PoppinsFamily,
                fontSize = 10.sp,
                lineHeight = 14.sp,
                letterSpacing = 0.sp,
                lineHeightStyle = LineHeightStyle(alignment = Alignment.Center, trim = Trim.LastLineBottom)
            )
    )
