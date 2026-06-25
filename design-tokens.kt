// Design Tokens — Generated from Figma
// Plugin: DS Studio Token v1.0
// Source: Plugin Live State (NOT JSON file)

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.unit.Density
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

private object _AppPrimitives {
  // ==========================================
  // PRIMITIVES — Global Colors
  // ==========================================

  // Brand Primary
  val brandPrimaryLight = Color(0xFFFBDE7B)
  val brandPrimaryLightHover = Color(0xFFFBD965)
  val brandPrimaryLightActive = Color(0xFFFAD34F)
  val brandPrimaryDefault = Color(0xFFF9C823)
  val brandPrimaryDefaultHover = Color(0xFFE5B820)
  val brandPrimaryDefaultActive = Color(0xFFD4AA1E)
  val brandPrimaryDark = Color(0xFFBB961A)
  val brandPrimaryDarkHover = Color(0xFFA28217)
  val brandPrimaryDarkActive = Color(0xFF896E13)
  val brandPrimaryDarker = Color(0xFF705A10)

  // Brand Secondary
  val brandSecondaryLight = Color(0xFFFD96A8)
  val brandSecondaryLightHover = Color(0xFFFD859A)
  val brandSecondaryLightActive = Color(0xFFFD738B)
  val brandSecondaryDefault = Color(0xFFFC506E)
  val brandSecondaryDefaultHover = Color(0xFFE84A65)
  val brandSecondaryDefaultActive = Color(0xFFD6445E)
  val brandSecondaryDark = Color(0xFFBD3C53)
  val brandSecondaryDarkHover = Color(0xFFA43448)
  val brandSecondaryDarkActive = Color(0xFF8B2C3D)
  val brandSecondaryDarker = Color(0xFF712431)

  // Status Success
  val statusSuccessLight = Color(0xFF6EBFB8)
  val statusSuccessLightHover = Color(0xFF56B4AC)
  val statusSuccessLightActive = Color(0xFF3DA9A0)
  val statusSuccessDefault = Color(0xFF0D9488)
  val statusSuccessDefaultHover = Color(0xFF0C887D)
  val statusSuccessDefaultActive = Color(0xFF0B7E74)
  val statusSuccessDark = Color(0xFF0A6F66)
  val statusSuccessDarkHover = Color(0xFF086058)
  val statusSuccessDarkActive = Color(0xFF07514B)
  val statusSuccessDarker = Color(0xFF06433D)

  // Status Pending
  val statusPendingLight = Color(0xFFFEEC91)
  val statusPendingLightHover = Color(0xFFFEE97E)
  val statusPendingLightActive = Color(0xFFFDE66C)
  val statusPendingDefault = Color(0xFFFDE047)
  val statusPendingDefaultHover = Color(0xFFE9CE41)
  val statusPendingDefaultActive = Color(0xFFD7BE3C)
  val statusPendingDark = Color(0xFFBEA835)
  val statusPendingDarkHover = Color(0xFFA4922E)
  val statusPendingDarkActive = Color(0xFF8B7B27)
  val statusPendingDarker = Color(0xFF726520)

  // Status Warning
  val statusWarningLight = Color(0xFFDA8D6D)
  val statusWarningLightHover = Color(0xFFD47A55)
  val statusWarningLightActive = Color(0xFFCE673D)
  val statusWarningDefault = Color(0xFFC2410C)
  val statusWarningDefaultHover = Color(0xFFB23C0B)
  val statusWarningDefaultActive = Color(0xFFA5370A)
  val statusWarningDark = Color(0xFF923109)
  val statusWarningDarkHover = Color(0xFF7E2A08)
  val statusWarningDarkActive = Color(0xFF6B2407)
  val statusWarningDarker = Color(0xFF571D05)

  // Status Error
  val statusErrorLight = Color(0xFFF58F8F)
  val statusErrorLightHover = Color(0xFFF47C7C)
  val statusErrorLightActive = Color(0xFFF26969)
  val statusErrorDefault = Color(0xFFEF4444)
  val statusErrorDefaultHover = Color(0xFFDC3F3F)
  val statusErrorDefaultActive = Color(0xFFCB3A3A)
  val statusErrorDark = Color(0xFFB33333)
  val statusErrorDarkHover = Color(0xFF9B2C2C)
  val statusErrorDarkActive = Color(0xFF832525)
  val statusErrorDarker = Color(0xFF6C1F1F)

