package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.anon.ContinuousAxisChannelDef
import typingsSlinky.vegaLite.anon.`4`
import typingsSlinky.vegaLite.channeldefMod.ColorDef
import typingsSlinky.vegaLite.channeldefMod.Field
import typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale
import typingsSlinky.vegaLite.channeldefMod.NumericMarkPropDef
import typingsSlinky.vegaLite.channeldefMod.Position2Def
import typingsSlinky.vegaLite.channeldefMod.PositionDef
import typingsSlinky.vegaLite.channeldefMod.SecondaryFieldDef
import typingsSlinky.vegaLite.channeldefMod.ValueDef
import typingsSlinky.vegaLite.compositemarkBaseMod.CompositeMarkNormalizer
import typingsSlinky.vegaLite.compositemarkCommonMod.GenericCompositeMarkDef
import typingsSlinky.vegaLite.compositemarkCommonMod.PartsMixins
import typingsSlinky.vegaLite.errorbandMod.ErrorBand
import typingsSlinky.vegaLite.errorbandMod.ErrorBandDef
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.normalizeBaseMod.NormalizerParams
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.vegaLiteStrings.errorbar
import typingsSlinky.vegaLite.vegaLiteStrings.rule
import typingsSlinky.vegaLite.vegaLiteStrings.ticks
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object errorbarMod {
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "ERRORBAR")
  @js.native
  val ERRORBAR_ : errorbar = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "ERRORBAR_PARTS")
  @js.native
  val ERRORBAR_PARTS: js.Tuple2[ticks, rule] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "errorBarNormalizer")
  @js.native
  val errorBarNormalizer: CompositeMarkNormalizer[errorbar] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "errorBarParams")
  @js.native
  def errorBarParams[M /* <: ErrorBar | ErrorBand */, MD /* <: GenericCompositeMarkDef[M] with (ErrorBarDef | ErrorBandDef) */](
    spec: GenericUnitSpec[ErrorEncoding[String], M | MD],
    compositeMark: M,
    config: Config[ExprRef | SignalRef]
  ): ContinuousAxisChannelDef[MD, M] = js.native
  
  @JSImport("vega-lite/build/src/compositemark/errorbar", "normalizeErrorBar")
  @js.native
  def normalizeErrorBar(spec: GenericUnitSpec[ErrorEncoding[String], ErrorBar | ErrorBarDef], hasConfig: NormalizerParams): NormalizedLayerSpec | NormalizedUnitSpec = js.native
  
  type ErrorBar = errorbar
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.mean
    - typingsSlinky.vegaLite.vegaLiteStrings.median
  */
  trait ErrorBarCenter extends StObject
  object ErrorBarCenter {
    
    @scala.inline
    def mean: typingsSlinky.vegaLite.vegaLiteStrings.mean = "mean".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.mean]
    
    @scala.inline
    def median: typingsSlinky.vegaLite.vegaLiteStrings.median = "median".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.median]
  }
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped {[ P in keyof std.Record<vega-lite.vega-lite/build/src/compositemark/errorbar.ErrorBarPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef>> ]:? std.Record<vega-lite.vega-lite/build/src/compositemark/errorbar.ErrorBarPart, boolean | vega-lite.vega-lite/build/src/mark.MarkConfig<vega-lite.vega-lite/build/src/expr.ExprOrSignalRef>>[P]} */ @js.native
  trait ErrorBarConfig extends StObject {
    
    /**
      * The center of the errorbar. Available options include:
      * - `"mean"`: the mean of the data points.
      * - `"median"`: the median of the data points.
      *
      * __Default value:__ `"mean"`.
      * @hidden
      */
    var center: js.UndefOr[ErrorBarCenter] = js.native
    
    /**
      * The extent of the rule. Available options include:
      * - `"ci"`: Extend the rule to the confidence interval of the mean.
      * - `"stderr"`: The size of rule are set to the value of standard error, extending from the mean.
      * - `"stdev"`: The size of rule are set to the value of standard deviation, extending from the mean.
      * - `"iqr"`: Extend the rule to the q1 and q3.
      *
      * __Default value:__ `"stderr"`.
      */
    var extent: js.UndefOr[ErrorBarExtent] = js.native
    
    /** Size of the ticks of an error bar */
    var size: js.UndefOr[Double] = js.native
    
    /** Thickness of the ticks and the bar of an error bar */
    var thickness: js.UndefOr[Double] = js.native
  }
  object ErrorBarConfig {
    
    @scala.inline
    def apply(): ErrorBarConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarConfig]
    }
    
    @scala.inline
    implicit class ErrorBarConfigMutableBuilder[Self <: ErrorBarConfig] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCenter(value: ErrorBarCenter): Self = StObject.set(x, "center", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterUndefined: Self = StObject.set(x, "center", js.undefined)
      
      @scala.inline
      def setExtent(value: ErrorBarExtent): Self = StObject.set(x, "extent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExtentUndefined: Self = StObject.set(x, "extent", js.undefined)
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setThickness(value: Double): Self = StObject.set(x, "thickness", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThicknessUndefined: Self = StObject.set(x, "thickness", js.undefined)
    }
  }
  
  @js.native
  trait ErrorBarConfigMixins extends StObject {
    
    /**
      * ErrorBar Config
      */
    var errorbar: js.UndefOr[ErrorBarConfig] = js.native
  }
  object ErrorBarConfigMixins {
    
    @scala.inline
    def apply(): ErrorBarConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorBarConfigMixins]
    }
    
    @scala.inline
    implicit class ErrorBarConfigMixinsMutableBuilder[Self <: ErrorBarConfigMixins] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setErrorbar(value: ErrorBarConfig): Self = StObject.set(x, "errorbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setErrorbarUndefined: Self = StObject.set(x, "errorbar", js.undefined)
    }
  }
  
  type ErrorBarDef = GenericCompositeMarkDef[ErrorBar] with ErrorBarConfig with `4`
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.ci
    - typingsSlinky.vegaLite.vegaLiteStrings.iqr
    - typingsSlinky.vegaLite.vegaLiteStrings.stderr
    - typingsSlinky.vegaLite.vegaLiteStrings.stdev
  */
  trait ErrorBarExtent extends StObject
  object ErrorBarExtent {
    
    @scala.inline
    def ci: typingsSlinky.vegaLite.vegaLiteStrings.ci = "ci".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.ci]
    
    @scala.inline
    def iqr: typingsSlinky.vegaLite.vegaLiteStrings.iqr = "iqr".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.iqr]
    
    @scala.inline
    def stderr: typingsSlinky.vegaLite.vegaLiteStrings.stderr = "stderr".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stderr]
    
    @scala.inline
    def stdev: typingsSlinky.vegaLite.vegaLiteStrings.stdev = "stdev".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.stdev]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.ticks
    - typingsSlinky.vegaLite.vegaLiteStrings.rule
  */
  trait ErrorBarPart extends StObject
  
  type ErrorBarPartsMixins = PartsMixins[ErrorBarPart]
  
  /* Inlined std.Pick<vega-lite.vega-lite/build/src/encoding.Encoding<F>, vega-lite.vega-lite/build/src/channel.PositionChannel | 'color' | 'detail' | 'opacity'> & vega-lite.vega-lite/build/src/compositemark/errorbar.ErrorExtraEncoding<F> */
  @js.native
  trait ErrorEncoding[F /* <: Field */] extends StObject {
    
    var color: js.UndefOr[ColorDef[F]] = js.native
    
    var detail: js.UndefOr[
        (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])
      ] = js.native
    
    var opacity: js.UndefOr[NumericMarkPropDef[F]] = js.native
    
    var x: js.UndefOr[PositionDef[F]] = js.native
    
    var x2: js.UndefOr[Position2Def[F]] = js.native
    
    /**
      * Error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
    
    /**
      * Secondary error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
    
    var y: js.UndefOr[PositionDef[F]] = js.native
    
    var y2: js.UndefOr[Position2Def[F]] = js.native
    
    /**
      * Error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
    
    /**
      * Secondary error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
  }
  object ErrorEncoding {
    
    @scala.inline
    def apply[F /* <: Field */](): ErrorEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorEncoding[F]]
    }
    
    @scala.inline
    implicit class ErrorEncodingMutableBuilder[Self <: ErrorEncoding[_], F /* <: Field */] (val x: Self with ErrorEncoding[F]) extends AnyVal {
      
      @scala.inline
      def setColor(value: ColorDef[F]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value :_*))
      
      @scala.inline
      def setOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setX(value: PositionDef[F]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Position2Def[F]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      @scala.inline
      def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: PositionDef[F]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Position2Def[F]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      @scala.inline
      def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait ErrorExtraEncoding[F /* <: Field */] extends StObject {
    
    /**
      * Error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
    
    /**
      * Secondary error value of x coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var xError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
    
    /**
      * Error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
    
    /**
      * Secondary error value of y coordinates for error specified `"errorbar"` and `"errorband"`.
      */
    var yError2: js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]] = js.native
  }
  object ErrorExtraEncoding {
    
    @scala.inline
    def apply[F /* <: Field */](): ErrorExtraEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ErrorExtraEncoding[F]]
    }
    
    @scala.inline
    implicit class ErrorExtraEncodingMutableBuilder[Self <: ErrorExtraEncoding[_], F /* <: Field */] (val x: Self with ErrorExtraEncoding[F]) extends AnyVal {
      
      @scala.inline
      def setXError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      @scala.inline
      def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      @scala.inline
      def setYError(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2(value: SecondaryFieldDef[F] | ValueDef[Double]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      @scala.inline
      def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.vegaLiteStrings.raw
    - typingsSlinky.vegaLite.vegaLiteStrings.`aggregated-upper-lower`
    - typingsSlinky.vegaLite.vegaLiteStrings.`aggregated-error`
  */
  trait ErrorInputType extends StObject
  object ErrorInputType {
    
    @scala.inline
    def `aggregated-error`: typingsSlinky.vegaLite.vegaLiteStrings.`aggregated-error` = "aggregated-error".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`aggregated-error`]
    
    @scala.inline
    def `aggregated-upper-lower`: typingsSlinky.vegaLite.vegaLiteStrings.`aggregated-upper-lower` = "aggregated-upper-lower".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.`aggregated-upper-lower`]
    
    @scala.inline
    def raw: typingsSlinky.vegaLite.vegaLiteStrings.raw = "raw".asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.raw]
  }
}
