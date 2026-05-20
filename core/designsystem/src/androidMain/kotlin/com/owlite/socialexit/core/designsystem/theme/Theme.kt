package com.owlite.socialexit.core.designsystem.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.ReadOnlyComposable

/**
 * Theme.kt — Layer 3: Composition root
 *
 * Wires all token layers into a single SocialExitTheme composable.
 * Provides both M3 MaterialTheme and all custom CompositionLocals.
 *
 * Usage:
 *   SocialExitTheme {
 *       Scaffold { ... }
 *   }
 *
 * Token access in composables:
 *   MaterialTheme.colorScheme.primary ← M3 system tokens
 *   MaterialTheme.extendedColors.warning ← extended ramps
 *   MaterialTheme.semanticColors.armed ← guardian states
 *   MaterialTheme.categoryColors.homeContainer ← script categories
 *   MaterialTheme.badgeColors.activeContainer ← badge semantics
 *   MaterialTheme.surfaces.surface1 ← elevation stops
 *   MaterialTheme.content.accent ← text/icon roles
 *   MaterialTheme.borders.accent ← border strengths
 *   MaterialTheme.spacing.screenHorizontal ← spacing scale
 *   MaterialTheme.motion.pulseRingDuration ← animation tokens
 *   MaterialTheme.extendedShapes.pill ← shape overrides
 */

@Composable
fun SocialExitTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit,
) {
    val colorScheme = if (darkTheme) {
        SocialExitDarkColorScheme
    } else {
        SocialExitLightColorScheme
    }

    CompositionLocalProvider(
        // Extended M3 ramps (amber, teal)
        LocalExtendedColors provides
                if (darkTheme) darkExtendedColors
                else lightExtendedColors,

        // Component-level semantic tokens
        LocalGuardianStateColors provides
                if (darkTheme) darkGuardianStateColors
                else lightGuardianStateColors,
        LocalCategoryColors provides if (darkTheme) darkCategoryColors else lightCategoryColors,
        LocalBadgeColors provides if (darkTheme) darkBadgeColors else lightBadgeColors,
        LocalSurfaceColors provides if (darkTheme) darkSurfaceColors else lightSurfaceColors,
        LocalContentColors provides if (darkTheme) darkContentColors else lightContentColors,
        LocalBorderColors provides if (darkTheme) darkBorderColors else lightBorderColors,

        // Non-color tokens (same for both modes)
        LocalSpacing provides SocialExitSpacing,
        LocalMotion provides SocialExitMotion,
        LocalExtendedShapes provides SocialExitExtendedShapes,
    ) {
        MaterialTheme(
            colorScheme = colorScheme,
            typography = SocialExitTypography,
            shapes = SocialExitShapes,
            content = content,
        )
    }
}

// MaterialTheme extension properties
// Mirrors the Now In Android pattern so all tokens read as
// MaterialTheme.x rather than LocalX.current.x

val MaterialTheme.extendedColors: ExtendedColors
    @Composable @ReadOnlyComposable get() = LocalExtendedColors.current

val MaterialTheme.semanticColors: GuardianStateColors
    @Composable @ReadOnlyComposable get() = LocalGuardianStateColors.current

val MaterialTheme.categoryColors: CategoryColors
    @Composable @ReadOnlyComposable get() = LocalCategoryColors.current

val MaterialTheme.badgeColors: BadgeColors
    @Composable @ReadOnlyComposable get() = LocalBadgeColors.current

val MaterialTheme.surfaces: SurfaceColors
    @Composable @ReadOnlyComposable get() = LocalSurfaceColors.current

val MaterialTheme.content: ContentColors
    @Composable @ReadOnlyComposable get() = LocalContentColors.current

val MaterialTheme.borders: BorderColors
    @Composable @ReadOnlyComposable get() = LocalBorderColors.current

val MaterialTheme.spacing: Spacing
    @Composable @ReadOnlyComposable get() = LocalSpacing.current

val MaterialTheme.motion: MotionTokens
    @Composable @ReadOnlyComposable get() = LocalMotion.current

val MaterialTheme.extendedShapes: ExtendedShapes
    @Composable @ReadOnlyComposable get() = LocalExtendedShapes.current

val MaterialTheme.extendedTypography: ExtendedTypography
    @Composable @ReadOnlyComposable get() = SocialExitExtendedTypography
