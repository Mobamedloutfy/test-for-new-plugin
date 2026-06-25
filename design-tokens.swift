// Design Tokens — Generated from Figma
// Plugin: DS Studio Token v1.0
// Source: Plugin Live State (NOT JSON file)

import SwiftUI

private extension Color {
  init(hex: String) {
    let hex = hex.trimmingCharacters(in: CharacterSet.alphanumerics.inverted)
    var rgbValue: UInt64 = 0
    Scanner(string: hex).scanHexInt64(&rgbValue)
    self.init(
      red: Double((rgbValue & 0xFF0000) >> 16) / 255.0,
      green: Double((rgbValue & 0x00FF00) >> 8) / 255.0,
      blue: Double(rgbValue & 0x0000FF) / 255.0
    )
  }
}

// MARK: - Primitives
private enum _AppPrimitives {
  // ==========================================
  // PRIMITIVES — Global Colors
  // ==========================================

  // Brand Primary
  static let brandPrimaryLight = Color(hex: "#FBDE7B")
  static let brandPrimaryLightHover = Color(hex: "#FBD965")
  static let brandPrimaryLightActive = Color(hex: "#FAD34F")
  static let brandPrimaryDefault = Color(hex: "#F9C823")
  static let brandPrimaryDefaultHover = Color(hex: "#E5B820")
  static let brandPrimaryDefaultActive = Color(hex: "#D4AA1E")
  static let brandPrimaryDark = Color(hex: "#BB961A")
  static let brandPrimaryDarkHover = Color(hex: "#A28217")
  static let brandPrimaryDarkActive = Color(hex: "#896E13")
  static let brandPrimaryDarker = Color(hex: "#705A10")

  // Brand Secondary
  static let brandSecondaryLight = Color(hex: "#FD96A8")
  static let brandSecondaryLightHover = Color(hex: "#FD859A")
  static let brandSecondaryLightActive = Color(hex: "#FD738B")
  static let brandSecondaryDefault = Color(hex: "#FC506E")
  static let brandSecondaryDefaultHover = Color(hex: "#E84A65")
  static let brandSecondaryDefaultActive = Color(hex: "#D6445E")
  static let brandSecondaryDark = Color(hex: "#BD3C53")
  static let brandSecondaryDarkHover = Color(hex: "#A43448")
  static let brandSecondaryDarkActive = Color(hex: "#8B2C3D")
  static let brandSecondaryDarker = Color(hex: "#712431")

  // Status Success
  static let statusSuccessLight = Color(hex: "#6EBFB8")
  static let statusSuccessLightHover = Color(hex: "#56B4AC")
  static let statusSuccessLightActive = Color(hex: "#3DA9A0")
  static let statusSuccessDefault = Color(hex: "#0D9488")
  static let statusSuccessDefaultHover = Color(hex: "#0C887D")
  static let statusSuccessDefaultActive = Color(hex: "#0B7E74")
  static let statusSuccessDark = Color(hex: "#0A6F66")
  static let statusSuccessDarkHover = Color(hex: "#086058")
  static let statusSuccessDarkActive = Color(hex: "#07514B")
  static let statusSuccessDarker = Color(hex: "#06433D")

  // Status Pending
  static let statusPendingLight = Color(hex: "#FEEC91")
  static let statusPendingLightHover = Color(hex: "#FEE97E")
  static let statusPendingLightActive = Color(hex: "#FDE66C")
  static let statusPendingDefault = Color(hex: "#FDE047")
  static let statusPendingDefaultHover = Color(hex: "#E9CE41")
  static let statusPendingDefaultActive = Color(hex: "#D7BE3C")
  static let statusPendingDark = Color(hex: "#BEA835")
  static let statusPendingDarkHover = Color(hex: "#A4922E")
  static let statusPendingDarkActive = Color(hex: "#8B7B27")
  static let statusPendingDarker = Color(hex: "#726520")

  // Status Warning
  static let statusWarningLight = Color(hex: "#DA8D6D")
  static let statusWarningLightHover = Color(hex: "#D47A55")
  static let statusWarningLightActive = Color(hex: "#CE673D")
  static let statusWarningDefault = Color(hex: "#C2410C")
  static let statusWarningDefaultHover = Color(hex: "#B23C0B")
  static let statusWarningDefaultActive = Color(hex: "#A5370A")
  static let statusWarningDark = Color(hex: "#923109")
  static let statusWarningDarkHover = Color(hex: "#7E2A08")
  static let statusWarningDarkActive = Color(hex: "#6B2407")
  static let statusWarningDarker = Color(hex: "#571D05")

