package com.example.navigationdrew.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    secondary = PurpleGrey80,
    tertiary = Pink80
)

public val LightColorScheme = lightColorScheme(
    primary = Purple40,
    secondary = PurpleGrey40,
    tertiary = Pink40

    /* Other default colors to override
    background = Color(0xFFFFFBFE),
    surface = Color(0xFFFFFBFE),
    onPrimary = Color.White,
    onSecondary = Color.White,
    onTertiary = Color.White,
    onBackground = Color(0xFF1C1B1F),
    onSurface = Color(0xFF1C1B1F),
    */
)

public val lighYellowtScheme = lightColorScheme(
    primary = yellow_primaryLight,
    onPrimary = yellow_onPrimaryLight,
    primaryContainer = yellow_primaryContainerLight,
    onPrimaryContainer = yellow_onPrimaryContainerLight,
    secondary = yellow_secondaryLight,
    onSecondary = yellow_onSecondaryLight,
    secondaryContainer = yellow_secondaryContainerLight,
    onSecondaryContainer = yellow_onSecondaryContainerLight,
    tertiary = yellow_tertiaryLight,
    onTertiary = yellow_onTertiaryLight,
    tertiaryContainer = yellow_tertiaryContainerLight,
    onTertiaryContainer = yellow_onTertiaryContainerLight,
    error = yellow_errorLight,
    onError = yellow_onErrorLight,
    errorContainer = yellow_errorContainerLight,
    onErrorContainer = yellow_onErrorContainerLight,
    background = yellow_backgroundLight,
    onBackground = yellow_onBackgroundLight,
    surface = yellow_surfaceLight,
    onSurface = yellow_onSurfaceLight,
    surfaceVariant = yellow_surfaceVariantLight,
    onSurfaceVariant = yellow_onSurfaceVariantLight,
    outline = yellow_outlineLight,
    outlineVariant = yellow_outlineVariantLight,
    scrim = yellow_scrimLight,
    inverseSurface = yellow_inverseSurfaceLight,
    inverseOnSurface = yellow_inverseOnSurfaceLight,
    inversePrimary = yellow_inversePrimaryLight,
    surfaceDim = yellow_surfaceDimLight,
    surfaceBright = yellow_surfaceBrightLight,
    surfaceContainerLowest = yellow_surfaceContainerLowestLight,
    surfaceContainerLow = yellow_surfaceContainerLowLight,
    surfaceContainer = yellow_surfaceContainerLight,
    surfaceContainerHigh = yellow_surfaceContainerHighLight,
    surfaceContainerHighest = yellow_surfaceContainerHighestLight,
)

public val darkYellowScheme = darkColorScheme(
    primary = yellow_primaryDark,
    onPrimary = yellow_onPrimaryDark,
    primaryContainer = yellow_primaryContainerDark,
    onPrimaryContainer = yellow_onPrimaryContainerDark,
    secondary = yellow_secondaryDark,
    onSecondary = yellow_onSecondaryDark,
    secondaryContainer = yellow_secondaryContainerDark,
    onSecondaryContainer = yellow_onSecondaryContainerDark,
    tertiary = yellow_tertiaryDark,
    onTertiary = yellow_onTertiaryDark,
    tertiaryContainer = yellow_tertiaryContainerDark,
    onTertiaryContainer = yellow_onTertiaryContainerDark,
    error = yellow_errorDark,
    onError = yellow_onErrorDark,
    errorContainer = yellow_errorContainerDark,
    onErrorContainer = yellow_onErrorContainerDark,
    background = yellow_backgroundDark,
    onBackground = yellow_onBackgroundDark,
    surface = yellow_surfaceDark,
    onSurface = yellow_onSurfaceDark,
    surfaceVariant = yellow_surfaceVariantDark,
    onSurfaceVariant = yellow_onSurfaceVariantDark,
    outline = yellow_outlineDark,
    outlineVariant = yellow_outlineVariantDark,
    scrim = yellow_scrimDark,
    inverseSurface = yellow_inverseSurfaceDark,
    inverseOnSurface = yellow_inverseOnSurfaceDark,
    inversePrimary = yellow_inversePrimaryDark,
    surfaceDim = yellow_surfaceDimDark,
    surfaceBright = yellow_surfaceBrightDark,
    surfaceContainerLowest = yellow_surfaceContainerLowestDark,
    surfaceContainerLow = yellow_surfaceContainerLowDark,
    surfaceContainer = yellow_surfaceContainerDark,
    surfaceContainerHigh = yellow_surfaceContainerHighDark,
    surfaceContainerHighest = yellow_surfaceContainerHighestDark,
)

