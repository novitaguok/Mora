package com.owlite.socialexit.core.designsystem.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color

/**
 * SemanticColors.kt — Layer 2: Extended + semantic tokens
 *
 * Structure (mirrors Now In Android's approach):
 *   ExtendedColors — extra ramps outside M3 (amber, teal)
 *   SemanticColors — named UI states (armed, cooldown, success, etc.)
 *   SurfaceColors — named elevation stops for quick reference
 *   ContentColors — text/icon roles beyond onSurface / onBackground
 *   BorderColors — named border strengths
 *
 * Access via:
 *   MaterialTheme.extendedColors.warning
 *   MaterialTheme.semanticColors.armed
 */

// Extended ramps (M3 doesn't model these)

@Immutable
data class ExtendedColors(
    val warning: Color,
    val onWarning: Color,
    val warningContainer: Color,
    val onWarningContainer: Color,

    val teal: Color,
    val onTeal: Color,
    val tealContainer: Color,
    val onTealContainer: Color,
)

val darkExtendedColors = ExtendedColors(
    warning = AmberPalette.Amber80,
    onWarning = AmberPalette.Amber20,
    warningContainer = AmberPalette.Amber30,
    onWarningContainer = AmberPalette.Amber90,

    teal = TealPalette.Teal70,
    onTeal = TealPalette.Teal10,
    tealContainer = TealPalette.Teal30,
    onTealContainer = TealPalette.Teal90,
)

val lightExtendedColors = ExtendedColors(
    warning = AmberPalette.Amber40,
    onWarning = AmberPalette.Amber100,
    warningContainer = AmberPalette.Amber95,
    onWarningContainer = AmberPalette.Amber10,

    teal = TealPalette.Teal40,
    onTeal = TealPalette.Teal100,
    tealContainer = TealPalette.Teal95,
    onTealContainer = TealPalette.Teal10,
)

// Component-level semantic tokens
@Immutable
data class GuardianStateColors(
    // Idle — app launched, not armed
    val idleContainer: Color,
    val onIdle: Color,
    val idleBorder: Color,

    // Armed — trigger detected, countdown running
    val armedContainer: Color,
    val onArmed: Color,
    val armedBorder: Color,
    val armedPulse: Color,

    // Calling — fake call in progress
    val callingContainer: Color,
    val onCalling: Color,
    val callingBorder: Color,
    val callingBlink: Color,

    // Cooldown — post-exit lockout period
    val cooldownContainer: Color,
    val onCooldown: Color,
    val cooldownBorder: Color,

    // Error — trigger or API failure
    val errorContainer: Color,
    val onError: Color,
    val errorBorder: Color,
)

val darkGuardianStateColors = GuardianStateColors(
    // Idle
    idleContainer = NeutralPalette.Neutral10,
    onIdle = NeutralPalette.Neutral70,
    idleBorder = NeutralVariantPalette.NeutralV30,

    // Armed → lime
    armedContainer = LimePalette.Lime30,
    onArmed = LimePalette.Lime90,
    armedBorder = LimePalette.Lime80.copy(alpha = 0.4f),
    armedPulse = LimePalette.Lime80.copy(alpha = 0.2f),

    // Calling → blue
    callingContainer = BluePalette.Blue30,
    onCalling = BluePalette.Blue90,
    callingBorder = BluePalette.Blue70.copy(alpha = 0.4f),
    callingBlink = BluePalette.Blue70,

    // Cooldown → amber
    cooldownContainer = AmberPalette.Amber30,
    onCooldown = AmberPalette.Amber90,
    cooldownBorder = AmberPalette.Amber80.copy(alpha = 0.4f),

    // Error → red
    errorContainer = RedPalette.Red30,
    onError = RedPalette.Red90,
    errorBorder = RedPalette.Red70.copy(alpha = 0.4f),
)