  // Status Error
  static let statusErrorLight = Color(hex: "#F58F8F")
  static let statusErrorLightHover = Color(hex: "#F47C7C")
  static let statusErrorLightActive = Color(hex: "#F26969")
  static let statusErrorDefault = Color(hex: "#EF4444")
  static let statusErrorDefaultHover = Color(hex: "#DC3F3F")
  static let statusErrorDefaultActive = Color(hex: "#CB3A3A")
  static let statusErrorDark = Color(hex: "#B33333")
  static let statusErrorDarkHover = Color(hex: "#9B2C2C")
  static let statusErrorDarkActive = Color(hex: "#832525")
  static let statusErrorDarker = Color(hex: "#6C1F1F")

  // Neutrals Light
  static let neutralsLightBackground = Color(hex: "#F8F7F4")
  static let neutralsLightSurface = Color(hex: "#FFFFFF")
  static let neutralsLightBorders = Color(hex: "#E7E6E4")
  static let neutralsLightDividers = Color(hex: "#F3F3F1")
  static let neutralsLightHover = Color(hex: "#F3F3F1")
  static let neutralsLightBlack = Color(hex: "#0B0B0C")
  static let neutralsLightTextgray = Color(hex: "#B1B1B1")

  // Neutrals Dark
  static let neutralsDarkBackground = Color(hex: "#0D0C0B")
  static let neutralsDarkSurface = Color(hex: "#181714")
  static let neutralsDarkBorders = Color(hex: "#25231F")
  static let neutralsDarkDividers = Color(hex: "#1F1E1A")
  static let neutralsDarkHover = Color(hex: "#21201C")
  static let neutralsDarkWhite = Color(hex: "#FFFFFF")
  static let neutralsDarkTextgray = Color(hex: "#6B6B6B")

  // Border Widths
  static let borderThin: CGFloat = 1
  static let borderMedium: CGFloat = 1.5
  static let borderThick: CGFloat = 2

  // MARK: - Typography
  // ==========================================

  static let typoFontFamilyPrimary = "Cairo"
  static let typoFontFamilySecondary = "SF Pro"

  // Display Large
  static let typoFontSizeDisplayLg: CGFloat = 48
  static let typoLineHeightDisplayLg: CGFloat = 56
  static let typoLetterSpacingDisplayLg: CGFloat = 0
  static let typoFontWeightDisplayLg = Font.Weight.medium

  // Display Medium
  static let typoFontSizeDisplayMd: CGFloat = 44
  static let typoLineHeightDisplayMd: CGFloat = 52
  static let typoLetterSpacingDisplayMd: CGFloat = 0
  static let typoFontWeightDisplayMd = Font.Weight.semibold

  // Display Small
  static let typoFontSizeDisplaySm: CGFloat = 32
  static let typoLineHeightDisplaySm: CGFloat = 40
  static let typoLetterSpacingDisplaySm: CGFloat = 0
  static let typoFontWeightDisplaySm = Font.Weight.medium

  // H1
  static let typoFontSizeH1: CGFloat = 31
  static let typoLineHeightH1: CGFloat = 47
  static let typoLetterSpacingH1: CGFloat = 0
  static let typoFontWeightH1 = Font.Weight.regular

  // H2
  static let typoFontSizeH2: CGFloat = 24
  static let typoLineHeightH2: CGFloat = 32
  static let typoLetterSpacingH2: CGFloat = 0
  static let typoFontWeightH2 = Font.Weight.regular

  // H3
  static let typoFontSizeH3: CGFloat = 20
  static let typoLineHeightH3: CGFloat = 28
  static let typoLetterSpacingH3: CGFloat = 0
  static let typoFontWeightH3 = Font.Weight.regular

  // H4
  static let typoFontSizeH4: CGFloat = 18
  static let typoLineHeightH4: CGFloat = 28
  static let typoLetterSpacingH4: CGFloat = 0
  static let typoFontWeightH4 = Font.Weight.regular