public val lightBlueScheme = lightColorScheme(
    primary = blue_primaryLight,
    onPrimary = blue_onPrimaryLight,
    primaryContainer = blue_primaryContainerLight,
    onPrimaryContainer = blue_onPrimaryContainerLight,
    secondary = blue_secondaryLight,
    onSecondary = blue_onSecondaryLight,
    secondaryContainer = blue_secondaryContainerLight,
    onSecondaryContainer = blue_onSecondaryContainerLight,
    tertiary = blue_tertiaryLight,
    onTertiary = blue_onTertiaryLight,
    tertiaryContainer = blue_tertiaryContainerLight,
    onTertiaryContainer = blue_onTertiaryContainerLight,
    error = blue_errorLight,
    onError = blue_onErrorLight,
    errorContainer = blue_errorContainerLight,
    onErrorContainer = blue_onErrorContainerLight,
    background = blue_backgroundLight,
    onBackground = blue_onBackgroundLight,
    surface = blue_surfaceLight,
    onSurface = blue_onSurfaceLight,
    surfaceVariant = blue_surfaceVariantLight,
    onSurfaceVariant = blue_onSurfaceVariantLight,
    outline = blue_outlineLight,
    outlineVariant = blue_outlineVariantLight,
    scrim = blue_scrimLight,
    inverseSurface = blue_inverseSurfaceLight,
    inverseOnSurface = blue_inverseOnSurfaceLight,
    inversePrimary = blue_inversePrimaryLight,
    surfaceDim = blue_surfaceDimLight,
    surfaceBright = blue_surfaceBrightLight,
    surfaceContainerLowest = blue_surfaceContainerLowestLight,
    surfaceContainerLow = blue_surfaceContainerLowLight,
    surfaceContainer = blue_surfaceContainerLight,
    surfaceContainerHigh = blue_surfaceContainerHighLight,
    surfaceContainerHighest = blue_surfaceContainerHighestLight,
)

public val darkBlueScheme = darkColorScheme(
    primary = blue_primaryDark,
    onPrimary = blue_onPrimaryDark,
    primaryContainer = blue_primaryContainerDark,
    onPrimaryContainer = blue_onPrimaryContainerDark,
    secondary = blue_secondaryDark,
    onSecondary = blue_onSecondaryDark,
    secondaryContainer = blue_secondaryContainerDark,
    onSecondaryContainer = blue_onSecondaryContainerDark,
    tertiary = blue_tertiaryDark,
    onTertiary = blue_onTertiaryDark,
    tertiaryContainer = blue_tertiaryContainerDark,
    onTertiaryContainer = blue_onTertiaryContainerDark,
    error = blue_errorDark,
    onError = blue_onErrorDark,
    errorContainer = blue_errorContainerDark,
    onErrorContainer = blue_onErrorContainerDark,
    background = blue_backgroundDark,
    onBackground = blue_onBackgroundDark,
    surface = blue_surfaceDark,
    onSurface = blue_onSurfaceDark,
    surfaceVariant = blue_surfaceVariantDark,
    onSurfaceVariant = blue_onSurfaceVariantDark,
    outline = blue_outlineDark,
    outlineVariant = blue_outlineVariantDark,
    scrim = blue_scrimDark,
    inverseSurface = blue_inverseSurfaceDark,
    inverseOnSurface = blue_inverseOnSurfaceDark,
    inversePrimary = blue_inversePrimaryDark,
    surfaceDim = blue_surfaceDimDark,
    surfaceBright = blue_surfaceBrightDark,
    surfaceContainerLowest = blue_surfaceContainerLowestDark,
    surfaceContainerLow = blue_surfaceContainerLowDark,
    surfaceContainer = blue_surfaceContainerDark,
    surfaceContainerHigh = blue_surfaceContainerHighDark,
    surfaceContainerHighest = blue_surfaceContainerHighestDark,
)