val lightGuardianStateColors = GuardianStateColors(
    idleContainer = NeutralPalette.Neutral94,
    onIdle = NeutralPalette.Neutral40,
    idleBorder = NeutralVariantPalette.NeutralV80,

    armedContainer = LimePalette.Lime90,
    onArmed = LimePalette.Lime10,
    armedBorder = LimePalette.Lime40.copy(alpha = 0.5f),
    armedPulse = LimePalette.Lime40.copy(alpha = 0.15f),

    callingContainer = BluePalette.Blue95,
    onCalling = BluePalette.Blue10,
    callingBorder = BluePalette.Blue40.copy(alpha = 0.5f),
    callingBlink = BluePalette.Blue40,

    cooldownContainer = AmberPalette.Amber95,
    onCooldown = AmberPalette.Amber10,
    cooldownBorder = AmberPalette.Amber40.copy(alpha = 0.5f),

    errorContainer = RedPalette.Red95,
    onError = RedPalette.Red10,
    errorBorder = RedPalette.Red40.copy(alpha = 0.5f),
)

// Script category colors
@Immutable
data class CategoryColors(
    val homeContainer: Color,
    val onHome: Color,
    val familyContainer: Color,
    val onFamily: Color,
    val workContainer: Color,
    val onWork: Color,
    val petContainer: Color,
    val onPet: Color,
    val customContainer: Color,
    val onCustom: Color,
)

val darkCategoryColors = CategoryColors(
    homeContainer = BluePalette.Blue70.copy(alpha = 0.15f),
    onHome = BluePalette.Blue70,
    familyContainer = AmberPalette.Amber80.copy(alpha = 0.15f),
    onFamily = AmberPalette.Amber80,
    workContainer = TealPalette.Teal70.copy(alpha = 0.15f),
    onWork = TealPalette.Teal70,
    petContainer = LimePalette.Lime80.copy(alpha = 0.12f),
    onPet = LimePalette.Lime80,
    customContainer = NeutralVariantPalette.NeutralV40.copy(alpha = 0.3f),
    onCustom = NeutralVariantPalette.NeutralV80,
)

val lightCategoryColors = CategoryColors(
    homeContainer = BluePalette.Blue95,
    onHome = BluePalette.Blue30,
    familyContainer = AmberPalette.Amber95,
    onFamily = AmberPalette.Amber30,
    workContainer = TealPalette.Teal95,
    onWork = TealPalette.Teal30,
    petContainer = LimePalette.Lime95,
    onPet = LimePalette.Lime30,
    customContainer = NeutralVariantPalette.NeutralV90,
    onCustom = NeutralVariantPalette.NeutralV40,
)

// Badge / pill semantic colors
@Immutable
data class BadgeColors(
    // Active script badge (lime tint)
    val activeContainer: Color,
    val onActive: Color,
    // New badge (blue tint)
    val newContainer: Color,
    val onNew: Color,
    // Success outcome (exit worked)
    val successContainer: Color,
    val onSuccess: Color,
    // Partial outcome (bit awkward)
    val cautionContainer: Color,
    val onCaution: Color,
    // Failed outcome (they knew)
    val failContainer: Color,
    val onFail: Color,
)

val darkBadgeColors = BadgeColors(
    activeContainer = LimePalette.Lime80.copy(alpha = 0.15f),
    onActive = LimePalette.Lime80,
    newContainer = BluePalette.Blue70.copy(alpha = 0.15f),
    onNew = BluePalette.Blue70,
    successContainer = TealPalette.Teal70.copy(alpha = 0.15f),
    onSuccess = TealPalette.Teal70,
    cautionContainer = AmberPalette.Amber80.copy(alpha = 0.15f),
    onCaution = AmberPalette.Amber80,
    failContainer = RedPalette.Red70.copy(alpha = 0.15f),
    onFail = RedPalette.Red70,
)

val lightBadgeColors = BadgeColors(
    activeContainer = LimePalette.Lime90,
    onActive = LimePalette.Lime20,
    newContainer = BluePalette.Blue95,
    onNew = BluePalette.Blue30,
    successContainer = TealPalette.Teal95,
    onSuccess = TealPalette.Teal30,
    cautionContainer = AmberPalette.Amber95,
    onCaution = AmberPalette.Amber30,
    failContainer = RedPalette.Red95,
    onFail = RedPalette.Red30,
)

