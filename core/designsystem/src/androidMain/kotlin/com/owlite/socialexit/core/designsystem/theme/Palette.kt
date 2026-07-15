package com.owlite.socialexit.core.designsystem.theme

import androidx.compose.ui.graphics.Color

/**
 * Palette.kt — Layer 0: Raw color ramps
 *
 * These are NOT used directly in UI. They are the source of truth
 * for semantic tokens defined in ColorScheme.kt and SemanticColors.kt.
 *
 * Naming: <Ramp><Stop> where stop follows Material 3 tonal palette
 * convention: 0 (black) → 100 (white), with key stops at
 * 10, 20, 30, 40, 50, 60, 70, 80, 90, 95, 99.
 *
 * Social Exit uses 5 key ramps:
 *   Lime — primary brand / accent
 *   Neutral — backgrounds, surfaces
 *   NeutralV — surface variants, borders (slightly purple-tinted)
 *   Red — error / danger / destructive
 *   Blue — informational / tertiary
 *   Amber — warning / caution (extended, not M3 standard)
 *   Teal — success-alt / secondary category (extended)
 */

// Lime ramp (primary)
internal object LimePalette {
    val Lime0 = Color(0xFF000000)
    val Lime10 = Color(0xFF0D1700)
    val Lime20 = Color(0xFF1A2E00)
    val Lime30 = Color(0xFF2A4800)
    val Lime40 = Color(0xFF3C6300) // darkest accessible on white (4.5:1)
    val Lime50 = Color(0xFF5C7A05) // light mode primary
    val Lime60 = Color(0xFF7D9E1A)
    val Lime70 = Color(0xFF9DC035)
    val Lime80 = Color(0xFFC8F135) // brand lime — dark mode primary
    val Lime90 = Color(0xFFDCF77A)
    val Lime95 = Color(0xFFEBFAA8)
    val Lime99 = Color(0xFFF7FDE8)
    val Lime100 = Color(0xFFFFFFFF)
}

// Neutral ramp (backgrounds, surfaces)
internal object NeutralPalette {
    val Neutral0 = Color(0xFF000000)
    val Neutral4 = Color(0xFF0A0A0F) // app background
    val Neutral6 = Color(0xFF0F0F15)
    val Neutral10 = Color(0xFF13131A) // Surface 1
    val Neutral12 = Color(0xFF181820)
    val Neutral17 = Color(0xFF1C1C28) // Surface 2
    val Neutral22 = Color(0xFF252535) // Surface 3
    val Neutral24 = Color(0xFF2E2E40) // Surface 4
    val Neutral30 = Color(0xFF3A3A50)
    val Neutral40 = Color(0xFF52526C)
    val Neutral50 = Color(0xFF6B6B88)
    val Neutral60 = Color(0xFF8585A0)
    val Neutral70 = Color(0xFF9090A8) // text secondary dark
    val Neutral80 = Color(0xFFB5B5C8)
    val Neutral87 = Color(0xFFD0D0DE)
    val Neutral90 = Color(0xFFE4E4DE) // surface 3 light
    val Neutral92 = Color(0xFFEAEAE4)
    val Neutral94 = Color(0xFFF0F0EC) // surface 2 light
    val Neutral95 = Color(0xFFF2F2EE)
    val Neutral96 = Color(0xFFF5F5F0)
    val Neutral98 = Color(0xFFF7F7F5) // background light
    val Neutral99 = Color(0xFFFAFAF7)
    val Neutral100 = Color(0xFFFFFFFF)
}

// NeutralVariant ramp (borders, chips, surface tints)
internal object NeutralVariantPalette {
    val NeutralV0 = Color(0xFF000000)
    val NeutralV10 = Color(0xFF0D0D1A)
    val NeutralV20 = Color(0xFF1A1A30)
    val NeutralV30 = Color(0xFF2A2A45)
    val NeutralV40 = Color(0xFF3D3D5C)
    val NeutralV50 = Color(0xFF525272)
    val NeutralV60 = Color(0xFF5A5A72) // text tertiary dark
    val NeutralV70 = Color(0xFF7272A0)
    val NeutralV80 = Color(0xFF9090B8)
    val NeutralV90 = Color(0xFFD0D0E0)
    val NeutralV95 = Color(0xFFE8E8F0)
    val NeutralV99 = Color(0xFFF7F7FC)
    val NeutralV100 = Color(0xFFFFFFFF)
}

// Red ramp (error / danger)
internal object RedPalette {
    val Red0 = Color(0xFF000000)
    val Red10 = Color(0xFF330000)
    val Red20 = Color(0xFF580000)
    val Red30 = Color(0xFF7A0000)
    val Red40 = Color(0xFFB3261E) // light mode error
    val Red50 = Color(0xFFD43B32)
    val Red60 = Color(0xFFE65C50)
    val Red70 = Color(0xFFFF5C5C) // dark mode error
    val Red80 = Color(0xFFFF8A80)
    val Red90 = Color(0xFFFFDAD6)
    val Red95 = Color(0xFFFAECE7)
    val Red99 = Color(0xFFFCF5F4)
    val Red100 = Color(0xFFFFFFFF)
}

// Blue ramp (tertiary / informational)
internal object BluePalette {
    val Blue0 = Color(0xFF000000)
    val Blue10 = Color(0xFF02192E)
    val Blue20 = Color(0xFF042C53)
    val Blue30 = Color(0xFF0C447C)
    val Blue40 = Color(0xFF185FA5) // light mode tertiary
    val Blue50 = Color(0xFF2478CC)
    val Blue60 = Color(0xFF378ADD)
    val Blue70 = Color(0xFF4A9EFF) // dark mode tertiary
    val Blue80 = Color(0xFF85BEFF)
    val Blue90 = Color(0xFFB5D4F4)
    val Blue95 = Color(0xFFE6F1FB)
    val Blue99 = Color(0xFFF5FAFF)
    val Blue100 = Color(0xFFFFFFFF)
}

// Amber ramp (warning — extended token)
internal object AmberPalette {
    val Amber0 = Color(0xFF000000)
    val Amber10 = Color(0xFF2A1500)
    val Amber20 = Color(0xFF4A2A00)
    val Amber30 = Color(0xFF6B3D00)
    val Amber40 = Color(0xFF854F0B) // light mode warning
    val Amber50 = Color(0xFFAA6A0F)
    val Amber60 = Color(0xFFCC8A14)
    val Amber70 = Color(0xFFEF9F27)
    val Amber80 = Color(0xFFFFC94A) // dark mode warning
    val Amber90 = Color(0xFFFFE0A0)
    val Amber95 = Color(0xFFFAEEDA)
    val Amber99 = Color(0xFFFFF9F0)
    val Amber100 = Color(0xFFFFFFFF)
}

// Teal ramp (success-alt — extended token)
internal object TealPalette {
    val Teal0 = Color(0xFF000000)
    val Teal10 = Color(0xFF001A12)
    val Teal20 = Color(0xFF003322)
    val Teal30 = Color(0xFF005236)
    val Teal40 = Color(0xFF0A7A52) // light mode teal
    val Teal50 = Color(0xFF12A06E)
    val Teal60 = Color(0xFF1DB88A)
    val Teal70 = Color(0xFF3ECFAA) // dark mode teal
    val Teal80 = Color(0xFF80DFCA)
    val Teal90 = Color(0xFFB5EFE0)
    val Teal95 = Color(0xFFE1F5EE)
    val Teal99 = Color(0xFFF5FCFA)
    val Teal100 = Color(0xFFFFFFFF)
}