  // Body Large
  static let typoFontSizeBodyLg: CGFloat = 16
  static let typoLineHeightBodyLg: CGFloat = 24
  static let typoLetterSpacingBodyLg: CGFloat = 0
  static let typoFontWeightBodyLg = Font.Weight.regular

  // Body Regular
  static let typoFontSizeBody: CGFloat = 14
  static let typoLineHeightBody: CGFloat = 24
  static let typoLetterSpacingBody: CGFloat = 0
  static let typoFontWeightBody = Font.Weight.regular

  // Body Small
  static let typoFontSizeBodySm: CGFloat = 12
  static let typoLineHeightBodySm: CGFloat = 20
  static let typoLetterSpacingBodySm: CGFloat = 0
  static let typoFontWeightBodySm = Font.Weight.regular

  // Button Text
  static let typoFontSizeButton: CGFloat = 16
  static let typoLineHeightButton: CGFloat = 24
  static let typoLetterSpacingButton: CGFloat = 0
  static let typoFontWeightButton = Font.Weight.regular

  // Input Label
  static let typoFontSizeLabel: CGFloat = 14
  static let typoLineHeightLabel: CGFloat = 24
  static let typoLetterSpacingLabel: CGFloat = 0
  static let typoFontWeightLabel = Font.Weight.regular

  // Caption / Footnote
  static let typoFontSizeCaption: CGFloat = 10
  static let typoLineHeightCaption: CGFloat = 24
  static let typoLetterSpacingCaption: CGFloat = 0
  static let typoFontWeightCaption = Font.Weight.regular

  // MARK: - Spacing
  // ==========================================
  static let spaceXs: CGFloat = 4
  static let spaceSm: CGFloat = 8
  static let spaceMd: CGFloat = 12
  static let spaceLg: CGFloat = 16
  static let spaceXl: CGFloat = 20
  static let space2xl: CGFloat = 24
  static let space3xl: CGFloat = 28
  static let space4xl: CGFloat = 32
  static let space5xl: CGFloat = 36
  static let space6xl: CGFloat = 40
  static let space7xl: CGFloat = 44
  static let space8xl: CGFloat = 48

  // MARK: - Radius
  // ==========================================
  static let radiusXs: CGFloat = 4
  static let radiusSm: CGFloat = 8
  static let radiusMd: CGFloat = 12
  static let radiusLg: CGFloat = 16
  static let radiusXl: CGFloat = 20
  static let radius2xl: CGFloat = 24
  static let radius3xl: CGFloat = 32

  // MARK: - Elevation / Shadows
  // ==========================================

  // lg
  static let shadow0OffsetX: CGFloat = 4
  static let shadow0OffsetY: CGFloat = 7
  static let shadow0Blur: CGFloat = 39
  static let shadow0Spread: CGFloat = 3
  static let shadow0Color = Color(hex: "#0B0B0C")
  static let shadow0Opacity: CGFloat = 0.09

  // md
  static let shadow1OffsetX: CGFloat = 1
  static let shadow1OffsetY: CGFloat = 4
  static let shadow1Blur: CGFloat = 36
  static let shadow1Spread: CGFloat = 6
  static let shadow1Color = Color(hex: "#0B0B0C")
  static let shadow1Opacity: CGFloat = 0.07

  // sm
  static let shadow2OffsetX: CGFloat = 3
  static let shadow2OffsetY: CGFloat = 3
  static let shadow2Blur: CGFloat = 28
  static let shadow2Spread: CGFloat = 1
  static let shadow2Color = Color(hex: "#0B0B0C")
  static let shadow2Opacity: CGFloat = 0.05

  // MARK: - Opacity
  // ==========================================
  static let opacityDisabled: CGFloat = 0.38
  static let opacityHover: CGFloat = 0.08
  static let opacityActive: CGFloat = 0.12
  static let opacitySelected: CGFloat = 0.16

  // MARK: - Duration
  // ==========================================
  static let durationFast: TimeInterval = 0.15
  static let durationNormal: TimeInterval = 0.25
  static let durationSlow: TimeInterval = 0.4
}

// MARK: - Light Mode Tokens
public enum AppTokens {
  // ==========================================
  // SEMANTIC — Light Mode
  // ==========================================

