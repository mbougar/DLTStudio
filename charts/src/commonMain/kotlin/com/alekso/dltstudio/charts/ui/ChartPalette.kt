package com.alekso.dltstudio.charts.ui

import androidx.compose.desktop.ui.tooling.preview.Preview
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlin.random.Random
import kotlin.random.nextInt

object ChartPalette {
    val light = mutableListOf<Color>()
    val dark = mutableListOf<Color>()

    val lightPalette = mutableListOf(
        Color(0xFFFF0000),
//        Color(0xFF00FF00), // green - selection
        Color(0xFF0000FF),
        Color(0xFFFF00FF),
        Color(0xFF00FFFF),
        Color(0xFF800000),
        Color(0xFF008000),
        Color(0xFF00CCFF),
        Color(0xFF000080),
        Color(0xFF808000),
        Color(0xFF800080),
        Color(0xFF008080),
        Color(0xFFC0C0C0),
        Color(0xFF808080),
        Color(0xFF9999FF),
        Color(0xFF993366),
        Color(0xFFaadddd),
        Color(0xFF660066),
        Color(0xFFFF8080),
        Color(0xFF0066CC),
        Color(0xFFCCCCFF),
        Color(0xFF000080),
        Color(0xFFFFFF00),
        Color(0xFF00FFFF),
        Color(0xFF800080),
        Color(0xFF800000),
        Color(0xFF008080),
        Color(0xFF0340FF),
        Color(0xFFCC3F6F),
        Color(0xFFCCFFCC),
        Color(0xFF6F5F99),
        Color(0xFF99CCFF),
        Color(0xFFFF99CC),
        Color(0xFFCC99FF),
        Color(0xFFFFCC99),
        Color(0xFF3366FF),
        Color(0xFF33CCCC),
        Color(0xFF99CC00),
        Color(0xFFFFCC00),
        Color(0xFFFF9900),
        Color(0xFFFF6600),
        Color(0xFF666699),
        Color(0xFF969696),
        Color(0xFF003366),
        Color(0xFF339966),
        Color(0xFF003300),
        Color(0xFF333300),
        Color(0xFF993300),
        Color(0xFF993366),
        Color(0xFF333399),
        Color(0xFF333333),
        Color(0xFF000000),
        Color(0xFFFFE4E1),
        Color(0xFFF0FFF0),
        Color(0xFFF5F5DC),
        Color(0xFFE6E6FA),
        Color(0xFFF0FFFF),
        Color(0xFFFAF0E6),
        Color(0xFFFFFAFA),
        Color(0xFFFDF5E6),
        Color(0xFFFFF5EE),
        Color(0xFFFAEBD7),
        Color(0xFFF5FFFA),
        Color(0xFFF0F8FF),
        Color(0xFFFFF0F5),
        Color(0xFFF5F5F5),
        Color(0xFFDCDCDC),
        Color(0xFFC8C8C8),
        Color(0xFFA9A9A9),
        Color(0xFF778899),
        Color(0xFF708090),
        Color(0xFF2F4F4F),
        Color(0xFF696969),
        Color(0xFFB0C4DE),
        Color(0xFFADD8E6),
        Color(0xFF87CEEB),
        Color(0xFF87CEFA),
        Color(0xFF4682B4),
        Color(0xFF5F9EA0),
        Color(0xFF6495ED),
        Color(0xFF7B68EE),
        Color(0xFF6A5ACD),
        Color(0xFF483D8B),
        Color(0xFF4169E1),
        Color(0xFF00008B),
        Color(0xFF000080),
        Color(0xFF191970),
        Color(0xFF8A2BE2),
        Color(0xFF9370DB),
        Color(0xFF9932CC),
        Color(0xFFBA55D3),
        Color(0xFFDA70D6),
        Color(0xFFE6E6FA),
        Color(0xFFD8BFD8),
        Color(0xFFDDA0DD),
        Color(0xFFEE82EE),
        Color(0xFFFF00FF)
    )