  // Neutrals Light
  val neutralsLightBackground = Color(0xFFF8F7F4)
  val neutralsLightSurface = Color(0xFFFFFFFF)
  val neutralsLightBorders = Color(0xFFE7E6E4)
  val neutralsLightDividers = Color(0xFFF3F3F1)
  val neutralsLightHover = Color(0xFFF3F3F1)
  val neutralsLightBlack = Color(0xFF0B0B0C)
  val neutralsLightTextgray = Color(0xFFB1B1B1)

  // Neutrals Dark
  val neutralsDarkBackground = Color(0xFF0D0C0B)
  val neutralsDarkSurface = Color(0xFF181714)
  val neutralsDarkBorders = Color(0xFF25231F)
  val neutralsDarkDividers = Color(0xFF1F1E1A)
  val neutralsDarkHover = Color(0xFF21201C)
  val neutralsDarkWhite = Color(0xFFFFFFFF)
  val neutralsDarkTextgray = Color(0xFF6B6B6B)

  // ==========================================
  // TYPOGRAPHY
  // ==========================================
  // Font name: "Cairo"
  val typoFontFamilyPrimary = cairoFontFamily
  // Font name: "SF Pro"
  val typoFontFamilySecondary = sf_proFontFamily
  val typoFontSizeDisplayLg = 48.sp
  val typoLineHeightDisplayLg = 56.sp
  val typoLetterSpacingDisplayLg = 0.sp
  val typoFontWeightDisplayLg = FontWeight.W500
  val typoFontSizeDisplayMd = 44.sp
  val typoLineHeightDisplayMd = 52.sp
  val typoLetterSpacingDisplayMd = 0.sp
  val typoFontWeightDisplayMd = FontWeight.W600
  val typoFontSizeDisplaySm = 32.sp
  val typoLineHeightDisplaySm = 40.sp
  val typoLetterSpacingDisplaySm = 0.sp
  val typoFontWeightDisplaySm = FontWeight.W500
  val typoFontSizeH1 = 31.sp
  val typoLineHeightH1 = 47.sp
  val typoLetterSpacingH1 = 0.sp
  val typoFontWeightH1 = FontWeight.W400
  val typoFontSizeH2 = 24.sp
  val typoLineHeightH2 = 32.sp
  val typoLetterSpacingH2 = 0.sp
  val typoFontWeightH2 = FontWeight.W400
  val typoFontSizeH3 = 20.sp
  val typoLineHeightH3 = 28.sp
  val typoLetterSpacingH3 = 0.sp
  val typoFontWeightH3 = FontWeight.W400
  val typoFontSizeH4 = 18.sp
  val typoLineHeightH4 = 28.sp
  val typoLetterSpacingH4 = 0.sp
  val typoFontWeightH4 = FontWeight.W400
  val typoFontSizeBodyLg = 16.sp
  val typoLineHeightBodyLg = 24.sp
  val typoLetterSpacingBodyLg = 0.sp
  val typoFontWeightBodyLg = FontWeight.W400
  val typoFontSizeBody = 14.sp
  val typoLineHeightBody = 24.sp
  val typoLetterSpacingBody = 0.sp
  val typoFontWeightBody = FontWeight.W400
  val typoFontSizeBodySm = 12.sp
  val typoLineHeightBodySm = 20.sp
  val typoLetterSpacingBodySm = 0.sp
  val typoFontWeightBodySm = FontWeight.W400
  val typoFontSizeButton = 16.sp
  val typoLineHeightButton = 24.sp
  val typoLetterSpacingButton = 0.sp
  val typoFontWeightButton = FontWeight.W400
  val typoFontSizeLabel = 14.sp
  val typoLineHeightLabel = 24.sp
  val typoLetterSpacingLabel = 0.sp
  val typoFontWeightLabel = FontWeight.W400
  val typoFontSizeCaption = 10.sp
  val typoLineHeightCaption = 24.sp
  val typoLetterSpacingCaption = 0.sp
  val typoFontWeightCaption = FontWeight.W400

  // ==========================================
  // SPACING
  // ==========================================
  val spaceXs = 4.dp
  val spaceSm = 8.dp
  val spaceMd = 12.dp
  val spaceLg = 16.dp
  val spaceXl = 20.dp
  val space2xl = 24.dp
  val space3xl = 28.dp
  val space4xl = 32.dp
  val space5xl = 36.dp
  val space6xl = 40.dp
  val space7xl = 44.dp
  val space8xl = 48.dp

  // ==========================================
  // RADIUS
  // ==========================================
  val radiusXs = 4.dp
  val radiusSm = 8.dp
  val radiusMd = 12.dp
  val radiusLg = 16.dp
  val radiusXl = 20.dp
  val radius2xl = 24.dp
  val radius3xl = 32.dp

