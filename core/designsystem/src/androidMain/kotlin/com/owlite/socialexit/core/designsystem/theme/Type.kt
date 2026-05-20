package com.owlite.socialexit.core.designsystem.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.googlefonts.Font
import androidx.compose.ui.text.googlefonts.GoogleFont
import androidx.compose.ui.unit.sp
import com.owlite.socialexit.core.designsystem.R

/**
 * Typography.kt — Layer 2: Type scale
 *
 * Two font families:
 *   Syne — display, headlines, labels (buttons, eyebrows)
 *   DM Sans — body, supporting text, descriptions
 *
 * Mapped to M3 type scale roles:
 *   Display → app name, hero numbers (23 exits, 87%)
 *   Headline → screen titles, section headers
 *   Title → card titles, dialog headers
 *   Body → descriptions, script previews
 *   Label → buttons, chips, eyebrows, nav labels
 */
val provider = GoogleFont.Provider(
    providerAuthority = "com.google.android.gms.fonts",
    providerPackage = "com.google.android.gms",
    certificates = R.array.com_google_android_gms_fonts_certs,
)

val fontOrbitron = GoogleFont("Orbitron")
val OrbitronFontFamily = FontFamily(
    Font(
        googleFont = fontOrbitron,
        fontProvider = provider,
    ),
)

val fontSyne = GoogleFont("Syne")
val SyneFontFamily = FontFamily(
    Font(
        googleFont = fontSyne,
        fontProvider = provider,
        weight = FontWeight.Normal,
    ),
    Font(
        googleFont = fontSyne,
        fontProvider = provider,
        weight = FontWeight.Medium,
    ),
    Font(
        googleFont = fontSyne,
        fontProvider = provider,
        weight = FontWeight.Bold,
    ),
    Font(
        googleFont = fontSyne,
        fontProvider = provider,
        weight = FontWeight.ExtraBold,
    ),
)

val fontDMSans = GoogleFont("DM Sans")
val DmSansFontFamily = FontFamily(
    Font(
        googleFont = fontDMSans,
        fontProvider = provider,
        weight = FontWeight.Light,
    ),
    Font(
        googleFont = fontDMSans,
        fontProvider = provider,
        weight = FontWeight.Normal,
    ),
    Font(
        googleFont = fontDMSans,
        fontProvider = provider,
        weight = FontWeight.Medium,
    ),
    Font(
        googleFont = fontDMSans,
        fontProvider = provider,
        weight = FontWeight.SemiBold,
    ),
)

internal val SocialExitTypography = Typography(
    // Display — app name, hero stat numbers
    displayLarge = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 57.sp,
        lineHeight = 64.sp,
        letterSpacing = (-0.25).sp,
    ),
    displayMedium = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 45.sp,
        lineHeight = 52.sp,
        letterSpacing = 0.sp,
    ),
    displaySmall = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 36.sp,
        lineHeight = 44.sp,
        letterSpacing = 0.sp,
    ),

    // Headline — screen titles ("Scripts", "History")
    headlineLarge = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 32.sp,
        lineHeight = 40.sp,
        letterSpacing = 0.sp,
    ),
    headlineMedium = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 28.sp,
        lineHeight = 36.sp,
        letterSpacing = 0.sp,
    ),
    headlineSmall = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 24.sp,
        lineHeight = 32.sp,
        letterSpacing = 0.sp,
    ),

    // Title — card titles, dialog headers
    titleLarge = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        lineHeight = 28.sp,
        letterSpacing = 0.sp,
    ),
    titleMedium = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.Bold,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.15.sp,
    ),
    titleSmall = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.1.sp,
    ),

    // Body — script previews, descriptions, settings rows
    bodyLarge = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp,
    ),
    bodyMedium = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.25.sp,
    ),
    bodySmall = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.4.sp,
    ),

    // Label — buttons, chips, nav, eyebrow labels
    labelLarge = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 14.sp,
        lineHeight = 20.sp,
        letterSpacing = 0.5.sp,
    ),
    labelMedium = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 12.sp,
        lineHeight = 16.sp,
        letterSpacing = 0.5.sp,
    ),
    labelSmall = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.Medium,
        fontSize = 10.sp,
        lineHeight = 14.sp,
        letterSpacing = 0.8.sp,
    ),
)

// Extended
data class ExtendedTypography(
    // Section eyebrow labels ("TRIGGER METHOD", "YOUR CALLERS")
    val eyebrow: TextStyle,

    // Countdown timer number (large mono-weight digit)
    val countdownTimer: TextStyle,

    // Script preview italic text inside cards
    val scriptPreview: TextStyle,

    // Status card state text ("Guardian armed", "Ready to arm")
    val statusHeadline: TextStyle,

    // Caller name on the incoming call screen
    val callerName: TextStyle,
)

val SocialExitExtendedTypography = ExtendedTypography(
    eyebrow = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.SemiBold,
        fontSize = 11.sp,
        lineHeight = 14.sp,
        letterSpacing = 1.2.sp,
    ),
    countdownTimer = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 28.sp,
        lineHeight = 32.sp,
        letterSpacing = (-0.5).sp,
    ),
    scriptPreview = TextStyle(
        fontFamily = DmSansFontFamily,
        fontWeight = FontWeight.Normal,
        fontSize = 12.sp,
        lineHeight = 18.sp,
        letterSpacing = 0.sp,
        // fontStyle = FontStyle.Italic — apply at call site
    ),
    statusHeadline = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 20.sp,
        lineHeight = 26.sp,
        letterSpacing = 0.sp,
    ),
    callerName = TextStyle(
        fontFamily = SyneFontFamily,
        fontWeight = FontWeight.ExtraBold,
        fontSize = 24.sp,
        lineHeight = 30.sp,
        letterSpacing = 0.sp,
    ),
)
