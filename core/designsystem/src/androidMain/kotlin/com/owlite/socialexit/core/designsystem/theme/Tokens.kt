package com.owlite.socialexit.core.designsystem.theme

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Shapes
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

/**
 * Tokens.kt — Layer 2: Shape, spacing, and motion tokens
 *
 * Shape → M3 Shapes + named overrides for specific components
 * Spacing → named scale (xs → 2xl) for consistent padding/gap
 * Motion → named durations and easing for all animations
 */

// Shape
val SocialExitShapes = Shapes(
    // M3 shape scale
    extraSmall = RoundedCornerShape(4.dp),   // text fields, small chips
    small = RoundedCornerShape(8.dp),   // default chips, small cards
    medium = RoundedCornerShape(12.dp),  // buttons, standard cards
    large = RoundedCornerShape(16.dp),  // bottom sheets, large cards
    extraLarge = RoundedCornerShape(28.dp),  // dialogs, modals
)

/**
 * Component-specific shape overrides — for things that need
 * a shape that doesn't match the general M3 scale role.
 */
@Immutable
data class ExtendedShapes(
    val pill: RoundedCornerShape,       // trigger chips, category filters (50% radius)
    val avatar: RoundedCornerShape,     // circular avatars
    val iconContainer: RoundedCornerShape, // script category icon boxes
    val shieldCard: RoundedCornerShape, // home screen shield card
    val phoneFrame: RoundedCornerShape, // fake incoming call overlay
    val toggle: RoundedCornerShape,     // toggle switch track
)

val SocialExitExtendedShapes = ExtendedShapes(
    pill = RoundedCornerShape(50),
    avatar = RoundedCornerShape(50),
    iconContainer = RoundedCornerShape(8.dp),
    shieldCard = RoundedCornerShape(16.dp),
    phoneFrame = RoundedCornerShape(38.dp),
    toggle = RoundedCornerShape(10.dp),
)

val LocalExtendedShapes = staticCompositionLocalOf { SocialExitExtendedShapes }

// Spacing
/**
 * Named spacing scale. Prefer using these over raw dp values
 * so a single change here propagates everywhere.
 *
 * Usage:
 *   Modifier.padding(horizontal = LocalSpacing.current.screenHorizontal)
 */
@Immutable
data class Spacing(
    val xs: Dp, // 4.dp — icon-to-label gap, badge padding
    val sm: Dp, // 8.dp — between chip rows
    val md: Dp, // 12.dp — card internal padding (compact)
    val lg: Dp, // 16.dp — card internal padding (standard)
    val xl: Dp, // 20.dp — section horizontal padding
    val xxl: Dp, // 28.dp — section vertical gaps

    val screenHorizontal: Dp, // 20.dp — standard screen side padding
    val screenVertical: Dp, // 18.dp — standard screen top padding
    val cardPadding: Dp, // 14.dp — inside cards
    val sectionGap: Dp, // 16.dp — between sections

    val iconContainerSize: Dp, // 36.dp — script category icon box
    val avatarSize: Dp, // 38.dp — caller list avatar
    val avatarSizeLg: Dp, // 64.dp — caller hero avatar
    val toggleWidth: Dp, // 36.dp
    val toggleHeight: Dp, // 20.dp
    val navBarHeight: Dp, // 56.dp
    val statusBarHeight: Dp, // 44.dp
)

val SocialExitSpacing = Spacing(
    xs = 4.dp,
    sm = 8.dp,
    md = 12.dp,
    lg = 16.dp,
    xl = 20.dp,
    xxl = 28.dp,

    screenHorizontal = 20.dp,
    screenVertical = 18.dp,
    cardPadding = 14.dp,
    sectionGap = 16.dp,

    iconContainerSize = 36.dp,
    avatarSize = 38.dp,
    avatarSizeLg = 64.dp,
    toggleWidth = 36.dp,
    toggleHeight = 20.dp,
    navBarHeight = 56.dp,
    statusBarHeight = 44.dp,
)
val LocalSpacing = staticCompositionLocalOf { SocialExitSpacing }

// Motion
/**
 * Named animation durations (ms) and easing curves.
 * Use with Compose's `tween()`, `spring()`, or `keyframes()`.
 *
 * Groups:
 *   Instant — immediate visual feedback (ripples, toggle thumb)
 *   Short — small element transitions (chip select, badge appear)
 *   Standard — screen transitions, sheet open/close
 *   Long — emphasis animations (pulse ring, waveform)
 *   Infinite — looping animations (pulse, blink, wave)
 */
@Immutable
data class MotionTokens(
    // Durations (ms)
    val durationInstant: Int, // 100ms — button press feedback
    val durationShort1: Int, // 150ms — toggle, chip select
    val durationShort2: Int, // 180ms — screen enter/exit
    val durationMedium1: Int, // 250ms — bottom sheet, dialog
    val durationMedium2: Int, // 350ms — page-level transitions
    val durationLong: Int, // 500ms — emphasis (shield reveal)

    // Looping animation durations (ms)
    val pulseRingDuration: Int, // 2000ms — armed state pulse ring
    val waveformBarDuration: Int, // 1100ms — call waveform bars
    val statusBlinkDuration: Int, // 1400ms — "● Incoming call…" blink
    val countdownTickDuration: Int, // 1000ms — countdown ring tick

    // Stagger delays for waveform bars (ms)
    val waveformStaggerStep: Int, // 50ms per bar

    // Easing descriptions — use these with Android's Interpolator or Compose EasingSpec
    // FastOutSlowIn → standard enter transitions
    // LinearOutSlowIn → elements entering from off-screen
    // FastOutLinearIn → elements exiting to off-screen
    // EaseInOut → looping / emphasis animations (pulse, blink)
)

val SocialExitMotion = MotionTokens(
    durationInstant = 100,
    durationShort1 = 150,
    durationShort2 = 180,
    durationMedium1 = 250,
    durationMedium2 = 350,
    durationLong = 500,

    pulseRingDuration = 2000,
    waveformBarDuration = 1100,
    statusBlinkDuration = 1400,
    countdownTickDuration = 1000,

    waveformStaggerStep = 50,
)
val LocalMotion = staticCompositionLocalOf { SocialExitMotion }