  // ==========================================
  // BORDER WIDTHS
  // ==========================================
  val borderThin = 1.dp
  val borderMedium = 1.5.dp
  val borderThick = 2.dp

  // ==========================================
  // ELEVATION
  // ==========================================
  val elevation0 = AppShadow(
    offsetX = 4.dp,
    offsetY = 7.dp,
    blurRadius = 39.dp,
    spreadRadius = 3.dp,
    color = Color(0x170B0B0C),
  )
  val elevation1 = AppShadow(
    offsetX = 1.dp,
    offsetY = 4.dp,
    blurRadius = 36.dp,
    spreadRadius = 6.dp,
    color = Color(0x120B0B0C),
  )
  val elevation2 = AppShadow(
    offsetX = 3.dp,
    offsetY = 3.dp,
    blurRadius = 28.dp,
    spreadRadius = 1.dp,
    color = Color(0x0d0B0B0C),
  )

  // ==========================================
  // OPACITY
  // ==========================================
  val opacityDisabled = 0.38f
  val opacityHover = 0.08f
  val opacityActive = 0.12f
  val opacitySelected = 0.16f
}

private val cairoFontFamily = FontFamily(
    Font(R.font.cairo_light, FontWeight.Light),
    Font(R.font.cairo_regular, FontWeight.Normal),
    Font(R.font.cairo_medium, FontWeight.Medium),
    Font(R.font.cairo_semibold, FontWeight.SemiBold),
    Font(R.font.cairo_bold, FontWeight.Bold),
)

private val sf_proFontFamily = FontFamily(
    Font(R.font.sf_pro_light, FontWeight.Light),
    Font(R.font.sf_pro_regular, FontWeight.Normal),
    Font(R.font.sf_pro_medium, FontWeight.Medium),
    Font(R.font.sf_pro_semibold, FontWeight.SemiBold),
    Font(R.font.sf_pro_bold, FontWeight.Bold),
)

@Immutable
data class AppShadow(
  val offsetX: Dp,
  val offsetY: Dp,
  val blurRadius: Dp,
  val spreadRadius: Dp,
  val color: Color,
)