// Surface / elevation quick-reference
@Immutable
data class SurfaceColors(
    val base: Color, // = background
    val surface1: Color, // cards
    val surface2: Color, // nested elements
    val surface3: Color, // active/pressed
    val surface4: Color, // top-most elevated
    val overlay: Color, // scrim / dimming
)

val darkSurfaceColors = SurfaceColors(
    base = NeutralPalette.Neutral4,
    surface1 = NeutralPalette.Neutral10,
    surface2 = NeutralPalette.Neutral17,
    surface3 = NeutralPalette.Neutral22,
    surface4 = NeutralPalette.Neutral24,
    overlay = NeutralPalette.Neutral0.copy(alpha = 0.8f),
)

val lightSurfaceColors = SurfaceColors(
    base = NeutralPalette.Neutral98,
    surface1 = NeutralPalette.Neutral100,
    surface2 = NeutralPalette.Neutral94,
    surface3 = NeutralPalette.Neutral90,
    surface4 = NeutralPalette.Neutral87,
    overlay = NeutralPalette.Neutral0.copy(alpha = 0.5f),
)

// Content (text/icon) semantic tokens
@Immutable
data class ContentColors(
    val primary: Color, // headlines, main labels
    val secondary: Color, // descriptions, subtext
    val tertiary: Color, // hints, timestamps, disabled
    val accent: Color, // active values, links
    val onAccent: Color, // text placed directly on accent
    val disabled: Color, // all disabled text
)

val darkContentColors = ContentColors(
    primary = NeutralPalette.Neutral90,
    secondary = NeutralPalette.Neutral70,
    tertiary = NeutralVariantPalette.NeutralV60,
    accent = LimePalette.Lime80,
    onAccent = LimePalette.Lime20,
    disabled = NeutralVariantPalette.NeutralV40,
)

val lightContentColors = ContentColors(
    primary = NeutralPalette.Neutral10,
    secondary = NeutralPalette.Neutral40,
    tertiary = NeutralVariantPalette.NeutralV50,
    accent = LimePalette.Lime40,
    onAccent = LimePalette.Lime100,
    disabled = NeutralVariantPalette.NeutralV70,
)

// Border semantic tokens
@Immutable
data class BorderColors(
    val subtle: Color, // default card/row divider
    val medium: Color, // hover / emphasis
    val strong: Color, // focused input
    val accent: Color, // selected chip / active card
    val accentSubtle: Color, // pulse ring outer rings
)

val darkBorderColors = BorderColors(
    subtle = Color.White.copy(alpha = 0.07f),
    medium = Color.White.copy(alpha = 0.13f),
    strong = Color.White.copy(alpha = 0.25f),
    accent = LimePalette.Lime80.copy(alpha = 0.4f),
    accentSubtle = LimePalette.Lime80.copy(alpha = 0.15f),
)

val lightBorderColors = BorderColors(
    subtle = Color.Black.copy(alpha = 0.07f),
    medium = Color.Black.copy(alpha = 0.12f),
    strong = Color.Black.copy(alpha = 0.25f),
    accent = LimePalette.Lime40.copy(alpha = 0.5f),
    accentSubtle = LimePalette.Lime40.copy(alpha = 0.15f),
)

val LocalExtendedColors = staticCompositionLocalOf { darkExtendedColors }
val LocalGuardianStateColors = staticCompositionLocalOf { darkGuardianStateColors }
val LocalCategoryColors = staticCompositionLocalOf { darkCategoryColors }
val LocalBadgeColors = staticCompositionLocalOf { darkBadgeColors }
val LocalSurfaceColors = staticCompositionLocalOf { darkSurfaceColors }
val LocalContentColors = staticCompositionLocalOf { darkContentColors }
val LocalBorderColors = staticCompositionLocalOf { darkBorderColors }