public val lightRedScheme = lightColorScheme(
    primary = red_primaryLight,
    onPrimary = red_onPrimaryLight,
    primaryContainer = red_primaryContainerLight,
    onPrimaryContainer = red_onPrimaryContainerLight,
    secondary = red_secondaryLight,
    onSecondary = red_onSecondaryLight,
    secondaryContainer = red_secondaryContainerLight,
    onSecondaryContainer = red_onSecondaryContainerLight,
    tertiary = red_tertiaryLight,
    onTertiary = red_onTertiaryLight,
    tertiaryContainer = red_tertiaryContainerLight,
    onTertiaryContainer = red_onTertiaryContainerLight,
    error = red_errorLight,
    onError = red_onErrorLight,
    errorContainer = red_errorContainerLight,
    onErrorContainer = red_onErrorContainerLight,
    background = red_backgroundLight,
    onBackground = red_onBackgroundLight,
    surface = red_surfaceLight,
    onSurface = red_onSurfaceLight,
    surfaceVariant = red_surfaceVariantLight,
    onSurfaceVariant = red_onSurfaceVariantLight,
    outline = red_outlineLight,
    outlineVariant = red_outlineVariantLight,
    scrim = red_scrimLight,
    inverseSurface = red_inverseSurfaceLight,
    inverseOnSurface = red_inverseOnSurfaceLight,
    inversePrimary = red_inversePrimaryLight,
    surfaceDim = red_surfaceDimLight,
    surfaceBright = red_surfaceBrightLight,
    surfaceContainerLowest = red_surfaceContainerLowestLight,
    surfaceContainerLow = red_surfaceContainerLowLight,
    surfaceContainer = red_surfaceContainerLight,
    surfaceContainerHigh = red_surfaceContainerHighLight,
    surfaceContainerHighest = red_surfaceContainerHighestLight,
)

public val darkRedScheme = darkColorScheme(
    primary = red_primaryDark,
    onPrimary = red_onPrimaryDark,
    primaryContainer = red_primaryContainerDark,
    onPrimaryContainer = red_onPrimaryContainerDark,
    secondary = red_secondaryDark,
    onSecondary = red_onSecondaryDark,
    secondaryContainer = red_secondaryContainerDark,
    onSecondaryContainer = red_onSecondaryContainerDark,
    tertiary = red_tertiaryDark,
    onTertiary = red_onTertiaryDark,
    tertiaryContainer = red_tertiaryContainerDark,
    onTertiaryContainer = red_onTertiaryContainerDark,
    error = red_errorDark,
    onError = red_onErrorDark,
    errorContainer = red_errorContainerDark,
    onErrorContainer = red_onErrorContainerDark,
    background = red_backgroundDark,
    onBackground = red_onBackgroundDark,
    surface = red_surfaceDark,
    onSurface = red_onSurfaceDark,
    surfaceVariant = red_surfaceVariantDark,
    onSurfaceVariant = red_onSurfaceVariantDark,
    outline = red_outlineDark,
    outlineVariant = red_outlineVariantDark,
    scrim = red_scrimDark,
    inverseSurface = red_inverseSurfaceDark,
    inverseOnSurface = red_inverseOnSurfaceDark,
    inversePrimary = red_inversePrimaryDark,
    surfaceDim = red_surfaceDimDark,
    surfaceBright = red_surfaceBrightDark,
    surfaceContainerLowest = red_surfaceContainerLowestDark,
    surfaceContainerLow = red_surfaceContainerLowDark,
    surfaceContainer = red_surfaceContainerDark,
    surfaceContainerHigh = red_surfaceContainerHighDark,
    surfaceContainerHighest = red_surfaceContainerHighestDark,
)