@Immutable
data class AppColorTokens(
  val brandPrimarySubtle: Color,
  val brandPrimarySubtleHover: Color,
  val brandPrimarySubtleActive: Color,
  val brandPrimaryDefault: Color,
  val brandPrimaryDefaultHover: Color,
  val brandPrimaryDefaultActive: Color,
  val brandPrimaryEmphasis: Color,
  val brandPrimaryEmphasisHover: Color,
  val brandPrimaryEmphasisActive: Color,
  val brandPrimaryStrong: Color,
  val brandSecondarySubtle: Color,
  val brandSecondarySubtleHover: Color,
  val brandSecondarySubtleActive: Color,
  val brandSecondaryDefault: Color,
  val brandSecondaryDefaultHover: Color,
  val brandSecondaryDefaultActive: Color,
  val brandSecondaryEmphasis: Color,
  val brandSecondaryEmphasisHover: Color,
  val brandSecondaryEmphasisActive: Color,
  val brandSecondaryStrong: Color,
  val successSubtle: Color,
  val successSubtleHover: Color,
  val successSubtleActive: Color,
  val successDefault: Color,
  val successDefaultHover: Color,
  val successDefaultActive: Color,
  val successEmphasis: Color,
  val successEmphasisHover: Color,
  val successEmphasisActive: Color,
  val successStrong: Color,
  val pendingSubtle: Color,
  val pendingSubtleHover: Color,
  val pendingSubtleActive: Color,
  val pendingDefault: Color,
  val pendingDefaultHover: Color,
  val pendingDefaultActive: Color,
  val pendingEmphasis: Color,
  val pendingEmphasisHover: Color,
  val pendingEmphasisActive: Color,
  val pendingStrong: Color,
  val warningSubtle: Color,
  val warningSubtleHover: Color,
  val warningSubtleActive: Color,
  val warningDefault: Color,
  val warningDefaultHover: Color,
  val warningDefaultActive: Color,
  val warningEmphasis: Color,
  val warningEmphasisHover: Color,
  val warningEmphasisActive: Color,
  val warningStrong: Color,
  val errorSubtle: Color,
  val errorSubtleHover: Color,
  val errorSubtleActive: Color,
  val errorDefault: Color,
  val errorDefaultHover: Color,
  val errorDefaultActive: Color,
  val errorEmphasis: Color,
  val errorEmphasisHover: Color,
  val errorEmphasisActive: Color,
  val errorStrong: Color,
  val background: Color,
  val surface: Color,
  val border: Color,
  val divider: Color,
  val hover: Color,
  val textPrimary: Color,
  val textSecondary: Color
) {
  companion object {
    val Light = AppColorTokens(
      brandPrimarySubtle = _AppPrimitives.brandPrimaryLight,
      brandPrimarySubtleHover = _AppPrimitives.brandPrimaryLightHover,
      brandPrimarySubtleActive = _AppPrimitives.brandPrimaryLightActive,
      brandPrimaryDefault = _AppPrimitives.brandPrimaryDefault,
      brandPrimaryDefaultHover = _AppPrimitives.brandPrimaryDefaultHover,
      brandPrimaryDefaultActive = _AppPrimitives.brandPrimaryDefaultActive,
      brandPrimaryEmphasis = _AppPrimitives.brandPrimaryDark,
      brandPrimaryEmphasisHover = _AppPrimitives.brandPrimaryDarkHover,
      brandPrimaryEmphasisActive = _AppPrimitives.brandPrimaryDarkActive,
      brandPrimaryStrong = _AppPrimitives.brandPrimaryDarker,
      brandSecondarySubtle = _AppPrimitives.brandSecondaryLight,
      brandSecondarySubtleHover = _AppPrimitives.brandSecondaryLightHover,
      brandSecondarySubtleActive = _AppPrimitives.brandSecondaryLightActive,
      brandSecondaryDefault = _AppPrimitives.brandSecondaryDefault,
      brandSecondaryDefaultHover = _AppPrimitives.brandSecondaryDefaultHover,
      brandSecondaryDefaultActive = _AppPrimitives.brandSecondaryDefaultActive,
      brandSecondaryEmphasis = _AppPrimitives.brandSecondaryDark,
      brandSecondaryEmphasisHover = _AppPrimitives.brandSecondaryDarkHover,
      brandSecondaryEmphasisActive = _AppPrimitives.brandSecondaryDarkActive,
      brandSecondaryStrong = _AppPrimitives.brandSecondaryDarker,
      successSubtle = _AppPrimitives.statusSuccessLight,
      successSubtleHover = _AppPrimitives.statusSuccessLightHover,
      successSubtleActive = _AppPrimitives.statusSuccessLightActive,
      successDefault = _AppPrimitives.statusSuccessDefault,
      successDefaultHover = _AppPrimitives.statusSuccessDefaultHover,
      successDefaultActive = _AppPrimitives.statusSuccessDefaultActive,
      successEmphasis = _AppPrimitives.statusSuccessDark,
      successEmphasisHover = _AppPrimitives.statusSuccessDarkHover,
      successEmphasisActive = _AppPrimitives.statusSuccessDarkActive,
      successStrong = _AppPrimitives.statusSuccessDarker,
      pendingSubtle = _AppPrimitives.statusPendingLight,
      pendingSubtleHover = _AppPrimitives.statusPendingLightHover,
      pendingSubtleActive = _AppPrimitives.statusPendingLightActive,
      pendingDefault = _AppPrimitives.statusPendingDefault,
      pendingDefaultHover = _AppPrimitives.statusPendingDefaultHover,
      pendingDefaultActive = _AppPrimitives.statusPendingDefaultActive,
      pendingEmphasis = _AppPrimitives.statusPendingDark,
      pendingEmphasisHover = _AppPrimitives.statusPendingDarkHover,
      pendingEmphasisActive = _AppPrimitives.statusPendingDarkActive,
      pendingStrong = _AppPrimitives.statusPendingDarker,
      warningSubtle = _AppPrimitives.statusWarningLight,
      warningSubtleHover = _AppPrimitives.statusWarningLightHover,
      warningSubtleActive = _AppPrimitives.statusWarningLightActive,
      warningDefault = _AppPrimitives.statusWarningDefault,
      warningDefaultHover = _AppPrimitives.statusWarningDefaultHover,
      warningDefaultActive = _AppPrimitives.statusWarningDefaultActive,
      warningEmphasis = _AppPrimitives.statusWarningDark,
      warningEmphasisHover = _AppPrimitives.statusWarningDarkHover,
      warningEmphasisActive = _AppPrimitives.statusWarningDarkActive,
      warningStrong = _AppPrimitives.statusWarningDarker,
      errorSubtle = _AppPrimitives.statusErrorLight,
      errorSubtleHover = _AppPrimitives.statusErrorLightHover,
      errorSubtleActive = _AppPrimitives.statusErrorLightActive,
      errorDefault = _AppPrimitives.statusErrorDefault,
      errorDefaultHover = _AppPrimitives.statusErrorDefaultHover,
      errorDefaultActive = _AppPrimitives.statusErrorDefaultActive,
      errorEmphasis = _AppPrimitives.statusErrorDark,
      errorEmphasisHover = _AppPrimitives.statusErrorDarkHover,
      errorEmphasisActive = _AppPrimitives.statusErrorDarkActive,
      errorStrong = _AppPrimitives.statusErrorDarker,
      background = _AppPrimitives.neutralsLightBackground,
      surface = _AppPrimitives.neutralsLightSurface,
      border = _AppPrimitives.neutralsLightBorders,
      divider = _AppPrimitives.neutralsLightDividers,
      hover = _AppPrimitives.neutralsLightHover,
      textPrimary = _AppPrimitives.neutralsLightBlack,
      textSecondary = _AppPrimitives.neutralsLightTextgray
    )

    val Dark = AppColorTokens(
      brandPrimarySubtle = _AppPrimitives.brandPrimaryDark,
      brandPrimarySubtleHover = _AppPrimitives.brandPrimaryDarkHover,
      brandPrimarySubtleActive = _AppPrimitives.brandPrimaryDarkActive,
      brandPrimaryDefault = _AppPrimitives.brandPrimaryDefault,
      brandPrimaryDefaultHover = _AppPrimitives.brandPrimaryDefaultHover,
      brandPrimaryDefaultActive = _AppPrimitives.brandPrimaryDefaultActive,
      brandPrimaryEmphasis = _AppPrimitives.brandPrimaryDarker,
      brandPrimaryEmphasisHover = _AppPrimitives.brandPrimaryDarker,
      brandPrimaryEmphasisActive = _AppPrimitives.brandPrimaryDarker,
      brandPrimaryStrong = _AppPrimitives.brandPrimaryDarker,
      brandSecondarySubtle = _AppPrimitives.brandSecondaryDark,
      brandSecondarySubtleHover = _AppPrimitives.brandSecondaryDarkHover,
      brandSecondarySubtleActive = _AppPrimitives.brandSecondaryDarkActive,
      brandSecondaryDefault = _AppPrimitives.brandSecondaryDefault,
      brandSecondaryDefaultHover = _AppPrimitives.brandSecondaryDefaultHover,
      brandSecondaryDefaultActive = _AppPrimitives.brandSecondaryDefaultActive,
      brandSecondaryEmphasis = _AppPrimitives.brandSecondaryDarker,
      brandSecondaryEmphasisHover = _AppPrimitives.brandSecondaryDarker,
      brandSecondaryEmphasisActive = _AppPrimitives.brandSecondaryDarker,
      brandSecondaryStrong = _AppPrimitives.brandSecondaryDarker,
      successSubtle = _AppPrimitives.statusSuccessDark,
      successSubtleHover = _AppPrimitives.statusSuccessDarkHover,
      successSubtleActive = _AppPrimitives.statusSuccessDarkActive,
      successDefault = _AppPrimitives.statusSuccessDefault,
      successDefaultHover = _AppPrimitives.statusSuccessDefaultHover,
      successDefaultActive = _AppPrimitives.statusSuccessDefaultActive,
      successEmphasis = _AppPrimitives.statusSuccessDarker,
      successEmphasisHover = _AppPrimitives.statusSuccessDarker,
      successEmphasisActive = _AppPrimitives.statusSuccessDarker,
      successStrong = _AppPrimitives.statusSuccessDarker,
      pendingSubtle = _AppPrimitives.statusPendingDark,
      pendingSubtleHover = _AppPrimitives.statusPendingDarkHover,
      pendingSubtleActive = _AppPrimitives.statusPendingDarkActive,
      pendingDefault = _AppPrimitives.statusPendingDefault,
      pendingDefaultHover = _AppPrimitives.statusPendingDefaultHover,
      pendingDefaultActive = _AppPrimitives.statusPendingDefaultActive,
      pendingEmphasis = _AppPrimitives.statusPendingDarker,
      pendingEmphasisHover = _AppPrimitives.statusPendingDarker,
      pendingEmphasisActive = _AppPrimitives.statusPendingDarker,
      pendingStrong = _AppPrimitives.statusPendingDarker,
      warningSubtle = _AppPrimitives.statusWarningDark,
      warningSubtleHover = _AppPrimitives.statusWarningDarkHover,
      warningSubtleActive = _AppPrimitives.statusWarningDarkActive,
      warningDefault = _AppPrimitives.statusWarningDefault,
      warningDefaultHover = _AppPrimitives.statusWarningDefaultHover,
      warningDefaultActive = _AppPrimitives.statusWarningDefaultActive,
      warningEmphasis = _AppPrimitives.statusWarningDarker,
      warningEmphasisHover = _AppPrimitives.statusWarningDarker,
      warningEmphasisActive = _AppPrimitives.statusWarningDarker,
      warningStrong = _AppPrimitives.statusWarningDarker,
      errorSubtle = _AppPrimitives.statusErrorDark,
      errorSubtleHover = _AppPrimitives.statusErrorDarkHover,
      errorSubtleActive = _AppPrimitives.statusErrorDarkActive,
      errorDefault = _AppPrimitives.statusErrorDefault,
      errorDefaultHover = _AppPrimitives.statusErrorDefaultHover,
      errorDefaultActive = _AppPrimitives.statusErrorDefaultActive,
      errorEmphasis = _AppPrimitives.statusErrorDarker,
      errorEmphasisHover = _AppPrimitives.statusErrorDarker,
      errorEmphasisActive = _AppPrimitives.statusErrorDarker,
      errorStrong = _AppPrimitives.statusErrorDarker,
      background = _AppPrimitives.neutralsDarkBackground,
      surface = _AppPrimitives.neutralsDarkSurface,
      border = _AppPrimitives.neutralsDarkBorders,
      divider = _AppPrimitives.neutralsDarkDividers,
      hover = _AppPrimitives.neutralsDarkHover,
      textPrimary = _AppPrimitives.neutralsDarkWhite,
      textSecondary = _AppPrimitives.neutralsDarkTextgray
    )
  }
}