  // Brand Primary
  public static let brandPrimarySubtle = _AppPrimitives.brandPrimaryLight
  public static let brandPrimarySubtleHover = _AppPrimitives.brandPrimaryLightHover
  public static let brandPrimarySubtleActive = _AppPrimitives.brandPrimaryLightActive
  public static let brandPrimaryDefault = _AppPrimitives.brandPrimaryDefault
  public static let brandPrimaryDefaultHover = _AppPrimitives.brandPrimaryDefaultHover
  public static let brandPrimaryDefaultActive = _AppPrimitives.brandPrimaryDefaultActive
  public static let brandPrimaryEmphasis = _AppPrimitives.brandPrimaryDark
  public static let brandPrimaryEmphasisHover = _AppPrimitives.brandPrimaryDarkHover
  public static let brandPrimaryEmphasisActive = _AppPrimitives.brandPrimaryDarkActive
  public static let brandPrimaryStrong = _AppPrimitives.brandPrimaryDarker

  // Brand Secondary
  public static let brandSecondarySubtle = _AppPrimitives.brandSecondaryLight
  public static let brandSecondarySubtleHover = _AppPrimitives.brandSecondaryLightHover
  public static let brandSecondarySubtleActive = _AppPrimitives.brandSecondaryLightActive
  public static let brandSecondaryDefault = _AppPrimitives.brandSecondaryDefault
  public static let brandSecondaryDefaultHover = _AppPrimitives.brandSecondaryDefaultHover
  public static let brandSecondaryDefaultActive = _AppPrimitives.brandSecondaryDefaultActive
  public static let brandSecondaryEmphasis = _AppPrimitives.brandSecondaryDark
  public static let brandSecondaryEmphasisHover = _AppPrimitives.brandSecondaryDarkHover
  public static let brandSecondaryEmphasisActive = _AppPrimitives.brandSecondaryDarkActive
  public static let brandSecondaryStrong = _AppPrimitives.brandSecondaryDarker

  // Status Success
  public static let successSubtle = _AppPrimitives.statusSuccessLight
  public static let successSubtleHover = _AppPrimitives.statusSuccessLightHover
  public static let successSubtleActive = _AppPrimitives.statusSuccessLightActive
  public static let successDefault = _AppPrimitives.statusSuccessDefault
  public static let successDefaultHover = _AppPrimitives.statusSuccessDefaultHover
  public static let successDefaultActive = _AppPrimitives.statusSuccessDefaultActive
  public static let successEmphasis = _AppPrimitives.statusSuccessDark
  public static let successEmphasisHover = _AppPrimitives.statusSuccessDarkHover
  public static let successEmphasisActive = _AppPrimitives.statusSuccessDarkActive
  public static let successStrong = _AppPrimitives.statusSuccessDarker

  // Status Pending
  public static let pendingSubtle = _AppPrimitives.statusPendingLight
  public static let pendingSubtleHover = _AppPrimitives.statusPendingLightHover
  public static let pendingSubtleActive = _AppPrimitives.statusPendingLightActive
  public static let pendingDefault = _AppPrimitives.statusPendingDefault
  public static let pendingDefaultHover = _AppPrimitives.statusPendingDefaultHover
  public static let pendingDefaultActive = _AppPrimitives.statusPendingDefaultActive
  public static let pendingEmphasis = _AppPrimitives.statusPendingDark
  public static let pendingEmphasisHover = _AppPrimitives.statusPendingDarkHover
  public static let pendingEmphasisActive = _AppPrimitives.statusPendingDarkActive
  public static let pendingStrong = _AppPrimitives.statusPendingDarker

  // Status Warning
  public static let warningSubtle = _AppPrimitives.statusWarningLight
  public static let warningSubtleHover = _AppPrimitives.statusWarningLightHover
  public static let warningSubtleActive = _AppPrimitives.statusWarningLightActive
  public static let warningDefault = _AppPrimitives.statusWarningDefault
  public static let warningDefaultHover = _AppPrimitives.statusWarningDefaultHover
  public static let warningDefaultActive = _AppPrimitives.statusWarningDefaultActive
  public static let warningEmphasis = _AppPrimitives.statusWarningDark
  public static let warningEmphasisHover = _AppPrimitives.statusWarningDarkHover
  public static let warningEmphasisActive = _AppPrimitives.statusWarningDarkActive
  public static let warningStrong = _AppPrimitives.statusWarningDarker

