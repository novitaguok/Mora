package com.owlite.socialexit.core.designsystem.theme

import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme

/**
 * ColorScheme.kt — Layer 1: Material 3 system tokens
 */
val SocialExitDarkColorScheme = darkColorScheme(
    // Primary
    primary = LimePalette.Lime80,
    onPrimary = LimePalette.Lime20,
    primaryContainer = LimePalette.Lime30, // chip/container fill
    onPrimaryContainer = LimePalette.Lime90, // text/icon on lime container

    // Secondary
    secondary = NeutralVariantPalette.NeutralV80,
    onSecondary = NeutralVariantPalette.NeutralV20,
    secondaryContainer = NeutralVariantPalette.NeutralV30,
    onSecondaryContainer = NeutralVariantPalette.NeutralV90,

    // Tertiary
    tertiary = BluePalette.Blue70,
    onTertiary = BluePalette.Blue10,
    tertiaryContainer = BluePalette.Blue30,
    onTertiaryContainer = BluePalette.Blue90,

    // Error
    error = RedPalette.Red70,
    onError = RedPalette.Red10,
    errorContainer = RedPalette.Red30,
    onErrorContainer = RedPalette.Red90,

    // Background
    background = NeutralPalette.Neutral4,
    onBackground = NeutralPalette.Neutral90,

    // Surface
    surface = NeutralPalette.Neutral10,
    onSurface = NeutralPalette.Neutral90,
    surfaceVariant = NeutralVariantPalette.NeutralV30,
    onSurfaceVariant = NeutralVariantPalette.NeutralV80,
    surfaceTint = LimePalette.Lime80,
    surfaceContainerLowest = NeutralPalette.Neutral4,
    surfaceContainerLow = NeutralPalette.Neutral10,
    surfaceContainer = NeutralPalette.Neutral17,
    surfaceContainerHigh = NeutralPalette.Neutral22,
    surfaceContainerHighest = NeutralPalette.Neutral24,

    // Outline
    outline = NeutralVariantPalette.NeutralV60, // subtle dividers
    outlineVariant = NeutralVariantPalette.NeutralV40, // stronger borders / hover

    // Inverse
    inverseSurface = NeutralPalette.Neutral90,
    inverseOnSurface = NeutralPalette.Neutral10,
    inversePrimary = LimePalette.Lime40,

    // Scrim
    scrim = NeutralPalette.Neutral0,
)

val SocialExitLightColorScheme = lightColorScheme(
    // Primary
    primary = LimePalette.Lime40,
    onPrimary = LimePalette.Lime100,
    primaryContainer = LimePalette.Lime90,
    onPrimaryContainer = LimePalette.Lime10,

    // Secondary
    secondary = NeutralVariantPalette.NeutralV40,
    onSecondary = NeutralVariantPalette.NeutralV100,
    secondaryContainer = NeutralVariantPalette.NeutralV90,
    onSecondaryContainer = NeutralVariantPalette.NeutralV10,

    // Tertiary
    tertiary = BluePalette.Blue40,
    onTertiary = BluePalette.Blue100,
    tertiaryContainer = BluePalette.Blue95,
    onTertiaryContainer = BluePalette.Blue10,

    // Error
    error = RedPalette.Red40,
    onError = RedPalette.Red100,
    errorContainer = RedPalette.Red95,
    onErrorContainer = RedPalette.Red10,

    // Background
    background = NeutralPalette.Neutral98,
    onBackground = NeutralPalette.Neutral10,

    // Surface
    surface = NeutralPalette.Neutral98,
    onSurface = NeutralPalette.Neutral10,
    surfaceVariant = NeutralVariantPalette.NeutralV90,
    onSurfaceVariant = NeutralVariantPalette.NeutralV40,
    surfaceTint = LimePalette.Lime40,

    surfaceContainerLowest = NeutralPalette.Neutral100,
    surfaceContainerLow = NeutralPalette.Neutral99,
    surfaceContainer = NeutralPalette.Neutral94,
    surfaceContainerHigh = NeutralPalette.Neutral90,
    surfaceContainerHighest = NeutralPalette.Neutral87,

    // Outline
    outline = NeutralVariantPalette.NeutralV50,
    outlineVariant = NeutralVariantPalette.NeutralV80,

    // Inverse
    inverseSurface = NeutralPalette.Neutral22,
    inverseOnSurface = NeutralPalette.Neutral96,
    inversePrimary = LimePalette.Lime80,

    // Scrim
    scrim = NeutralPalette.Neutral0,
)