@Immutable
data class AppTypographyTokens(
  val displayLg: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilyPrimary,
    fontWeight = _AppPrimitives.typoFontWeightDisplayLg,
    fontSize = _AppPrimitives.typoFontSizeDisplayLg,
    lineHeight = _AppPrimitives.typoLineHeightDisplayLg,
    letterSpacing = _AppPrimitives.typoLetterSpacingDisplayLg,
  ),
  val displayMd: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilyPrimary,
    fontWeight = _AppPrimitives.typoFontWeightDisplayMd,
    fontSize = _AppPrimitives.typoFontSizeDisplayMd,
    lineHeight = _AppPrimitives.typoLineHeightDisplayMd,
    letterSpacing = _AppPrimitives.typoLetterSpacingDisplayMd,
  ),
  val displaySm: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilyPrimary,
    fontWeight = _AppPrimitives.typoFontWeightDisplaySm,
    fontSize = _AppPrimitives.typoFontSizeDisplaySm,
    lineHeight = _AppPrimitives.typoLineHeightDisplaySm,
    letterSpacing = _AppPrimitives.typoLetterSpacingDisplaySm,
  ),
  val h1: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilyPrimary,
    fontWeight = _AppPrimitives.typoFontWeightH1,
    fontSize = _AppPrimitives.typoFontSizeH1,
    lineHeight = _AppPrimitives.typoLineHeightH1,
    letterSpacing = _AppPrimitives.typoLetterSpacingH1,
  ),
  val h2: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilyPrimary,
    fontWeight = _AppPrimitives.typoFontWeightH2,
    fontSize = _AppPrimitives.typoFontSizeH2,
    lineHeight = _AppPrimitives.typoLineHeightH2,
    letterSpacing = _AppPrimitives.typoLetterSpacingH2,
  ),
  val h3: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilyPrimary,
    fontWeight = _AppPrimitives.typoFontWeightH3,
    fontSize = _AppPrimitives.typoFontSizeH3,
    lineHeight = _AppPrimitives.typoLineHeightH3,
    letterSpacing = _AppPrimitives.typoLetterSpacingH3,
  ),
  val h4: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilyPrimary,
    fontWeight = _AppPrimitives.typoFontWeightH4,
    fontSize = _AppPrimitives.typoFontSizeH4,
    lineHeight = _AppPrimitives.typoLineHeightH4,
    letterSpacing = _AppPrimitives.typoLetterSpacingH4,
  ),
  val bodyLg: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilySecondary,
    fontWeight = _AppPrimitives.typoFontWeightBodyLg,
    fontSize = _AppPrimitives.typoFontSizeBodyLg,
    lineHeight = _AppPrimitives.typoLineHeightBodyLg,
    letterSpacing = _AppPrimitives.typoLetterSpacingBodyLg,
  ),
  val body: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilySecondary,
    fontWeight = _AppPrimitives.typoFontWeightBody,
    fontSize = _AppPrimitives.typoFontSizeBody,
    lineHeight = _AppPrimitives.typoLineHeightBody,
    letterSpacing = _AppPrimitives.typoLetterSpacingBody,
  ),
  val bodySm: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilySecondary,
    fontWeight = _AppPrimitives.typoFontWeightBodySm,
    fontSize = _AppPrimitives.typoFontSizeBodySm,
    lineHeight = _AppPrimitives.typoLineHeightBodySm,
    letterSpacing = _AppPrimitives.typoLetterSpacingBodySm,
  ),
  val button: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilySecondary,
    fontWeight = _AppPrimitives.typoFontWeightButton,
    fontSize = _AppPrimitives.typoFontSizeButton,
    lineHeight = _AppPrimitives.typoLineHeightButton,
    letterSpacing = _AppPrimitives.typoLetterSpacingButton,
  ),
  val label: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilySecondary,
    fontWeight = _AppPrimitives.typoFontWeightLabel,
    fontSize = _AppPrimitives.typoFontSizeLabel,
    lineHeight = _AppPrimitives.typoLineHeightLabel,
    letterSpacing = _AppPrimitives.typoLetterSpacingLabel,
  ),
  val caption: TextStyle = TextStyle(
    fontFamily = _AppPrimitives.typoFontFamilySecondary,
    fontWeight = _AppPrimitives.typoFontWeightCaption,
    fontSize = _AppPrimitives.typoFontSizeCaption,
    lineHeight = _AppPrimitives.typoLineHeightCaption,
    letterSpacing = _AppPrimitives.typoLetterSpacingCaption,
  ),
)

