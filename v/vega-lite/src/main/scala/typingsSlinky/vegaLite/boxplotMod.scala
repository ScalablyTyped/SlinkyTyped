package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.Orient
import typingsSlinky.vegaLite.compositemarkBaseMod.CompositeMarkNormalizer
import typingsSlinky.vegaLite.compositemarkCommonMod.GenericCompositeMarkDef
import typingsSlinky.vegaLite.compositemarkCommonMod.PartsMixins
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.normalizeBaseMod.NormalizerParams
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import typingsSlinky.vegaLite.vegaLiteStrings.`min-max`
import typingsSlinky.vegaLite.vegaLiteStrings.box
import typingsSlinky.vegaLite.vegaLiteStrings.boxplot
import typingsSlinky.vegaLite.vegaLiteStrings.median
import typingsSlinky.vegaLite.vegaLiteStrings.outliers
import typingsSlinky.vegaLite.vegaLiteStrings.rule
import typingsSlinky.vegaLite.vegaLiteStrings.ticks
import typingsSlinky.vegaLite.vegaLiteStrings.tukey
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boxplotMod {
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "BOXPLOT")
  @js.native
  val BOXPLOT_ : boxplot = js.native
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "BOXPLOT_PARTS")
  @js.native
  val BOXPLOT_PARTS: js.Tuple5[box, median, outliers, rule, ticks] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "boxPlotNormalizer")
  @js.native
  val boxPlotNormalizer: CompositeMarkNormalizer[boxplot] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "getBoxPlotType")
  @js.native
  def getBoxPlotType(extent: Double): `min-max` | tukey = js.native
  @JSImport("vega-lite/build/src/compositemark/boxplot", "getBoxPlotType")
  @js.native
  def getBoxPlotType_minmax(extent: `min-max`): `min-max` | tukey = js.native
  
  @JSImport("vega-lite/build/src/compositemark/boxplot", "normalizeBoxPlot")
  @js.native
  def normalizeBoxPlot(spec: GenericUnitSpec[Encoding[String], BoxPlot | BoxPlotDef], hasConfig: NormalizerParams): NormalizedLayerSpec = js.native
  
  type BoxPlot = boxplot
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef>> ]:? std.Record<vega-lite.vega-lite/build/src/compositemark/boxplot.BoxPlotPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef>>[P]} */ @js.native
  trait BoxPlotConfig extends StObject {
    
    /**
      * The extent of the whiskers. Available options include:
      * - `"min-max"`: min and max are the lower and upper whiskers respectively.
      * - A number representing multiple of the interquartile range. This number will be multiplied by the IQR to determine whisker boundary, which spans from the smallest data to the largest data within the range _[Q1 - k * IQR, Q3 + k * IQR]_ where _Q1_ and _Q3_ are the first and third quartiles while _IQR_ is the interquartile range (_Q3-Q1_).
      *
      * __Default value:__ `1.5`.
      */
    var extent: js.UndefOr[`min-max` | Double] = js.native
    
    /** Size of the box and median tick of a box plot */
    var size: js.UndefOr[Double] = js.native
  }
  object BoxPlotConfig {
    
    @scala.inline
    def apply(): BoxPlotConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxPlotConfig]
    }
    
    @scala.inline
    implicit class BoxPlotConfigMutableBuilder[Self <: BoxPlotConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setExtent(value: `min-max` | Double): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  @js.native
  trait BoxPlotConfigMixins extends StObject {
    
    /**
      * Box Config
      */
    var boxplot: js.UndefOr[BoxPlotConfig] = js.native
  }
  object BoxPlotConfigMixins {
    
    @scala.inline
    def apply(): BoxPlotConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BoxPlotConfigMixins]
    }
    
    @scala.inline
    implicit class BoxPlotConfigMixinsMutableBuilder[Self <: BoxPlotConfigMixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBoxplot(value: BoxPlotConfig): Self = StObject.set(x, "boxplot", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBoxplotUndefined: Self = StObject.set(x, "boxplot", js.undefined)
    }
  }
  
  type BoxPlotDef = GenericCompositeMarkDef[BoxPlot] with BoxPlotConfig with Orient
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.box
    - typingsSlinky.vegaLite.vegaLiteStrings.median
    - typingsSlinky.vegaLite.vegaLiteStrings.outliers
    - typingsSlinky.vegaLite.vegaLiteStrings.rule
    - typingsSlinky.vegaLite.vegaLiteStrings.ticks
  */
  trait BoxPlotPart extends StObject
  
  type BoxPlotPartsMixins = PartsMixins[BoxPlotPart]
}