  // Status Error
  public static let errorSubtle = _AppPrimitives.statusErrorLight
  public static let errorSubtleHover = _AppPrimitives.statusErrorLightHover
  public static let errorSubtleActive = _AppPrimitives.statusErrorLightActive
  public static let errorDefault = _AppPrimitives.statusErrorDefault
  public static let errorDefaultHover = _AppPrimitives.statusErrorDefaultHover
  public static let errorDefaultActive = _AppPrimitives.statusErrorDefaultActive
  public static let errorEmphasis = _AppPrimitives.statusErrorDark
  public static let errorEmphasisHover = _AppPrimitives.statusErrorDarkHover
  public static let errorEmphasisActive = _AppPrimitives.statusErrorDarkActive
  public static let errorStrong = _AppPrimitives.statusErrorDarker

  // Neutrals
  public static let background = _AppPrimitives.neutralsLightBackground
  public static let surface = _AppPrimitives.neutralsLightSurface
  public static let border = _AppPrimitives.neutralsLightBorders
  public static let divider = _AppPrimitives.neutralsLightDividers
  public static let hover = _AppPrimitives.neutralsLightHover
  public static let textPrimary = _AppPrimitives.neutralsLightBlack
  public static let textSecondary = _AppPrimitives.neutralsLightTextgray
}

// MARK: - Dark Mode Tokens
public enum AppTokensDark {
  // ==========================================
  // SEMANTIC DARK OVERRIDES
  // ==========================================

  // Brand Primary Dark
  public static let brandPrimarySubtle = _AppPrimitives.brandPrimaryDark
  public static let brandPrimarySubtleHover = _AppPrimitives.brandPrimaryDarkHover
  public static let brandPrimarySubtleActive = _AppPrimitives.brandPrimaryDarkActive
  public static let brandPrimaryDefault = _AppPrimitives.brandPrimaryDefault
  public static let brandPrimaryDefaultHover = _AppPrimitives.brandPrimaryDefaultHover
  public static let brandPrimaryDefaultActive = _AppPrimitives.brandPrimaryDefaultActive
  public static let brandPrimaryEmphasis = _AppPrimitives.brandPrimaryDarker
  public static let brandPrimaryEmphasisHover = _AppPrimitives.brandPrimaryDarker
  public static let brandPrimaryEmphasisActive = _AppPrimitives.brandPrimaryDarker
  public static let brandPrimaryStrong = _AppPrimitives.brandPrimaryDarker

  // Brand Secondary Dark
  public static let brandSecondarySubtle = _AppPrimitives.brandSecondaryDark
  public static let brandSecondarySubtleHover = _AppPrimitives.brandSecondaryDarkHover
  public static let brandSecondarySubtleActive = _AppPrimitives.brandSecondaryDarkActive
  public static let brandSecondaryDefault = _AppPrimitives.brandSecondaryDefault
  public static let brandSecondaryDefaultHover = _AppPrimitives.brandSecondaryDefaultHover
  public static let brandSecondaryDefaultActive = _AppPrimitives.brandSecondaryDefaultActive
  public static let brandSecondaryEmphasis = _AppPrimitives.brandSecondaryDarker
  public static let brandSecondaryEmphasisHover = _AppPrimitives.brandSecondaryDarker
  public static let brandSecondaryEmphasisActive = _AppPrimitives.brandSecondaryDarker
  public static let brandSecondaryStrong = _AppPrimitives.brandSecondaryDarker

  // Status Success Dark
  public static let successSubtle = _AppPrimitives.statusSuccessDark
  public static let successSubtleHover = _AppPrimitives.statusSuccessDarkHover
  public static let successSubtleActive = _AppPrimitives.statusSuccessDarkActive
  public static let successDefault = _AppPrimitives.statusSuccessDefault
  public static let successDefaultHover = _AppPrimitives.statusSuccessDefaultHover
  public static let successDefaultActive = _AppPrimitives.statusSuccessDefaultActive
  public static let successEmphasis = _AppPrimitives.statusSuccessDarker
  public static let successEmphasisHover = _AppPrimitives.statusSuccessDarker
  public static let successEmphasisActive = _AppPrimitives.statusSuccessDarker
  public static let successStrong = _AppPrimitives.statusSuccessDarker