private val AppTypographyTokensInstance = AppTypographyTokens()
val AppTypography = Typography(
    displayLarge = AppTypographyTokensInstance.displayLg,
    displayMedium = AppTypographyTokensInstance.displayMd,
    displaySmall = AppTypographyTokensInstance.displaySm,
    headlineLarge = AppTypographyTokensInstance.h1,
    headlineMedium = AppTypographyTokensInstance.h2,
    headlineSmall = AppTypographyTokensInstance.h3,
    titleLarge = AppTypographyTokensInstance.h4,
    bodyLarge = AppTypographyTokensInstance.bodyLg,
    bodyMedium = AppTypographyTokensInstance.body,
    bodySmall = AppTypographyTokensInstance.bodySm,
    labelLarge = AppTypographyTokensInstance.button,
    labelMedium = AppTypographyTokensInstance.label,
    labelSmall = AppTypographyTokensInstance.caption,
)

@Immutable
data class AppSpacingTokens(
  val xs: Dp = _AppPrimitives.spaceXs,
  val sm: Dp = _AppPrimitives.spaceSm,
  val md: Dp = _AppPrimitives.spaceMd,
  val lg: Dp = _AppPrimitives.spaceLg,
  val xl: Dp = _AppPrimitives.spaceXl,
  val _2xl: Dp = _AppPrimitives.space2xl,
  val _3xl: Dp = _AppPrimitives.space3xl,
  val _4xl: Dp = _AppPrimitives.space4xl,
  val _5xl: Dp = _AppPrimitives.space5xl,
  val _6xl: Dp = _AppPrimitives.space6xl,
  val _7xl: Dp = _AppPrimitives.space7xl,
  val _8xl: Dp = _AppPrimitives.space8xl,
)

