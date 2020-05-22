package typingsSlinky.uifabricStyling

import typingsSlinky.std.Partial
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.IFontWeight
import typingsSlinky.uifabricMergeStyles.istyleMod.IRawStyle
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricStyling.getGlobalClassNamesMod.GlobalClassNames
import typingsSlinky.uifabricStyling.ianimationstylesMod.IAnimationStyles
import typingsSlinky.uifabricStyling.ianimationstylesMod.IAnimationVariables
import typingsSlinky.uifabricStyling.ieffectsMod.IEffects
import typingsSlinky.uifabricStyling.ifontstylesMod.IFontStyles
import typingsSlinky.uifabricStyling.igetfocusstylesMod.IGetFocusStylesOptions
import typingsSlinky.uifabricStyling.ipaletteMod.IPalette
import typingsSlinky.uifabricStyling.ithemeMod.IPartialTheme
import typingsSlinky.uifabricStyling.ithemeMod.ISchemeNames
import typingsSlinky.uifabricStyling.ithemeMod.ITheme
import typingsSlinky.uifabricStyling.uifabricStylingStrings.absolute
import typingsSlinky.uifabricStyling.uifabricStylingStrings.accent
import typingsSlinky.uifabricStyling.uifabricStylingStrings.black
import typingsSlinky.uifabricStyling.uifabricStylingStrings.blackTranslucent40
import typingsSlinky.uifabricStyling.uifabricStylingStrings.blue
import typingsSlinky.uifabricStyling.uifabricStylingStrings.blueDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.blueLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.blueMid
import typingsSlinky.uifabricStyling.uifabricStylingStrings.border
import typingsSlinky.uifabricStyling.uifabricStylingStrings.borderBottom
import typingsSlinky.uifabricStyling.uifabricStylingStrings.green
import typingsSlinky.uifabricStyling.uifabricStylingStrings.greenDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.greenLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.horizontal
import typingsSlinky.uifabricStyling.uifabricStylingStrings.magenta
import typingsSlinky.uifabricStyling.uifabricStylingStrings.magentaDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.magentaLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralLighter
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralLighterAlt
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralPrimary
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralPrimaryAlt
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralQuaternary
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralQuaternaryAlt
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralSecondary
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralSecondaryAlt
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralTertiary
import typingsSlinky.uifabricStyling.uifabricStylingStrings.neutralTertiaryAlt
import typingsSlinky.uifabricStyling.uifabricStylingStrings.orange
import typingsSlinky.uifabricStyling.uifabricStylingStrings.orangeLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.orangeLighter
import typingsSlinky.uifabricStyling.uifabricStylingStrings.purple
import typingsSlinky.uifabricStyling.uifabricStylingStrings.purpleDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.purpleLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.red
import typingsSlinky.uifabricStyling.uifabricStylingStrings.redDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.relative
import typingsSlinky.uifabricStyling.uifabricStylingStrings.teal
import typingsSlinky.uifabricStyling.uifabricStylingStrings.tealDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.tealLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeDarkAlt
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeDarker
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeLight
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeLighter
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeLighterAlt
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themePrimary
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeSecondary
import typingsSlinky.uifabricStyling.uifabricStylingStrings.themeTertiary
import typingsSlinky.uifabricStyling.uifabricStylingStrings.vertical
import typingsSlinky.uifabricStyling.uifabricStylingStrings.white
import typingsSlinky.uifabricStyling.uifabricStylingStrings.whiteTranslucent40
import typingsSlinky.uifabricStyling.uifabricStylingStrings.yellow
import typingsSlinky.uifabricStyling.uifabricStylingStrings.yellowDark
import typingsSlinky.uifabricStyling.uifabricStylingStrings.yellowLight
import typingsSlinky.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uifabric/styling/lib/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  val AnimationStyles: IAnimationStyles = js.native
  val AnimationVariables: IAnimationVariables = js.native
  val DefaultEffects: IEffects = js.native
  val DefaultFontStyles: IFontStyles = js.native
  val DefaultPalette: IPalette = js.native
  val EdgeChromiumHighContrastSelector: /* "@media screen and (-ms-high-contrast: active) and (forced-colors: active)" */ String = js.native
  val HighContrastSelector: /* "@media screen and (-ms-high-contrast: active)" */ String = js.native
  val HighContrastSelectorBlack: /* "@media screen and (-ms-high-contrast: white-on-black)" */ String = js.native
  val HighContrastSelectorWhite: /* "@media screen and (-ms-high-contrast: black-on-white)" */ String = js.native
  val ScreenWidthMaxLarge: Double = js.native
  val ScreenWidthMaxMedium: Double = js.native
  val ScreenWidthMaxSmall: Double = js.native
  val ScreenWidthMaxXLarge: Double = js.native
  val ScreenWidthMaxXXLarge: Double = js.native
  val ScreenWidthMinLarge: /* 640 */ Double = js.native
  val ScreenWidthMinMedium: /* 480 */ Double = js.native
  val ScreenWidthMinSmall: /* 320 */ Double = js.native
  val ScreenWidthMinUhfMobile: /* 768 */ Double = js.native
  val ScreenWidthMinXLarge: /* 1024 */ Double = js.native
  val ScreenWidthMinXXLarge: /* 1366 */ Double = js.native
  val ScreenWidthMinXXXLarge: /* 1920 */ Double = js.native
  val ThemeSettingName: /* "theme" */ String = js.native
  val hiddenContentStyle: IRawStyle = js.native
  val noWrap: IRawStyle = js.native
  val normalize: IRawStyle = js.native
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  def createTheme(theme: IPartialTheme): ITheme = js.native
  def createTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def focusClear(): IRawStyle = js.native
  def getEdgeChromiumNoHighContrastAdjustSelector(): typingsSlinky.uifabricStyling.anon.EdgeChromiumHighContrastSelector = js.native
  def getFadedOverflowStyle(theme: ITheme): IRawStyle = js.native
  def getFadedOverflowStyle(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight
  ): IRawStyle = js.native
  def getFadedOverflowStyle(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: horizontal
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: horizontal,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: horizontal,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: horizontal,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: horizontal
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: horizontal,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: horizontal,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: horizontal,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: horizontal,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: horizontal,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_horizontal(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: horizontal,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: vertical
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: vertical,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: accent | black | blackTranslucent40 | blue | blueDark | blueLight | blueMid | green | greenDark | greenLight | magenta | magentaDark | magentaLight | neutralDark | neutralLight | neutralLighter | neutralLighterAlt | neutralPrimary | neutralPrimaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | orange | orangeLight | orangeLighter | purple | purpleDark | purpleLight | red | redDark | teal | tealDark | tealLight | themeDark | themeDarkAlt | themeDarker | themeLight | themeLighter | themeLighterAlt | themePrimary | themeSecondary | themeTertiary | white | whiteTranslucent40 | yellow | yellowDark | yellowLight,
    direction: vertical,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/IPalette.IPalette */ themeDarker | themeDark | themeDarkAlt | themePrimary | themeSecondary | themeTertiary | themeLight | themeLighter | themeLighterAlt | black | blackTranslucent40 | neutralDark | neutralPrimary | neutralPrimaryAlt | neutralSecondary | neutralSecondaryAlt | neutralTertiary | neutralTertiaryAlt | neutralQuaternary | neutralQuaternaryAlt | neutralLight | neutralLighter | neutralLighterAlt | accent | white | whiteTranslucent40 | yellowDark | yellow | yellowLight | orange | orangeLight | orangeLighter | redDark | red | magentaDark | magenta | magentaLight | purpleDark | purple | purpleLight | blueDark | blueMid | blue | blueLight | tealDark | teal | tealLight | greenDark | green | greenLight,
    direction: vertical,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: vertical
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: vertical,
    width: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: vertical,
    width: String,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: vertical,
    width: String,
    height: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: vertical,
    width: Double
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: vertical,
    width: Double,
    height: String
  ): IRawStyle = js.native
  @JSName("getFadedOverflowStyle")
  def getFadedOverflowStyle_vertical(
    theme: ITheme,
    color: /* keyof @uifabric/styling.@uifabric/styling/lib/interfaces/ISemanticColors.ISemanticColors */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 100 */ js.Any,
    direction: vertical,
    width: Double,
    height: Double
  ): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double, color: String): IRawStyle = js.native
  def getFocusStyle(theme: ITheme): IRawStyle = js.native
  def getFocusStyle(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_absolute(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  @JSName("getFocusStyle")
  def getFocusStyle_relative(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): Partial[GlobalClassNames[T]] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): Partial[GlobalClassNames[T]] = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: String): IRawStyle = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: String, borderType: border): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: String, borderType: border, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: Double, borderType: border): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_border(borderColor: String, borderRadius: Double, borderType: border, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: String, borderType: borderBottom): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: String, borderType: borderBottom, borderPosition: Double): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: Double, borderType: borderBottom): IRawStyle = js.native
  @JSName("getInputFocusStyle")
  def getInputFocusStyle_borderBottom(borderColor: String, borderRadius: Double, borderType: borderBottom, borderPosition: Double): IRawStyle = js.native
  def getPlaceholderStyles(styles: IStyle): IStyle = js.native
  def getScreenSelector(min: Double, max: Double): String = js.native
  def getTheme(): ITheme = js.native
  def getTheme(depComments: Boolean): ITheme = js.native
  def getThemedContext(context: ICustomizerContext): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = js.native
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  def registerDefaultFontFaces(baseUrl: String): Unit = js.native
  def registerOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  def removeOnThemeChangeCallback(callback: js.Function1[/* theme */ ITheme, Unit]): Unit = js.native
  @js.native
  object FontSizes extends js.Object {
    val icon: String = js.native
    val large: String = js.native
    val medium: String = js.native
    val mediumPlus: String = js.native
    val mega: String = js.native
    val mini: String = js.native
    val small: String = js.native
    val smallPlus: String = js.native
    val superLarge: String = js.native
    val xLarge: String = js.native
    val xLargePlus: String = js.native
    val xSmall: String = js.native
    val xxLarge: String = js.native
    val xxLargePlus: String = js.native
  }
  
  @js.native
  object FontWeights extends js.Object {
    val bold: IFontWeight = js.native
    val light: IFontWeight = js.native
    val regular: IFontWeight = js.native
    val semibold: IFontWeight = js.native
    val semilight: IFontWeight = js.native
  }
  
  @js.native
  object IconFontSizes extends js.Object {
    val large: String = js.native
    val medium: String = js.native
    val small: String = js.native
    val xSmall: String = js.native
  }
  
  @js.native
  object PulsingBeaconAnimationStyles extends js.Object {
    var continuousPulseAnimationDouble: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var continuousPulseAnimationSingle: js.Function5[
        /* beaconColorOne */ String, 
        /* beaconColorTwo */ String, 
        /* innerDimension */ String, 
        /* outerDimension */ String, 
        /* borderWidth */ String, 
        String
      ] = js.native
    var createDefaultAnimation: js.Function2[/* animationName */ String, /* delayLength */ js.UndefOr[String], IRawStyle] = js.native
  }
  
  @js.native
  object ZIndexes extends js.Object {
    val Coachmark: Double = js.native
    val FocusStyle: Double = js.native
    val KeytipLayer: Double = js.native
    val Layer: Double = js.native
    val Nav: Double = js.native
    /**
      * @deprecated ScrollablePane
      */
    val ScrollablePane: Double = js.native
  }
  
}