  // Status Pending Dark
  public static let pendingSubtle = _AppPrimitives.statusPendingDark
  public static let pendingSubtleHover = _AppPrimitives.statusPendingDarkHover
  public static let pendingSubtleActive = _AppPrimitives.statusPendingDarkActive
  public static let pendingDefault = _AppPrimitives.statusPendingDefault
  public static let pendingDefaultHover = _AppPrimitives.statusPendingDefaultHover
  public static let pendingDefaultActive = _AppPrimitives.statusPendingDefaultActive
  public static let pendingEmphasis = _AppPrimitives.statusPendingDarker
  public static let pendingEmphasisHover = _AppPrimitives.statusPendingDarker
  public static let pendingEmphasisActive = _AppPrimitives.statusPendingDarker
  public static let pendingStrong = _AppPrimitives.statusPendingDarker

  // Status Warning Dark
  public static let warningSubtle = _AppPrimitives.statusWarningDark
  public static let warningSubtleHover = _AppPrimitives.statusWarningDarkHover
  public static let warningSubtleActive = _AppPrimitives.statusWarningDarkActive
  public static let warningDefault = _AppPrimitives.statusWarningDefault
  public static let warningDefaultHover = _AppPrimitives.statusWarningDefaultHover
  public static let warningDefaultActive = _AppPrimitives.statusWarningDefaultActive
  public static let warningEmphasis = _AppPrimitives.statusWarningDarker
  public static let warningEmphasisHover = _AppPrimitives.statusWarningDarker
  public static let warningEmphasisActive = _AppPrimitives.statusWarningDarker
  public static let warningStrong = _AppPrimitives.statusWarningDarker

  // Status Error Dark
  public static let errorSubtle = _AppPrimitives.statusErrorDark
  public static let errorSubtleHover = _AppPrimitives.statusErrorDarkHover
  public static let errorSubtleActive = _AppPrimitives.statusErrorDarkActive
  public static let errorDefault = _AppPrimitives.statusErrorDefault
  public static let errorDefaultHover = _AppPrimitives.statusErrorDefaultHover
  public static let errorDefaultActive = _AppPrimitives.statusErrorDefaultActive
  public static let errorEmphasis = _AppPrimitives.statusErrorDarker
  public static let errorEmphasisHover = _AppPrimitives.statusErrorDarker
  public static let errorEmphasisActive = _AppPrimitives.statusErrorDarker
  public static let errorStrong = _AppPrimitives.statusErrorDarker

  // Neutrals Dark
  public static let background = _AppPrimitives.neutralsDarkBackground
  public static let surface = _AppPrimitives.neutralsDarkSurface
  public static let border = _AppPrimitives.neutralsDarkBorders
  public static let divider = _AppPrimitives.neutralsDarkDividers
  public static let hover = _AppPrimitives.neutralsDarkHover
  public static let textPrimary = _AppPrimitives.neutralsDarkWhite
  public static let textSecondary = _AppPrimitives.neutralsDarkTextgray
}

// MARK: - Theme Manager
public class ThemeManager: ObservableObject {
  @Published public var isDarkMode: Bool = false

  public var tokens: AppTokens.Type {
    isDarkMode ? AppTokensDark.self : AppTokens.self
  }

  public init() {}
}

// MARK: - Typography Tokens
public enum AppTypography {

  // MARK: Display Large
  public static let displayLg: Font = Font.custom(_AppPrimitives.typoFontFamilyPrimary, size: _AppPrimitives.typoFontSizeDisplayLg).weight(_AppPrimitives.typoFontWeightDisplayLg)
  public static let displayLgSize: CGFloat = _AppPrimitives.typoFontSizeDisplayLg
  public static let displayLgLineHeight: CGFloat = _AppPrimitives.typoLineHeightDisplayLg
  public static let displayLgLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingDisplayLg

  // MARK: Display Medium
  public static let displayMd: Font = Font.custom(_AppPrimitives.typoFontFamilyPrimary, size: _AppPrimitives.typoFontSizeDisplayMd).weight(_AppPrimitives.typoFontWeightDisplayMd)
  public static let displayMdSize: CGFloat = _AppPrimitives.typoFontSizeDisplayMd
  public static let displayMdLineHeight: CGFloat = _AppPrimitives.typoLineHeightDisplayMd
  public static let displayMdLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingDisplayMd

