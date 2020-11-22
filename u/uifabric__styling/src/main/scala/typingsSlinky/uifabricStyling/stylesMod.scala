package typingsSlinky.uifabricStyling

import typingsSlinky.fluentuiTheme.ianimationstylesMod.IAnimationStyles
import typingsSlinky.fluentuiTheme.ianimationstylesMod.IAnimationVariables
import typingsSlinky.fluentuiTheme.ieffectsMod.IEffects
import typingsSlinky.fluentuiTheme.ifontstylesMod.IFontStyles
import typingsSlinky.fluentuiTheme.ipaletteMod.IPalette
import typingsSlinky.fluentuiTheme.ischemeMod.ISchemeNames
import typingsSlinky.fluentuiTheme.ithemeMod.IPartialTheme
import typingsSlinky.fluentuiTheme.ithemeMod.ITheme
import typingsSlinky.fluentuiTheme.themeMod.PartialTheme
import typingsSlinky.fluentuiTheme.themeMod.Theme
import typingsSlinky.uifabricMergeStyles.irawstyleMod.IRawStyle
import typingsSlinky.uifabricMergeStyles.irawstylebaseMod.IFontWeight
import typingsSlinky.uifabricMergeStyles.istyleMod.IStyle
import typingsSlinky.uifabricStyling.getGlobalClassNamesMod.GlobalClassNames
import typingsSlinky.uifabricStyling.igetfocusstylesMod.IGetFocusStylesOptions
import typingsSlinky.uifabricStyling.uifabricStylingStrings.absolute
import typingsSlinky.uifabricStyling.uifabricStylingStrings.border
import typingsSlinky.uifabricStyling.uifabricStylingStrings.borderBottom
import typingsSlinky.uifabricStyling.uifabricStylingStrings.horizontal
import typingsSlinky.uifabricStyling.uifabricStylingStrings.relative
import typingsSlinky.uifabricStyling.uifabricStylingStrings.vertical
import typingsSlinky.uifabricUtilities.customizerContextMod.ICustomizerContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@uifabric/styling/lib/styles", JSImport.Namespace)
@js.native
object stylesMod extends js.Object {
  
  val AnimationStyles: IAnimationStyles = js.native
  
  val AnimationVariables: IAnimationVariables = js.native
  
  val DefaultEffects: IEffects = js.native
  
  val DefaultFontStyles: IFontStyles = js.native
  
  val DefaultPalette: IPalette = js.native
  
  val EdgeChromiumHighContrastSelector: /* "@media screen and (forced-colors: active)" */ String = js.native
  
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
  
  def createFontStyles(): IFontStyles = js.native
  def createFontStyles(localeCode: String): IFontStyles = js.native
  
  def createTheme(): Theme = js.native
  def createTheme(theme: js.UndefOr[scala.Nothing], depComments: Boolean): Theme = js.native
  def createTheme(theme: PartialTheme): Theme = js.native
  def createTheme(theme: PartialTheme, depComments: Boolean): Theme = js.native
  
  def focusClear(): IRawStyle = js.native
  
  def getEdgeChromiumNoHighContrastAdjustSelector(): typingsSlinky.uifabricStyling.anon.EdgeChromiumHighContrastSelector = js.native
  
  def getFadedOverflowStyle(
    theme: ITheme,
    color: js.UndefOr[
      /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 154 */ js.Any
    ],
    direction: js.UndefOr[horizontal | vertical],
    width: js.UndefOr[String | Double],
    height: js.UndefOr[String | Double]
  ): IRawStyle = js.native
  
  def getFocusOutlineStyle(theme: ITheme): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: js.UndefOr[scala.Nothing], width: js.UndefOr[scala.Nothing], color: String): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: js.UndefOr[scala.Nothing], width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: js.UndefOr[scala.Nothing], width: Double, color: String): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: js.UndefOr[scala.Nothing], color: String): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double): IRawStyle = js.native
  def getFocusOutlineStyle(theme: ITheme, inset: Double, width: Double, color: String): IRawStyle = js.native
  
  def getFocusStyle(theme: ITheme): IRawStyle = js.native
  def getFocusStyle(
    theme: ITheme,
    inset: js.UndefOr[Double],
    position: js.UndefOr[relative | absolute],
    highContrastStyle: js.UndefOr[IRawStyle],
    borderColor: js.UndefOr[String],
    outlineColor: js.UndefOr[String],
    isFocusedOnly: js.UndefOr[Boolean]
  ): IRawStyle = js.native
  def getFocusStyle(theme: ITheme, options: IGetFocusStylesOptions): IRawStyle = js.native
  
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme): GlobalClassNames[T] = js.native
  def getGlobalClassNames[T](classNames: GlobalClassNames[T], theme: ITheme, disableGlobalClassNames: Boolean): GlobalClassNames[T] = js.native
  
  def getInputFocusStyle(borderColor: String, borderRadius: String): IRawStyle = js.native
  def getInputFocusStyle(
    borderColor: String,
    borderRadius: String,
    borderType: js.UndefOr[scala.Nothing],
    borderPosition: Double
  ): IRawStyle = js.native
  def getInputFocusStyle(borderColor: String, borderRadius: Double): IRawStyle = js.native
  def getInputFocusStyle(
    borderColor: String,
    borderRadius: Double,
    borderType: js.UndefOr[scala.Nothing],
    borderPosition: Double
  ): IRawStyle = js.native
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
  def getThemedContext(context: ICustomizerContext, scheme: js.UndefOr[scala.Nothing], theme: ITheme): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames): ICustomizerContext = js.native
  def getThemedContext(context: ICustomizerContext, scheme: ISchemeNames, theme: ITheme): ICustomizerContext = js.native
  
  val hiddenContentStyle: IRawStyle = js.native
  
  def loadTheme(theme: IPartialTheme): ITheme = js.native
  def loadTheme(theme: IPartialTheme, depComments: Boolean): ITheme = js.native
  
  val noWrap: IRawStyle = js.native
  
  val normalize: IRawStyle = js.native
  
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
    
    val size10: /* "10px" */ String = js.native
    
    val size12: /* "12px" */ String = js.native
    
    val size14: /* "14px" */ String = js.native
    
    val size16: /* "16px" */ String = js.native
    
    val size18: /* "18px" */ String = js.native
    
    val size20: /* "20px" */ String = js.native
    
    val size24: /* "24px" */ String = js.native
    
    val size28: /* "28px" */ String = js.native
    
    val size32: /* "32px" */ String = js.native
    
    val size42: /* "42px" */ String = js.native
    
    val size68: /* "68px" */ String = js.native
    
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