@Immutable
data class AppShapeTokens(
  val radiusXs: RoundedCornerShape = RoundedCornerShape(_AppPrimitives.radiusXs),
  val radiusSm: RoundedCornerShape = RoundedCornerShape(_AppPrimitives.radiusSm),
  val radiusMd: RoundedCornerShape = RoundedCornerShape(_AppPrimitives.radiusMd),
  val radiusLg: RoundedCornerShape = RoundedCornerShape(_AppPrimitives.radiusLg),
  val radiusXl: RoundedCornerShape = RoundedCornerShape(_AppPrimitives.radiusXl),
  val radius2xl: RoundedCornerShape = RoundedCornerShape(_AppPrimitives.radius2xl),
  val radius3xl: RoundedCornerShape = RoundedCornerShape(_AppPrimitives.radius3xl),
)

@Immutable
data class AppElevationTokens(
  val elevation0: AppShadow = _AppPrimitives.elevation0,
  val elevation1: AppShadow = _AppPrimitives.elevation1,
  val elevation2: AppShadow = _AppPrimitives.elevation2
)

@Immutable
data class AppBorderTokens(
  val thin: Dp = _AppPrimitives.borderThin,
  val medium: Dp = _AppPrimitives.borderMedium,
  val thick: Dp = _AppPrimitives.borderThick,
)

