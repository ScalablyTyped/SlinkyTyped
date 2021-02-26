package typingsSlinky.vegaLite

import typingsSlinky.std.Partial
import typingsSlinky.std.Record
import typingsSlinky.vegaLite.anon.Groupsubtitle
import typingsSlinky.vegaLite.anon.Step
import typingsSlinky.vegaLite.axisMod.Axis
import typingsSlinky.vegaLite.axisMod.AxisConfigMixins
import typingsSlinky.vegaLite.compositemarkMod.CompositeMarkConfigMixins
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.headerMod.HeaderConfigMixins
import typingsSlinky.vegaLite.legendMod.LegendConfig
import typingsSlinky.vegaLite.projectionMod.ProjectionConfig
import typingsSlinky.vegaLite.scaleMod.ScaleConfig
import typingsSlinky.vegaLite.specBaseMod.BaseViewBackground
import typingsSlinky.vegaLite.specBaseMod.CompositionConfigMixins
import typingsSlinky.vegaLite.srcMarkMod.AnyMarkConfig
import typingsSlinky.vegaLite.srcMarkMod.MarkConfigMixins
import typingsSlinky.vegaLite.srcSelectionMod.SelectionConfig
import typingsSlinky.vegaLite.titleMod.TitleConfig
import typingsSlinky.vegaLite.toplevelMod.TopLevelProperties
import typingsSlinky.vegaLite.vegaLiteStrings.functional
import typingsSlinky.vegaLite.vegaLiteStrings.height
import typingsSlinky.vegaLite.vegaLiteStrings.plain
import typingsSlinky.vegaLite.vegaLiteStrings.verbal
import typingsSlinky.vegaLite.vegaLiteStrings.width
import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.configMod.RangeConfig
import typingsSlinky.vegaTypings.scaleMod.RangeScheme
import typingsSlinky.vegaTypings.signalMod.InitSignal
import typingsSlinky.vegaTypings.signalMod.NewSignal
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object srcConfigMod {
  
  object DEFAULT_COLOR {
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.blue")
    @js.native
    def blue: String = js.native
    @scala.inline
    def blue_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("blue")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.brown")
    @js.native
    def brown: String = js.native
    @scala.inline
    def brown_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("brown")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray0")
    @js.native
    def gray0: String = js.native
    @scala.inline
    def gray0_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray0")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray1")
    @js.native
    def gray1: String = js.native
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray10")
    @js.native
    def gray10: String = js.native
    @scala.inline
    def gray10_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray10")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray11")
    @js.native
    def gray11: String = js.native
    @scala.inline
    def gray11_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray11")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray12")
    @js.native
    def gray12: String = js.native
    @scala.inline
    def gray12_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray12")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray13")
    @js.native
    def gray13: String = js.native
    @scala.inline
    def gray13_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray13")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray14")
    @js.native
    def gray14: String = js.native
    @scala.inline
    def gray14_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray14")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray15")
    @js.native
    def gray15: String = js.native
    @scala.inline
    def gray15_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray15")(x.asInstanceOf[js.Any])
    
    @scala.inline
    def gray1_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray1")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray2")
    @js.native
    def gray2: String = js.native
    @scala.inline
    def gray2_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray2")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray3")
    @js.native
    def gray3: String = js.native
    @scala.inline
    def gray3_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray3")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray4")
    @js.native
    def gray4: String = js.native
    @scala.inline
    def gray4_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray4")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray5")
    @js.native
    def gray5: String = js.native
    @scala.inline
    def gray5_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray5")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray6")
    @js.native
    def gray6: String = js.native
    @scala.inline
    def gray6_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray6")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray7")
    @js.native
    def gray7: String = js.native
    @scala.inline
    def gray7_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray7")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray8")
    @js.native
    def gray8: String = js.native
    @scala.inline
    def gray8_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray8")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.gray9")
    @js.native
    def gray9: String = js.native
    @scala.inline
    def gray9_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("gray9")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.green")
    @js.native
    def green: String = js.native
    @scala.inline
    def green_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("green")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.orange")
    @js.native
    def orange: String = js.native
    @scala.inline
    def orange_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("orange")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.pink")
    @js.native
    def pink: String = js.native
    @scala.inline
    def pink_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("pink")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.purple")
    @js.native
    def purple: String = js.native
    @scala.inline
    def purple_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("purple")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.red")
    @js.native
    def red: String = js.native
    @scala.inline
    def red_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("red")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.teal")
    @js.native
    def teal: String = js.native
    @scala.inline
    def teal_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("teal")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_COLOR.yellow")
    @js.native
    def yellow: String = js.native
    @scala.inline
    def yellow_=(x: String): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("yellow")(x.asInstanceOf[js.Any])
  }
  
  object DEFAULT_FONT_SIZE {
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.groupSubtitle")
    @js.native
    def groupSubtitle: Double = js.native
    @scala.inline
    def groupSubtitle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupSubtitle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.groupTitle")
    @js.native
    def groupTitle: Double = js.native
    @scala.inline
    def groupTitle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("groupTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.guideLabel")
    @js.native
    def guideLabel: Double = js.native
    @scala.inline
    def guideLabel_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guideLabel")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.guideTitle")
    @js.native
    def guideTitle: Double = js.native
    @scala.inline
    def guideTitle_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("guideTitle")(x.asInstanceOf[js.Any])
    
    @JSImport("vega-lite/build/src/config", "DEFAULT_FONT_SIZE.text")
    @js.native
    def text: Double = js.native
    @scala.inline
    def text_=(x: Double): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("text")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("vega-lite/build/src/config", "DEFAULT_STEP")
  @js.native
  val DEFAULT_STEP: /* 20 */ Double = js.native
  
  @JSImport("vega-lite/build/src/config", "colorSignalConfig")
  @js.native
  def colorSignalConfig(): Config[ExprRef | SignalRef] = js.native
  @JSImport("vega-lite/build/src/config", "colorSignalConfig")
  @js.native
  def colorSignalConfig(color: Boolean): Config[ExprRef | SignalRef] = js.native
  @JSImport("vega-lite/build/src/config", "colorSignalConfig")
  @js.native
  def colorSignalConfig(color: ColorConfig): Config[ExprRef | SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/config", "defaultConfig")
  @js.native
  val defaultConfig: Config[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/config", "defaultViewConfig")
  @js.native
  val defaultViewConfig: ViewConfig[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/config", "fontConfig")
  @js.native
  def fontConfig(font: String): Config[ExprRef | SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/config", "fontSizeSignalConfig")
  @js.native
  def fontSizeSignalConfig(fontSize: Boolean): Config[ExprRef | SignalRef] = js.native
  @JSImport("vega-lite/build/src/config", "fontSizeSignalConfig")
  @js.native
  def fontSizeSignalConfig(fontSize: FontSizeConfig): Config[ExprRef | SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/config", "getViewConfigContinuousSize")
  @js.native
  def getViewConfigContinuousSize_height[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: height): Double = js.native
  @JSImport("vega-lite/build/src/config", "getViewConfigContinuousSize")
  @js.native
  def getViewConfigContinuousSize_width[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: width): Double = js.native
  
  @JSImport("vega-lite/build/src/config", "getViewConfigDiscreteSize")
  @js.native
  def getViewConfigDiscreteSize_height[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: height): Double | Step = js.native
  @JSImport("vega-lite/build/src/config", "getViewConfigDiscreteSize")
  @js.native
  def getViewConfigDiscreteSize_width[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: width): Double | Step = js.native
  
  @JSImport("vega-lite/build/src/config", "getViewConfigDiscreteStep")
  @js.native
  def getViewConfigDiscreteStep_height[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: height): Double = js.native
  @JSImport("vega-lite/build/src/config", "getViewConfigDiscreteStep")
  @js.native
  def getViewConfigDiscreteStep_width[ES /* <: ExprRef | SignalRef */](viewConfig: ViewConfig[ES], channel: width): Double = js.native
  
  @JSImport("vega-lite/build/src/config", "initConfig")
  @js.native
  def initConfig(): Config[SignalRef] = js.native
  @JSImport("vega-lite/build/src/config", "initConfig")
  @js.native
  def initConfig(specifiedConfig: Config[ExprRef | SignalRef]): Config[SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/config", "isVgScheme")
  @js.native
  def isVgScheme(rangeScheme: js.Array[String]): /* is vega-typings.vega-typings/types/spec/scale.RangeScheme */ Boolean = js.native
  @JSImport("vega-lite/build/src/config", "isVgScheme")
  @js.native
  def isVgScheme(rangeScheme: RangeScheme): /* is vega-typings.vega-typings/types/spec/scale.RangeScheme */ Boolean = js.native
  
  @JSImport("vega-lite/build/src/config", "stripAndRedirectConfig")
  @js.native
  def stripAndRedirectConfig(config: Config[SignalRef]): Config[SignalRef] = js.native
  
  type ColorConfig = Record[String, Color]
  
  @js.native
  trait Config[ES /* <: ExprRef | SignalRef */]
    extends CompositeMarkConfigMixins
       with TopLevelProperties[ES]
       with VLOnlyConfig[ES]
       with MarkConfigMixins[ES]
       with AxisConfigMixins[ES]
       with HeaderConfigMixins[ES]
       with CompositionConfigMixins {
    
    /**
      * A boolean flag indicating if ARIA default attributes should be included for marks and guides (SVG output only). If false, the `"aria-hidden"` attribute will be set for all guides, removing them from the ARIA accessibility tree and Vega-Lite will not generate default descriptions for marks.
      *
      * __Default value:__ `true`.
      */
    var aria: js.UndefOr[Boolean] = js.native
    
    /**
      * Legend configuration, which determines default properties for all [legends](https://vega.github.io/vega-lite/docs/legend.html). For a full list of legend configuration options, please see the [corresponding section of in the legend documentation](https://vega.github.io/vega-lite/docs/legend.html#config).
      */
    var legend: js.UndefOr[LegendConfig[ES]] = js.native
    
    /**
      * A delimiter, such as a newline character, upon which to break text strings into multiple lines. This property provides a global default for text marks, which is overridden by mark or style config settings, and by the lineBreak mark encoding channel. If signal-valued, either string or regular expression (regexp) values are valid.
      */
    var lineBreak: js.UndefOr[String | ES] = js.native
    
    /**
      * Projection configuration, which determines default properties for all [projections](https://vega.github.io/vega-lite/docs/projection.html). For a full list of projection configuration options, please see the [corresponding section of the projection documentation](https://vega.github.io/vega-lite/docs/projection.html#config).
      */
    var projection: js.UndefOr[ProjectionConfig] = js.native
    
    /**
      * An object hash that defines default range arrays or schemes for using with scales.
      * For a full list of scale range configuration options, please see the [corresponding section of the scale documentation](https://vega.github.io/vega-lite/docs/scale.html#config).
      */
    var range: js.UndefOr[RangeConfig] = js.native
    
    /**
      * @hidden
      */
    var signals: js.UndefOr[js.Array[InitSignal | NewSignal]] = js.native
    
    /** An object hash that defines key-value mappings to determine default properties for marks with a given [style](https://vega.github.io/vega-lite/docs/mark.html#mark-def). The keys represent styles names; the values have to be valid [mark configuration objects](https://vega.github.io/vega-lite/docs/mark.html#config). */
    var style: js.UndefOr[StyleConfigIndex[ES]] = js.native
    
    /**
      * Title configuration, which determines default properties for all [titles](https://vega.github.io/vega-lite/docs/title.html). For a full list of title configuration options, please see the [corresponding section of the title documentation](https://vega.github.io/vega-lite/docs/title.html#config).
      */
    var title: js.UndefOr[TitleConfig[ES]] = js.native
  }
  object Config {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): Config[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Config[ES]]
    }
    
    @scala.inline
    implicit class ConfigMutableBuilder[Self <: Config[_], ES /* <: ExprRef | SignalRef */] (val x: Self with Config[ES]) extends AnyVal {
      
      @scala.inline
      def setAria(value: Boolean): Self = StObject.set(x, "aria", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAriaUndefined: Self = StObject.set(x, "aria", js.undefined)
      
      @scala.inline
      def setLegend(value: LegendConfig[ES]): Self = StObject.set(x, "legend", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLegendUndefined: Self = StObject.set(x, "legend", js.undefined)
      
      @scala.inline
      def setLineBreak(value: String | ES): Self = StObject.set(x, "lineBreak", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineBreakUndefined: Self = StObject.set(x, "lineBreak", js.undefined)
      
      @scala.inline
      def setProjection(value: ProjectionConfig): Self = StObject.set(x, "projection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProjectionUndefined: Self = StObject.set(x, "projection", js.undefined)
      
      @scala.inline
      def setRange(value: RangeConfig): Self = StObject.set(x, "range", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRangeUndefined: Self = StObject.set(x, "range", js.undefined)
      
      @scala.inline
      def setSignals(value: js.Array[InitSignal | NewSignal]): Self = StObject.set(x, "signals", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSignalsUndefined: Self = StObject.set(x, "signals", js.undefined)
      
      @scala.inline
      def setSignalsVarargs(value: (InitSignal | NewSignal)*): Self = StObject.set(x, "signals", js.Array(value :_*))
      
      @scala.inline
      def setStyle(value: StyleConfigIndex[ES]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setTitle(value: TitleConfig[ES]): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
  
  type FontSizeConfig = Record[String, Double]
  
  type StyleConfigIndex[ES /* <: ExprRef | SignalRef */] = (Partial[Record[String, AnyMarkConfig[ES] | Axis[ES]]]) with MarkConfigMixins[ES] with Groupsubtitle[ES]
  
  @js.native
  trait VLOnlyConfig[ES /* <: ExprRef | SignalRef */] extends StObject {
    
    /**
      * Default color signals.
      *
      * @hidden
      */
    var color: js.UndefOr[Boolean | ColorConfig] = js.native
    
    /**
      * Default axis and legend title for count fields.
      *
      * __Default value:__ `'Count of Records`.
      *
      * @type {string}
      */
    var countTitle: js.UndefOr[String] = js.native
    
    /**
      * Allow the `formatType` property for text marks and guides to accept a custom formatter function [registered as a Vega expression](https://vega.github.io/vega-lite/usage/compile.html#format-type).
      */
    var customFormatTypes: js.UndefOr[Boolean] = js.native
    
    /**
      * Defines how Vega-Lite generates title for fields. There are three possible styles:
      * - `"verbal"` (Default) - displays function in a verbal style (e.g., "Sum of field", "Year-month of date", "field (binned)").
      * - `"function"` - displays function using parentheses and capitalized texts (e.g., "SUM(field)", "YEARMONTH(date)", "BIN(field)").
      * - `"plain"` - displays only the field name without functions (e.g., "field", "date", "field").
      */
    var fieldTitle: js.UndefOr[verbal | functional | plain] = js.native
    
    /**
      * Default font for all text marks, titles, and labels.
      */
    var font: js.UndefOr[String] = js.native
    
    /**
      * Default font size signals.
      *
      * @hidden
      */
    var fontSize: js.UndefOr[Boolean | FontSizeConfig] = js.native
    
    /**
      * D3 Number format for guide labels and text marks. For example `"s"` for SI units. Use [D3's number format pattern](https://github.com/d3/d3-format#locale_format).
      */
    var numberFormat: js.UndefOr[String] = js.native
    
    /**
      * Scale configuration determines default properties for all [scales](https://vega.github.io/vega-lite/docs/scale.html). For a full list of scale configuration options, please see the [corresponding section of the scale documentation](https://vega.github.io/vega-lite/docs/scale.html#config).
      */
    var scale: js.UndefOr[ScaleConfig[ES]] = js.native
    
    /** An object hash for defining default properties for each type of selections. */
    var selection: js.UndefOr[SelectionConfig] = js.native
    
    /**
      * Default time format for raw time values (without time units) in text marks, legend labels and header labels.
      *
      * __Default value:__ `"%b %d, %Y"`
      * __Note:__ Axes automatically determine the format for each label automatically so this config does not affect axes.
      */
    var timeFormat: js.UndefOr[String] = js.native
    
    /** Default properties for [single view plots](https://vega.github.io/vega-lite/docs/spec.html#single). */
    var view: js.UndefOr[ViewConfig[ES]] = js.native
  }
  object VLOnlyConfig {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): VLOnlyConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[VLOnlyConfig[ES]]
    }
    
    @scala.inline
    implicit class VLOnlyConfigMutableBuilder[Self <: VLOnlyConfig[_], ES /* <: ExprRef | SignalRef */] (val x: Self with VLOnlyConfig[ES]) extends AnyVal {
      
      @scala.inline
      def setColor(value: Boolean | ColorConfig): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setCountTitle(value: String): Self = StObject.set(x, "countTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountTitleUndefined: Self = StObject.set(x, "countTitle", js.undefined)
      
      @scala.inline
      def setCustomFormatTypes(value: Boolean): Self = StObject.set(x, "customFormatTypes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCustomFormatTypesUndefined: Self = StObject.set(x, "customFormatTypes", js.undefined)
      
      @scala.inline
      def setFieldTitle(value: verbal | functional | plain): Self = StObject.set(x, "fieldTitle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldTitleUndefined: Self = StObject.set(x, "fieldTitle", js.undefined)
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSize(value: Boolean | FontSizeConfig): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setNumberFormat(value: String): Self = StObject.set(x, "numberFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberFormatUndefined: Self = StObject.set(x, "numberFormat", js.undefined)
      
      @scala.inline
      def setScale(value: ScaleConfig[ES]): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScaleUndefined: Self = StObject.set(x, "scale", js.undefined)
      
      @scala.inline
      def setSelection(value: SelectionConfig): Self = StObject.set(x, "selection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectionUndefined: Self = StObject.set(x, "selection", js.undefined)
      
      @scala.inline
      def setTimeFormat(value: String): Self = StObject.set(x, "timeFormat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimeFormatUndefined: Self = StObject.set(x, "timeFormat", js.undefined)
      
      @scala.inline
      def setView(value: ViewConfig[ES]): Self = StObject.set(x, "view", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setViewUndefined: Self = StObject.set(x, "view", js.undefined)
    }
  }
  
  @js.native
  trait ViewConfig[ES /* <: ExprRef | SignalRef */] extends BaseViewBackground[ES] {
    
    /**
      * Whether the view should be clipped.
      */
    var clip: js.UndefOr[Boolean] = js.native
    
    /**
      * The default height when the plot has a continuous y-field for x or latitude, or has arc marks.
      *
      * __Default value:__ `200`
      */
    var continuousHeight: js.UndefOr[Double] = js.native
    
    /**
      * The default width when the plot has a continuous field for x or longitude, or has arc marks.
      *
      * __Default value:__ `200`
      */
    var continuousWidth: js.UndefOr[Double] = js.native
    
    /**
      * The default height when the plot has non arc marks and either a discrete y-field or no y-field.
      * The height can be either a number indicating a fixed height or an object in the form of `{step: number}` defining the height per discrete step.
      *
      * __Default value:__ a step size based on `config.view.step`.
      */
    var discreteHeight: js.UndefOr[Double | Step] = js.native
    
    /**
      * The default width when the plot has non-arc marks and either a discrete x-field or no x-field.
      * The width can be either a number indicating a fixed width or an object in the form of `{step: number}` defining the width per discrete step.
      *
      * __Default value:__ a step size based on `config.view.step`.
      */
    var discreteWidth: js.UndefOr[Double | Step] = js.native
    
    /**
      * Default height
      *
      * __Deprecated:__ Since Vega-Lite 4.0. Please use continuousHeight and discreteHeight instead.
      */
    var height: js.UndefOr[Double] = js.native
    
    /**
      * Default step size for x-/y- discrete fields.
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * Default width
      *
      * __Deprecated:__ Since Vega-Lite 4.0. Please use continuousWidth and discreteWidth instead.
      */
    var width: js.UndefOr[Double] = js.native
  }
  object ViewConfig {
    
    @scala.inline
    def apply[ES /* <: ExprRef | SignalRef */](): ViewConfig[ES] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ViewConfig[ES]]
    }
    
    @scala.inline
    implicit class ViewConfigMutableBuilder[Self <: ViewConfig[_], ES /* <: ExprRef | SignalRef */] (val x: Self with ViewConfig[ES]) extends AnyVal {
      
      @scala.inline
      def setClip(value: Boolean): Self = StObject.set(x, "clip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClipUndefined: Self = StObject.set(x, "clip", js.undefined)
      
      @scala.inline
      def setContinuousHeight(value: Double): Self = StObject.set(x, "continuousHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousHeightUndefined: Self = StObject.set(x, "continuousHeight", js.undefined)
      
      @scala.inline
      def setContinuousWidth(value: Double): Self = StObject.set(x, "continuousWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setContinuousWidthUndefined: Self = StObject.set(x, "continuousWidth", js.undefined)
      
      @scala.inline
      def setDiscreteHeight(value: Double | Step): Self = StObject.set(x, "discreteHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscreteHeightUndefined: Self = StObject.set(x, "discreteHeight", js.undefined)
      
      @scala.inline
      def setDiscreteWidth(value: Double | Step): Self = StObject.set(x, "discreteWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDiscreteWidthUndefined: Self = StObject.set(x, "discreteWidth", js.undefined)
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