    val darkPalette = listOf(
        Color(0xFFB71C1C),
        Color(0xFF0D47A1),
        Color(0xFF1B5E20),
        Color(0xFF880E4F),
        Color(0xFF4A148C),
        Color(0xFF311B92),
        Color(0xFF1A237E),
        Color(0xFF01579B),
        Color(0xFF006064),
        Color(0xFF004D40),
        Color(0xFF33691E),
        Color(0xFF827717),
        Color(0xFFF57F17),
        Color(0xFFFF6F00),
        Color(0xFFE65100),
        Color(0xFFBF360C),
        Color(0xFF3E2723),
        Color(0xFF212121),
        Color(0xFF263238),
        Color(0xFF546E7A),
        Color(0xFF37474F),
        Color(0xFF455A64),
        Color(0xFF90A4AE),
        Color(0xFF78909C),
        Color(0xFF607D8B),
        Color(0xFF6D4C41),
        Color(0xFF5D4037),
        Color(0xFF4E342E),
        Color(0xFF3E2723),
        Color(0xFF263238),
        Color(0xFF1C313A),
        Color(0xFF102027),
        Color(0xFF1B1B1B),
        Color(0xFF212121),
        Color(0xFF424242),
        Color(0xFF616161),
        Color(0xFF757575),
        Color(0xFF9E9E9E),
        Color(0xFFBDBDBD),
        Color(0xFF90CAF9),
        Color(0xFF64B5F6),
        Color(0xFF42A5F5),
        Color(0xFF2196F3),
        Color(0xFF1E88E5),
        Color(0xFF1976D2),
        Color(0xFF1565C0),
        Color(0xFF0D47A1),
        Color(0xFF82B1FF),
        Color(0xFF448AFF),
        Color(0xFF2979FF),
        Color(0xFF2962FF),
        Color(0xFF00B8D4),
        Color(0xFF00ACC1),
        Color(0xFF0097A7),
        Color(0xFF00838F),
        Color(0xFF006064),
        Color(0xFF84FFFF),
        Color(0xFF18FFFF),
        Color(0xFF00E5FF),
        Color(0xFF00B8D4),
        Color(0xFFA7FFEB),
        Color(0xFF64FFDA),
        Color(0xFF1DE9B6),
        Color(0xFF00BFA5),
        Color(0xFF00C853),
        Color(0xFF64DD17),
        Color(0xFFAEEA00),
        Color(0xFFFFD600),
        Color(0xFFFFAB00),
        Color(0xFFFF6D00),
        Color(0xFFD50000),
        Color(0xFFC51162),
        Color(0xFFAA00FF),
        Color(0xFF6200EA),
        Color(0xFF304FFE),
        Color(0xFF2962FF),
        Color(0xFF0091EA),
        Color(0xFF00B8D4),
        Color(0xFF00BFA5),
        Color(0xFF00C853),
        Color(0xFF64DD17),
        Color(0xFFAEEA00),
        Color(0xFFFFD600),
        Color(0xFFFFAB00),
        Color(0xFFFF6D00),
        Color(0xFFD50000),
        Color(0xFF9E9D24),
        Color(0xFF827717),
        Color(0xFF33691E),
        Color(0xFF1B5E20),
        Color(0xFF004D40),
        Color(0xFF263238),
        Color(0xFF37474F),
        Color(0xFF455A64),
        Color(0xFF546E7A),
        Color(0xFF607D8B),
        Color(0xFF78909C),
        Color(0xFF90A4AE),
        Color(0xFFB0BEC5),
        Color(0xFFCFD8DC)
    )

    fun getColor(
        index: Int,
        darkColors: Boolean = false,
        excludedColors: List<Color> = emptyList()
    ): Color {

        val colors = if (darkColors) dark else light
        val palette = if (darkColors) darkPalette else lightPalette
        if (index < colors.size) {
            return colors[index]
        }

        while (colors.size <= index) {
            val nextColor = palette.firstOrNull { it !in colors } ?: generate(colors)
            colors.add(nextColor)
        }

        return colors[index]
    }

    private fun generate(colors: List<Color>): Color {
        var color: Color
        do {
            color = Color(
                Random.nextInt(0..255),
                Random.nextInt(0..255),
                Random.nextInt(0..255)
            )
        } while (color in colors)// || color in excludedColors)
        return color
    }
}

@Preview
@Composable
fun PreviewDefaultChartPalette() {
    Column(Modifier.fillMaxSize().background(ChartStyle.Default.backgroundColor)) {
        ChartPalette.lightPalette.forEachIndexed { i, c ->
            PreviewColor(c)
        }
    }
}

@Preview
@Composable
fun PreviewDarkChartPalette() {
    Column(Modifier.fillMaxSize().background(ChartStyle.Dark.backgroundColor)) {
        ChartPalette.darkPalette.forEachIndexed { i, c ->
            PreviewColor(c)
        }
    }
}

@OptIn(ExperimentalStdlibApi::class)
@Composable
fun PreviewColor(color: Color) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Box(Modifier.padding(2.dp).size(50.dp, 2.dp).background(color))
        Text(
            modifier = Modifier.padding(vertical = 2.dp).width(100.dp),
            text = color.toArgb().toHexString(),
            fontFamily = FontFamily.Monospace,
            fontSize = 10.sp
        )
    }
}