@Immutable
data class AppOpacityTokens(
  val disabled: Float = _AppPrimitives.opacityDisabled,
  val hover: Float = _AppPrimitives.opacityHover,
  val active: Float = _AppPrimitives.opacityActive,
  val selected: Float = _AppPrimitives.opacitySelected,
)

fun AppShadow.toShadow(density: Density): Shadow = with(density) {
  Shadow(
    offset = Offset(offsetX.toPx(), offsetY.toPx()),
    radius = blurRadius.toPx(),
    color = color,
  )
}

@Immutable
data class AppThemeTokens(
  val colors: AppColorTokens,
  val typography: AppTypographyTokens,
  val spacing: AppSpacingTokens,
  val shapes: AppShapeTokens,
  val borders: AppBorderTokens,
  val opacity: AppOpacityTokens,
  val elevations: AppElevationTokens,
) {
  companion object {
    val Light = AppThemeTokens(
      colors = AppColorTokens.Light,
      typography = AppTypographyTokens(),
      spacing = AppSpacingTokens(),
      shapes = AppShapeTokens(),
      borders = AppBorderTokens(),
      opacity = AppOpacityTokens(),
      elevations = AppElevationTokens(),
    )
    val Dark = AppThemeTokens(
      colors = AppColorTokens.Dark,
      typography = AppTypographyTokens(),
      spacing = AppSpacingTokens(),
      shapes = AppShapeTokens(),
      borders = AppBorderTokens(),
      opacity = AppOpacityTokens(),
      elevations = AppElevationTokens(),
    )
  }
}

val LocalColors = staticCompositionLocalOf { AppColorTokens.Light }
val LocalTypography = staticCompositionLocalOf { AppTypographyTokens() }
val LocalSpacing = staticCompositionLocalOf { AppSpacingTokens() }
val LocalShapes = staticCompositionLocalOf { AppShapeTokens() }
val LocalBorders = staticCompositionLocalOf { AppBorderTokens() }
val LocalOpacity = staticCompositionLocalOf { AppOpacityTokens() }
val LocalElevations = staticCompositionLocalOf { AppElevationTokens() }

object AppTheme {
  val colors @Composable get() = LocalColors.current
  val typography @Composable get() = LocalTypography.current
  val spacing @Composable get() = LocalSpacing.current
  val shapes @Composable get() = LocalShapes.current
  val borders @Composable get() = LocalBorders.current
  val opacity @Composable get() = LocalOpacity.current
  val elevations @Composable get() = LocalElevations.current
}

private val LightColorScheme = lightColorScheme(
  primary = AppColorTokens.Light.brandPrimaryDefault,
  secondary = AppColorTokens.Light.brandSecondaryDefault,
  background = AppColorTokens.Light.background,
  surface = AppColorTokens.Light.surface,
  outline = AppColorTokens.Light.border,
  error = AppColorTokens.Light.errorDefault,
  onBackground = AppColorTokens.Light.textPrimary,
  onSurface = AppColorTokens.Light.textPrimary,
  onPrimary = AppColorTokens.Light.textPrimary,
  onSecondary = AppColorTokens.Light.textPrimary,
  onError = AppColorTokens.Light.textPrimary,
)

private val DarkColorScheme = darkColorScheme(
  primary = AppColorTokens.Dark.brandPrimaryDefault,
  secondary = AppColorTokens.Dark.brandSecondaryDefault,
  background = AppColorTokens.Dark.background,
  surface = AppColorTokens.Dark.surface,
  outline = AppColorTokens.Dark.border,
  error = AppColorTokens.Dark.errorDefault,
  onBackground = AppColorTokens.Dark.textPrimary,
  onSurface = AppColorTokens.Dark.textPrimary,
  onPrimary = AppColorTokens.Dark.textPrimary,
  onSecondary = AppColorTokens.Dark.textPrimary,
  onError = AppColorTokens.Dark.textPrimary,
)

@Composable
fun AppTheme(
  darkTheme: Boolean = isSystemInDarkTheme(),
  content: @Composable () -> Unit
) {
  val tokens = if (darkTheme) AppThemeTokens.Dark else AppThemeTokens.Light

  CompositionLocalProvider(
    LocalColors provides tokens.colors,
    LocalTypography provides tokens.typography,
    LocalSpacing provides tokens.spacing,
    LocalShapes provides tokens.shapes,
    LocalBorders provides tokens.borders,
    LocalOpacity provides tokens.opacity,
    LocalElevations provides tokens.elevations,
  ) {
    MaterialTheme(
      colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme,
      typography = AppTypography,
      content = content
    )
  }
}