package typingsSlinky.vegaLite

import typingsSlinky.std.Record
import typingsSlinky.vegaLite.anon.Bins
import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channelMod.Channel
import typingsSlinky.vegaLite.channeldefMod.ChannelDef
import typingsSlinky.vegaLite.channeldefMod.ColorDef
import typingsSlinky.vegaLite.channeldefMod.Field
import typingsSlinky.vegaLite.channeldefMod.FieldDef
import typingsSlinky.vegaLite.channeldefMod.FieldDefWithoutScale
import typingsSlinky.vegaLite.channeldefMod.LatLongDef
import typingsSlinky.vegaLite.channeldefMod.NumericArrayMarkPropDef
import typingsSlinky.vegaLite.channeldefMod.NumericMarkPropDef
import typingsSlinky.vegaLite.channeldefMod.OrderFieldDef
import typingsSlinky.vegaLite.channeldefMod.OrderValueDef
import typingsSlinky.vegaLite.channeldefMod.PolarDef
import typingsSlinky.vegaLite.channeldefMod.Position2Def
import typingsSlinky.vegaLite.channeldefMod.PositionDef
import typingsSlinky.vegaLite.channeldefMod.ShapeDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDef
import typingsSlinky.vegaLite.channeldefMod.StringFieldDefWithCondition
import typingsSlinky.vegaLite.channeldefMod.StringValueDefWithCondition
import typingsSlinky.vegaLite.channeldefMod.TextDef
import typingsSlinky.vegaLite.channeldefMod.TypedFieldDef
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.specFacetMod.EncodingFacetMapping
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.vegaLiteStrings.angle
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaLite.vegaLiteStrings.color
import typingsSlinky.vegaLite.vegaLiteStrings.column
import typingsSlinky.vegaLite.vegaLiteStrings.description
import typingsSlinky.vegaLite.vegaLiteStrings.detail
import typingsSlinky.vegaLite.vegaLiteStrings.facet
import typingsSlinky.vegaLite.vegaLiteStrings.fill
import typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.href
import typingsSlinky.vegaLite.vegaLiteStrings.key
import typingsSlinky.vegaLite.vegaLiteStrings.latitude
import typingsSlinky.vegaLite.vegaLiteStrings.latitude2
import typingsSlinky.vegaLite.vegaLiteStrings.longitude
import typingsSlinky.vegaLite.vegaLiteStrings.longitude2
import typingsSlinky.vegaLite.vegaLiteStrings.opacity
import typingsSlinky.vegaLite.vegaLiteStrings.order
import typingsSlinky.vegaLite.vegaLiteStrings.radius
import typingsSlinky.vegaLite.vegaLiteStrings.radius2
import typingsSlinky.vegaLite.vegaLiteStrings.row
import typingsSlinky.vegaLite.vegaLiteStrings.shape
import typingsSlinky.vegaLite.vegaLiteStrings.size
import typingsSlinky.vegaLite.vegaLiteStrings.stroke
import typingsSlinky.vegaLite.vegaLiteStrings.strokeDash
import typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.theta
import typingsSlinky.vegaLite.vegaLiteStrings.theta2
import typingsSlinky.vegaLite.vegaLiteStrings.tooltip
import typingsSlinky.vegaLite.vegaLiteStrings.url
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.x2
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaLite.vegaLiteStrings.y2
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodingMod {
  
  @JSImport("vega-lite/build/src/encoding", "channelHasField")
  @js.native
  def channelHasField[F /* <: Field */](
    encoding: EncodingWithFacet[F],
    channel: /* keyof vega-lite.vega-lite/build/src/encoding.EncodingWithFacet<F> */ x | y | x2 | y2 | longitude | latitude | longitude2 | latitude2 | theta | theta2 | radius | radius2 | color | fill | stroke | opacity | fillOpacity | strokeOpacity | strokeWidth | strokeDash | size | angle | shape | detail | key | text | tooltip | href | url | description | order | facet | row | column
  ): Boolean = js.native
  
  @JSImport("vega-lite/build/src/encoding", "extractTransformsFromEncoding")
  @js.native
  def extractTransformsFromEncoding(oldEncoding: Encoding[_], config: Config[ExprRef | SignalRef]): Bins = js.native
  
  @JSImport("vega-lite/build/src/encoding", "fieldDefs")
  @js.native
  def fieldDefs[F /* <: Field */](encoding: EncodingWithFacet[F]): js.Array[FieldDef[F, _]] = js.native
  
  @JSImport("vega-lite/build/src/encoding", "forEach")
  @js.native
  def forEach[U /* <: Record[_, _] */](mapping: U, f: js.Function2[/* cd */ ChannelDef[String], /* keyof U */ /* c */ String, Unit]): Unit = js.native
  @JSImport("vega-lite/build/src/encoding", "forEach")
  @js.native
  def forEach[U /* <: Record[_, _] */](
    mapping: U,
    f: js.Function2[/* cd */ ChannelDef[String], /* keyof U */ /* c */ String, Unit],
    thisArg: js.Any
  ): Unit = js.native
  
  @JSImport("vega-lite/build/src/encoding", "initEncoding")
  @js.native
  def initEncoding(encoding: Encoding[String], mark: Mark, filled: Boolean, config: Config[ExprRef | SignalRef]): Encoding[String] = js.native
  
  @JSImport("vega-lite/build/src/encoding", "isAggregate")
  @js.native
  def isAggregate(encoding: EncodingWithFacet[_]): Boolean = js.native
  
  @JSImport("vega-lite/build/src/encoding", "markChannelCompatible")
  @js.native
  def markChannelCompatible(encoding: Encoding[String], channel: Channel, mark: Mark): Boolean = js.native
  
  @JSImport("vega-lite/build/src/encoding", "normalizeEncoding")
  @js.native
  def normalizeEncoding(encoding: Encoding[String], config: Config[ExprRef | SignalRef]): Encoding[String] = js.native
  
  @JSImport("vega-lite/build/src/encoding", "pathGroupingFields")
  @js.native
  def pathGroupingFields(mark: Mark, encoding: Encoding[String]): js.Array[String] = js.native
  
  @JSImport("vega-lite/build/src/encoding", "reduce")
  @js.native
  def reduce_binned[T, U /* <: Record[_, _] */](
    mapping: U,
    f: js.Function3[
      /* acc */ js.Any, 
      /* fd */ TypedFieldDef[String, _, Boolean | BinParams | binned | Null], 
      /* keyof U */ /* c */ String, 
      U
    ],
    init: T
  ): js.Any = js.native
  @JSImport("vega-lite/build/src/encoding", "reduce")
  @js.native
  def reduce_binned[T, U /* <: Record[_, _] */](
    mapping: U,
    f: js.Function3[
      /* acc */ js.Any, 
      /* fd */ TypedFieldDef[String, _, Boolean | BinParams | binned | Null], 
      /* keyof U */ /* c */ String, 
      U
    ],
    init: T,
    thisArg: js.Any
  ): js.Any = js.native
  
  @js.native
  trait Encoding[F /* <: Field */] extends StObject {
    
    /**
      * Rotation angle of point and text marks.
      */
    var angle: js.UndefOr[NumericMarkPropDef[F]] = js.native
    
    /**
      * Color of the marks – either fill or stroke color based on  the `filled` property of mark definition.
      * By default, `color` represents fill color for `"area"`, `"bar"`, `"tick"`,
      * `"text"`, `"trail"`, `"circle"`, and `"square"` / stroke color for `"line"` and `"point"`.
      *
      * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `color` property.
      *
      * _Note:_
      * 1) For fine-grained control over both fill and stroke colors of the marks, please use the `fill` and `stroke` channels. The `fill` or `stroke` encodings have higher precedence than `color`, thus may override the `color` encoding if conflicting encodings are specified.
      * 2) See the scale documentation for more information about customizing [color scheme](https://vega.github.io/vega-lite/docs/scale.html#scheme).
      */
    var color: js.UndefOr[ColorDef[F]] = js.native
    
    /**
      * A text description of this mark for ARIA accessibility (SVG output only). For SVG output the `"aria-label"` attribute will be set to this description.
      */
    var description: js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])] = js.native
    
    /**
      * Additional levels of detail for grouping data in aggregate views and
      * in line, trail, and area marks without mapping data to a specific visual channel.
      */
    var detail: js.UndefOr[
        (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])
      ] = js.native
    
    /**
      * Fill color of the marks.
      * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `color` property.
      *
      * _Note:_ The `fill` encoding has higher precedence than `color`, thus may override the `color` encoding if conflicting encodings are specified.
      */
    var fill: js.UndefOr[ColorDef[F]] = js.native
    
    /**
      * Fill opacity of the marks.
      *
      * __Default value:__ If undefined, the default opacity depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `fillOpacity` property.
      */
    var fillOpacity: js.UndefOr[NumericMarkPropDef[F]] = js.native
    
    /**
      * A URL to load upon mouse click.
      */
    var href: js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])] = js.native
    
    /**
      * A data field to use as a unique key for data binding. When a visualization’s data is updated, the key value will be used to match data elements to existing mark instances. Use a key channel to enable object constancy for transitions over dynamic data.
      */
    var key: js.UndefOr[FieldDefWithoutScale[F, StandardType]] = js.native
    
    /**
      * Latitude position of geographically projected marks.
      */
    var latitude: js.UndefOr[LatLongDef[F]] = js.native
    
    /**
      * Latitude-2 position for geographically projected ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      */
    var latitude2: js.UndefOr[Position2Def[F]] = js.native
    
    /**
      * Longitude position of geographically projected marks.
      */
    var longitude: js.UndefOr[LatLongDef[F]] = js.native
    
    /**
      * Longitude-2 position for geographically projected ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      */
    var longitude2: js.UndefOr[Position2Def[F]] = js.native
    
    /**
      * Opacity of the marks.
      *
      * __Default value:__ If undefined, the default opacity depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `opacity` property.
      */
    var opacity: js.UndefOr[NumericMarkPropDef[F]] = js.native
    
    /**
      * Order of the marks.
      * - For stacked marks, this `order` channel encodes [stack order](https://vega.github.io/vega-lite/docs/stack.html#order).
      * - For line and trail marks, this `order` channel encodes order of data points in the lines. This can be useful for creating [a connected scatterplot](https://vega.github.io/vega-lite/examples/connected_scatterplot.html). Setting `order` to `{"value": null}` makes the line marks use the original order in the data sources.
      * - Otherwise, this `order` channel encodes layer order of the marks.
      *
      * __Note__: In aggregate plots, `order` field should be `aggregate`d to avoid creating additional aggregation grouping.
      */
    var order: js.UndefOr[OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef] = js.native
    
    /**
      * The outer radius in pixels of arc marks.
      */
    var radius: js.UndefOr[PolarDef[F]] = js.native
    
    /**
      * The inner radius in pixels of arc marks.
      */
    var radius2: js.UndefOr[Position2Def[F]] = js.native
    
    /**
      * Shape of the mark.
      *
      * 1. For `point` marks the supported values include:
      *   - plotting shapes: `"circle"`, `"square"`, `"cross"`, `"diamond"`, `"triangle-up"`, `"triangle-down"`, `"triangle-right"`, or `"triangle-left"`.
      *   - the line symbol `"stroke"`
      *   - centered directional shapes `"arrow"`, `"wedge"`, or `"triangle"`
      *   - a custom [SVG path string](https://developer.mozilla.org/en-US/docs/Web/SVG/Tutorial/Paths) (For correct sizing, custom shape paths should be defined within a square bounding box with coordinates ranging from -1 to 1 along both the x and y dimensions.)
      *
      * 2. For `geoshape` marks it should be a field definition of the geojson data
      *
      * __Default value:__ If undefined, the default shape depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#point-config)'s `shape` property. (`"circle"` if unset.)
      */
    var shape: js.UndefOr[ShapeDef[F]] = js.native
    
    /**
      * Size of the mark.
      * - For `"point"`, `"square"` and `"circle"`, – the symbol size, or pixel area of the mark.
      * - For `"bar"` and `"tick"` – the bar and tick's size.
      * - For `"text"` – the text's font size.
      * - Size is unsupported for `"line"`, `"area"`, and `"rect"`. (Use `"trail"` instead of line with varying size)
      */
    var size: js.UndefOr[NumericMarkPropDef[F]] = js.native
    
    /**
      * Stroke color of the marks.
      * __Default value:__ If undefined, the default color depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `color` property.
      *
      * _Note:_ The `stroke` encoding has higher precedence than `color`, thus may override the `color` encoding if conflicting encodings are specified.
      */
    var stroke: js.UndefOr[ColorDef[F]] = js.native
    
    /**
      * Stroke dash of the marks.
      *
      * __Default value:__ `[1,0]` (No dash).
      */
    var strokeDash: js.UndefOr[NumericArrayMarkPropDef[F]] = js.native
    
    /**
      * Stroke opacity of the marks.
      *
      * __Default value:__ If undefined, the default opacity depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `strokeOpacity` property.
      */
    var strokeOpacity: js.UndefOr[NumericMarkPropDef[F]] = js.native
    
    /**
      * Stroke width of the marks.
      *
      * __Default value:__ If undefined, the default stroke width depends on [mark config](https://vega.github.io/vega-lite/docs/config.html#mark-config)'s `strokeWidth` property.
      */
    var strokeWidth: js.UndefOr[NumericMarkPropDef[F]] = js.native
    
    /**
      * Text of the `text` mark.
      */
    var text: js.UndefOr[TextDef[F]] = js.native
    
    /**
      * - For arc marks, the arc length in radians if theta2 is not specified, otherwise the start arc angle. (A value of 0 indicates up or “north”, increasing values proceed clockwise.)
      *
      * - For text marks, polar coordinate angle in radians.
      */
    var theta: js.UndefOr[PolarDef[F]] = js.native
    
    /**
      * The end angle of arc marks in radians. A value of 0 indicates up or “north”, increasing values proceed clockwise.
      */
    var theta2: js.UndefOr[Position2Def[F]] = js.native
    
    /**
      * The tooltip text to show upon mouse hover. Specifying `tooltip` encoding overrides [the `tooltip` property in the mark definition](https://vega.github.io/vega-lite/docs/mark.html#mark-def).
      *
      * See the [`tooltip`](https://vega.github.io/vega-lite/docs/tooltip.html) documentation for a detailed discussion about tooltip in Vega-Lite.
      */
    var tooltip: js.UndefOr[
        StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType]) | js.Array[StringFieldDef[F]] | Null
      ] = js.native
    
    /**
      * The URL of an image mark.
      */
    var url: js.UndefOr[StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])] = js.native
    
    /**
      * X coordinates of the marks, or width of horizontal `"bar"` and `"area"` without specified `x2` or `width`.
      *
      * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
      */
    var x: js.UndefOr[PositionDef[F]] = js.native
    
    /**
      * X2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      *
      * The `value` of this channel can be a number or a string `"width"` for the width of the plot.
      */
    var x2: js.UndefOr[Position2Def[F]] = js.native
    
    /**
      * Y coordinates of the marks, or height of vertical `"bar"` and `"area"` without specified `y2` or `height`.
      *
      * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
      */
    var y: js.UndefOr[PositionDef[F]] = js.native
    
    /**
      * Y2 coordinates for ranged `"area"`, `"bar"`, `"rect"`, and  `"rule"`.
      *
      * The `value` of this channel can be a number or a string `"height"` for the height of the plot.
      */
    var y2: js.UndefOr[Position2Def[F]] = js.native
  }
  object Encoding {
    
    @scala.inline
    def apply[F /* <: Field */](): Encoding[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Encoding[F]]
    }
    
    @scala.inline
    implicit class EncodingMutableBuilder[Self <: Encoding[_], F /* <: Field */] (val x: Self with Encoding[F]) extends AnyVal {
      
      @scala.inline
      def setAngle(value: NumericMarkPropDef[F]): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAngleUndefined: Self = StObject.set(x, "angle", js.undefined)
      
      @scala.inline
      def setColor(value: ColorDef[F]): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setDescription(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
      
      @scala.inline
      def setDetail(value: (FieldDefWithoutScale[F, StandardType]) | (js.Array[FieldDefWithoutScale[F, StandardType]])): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
      
      @scala.inline
      def setDetailVarargs(value: (FieldDefWithoutScale[F, StandardType])*): Self = StObject.set(x, "detail", js.Array(value :_*))
      
      @scala.inline
      def setFill(value: ColorDef[F]): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setHref(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "href", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHrefUndefined: Self = StObject.set(x, "href", js.undefined)
      
      @scala.inline
      def setKey(value: FieldDefWithoutScale[F, StandardType]): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setLatitude(value: LatLongDef[F]): Self = StObject.set(x, "latitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2(value: Position2Def[F]): Self = StObject.set(x, "latitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLatitude2Undefined: Self = StObject.set(x, "latitude2", js.undefined)
      
      @scala.inline
      def setLatitudeUndefined: Self = StObject.set(x, "latitude", js.undefined)
      
      @scala.inline
      def setLongitude(value: LatLongDef[F]): Self = StObject.set(x, "longitude", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2(value: Position2Def[F]): Self = StObject.set(x, "longitude2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLongitude2Undefined: Self = StObject.set(x, "longitude2", js.undefined)
      
      @scala.inline
      def setLongitudeUndefined: Self = StObject.set(x, "longitude", js.undefined)
      
      @scala.inline
      def setOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setOrder(value: OrderFieldDef[F] | js.Array[OrderFieldDef[F]] | OrderValueDef): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrderUndefined: Self = StObject.set(x, "order", js.undefined)
      
      @scala.inline
      def setOrderVarargs(value: OrderFieldDef[F]*): Self = StObject.set(x, "order", js.Array(value :_*))
      
      @scala.inline
      def setRadius(value: PolarDef[F]): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2(value: Position2Def[F]): Self = StObject.set(x, "radius2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadius2Undefined: Self = StObject.set(x, "radius2", js.undefined)
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setShape(value: ShapeDef[F]): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: NumericMarkPropDef[F]): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setStroke(value: ColorDef[F]): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDash(value: NumericArrayMarkPropDef[F]): Self = StObject.set(x, "strokeDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeDashUndefined: Self = StObject.set(x, "strokeDash", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: NumericMarkPropDef[F]): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
      
      @scala.inline
      def setStrokeWidth(value: NumericMarkPropDef[F]): Self = StObject.set(x, "strokeWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeWidthUndefined: Self = StObject.set(x, "strokeWidth", js.undefined)
      
      @scala.inline
      def setText(value: TextDef[F]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      @scala.inline
      def setTheta(value: PolarDef[F]): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta2(value: Position2Def[F]): Self = StObject.set(x, "theta2", value.asInstanceOf[js.Any])
      
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
      def setUrl(value: StringFieldDefWithCondition[F] | (StringValueDefWithCondition[F, StandardType])): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
      
      @scala.inline
      def setX(value: PositionDef[F]): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2(value: Position2Def[F]): Self = StObject.set(x, "x2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setX2Undefined: Self = StObject.set(x, "x2", js.undefined)
      
      @scala.inline
      def setXUndefined: Self = StObject.set(x, "x", js.undefined)
      
      @scala.inline
      def setY(value: PositionDef[F]): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2(value: Position2Def[F]): Self = StObject.set(x, "y2", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY2Undefined: Self = StObject.set(x, "y2", js.undefined)
      
      @scala.inline
      def setYUndefined: Self = StObject.set(x, "y", js.undefined)
    }
  }
  
  @js.native
  trait EncodingWithFacet[F /* <: Field */]
    extends EncodingFacetMapping[F, ExprRef | SignalRef]
       with Encoding[F]
  object EncodingWithFacet {
    
    @scala.inline
    def apply[F /* <: Field */](): EncodingWithFacet[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[EncodingWithFacet[F]]
    }
  }
}