  // MARK: Display Small
  public static let displaySm: Font = Font.custom(_AppPrimitives.typoFontFamilyPrimary, size: _AppPrimitives.typoFontSizeDisplaySm).weight(_AppPrimitives.typoFontWeightDisplaySm)
  public static let displaySmSize: CGFloat = _AppPrimitives.typoFontSizeDisplaySm
  public static let displaySmLineHeight: CGFloat = _AppPrimitives.typoLineHeightDisplaySm
  public static let displaySmLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingDisplaySm

  // MARK: H1
  public static let h1: Font = Font.custom(_AppPrimitives.typoFontFamilyPrimary, size: _AppPrimitives.typoFontSizeH1).weight(_AppPrimitives.typoFontWeightH1)
  public static let h1Size: CGFloat = _AppPrimitives.typoFontSizeH1
  public static let h1LineHeight: CGFloat = _AppPrimitives.typoLineHeightH1
  public static let h1LetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingH1

  // MARK: H2
  public static let h2: Font = Font.custom(_AppPrimitives.typoFontFamilyPrimary, size: _AppPrimitives.typoFontSizeH2).weight(_AppPrimitives.typoFontWeightH2)
  public static let h2Size: CGFloat = _AppPrimitives.typoFontSizeH2
  public static let h2LineHeight: CGFloat = _AppPrimitives.typoLineHeightH2
  public static let h2LetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingH2

  // MARK: H3
  public static let h3: Font = Font.custom(_AppPrimitives.typoFontFamilyPrimary, size: _AppPrimitives.typoFontSizeH3).weight(_AppPrimitives.typoFontWeightH3)
  public static let h3Size: CGFloat = _AppPrimitives.typoFontSizeH3
  public static let h3LineHeight: CGFloat = _AppPrimitives.typoLineHeightH3
  public static let h3LetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingH3

  // MARK: H4
  public static let h4: Font = Font.custom(_AppPrimitives.typoFontFamilyPrimary, size: _AppPrimitives.typoFontSizeH4).weight(_AppPrimitives.typoFontWeightH4)
  public static let h4Size: CGFloat = _AppPrimitives.typoFontSizeH4
  public static let h4LineHeight: CGFloat = _AppPrimitives.typoLineHeightH4
  public static let h4LetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingH4

  // MARK: Body Large
  public static let bodyLg: Font = Font.custom(_AppPrimitives.typoFontFamilySecondary, size: _AppPrimitives.typoFontSizeBodyLg).weight(_AppPrimitives.typoFontWeightBodyLg)
  public static let bodyLgSize: CGFloat = _AppPrimitives.typoFontSizeBodyLg
  public static let bodyLgLineHeight: CGFloat = _AppPrimitives.typoLineHeightBodyLg
  public static let bodyLgLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingBodyLg

  // MARK: Body Regular
  public static let body: Font = Font.custom(_AppPrimitives.typoFontFamilySecondary, size: _AppPrimitives.typoFontSizeBody).weight(_AppPrimitives.typoFontWeightBody)
  public static let bodySize: CGFloat = _AppPrimitives.typoFontSizeBody
  public static let bodyLineHeight: CGFloat = _AppPrimitives.typoLineHeightBody
  public static let bodyLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingBody

  // MARK: Body Small
  public static let bodySm: Font = Font.custom(_AppPrimitives.typoFontFamilySecondary, size: _AppPrimitives.typoFontSizeBodySm).weight(_AppPrimitives.typoFontWeightBodySm)
  public static let bodySmSize: CGFloat = _AppPrimitives.typoFontSizeBodySm
  public static let bodySmLineHeight: CGFloat = _AppPrimitives.typoLineHeightBodySm
  public static let bodySmLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingBodySm

  // MARK: Button Text
  public static let button: Font = Font.custom(_AppPrimitives.typoFontFamilySecondary, size: _AppPrimitives.typoFontSizeButton).weight(_AppPrimitives.typoFontWeightButton)
  public static let buttonSize: CGFloat = _AppPrimitives.typoFontSizeButton
  public static let buttonLineHeight: CGFloat = _AppPrimitives.typoLineHeightButton
  public static let buttonLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingButton

  // MARK: Input Label
  public static let label: Font = Font.custom(_AppPrimitives.typoFontFamilySecondary, size: _AppPrimitives.typoFontSizeLabel).weight(_AppPrimitives.typoFontWeightLabel)
  public static let labelSize: CGFloat = _AppPrimitives.typoFontSizeLabel
  public static let labelLineHeight: CGFloat = _AppPrimitives.typoLineHeightLabel
  public static let labelLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingLabel

