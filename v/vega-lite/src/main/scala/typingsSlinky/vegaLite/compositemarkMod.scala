package typingsSlinky.vegaLite

import org.scalablytyped.runtime.TopLevel
import typingsSlinky.std.Partial
import typingsSlinky.vegaLite.boxplotMod.BoxPlot
import typingsSlinky.vegaLite.boxplotMod.BoxPlotConfigMixins
import typingsSlinky.vegaLite.boxplotMod.BoxPlotDef
import typingsSlinky.vegaLite.channeldefMod.ColorDef
import typingsSlinky.vegaLite.channeldefMod.Field
import typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale
import typingsSlinky.vegaLite.channeldefMod.LatLongDef
import typingsSlinky.vegaLite.channeldefMod.NumericArrayMarkPropDef
import typingsSlinky.vegaLite.channeldefMod.NumericMarkPropDef
import typingsSlinky.vegaLite.channeldefMod.OrderFieldDef
import typingsSlinky.vegaLite.channeldefMod.OrderValueDef
import typingsSlinky.vegaLite.channeldefMod.PolarDef
import typingsSlinky.vegaLite.channeldefMod.Position2Def
import typingsSlinky.vegaLite.channeldefMod.PositionDef
import typingsSlinky.vegaLite.channeldefMod.SecondaryFieldDef
import typingsSlinky.vegaLite.channeldefMod.ShapeDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDefWithCondition
import typingsSlinky.vegaLite.channeldefMod.StringValueDefWithCondition
import typingsSlinky.vegaLite.channeldefMod.TextDef
import typingsSlinky.vegaLite.channeldefMod.ValueDef
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.errorbandMod.ErrorBand
import typingsSlinky.vegaLite.errorbandMod.ErrorBandConfigMixins
import typingsSlinky.vegaLite.errorbandMod.ErrorBandDef
import typingsSlinky.vegaLite.errorbarMod.ErrorBar
import typingsSlinky.vegaLite.errorbarMod.ErrorBarConfigMixins
import typingsSlinky.vegaLite.errorbarMod.ErrorBarDef
import typingsSlinky.vegaLite.errorbarMod.ErrorExtraEncoding
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.normalizeBaseMod.NormalizerParams
import typingsSlinky.vegaLite.specFacetMod.EncodingFacetMapping
import typingsSlinky.vegaLite.specLayerMod.NormalizedLayerSpec
import typingsSlinky.vegaLite.specUnitMod.GenericUnitSpec
import typingsSlinky.vegaLite.specUnitMod.NormalizedUnitSpec
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object compositemarkMod {
  
  @JSImport("vega-lite/build/src/compositemark", "add")
  @js.native
  def add(mark: String, run: CompositeMarkNormalizerRun, parts: js.Array[String]): Unit = js.native
  
  @JSImport("vega-lite/build/src/compositemark", "getAllCompositeMarks")
  @js.native
  def getAllCompositeMarks(): js.Array[String] = js.native
  
  @JSImport("vega-lite/build/src/compositemark", "remove")
  @js.native
  def remove(mark: String): Unit = js.native
  
  type CompositeAggregate = BoxPlot | ErrorBar | ErrorBand
  
  type CompositeEncoding[F /* <: Field */] = Encoding[F] with ErrorExtraEncoding[F]
  
  type CompositeMark = BoxPlot | ErrorBar | ErrorBand
  
  @js.native
  trait CompositeMarkConfigMixins
    extends BoxPlotConfigMixins
       with ErrorBarConfigMixins
       with ErrorBandConfigMixins
  object CompositeMarkConfigMixins {
    
    @scala.inline
    def apply(): CompositeMarkConfigMixins = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CompositeMarkConfigMixins]
    }
  }
  
  type CompositeMarkDef = BoxPlotDef | ErrorBarDef | ErrorBandDef
  
  type CompositeMarkNormalizerRun = js.Function2[
    /* spec */ GenericUnitSpec[js.Any, js.Any], 
    /* params */ NormalizerParams, 
    NormalizedLayerSpec | NormalizedUnitSpec
  ]
  
  type FacetedCompositeEncoding[F /* <: Field */] = Encoding[F] with ErrorExtraEncoding[F] with (EncodingFacetMapping[F, ExprRef | SignalRef])
  
  type PartialIndex[T /* <: Encoding[_] */] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ t in keyof T ]:? std.Partial<T[t]>}
    */ typingsSlinky.vegaLite.vegaLiteStrings.PartialIndex with TopLevel[T]
  
  /* Inlined vega-lite.vega-lite/build/src/compositemark.PartialIndex<std.Omit<vega-lite.vega-lite/build/src/compositemark.CompositeEncoding<F>, 'detail' | 'order' | 'tooltip'>> & std.Pick<vega-lite.vega-lite/build/src/encoding.Encoding<F>, 'detail' | 'order' | 'tooltip'> */
  @js.native
  trait SharedCompositeEncoding[F /* <: Field */] extends StObject {
    
    var angle: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.native
    
    var color: js.UndefOr[Partial[js.UndefOr[ColorDef[F]]]] = js.native
    
    var description: js.UndefOr[
        Partial[
          js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
        ]
      ] = js.native
    
    var detail: js.UndefOr[
        (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])
      ] = js.native
    
    var fill: js.UndefOr[Partial[js.UndefOr[ColorDef[F]]]] = js.native
    
    var fillOpacity: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.native
    
    var href: js.UndefOr[
        Partial[
          js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
        ]
      ] = js.native
    
    var key: js.UndefOr[Partial[js.UndefOr[FieldDefWithoutScale[F, StandardType]]]] = js.native
    
    var latitude: js.UndefOr[Partial[js.UndefOr[LatLongDef[F]]]] = js.native
    
    var latitude2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.native
    
    var longitude: js.UndefOr[Partial[js.UndefOr[LatLongDef[F]]]] = js.native
    
    var longitude2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.native
    
    var opacity: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.native
    
    var order: js.UndefOr[OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef] = js.native
    
    var radius: js.UndefOr[Partial[js.UndefOr[PolarDef[F]]]] = js.native
    
    var radius2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.native
    
    var shape: js.UndefOr[Partial[js.UndefOr[ShapeDef[F]]]] = js.native
    
    var size: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.native
    
    var stroke: js.UndefOr[Partial[js.UndefOr[ColorDef[F]]]] = js.native
    
    var strokeDash: js.UndefOr[Partial[js.UndefOr[NumericArrayMarkPropDef[F]]]] = js.native
    
    var strokeOpacity: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.native
    
    var strokeWidth: js.UndefOr[Partial[js.UndefOr[NumericMarkPropDef[F]]]] = js.native
    
    var text: js.UndefOr[Partial[js.UndefOr[TextDef[F]]]] = js.native
    
    var theta: js.UndefOr[Partial[js.UndefOr[PolarDef[F]]]] = js.native
    
    var theta2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.native
    
    var tooltip: js.UndefOr[
        StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]] | Null
      ] = js.native
    
    var url: js.UndefOr[
        Partial[
          js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
        ]
      ] = js.native
    
    var x: js.UndefOr[Partial[js.UndefOr[PositionDef[F]]]] = js.native
    
    var x2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.native
    
    var xError: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.native
    
    var xError2: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.native
    
    var y: js.UndefOr[Partial[js.UndefOr[PositionDef[F]]]] = js.native
    
    var y2: js.UndefOr[Partial[js.UndefOr[Position2Def[F]]]] = js.native
    
    var yError: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.native
    
    var yError2: js.UndefOr[Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]] = js.native
  }
  object SharedCompositeEncoding {
    
    @scala.inline
    def apply[F /* <: Field */](): SharedCompositeEncoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SharedCompositeEncoding[F]]
    }
    
    @scala.inline
    implicit class SharedCompositeEncodingMutableBuilder[Self <: SharedCompositeEncoding[_], F /* <: Field */] (val x: Self with SharedCompositeEncoding[F]) extends AnyVal {
      
      @scala.inline
      def setAngle(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setColor(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDescription(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHref(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: Partial[js.UndefOr[FieldDefWithoutScale[F, StandardType]]]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLatitude(value: Partial[js.UndefOr[LatLongDef[F]]]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2Undefined: Self = StObject.set(x, "latitude2", js.undefined)
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: Partial[js.UndefOr[LatLongDef[F]]]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2Undefined: Self = StObject.set(x, "longitude2", js.undefined)
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrder(value: OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: OrderFieldDef[F]*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setRadius(value: Partial[js.UndefOr[PolarDef[F]]]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setShape(value: Partial[js.UndefOr[ShapeDef[F]]]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStroke(value: Partial[js.UndefOr[ColorDef[F]]]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDash(value: Partial[js.UndefOr[NumericArrayMarkPropDef[F]]]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: Partial[js.UndefOr[NumericMarkPropDef[F]]]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setText(value: Partial[js.UndefOr[TextDef[F]]]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheta(value: Partial[js.UndefOr[PolarDef[F]]]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta2Undefined: Self = StObject.set(x, "theta2", js.undefined)
      
      @scala.inline
      def setThetaUndefined: Self = StObject.set(x, "theta", js.undefined)
      
      @scala.inline
      def setTooltip(
        value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]]
      ): Self = StObject.set(x, "tooltip", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTooltipNull: Self = StObject.set(x, "tooltip", null)
      
      @scala.inline
      def setTooltipUndefined: Self = StObject.set(x, "tooltip", js.undefined)
      
      @scala.inline
      def setTooltipVarargs(value: StringFieldDef[F]*): Self = StObject.set(x, "tooltip", js.Array(value :_*))
      
      @scala.inline
      def setUrl(
        value: Partial[
              js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])]
            ]
      ): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setX(value: Partial[js.UndefOr[PositionDef[F]]]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXError(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "xError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "xError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setXError2Undefined: Self = StObject.set(x, "xError2", js.undefined)
      
      @scala.inline
      def setXErrorUndefined: Self = StObject.set(x, "xError", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: Partial[js.UndefOr[PositionDef[F]]]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Partial[js.UndefOr[Position2Def[F]]]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYError(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "yError", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2(value: Partial[js.UndefOr[SecondaryFieldDef[F] | ValueDef[Double]]]): Self = StObject.set(x, "yError2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYError2Undefined: Self = StObject.set(x, "yError2", js.undefined)
      
      @scala.inline
      def setYErrorUndefined: Self = StObject.set(x, "yError", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
}