public val lightGreenScheme = lightColorScheme(
    primary = green_primaryLight,
    onPrimary = green_onPrimaryLight,
    primaryContainer = green_primaryContainerLight,
    onPrimaryContainer = green_onPrimaryContainerLight,
    secondary = green_secondaryLight,
    onSecondary = green_onSecondaryLight,
    secondaryContainer = green_secondaryContainerLight,
    onSecondaryContainer = green_onSecondaryContainerLight,
    tertiary = green_tertiaryLight,
    onTertiary = green_onTertiaryLight,
    tertiaryContainer = green_tertiaryContainerLight,
    onTertiaryContainer = green_onTertiaryContainerLight,
    error = green_errorLight,
    onError = green_onErrorLight,
    errorContainer = green_errorContainerLight,
    onErrorContainer = green_onErrorContainerLight,
    background = green_backgroundLight,
    onBackground = green_onBackgroundLight,
    surface = green_surfaceLight,
    onSurface = green_onSurfaceLight,
    surfaceVariant = green_surfaceVariantLight,
    onSurfaceVariant = green_onSurfaceVariantLight,
    outline = green_outlineLight,
    outlineVariant = green_outlineVariantLight,
    scrim = green_scrimLight,
    inverseSurface = green_inverseSurfaceLight,
    inverseOnSurface = green_inverseOnSurfaceLight,
    inversePrimary = green_inversePrimaryLight,
    surfaceDim = green_surfaceDimLight,
    surfaceBright = green_surfaceBrightLight,
    surfaceContainerLowest = green_surfaceContainerLowestLight,
    surfaceContainerLow = green_surfaceContainerLowLight,
    surfaceContainer = green_surfaceContainerLight,
    surfaceContainerHigh = green_surfaceContainerHighLight,
    surfaceContainerHighest = green_surfaceContainerHighestLight,
)

public val darkGreenScheme = darkColorScheme(
    primary = green_primaryDark,
    onPrimary = green_onPrimaryDark,
    primaryContainer = green_primaryContainerDark,
    onPrimaryContainer = green_onPrimaryContainerDark,
    secondary = green_secondaryDark,
    onSecondary = green_onSecondaryDark,
    secondaryContainer = green_secondaryContainerDark,
    onSecondaryContainer = green_onSecondaryContainerDark,
    tertiary = green_tertiaryDark,
    onTertiary = green_onTertiaryDark,
    tertiaryContainer = green_tertiaryContainerDark,
    onTertiaryContainer = green_onTertiaryContainerDark,
    error = green_errorDark,
    onError = green_onErrorDark,
    errorContainer = green_errorContainerDark,
    onErrorContainer = green_onErrorContainerDark,
    background = green_backgroundDark,
    onBackground = green_onBackgroundDark,
    surface = green_surfaceDark,
    onSurface = green_onSurfaceDark,
    surfaceVariant = green_surfaceVariantDark,
    onSurfaceVariant = green_onSurfaceVariantDark,
    outline = green_outlineDark,
    outlineVariant = green_outlineVariantDark,
    scrim = green_scrimDark,
    inverseSurface = green_inverseSurfaceDark,
    inverseOnSurface = green_inverseOnSurfaceDark,
    inversePrimary = green_inversePrimaryDark,
    surfaceDim = green_surfaceDimDark,
    surfaceBright = green_surfaceBrightDark,
    surfaceContainerLowest = green_surfaceContainerLowestDark,
    surfaceContainerLow = green_surfaceContainerLowDark,
    surfaceContainer = green_surfaceContainerDark,
    surfaceContainerHigh = green_surfaceContainerHighDark,
    surfaceContainerHighest = green_surfaceContainerHighestDark,
)


enum class ThemeType{RED, GREEN, YELLOW, BLUE}

@Composable
fun NavigationDREWTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    // Dynamic color is available on Android 12+
    dynamicColor: Boolean = true,
    colorScheme: ColorScheme,
    content: @Composable () -> Unit
) {
    /*val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }

        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }*/


    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )


}