  // MARK: Caption / Footnote
  public static let caption: Font = Font.custom(_AppPrimitives.typoFontFamilySecondary, size: _AppPrimitives.typoFontSizeCaption).weight(_AppPrimitives.typoFontWeightCaption)
  public static let captionSize: CGFloat = _AppPrimitives.typoFontSizeCaption
  public static let captionLineHeight: CGFloat = _AppPrimitives.typoLineHeightCaption
  public static let captionLetterSpacing: CGFloat = _AppPrimitives.typoLetterSpacingCaption
}

// MARK: - Spacing Tokens
public enum AppSpacing {
  public static let xs: CGFloat = _AppPrimitives.spaceXs
  public static let sm: CGFloat = _AppPrimitives.spaceSm
  public static let md: CGFloat = _AppPrimitives.spaceMd
  public static let lg: CGFloat = _AppPrimitives.spaceLg
  public static let xl: CGFloat = _AppPrimitives.spaceXl
}

// MARK: - Radius Tokens
public enum AppRadius {
  public static let xs: CGFloat = _AppPrimitives.radiusXs
  public static let sm: CGFloat = _AppPrimitives.radiusSm
  public static let md: CGFloat = _AppPrimitives.radiusMd
  public static let lg: CGFloat = _AppPrimitives.radiusLg
  public static let xl: CGFloat = _AppPrimitives.radiusXl
}

// MARK: - Border Width Tokens
public enum AppBorder {
  public static let thin: CGFloat = _AppPrimitives.borderThin
  public static let medium: CGFloat = _AppPrimitives.borderMedium
  public static let thick: CGFloat = _AppPrimitives.borderThick
}

// MARK: - Shadow / Elevation Tokens
public struct AppShadowStyle {
  public let color: Color
  public let radius: CGFloat
  public let x: CGFloat
  public let y: CGFloat
  public init(color: Color, radius: CGFloat, x: CGFloat, y: CGFloat) {
    self.color = color
    self.radius = radius
    self.x = x
    self.y = y
  }
}

extension View {
  public func shadow(_ style: AppShadowStyle) -> some View {
    self.shadow(color: style.color, radius: style.radius, x: style.x, y: style.y)
  }
}

public enum AppShadow {
  public static let elevation0 = AppShadowStyle(
    color: _AppPrimitives.shadow0Color.opacity(_AppPrimitives.shadow0Opacity),
    radius: _AppPrimitives.shadow0Blur,
    x: _AppPrimitives.shadow0OffsetX,
    y: _AppPrimitives.shadow0OffsetY
  )
  public static let elevation1 = AppShadowStyle(
    color: _AppPrimitives.shadow1Color.opacity(_AppPrimitives.shadow1Opacity),
    radius: _AppPrimitives.shadow1Blur,
    x: _AppPrimitives.shadow1OffsetX,
    y: _AppPrimitives.shadow1OffsetY
  )
  public static let elevation2 = AppShadowStyle(
    color: _AppPrimitives.shadow2Color.opacity(_AppPrimitives.shadow2Opacity),
    radius: _AppPrimitives.shadow2Blur,
    x: _AppPrimitives.shadow2OffsetX,
    y: _AppPrimitives.shadow2OffsetY
  )
}

// MARK: - Motion Tokens
public enum AppMotion {
  public static let fast: TimeInterval = _AppPrimitives.durationFast
  public static let normal: TimeInterval = _AppPrimitives.durationNormal
  public static let slow: TimeInterval = _AppPrimitives.durationSlow

  public static func easeInOut(_ duration: TimeInterval) -> Animation {
    Animation.easeInOut(duration: duration)
  }
  public static func easeOut(_ duration: TimeInterval) -> Animation {
    Animation.easeOut(duration: duration)
  }
  public static func spring(_ duration: TimeInterval) -> Animation {
    Animation.spring(duration: duration)
  }
}

// MARK: - Opacity Tokens
public enum AppOpacity {
  public static let disabled: CGFloat = _AppPrimitives.opacityDisabled
  public static let hover: CGFloat = _AppPrimitives.opacityHover
  public static let active: CGFloat = _AppPrimitives.opacityActive
  public static let selected: CGFloat = _AppPrimitives.opacitySelected
}