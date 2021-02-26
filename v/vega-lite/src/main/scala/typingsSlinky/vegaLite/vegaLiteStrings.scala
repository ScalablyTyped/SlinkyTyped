package typingsSlinky.vegaLite

import typingsSlinky.vegaLite.aggregateMod.Aggregate
import typingsSlinky.vegaLite.aggregateMod.NonArgAggregateOp
import typingsSlinky.vegaLite.axisMod.AxisPart
import typingsSlinky.vegaLite.axisMod.ConditionalAxisProp
import typingsSlinky.vegaLite.binMod._Bin
import typingsSlinky.vegaLite.boxplotMod.BoxPlotPart
import typingsSlinky.vegaLite.channelMod.Channel
import typingsSlinky.vegaLite.channelMod.ColorChannel
import typingsSlinky.vegaLite.channelMod.FacetChannel
import typingsSlinky.vegaLite.channelMod.GeoPositionChannel
import typingsSlinky.vegaLite.channelMod.PolarPositionChannel
import typingsSlinky.vegaLite.channelMod.PolarPositionScaleChannel
import typingsSlinky.vegaLite.channelMod.PositionChannel
import typingsSlinky.vegaLite.channelMod.PositionScaleChannel
import typingsSlinky.vegaLite.channelMod.SecondaryRangeChannel
import typingsSlinky.vegaLite.channelMod._MainChannelOf
import typingsSlinky.vegaLite.channelMod._SecondaryChannelOf
import typingsSlinky.vegaLite.channeldefMod.TypeForShape
import typingsSlinky.vegaLite.errorbandMod.ErrorBandPart
import typingsSlinky.vegaLite.errorbarMod.ErrorBarCenter
import typingsSlinky.vegaLite.errorbarMod.ErrorBarExtent
import typingsSlinky.vegaLite.errorbarMod.ErrorBarPart
import typingsSlinky.vegaLite.errorbarMod.ErrorInputType
import typingsSlinky.vegaLite.headerComponentMod.HeaderChannel
import typingsSlinky.vegaLite.headerComponentMod.HeaderType
import typingsSlinky.vegaLite.layoutsizeComponentMod.LayoutSizeType
import typingsSlinky.vegaLite.layoutsizeComponentMod._LayoutSize
import typingsSlinky.vegaLite.projectMod.TupleStoreType
import typingsSlinky.vegaLite.scaleMod.ScaleType
import typingsSlinky.vegaLite.scaleMod._Domain
import typingsSlinky.vegaLite.sortMod.SortByChannel
import typingsSlinky.vegaLite.sortMod.SortByChannelDesc
import typingsSlinky.vegaLite.sortMod.SortOrder
import typingsSlinky.vegaLite.specBaseMod.SpecType
import typingsSlinky.vegaLite.splitMod.SplitParentProperty
import typingsSlinky.vegaLite.srcDataMod.DataFormatType
import typingsSlinky.vegaLite.srcDataMod._ParseValue
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcResolveMod.ResolveMode
import typingsSlinky.vegaLite.srcSelectionMod.LegendBinding
import typingsSlinky.vegaLite.srcSelectionMod.SelectionResolution
import typingsSlinky.vegaLite.srcSelectionMod.SelectionType
import typingsSlinky.vegaLite.srcStackMod.StackOffset
import typingsSlinky.vegaLite.srcTimeunitMod.LocalMultiTimeUnit
import typingsSlinky.vegaLite.srcTimeunitMod.LocalSingleTimeUnit
import typingsSlinky.vegaLite.srcTimeunitMod.TimeUnitFormat
import typingsSlinky.vegaLite.srcTimeunitMod.UtcMultiTimeUnit
import typingsSlinky.vegaLite.srcTimeunitMod.UtcSingleTimeUnit
import typingsSlinky.vegaLite.srcTypeMod.StandardType
import typingsSlinky.vegaLite.srcTypeMod.Type
import typingsSlinky.vegaLite.toplevelMod.AutosizeType
import typingsSlinky.vegaLite.toplevelMod.FitType
import typingsSlinky.vegaLite.transformMod.WindowOnlyOp
import typingsSlinky.vegaLite.typeMod._RangeType
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeChannel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object vegaLiteStrings {
  
  @js.native
  sealed trait `-color` extends SortByChannelDesc
  @scala.inline
  def `-color`: `-color` = "-color".asInstanceOf[`-color`]
  
  @js.native
  sealed trait `-fill` extends SortByChannelDesc
  @scala.inline
  def `-fill`: `-fill` = "-fill".asInstanceOf[`-fill`]
  
  @js.native
  sealed trait `-fillOpacity` extends SortByChannelDesc
  @scala.inline
  def `-fillOpacity`: `-fillOpacity` = "-fillOpacity".asInstanceOf[`-fillOpacity`]
  
  @js.native
  sealed trait `-opacity` extends SortByChannelDesc
  @scala.inline
  def `-opacity`: `-opacity` = "-opacity".asInstanceOf[`-opacity`]
  
  @js.native
  sealed trait `-shape` extends SortByChannelDesc
  @scala.inline
  def `-shape`: `-shape` = "-shape".asInstanceOf[`-shape`]
  
  @js.native
  sealed trait `-size` extends SortByChannelDesc
  @scala.inline
  def `-size`: `-size` = "-size".asInstanceOf[`-size`]
  
  @js.native
  sealed trait `-stroke` extends SortByChannelDesc
  @scala.inline
  def `-stroke`: `-stroke` = "-stroke".asInstanceOf[`-stroke`]
  
  @js.native
  sealed trait `-strokeOpacity` extends SortByChannelDesc
  @scala.inline
  def `-strokeOpacity`: `-strokeOpacity` = "-strokeOpacity".asInstanceOf[`-strokeOpacity`]
  
  @js.native
  sealed trait `-strokeWidth` extends SortByChannelDesc
  @scala.inline
  def `-strokeWidth`: `-strokeWidth` = "-strokeWidth".asInstanceOf[`-strokeWidth`]
  
  @js.native
  sealed trait `-text` extends SortByChannelDesc
  @scala.inline
  def `-text`: `-text` = "-text".asInstanceOf[`-text`]
  
  @js.native
  sealed trait `-x` extends SortByChannelDesc
  @scala.inline
  def `-x`: `-x` = "-x".asInstanceOf[`-x`]
  
  @js.native
  sealed trait `-y` extends SortByChannelDesc
  @scala.inline
  def `-y`: `-y` = "-y".asInstanceOf[`-y`]
  
  @js.native
  sealed trait DeepPartial extends StObject
  @scala.inline
  def DeepPartial: DeepPartial = "DeepPartial".asInstanceOf[DeepPartial]
  
  @js.native
  sealed trait E extends TupleStoreType
  @scala.inline
  def E: E = "E".asInstanceOf[E]
  
  @js.native
  sealed trait Flag extends StObject
  @scala.inline
  def Flag: Flag = "Flag".asInstanceOf[Flag]
  
  @js.native
  sealed trait MapExcludeAndKeepSignalAs extends StObject
  @scala.inline
  def MapExcludeAndKeepSignalAs: MapExcludeAndKeepSignalAs = "MapExcludeAndKeepSignalAs".asInstanceOf[MapExcludeAndKeepSignalAs]
  
  @js.native
  sealed trait MappedExclude extends StObject
  @scala.inline
  def MappedExclude: MappedExclude = "MappedExclude".asInstanceOf[MappedExclude]
  
  @js.native
  sealed trait PartialIndex extends StObject
  @scala.inline
  def PartialIndex: PartialIndex = "PartialIndex".asInstanceOf[PartialIndex]
  
  @js.native
  sealed trait R extends TupleStoreType
  @scala.inline
  def R: R = "R".asInstanceOf[R]
  
  @js.native
  sealed trait `R-RE` extends TupleStoreType
  @scala.inline
  def `R-RE`: `R-RE` = "R-RE".asInstanceOf[`R-RE`]
  
  @js.native
  sealed trait _empty extends SplitParentProperty
  @scala.inline
  def _empty: _empty = "".asInstanceOf[_empty]
  
  @js.native
  sealed trait `aggregated-error` extends ErrorInputType
  @scala.inline
  def `aggregated-error`: `aggregated-error` = "aggregated-error".asInstanceOf[`aggregated-error`]
  
  @js.native
  sealed trait `aggregated-upper-lower` extends ErrorInputType
  @scala.inline
  def `aggregated-upper-lower`: `aggregated-upper-lower` = "aggregated-upper-lower".asInstanceOf[`aggregated-upper-lower`]
  
  @js.native
  sealed trait align extends VgEncodeChannel
  @scala.inline
  def align: align = "align".asInstanceOf[align]
  
  @js.native
  sealed trait all extends StObject
  @scala.inline
  def all: all = "all".asInstanceOf[all]
  
  @js.native
  sealed trait always extends StObject
  @scala.inline
  def always: always = "always".asInstanceOf[always]
  
  @js.native
  sealed trait anchor extends StObject
  @scala.inline
  def anchor: anchor = "anchor".asInstanceOf[anchor]
  
  @js.native
  sealed trait angle
    extends Channel
       with VgEncodeChannel
  @scala.inline
  def angle: angle = "angle".asInstanceOf[angle]
  
  @js.native
  sealed trait arc extends Mark
  @scala.inline
  def arc: arc = "arc".asInstanceOf[arc]
  
  @js.native
  sealed trait area extends Mark
  @scala.inline
  def area: area = "area".asInstanceOf[area]
  
  @js.native
  sealed trait argmax extends Aggregate
  @scala.inline
  def argmax: argmax = "argmax".asInstanceOf[argmax]
  
  @js.native
  sealed trait argmin extends Aggregate
  @scala.inline
  def argmin: argmin = "argmin".asInstanceOf[argmin]
  
  @js.native
  sealed trait aria extends StObject
  @scala.inline
  def aria: aria = "aria".asInstanceOf[aria]
  
  @js.native
  sealed trait ariaRole extends StObject
  @scala.inline
  def ariaRole: ariaRole = "ariaRole".asInstanceOf[ariaRole]
  
  @js.native
  sealed trait ariaRoleDescription extends StObject
  @scala.inline
  def ariaRoleDescription: ariaRoleDescription = "ariaRoleDescription".asInstanceOf[ariaRoleDescription]
  
  @js.native
  sealed trait ascending extends SortOrder
  @scala.inline
  def ascending: ascending = "ascending".asInstanceOf[ascending]
  
  @js.native
  sealed trait aspect extends StObject
  @scala.inline
  def aspect: aspect = "aspect".asInstanceOf[aspect]
  
  @js.native
  sealed trait average
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def average: average = "average".asInstanceOf[average]
  
  @js.native
  sealed trait axis
    extends AxisPart
       with SplitParentProperty
  @scala.inline
  def axis: axis = "axis".asInstanceOf[axis]
  
  @js.native
  sealed trait axisBand extends StObject
  @scala.inline
  def axisBand: axisBand = "axisBand".asInstanceOf[axisBand]
  
  @js.native
  sealed trait axisBottom extends StObject
  @scala.inline
  def axisBottom: axisBottom = "axisBottom".asInstanceOf[axisBottom]
  
  @js.native
  sealed trait axisDiscrete extends StObject
  @scala.inline
  def axisDiscrete: axisDiscrete = "axisDiscrete".asInstanceOf[axisDiscrete]
  
  @js.native
  sealed trait axisLeft extends StObject
  @scala.inline
  def axisLeft: axisLeft = "axisLeft".asInstanceOf[axisLeft]
  
  @js.native
  sealed trait axisPoint extends StObject
  @scala.inline
  def axisPoint: axisPoint = "axisPoint".asInstanceOf[axisPoint]
  
  @js.native
  sealed trait axisQuantitative extends StObject
  @scala.inline
  def axisQuantitative: axisQuantitative = "axisQuantitative".asInstanceOf[axisQuantitative]
  
  @js.native
  sealed trait axisRight extends StObject
  @scala.inline
  def axisRight: axisRight = "axisRight".asInstanceOf[axisRight]
  
  @js.native
  sealed trait axisTemporal extends StObject
  @scala.inline
  def axisTemporal: axisTemporal = "axisTemporal".asInstanceOf[axisTemporal]
  
  @js.native
  sealed trait axisTop extends StObject
  @scala.inline
  def axisTop: axisTop = "axisTop".asInstanceOf[axisTop]
  
  @js.native
  sealed trait axisX extends StObject
  @scala.inline
  def axisX: axisX = "axisX".asInstanceOf[axisX]
  
  @js.native
  sealed trait axisXBand extends StObject
  @scala.inline
  def axisXBand: axisXBand = "axisXBand".asInstanceOf[axisXBand]
  
  @js.native
  sealed trait axisXDiscrete extends StObject
  @scala.inline
  def axisXDiscrete: axisXDiscrete = "axisXDiscrete".asInstanceOf[axisXDiscrete]
  
  @js.native
  sealed trait axisXPoint extends StObject
  @scala.inline
  def axisXPoint: axisXPoint = "axisXPoint".asInstanceOf[axisXPoint]
  
  @js.native
  sealed trait axisXQuantitative extends StObject
  @scala.inline
  def axisXQuantitative: axisXQuantitative = "axisXQuantitative".asInstanceOf[axisXQuantitative]
  
  @js.native
  sealed trait axisXTemporal extends StObject
  @scala.inline
  def axisXTemporal: axisXTemporal = "axisXTemporal".asInstanceOf[axisXTemporal]
  
  @js.native
  sealed trait axisY extends StObject
  @scala.inline
  def axisY: axisY = "axisY".asInstanceOf[axisY]
  
  @js.native
  sealed trait axisYBand extends StObject
  @scala.inline
  def axisYBand: axisYBand = "axisYBand".asInstanceOf[axisYBand]
  
  @js.native
  sealed trait axisYDiscrete extends StObject
  @scala.inline
  def axisYDiscrete: axisYDiscrete = "axisYDiscrete".asInstanceOf[axisYDiscrete]
  
  @js.native
  sealed trait axisYPoint extends StObject
  @scala.inline
  def axisYPoint: axisYPoint = "axisYPoint".asInstanceOf[axisYPoint]
  
  @js.native
  sealed trait axisYQuantitative extends StObject
  @scala.inline
  def axisYQuantitative: axisYQuantitative = "axisYQuantitative".asInstanceOf[axisYQuantitative]
  
  @js.native
  sealed trait axisYTemporal extends StObject
  @scala.inline
  def axisYTemporal: axisYTemporal = "axisYTemporal".asInstanceOf[axisYTemporal]
  
  @js.native
  sealed trait band
    extends ErrorBandPart
       with ScaleType
  @scala.inline
  def band: band = "band".asInstanceOf[band]
  
  @js.native
  sealed trait bandPosition extends StObject
  @scala.inline
  def bandPosition: bandPosition = "bandPosition".asInstanceOf[bandPosition]
  
  @js.native
  sealed trait bandSize extends StObject
  @scala.inline
  def bandSize: bandSize = "bandSize".asInstanceOf[bandSize]
  
  @js.native
  sealed trait bar extends Mark
  @scala.inline
  def bar: bar = "bar".asInstanceOf[bar]
  
  @js.native
  sealed trait base extends StObject
  @scala.inline
  def base: base = "base".asInstanceOf[base]
  
  @js.native
  sealed trait baseline extends VgEncodeChannel
  @scala.inline
  def baseline: baseline = "baseline".asInstanceOf[baseline]
  
  @js.native
  sealed trait `bin-ordinal` extends ScaleType
  @scala.inline
  def `bin-ordinal`: `bin-ordinal` = "bin-ordinal".asInstanceOf[`bin-ordinal`]
  
  @js.native
  sealed trait binSpacing extends StObject
  @scala.inline
  def binSpacing: binSpacing = "binSpacing".asInstanceOf[binSpacing]
  
  @js.native
  sealed trait binned extends _Bin
  @scala.inline
  def binned: binned = "binned".asInstanceOf[binned]
  
  @js.native
  sealed trait bins extends StObject
  @scala.inline
  def bins: bins = "bins".asInstanceOf[bins]
  
  @js.native
  sealed trait blend extends StObject
  @scala.inline
  def blend: blend = "blend".asInstanceOf[blend]
  
  @js.native
  sealed trait boolean extends _ParseValue
  @scala.inline
  def boolean: boolean = "boolean".asInstanceOf[boolean]
  
  @js.native
  sealed trait borders extends ErrorBandPart
  @scala.inline
  def borders: borders = "borders".asInstanceOf[borders]
  
  @js.native
  sealed trait both extends StObject
  @scala.inline
  def both: both = "both".asInstanceOf[both]
  
  @js.native
  sealed trait bottom extends StObject
  @scala.inline
  def bottom: bottom = "bottom".asInstanceOf[bottom]
  
  @js.native
  sealed trait `bottom-left` extends StObject
  @scala.inline
  def `bottom-left`: `bottom-left` = "bottom-left".asInstanceOf[`bottom-left`]
  
  @js.native
  sealed trait `bottom-right` extends StObject
  @scala.inline
  def `bottom-right`: `bottom-right` = "bottom-right".asInstanceOf[`bottom-right`]
  
  @js.native
  sealed trait box extends BoxPlotPart
  @scala.inline
  def box: box = "box".asInstanceOf[box]
  
  @js.native
  sealed trait boxplot extends StObject
  @scala.inline
  def boxplot: boxplot = "boxplot".asInstanceOf[boxplot]
  
  @js.native
  sealed trait center extends StackOffset
  @scala.inline
  def center: center = "center".asInstanceOf[center]
  
  @js.native
  sealed trait childHeight extends LayoutSizeType
  @scala.inline
  def childHeight: childHeight = "childHeight".asInstanceOf[childHeight]
  
  @js.native
  sealed trait childWidth extends LayoutSizeType
  @scala.inline
  def childWidth: childWidth = "childWidth".asInstanceOf[childWidth]
  
  @js.native
  sealed trait ci extends ErrorBarExtent
  @scala.inline
  def ci: ci = "ci".asInstanceOf[ci]
  
  @js.native
  sealed trait ci0
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def ci0: ci0 = "ci0".asInstanceOf[ci0]
  
  @js.native
  sealed trait ci1
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def ci1: ci1 = "ci1".asInstanceOf[ci1]
  
  @js.native
  sealed trait circle extends Mark
  @scala.inline
  def circle: circle = "circle".asInstanceOf[circle]
  
  @js.native
  sealed trait clamp extends StObject
  @scala.inline
  def clamp: clamp = "clamp".asInstanceOf[clamp]
  
  @js.native
  sealed trait clip extends VgEncodeChannel
  @scala.inline
  def clip: clip = "clip".asInstanceOf[clip]
  
  @js.native
  sealed trait clipHeight extends StObject
  @scala.inline
  def clipHeight: clipHeight = "clipHeight".asInstanceOf[clipHeight]
  
  @js.native
  sealed trait color
    extends SortByChannel
       with Channel
       with ColorChannel
  @scala.inline
  def color: color = "color".asInstanceOf[color]
  
  @js.native
  sealed trait column
    extends FacetChannel
       with HeaderChannel
  @scala.inline
  def column: column = "column".asInstanceOf[column]
  
  @js.native
  sealed trait columnPadding extends StObject
  @scala.inline
  def columnPadding: columnPadding = "columnPadding".asInstanceOf[columnPadding]
  
  @js.native
  sealed trait columns extends StObject
  @scala.inline
  def columns: columns = "columns".asInstanceOf[columns]
  
  @js.native
  sealed trait concat extends SpecType
  @scala.inline
  def concat: concat = "concat".asInstanceOf[concat]
  
  @js.native
  sealed trait constant extends StObject
  @scala.inline
  def constant: constant = "constant".asInstanceOf[constant]
  
  @js.native
  sealed trait container extends _LayoutSize
  @scala.inline
  def container: container = "container".asInstanceOf[container]
  
  @js.native
  sealed trait content extends StObject
  @scala.inline
  def content: content = "content".asInstanceOf[content]
  
  @js.native
  sealed trait continuous extends _RangeType
  @scala.inline
  def continuous: continuous = "continuous".asInstanceOf[continuous]
  
  @js.native
  sealed trait continuousBandSize extends StObject
  @scala.inline
  def continuousBandSize: continuousBandSize = "continuousBandSize".asInstanceOf[continuousBandSize]
  
  @js.native
  sealed trait cornerRadius extends VgEncodeChannel
  @scala.inline
  def cornerRadius: cornerRadius = "cornerRadius".asInstanceOf[cornerRadius]
  
  @js.native
  sealed trait cornerRadiusBottomLeft extends VgEncodeChannel
  @scala.inline
  def cornerRadiusBottomLeft: cornerRadiusBottomLeft = "cornerRadiusBottomLeft".asInstanceOf[cornerRadiusBottomLeft]
  
  @js.native
  sealed trait cornerRadiusBottomRight extends VgEncodeChannel
  @scala.inline
  def cornerRadiusBottomRight: cornerRadiusBottomRight = "cornerRadiusBottomRight".asInstanceOf[cornerRadiusBottomRight]
  
  @js.native
  sealed trait cornerRadiusEnd extends StObject
  @scala.inline
  def cornerRadiusEnd: cornerRadiusEnd = "cornerRadiusEnd".asInstanceOf[cornerRadiusEnd]
  
  @js.native
  sealed trait cornerRadiusTopLeft extends VgEncodeChannel
  @scala.inline
  def cornerRadiusTopLeft: cornerRadiusTopLeft = "cornerRadiusTopLeft".asInstanceOf[cornerRadiusTopLeft]
  
  @js.native
  sealed trait cornerRadiusTopRight extends VgEncodeChannel
  @scala.inline
  def cornerRadiusTopRight: cornerRadiusTopRight = "cornerRadiusTopRight".asInstanceOf[cornerRadiusTopRight]
  
  @js.native
  sealed trait count
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def count: count = "count".asInstanceOf[count]
  
  @js.native
  sealed trait csv extends DataFormatType
  @scala.inline
  def csv: csv = "csv".asInstanceOf[csv]
  
  @js.native
  sealed trait cume_dist extends WindowOnlyOp
  @scala.inline
  def cume_dist: cume_dist = "cume_dist".asInstanceOf[cume_dist]
  
  @js.native
  sealed trait cursor extends VgEncodeChannel
  @scala.inline
  def cursor: cursor = "cursor".asInstanceOf[cursor]
  
  @js.native
  sealed trait data extends StObject
  @scala.inline
  def data: data = "data".asInstanceOf[data]
  
  @js.native
  sealed trait date
    extends LocalSingleTimeUnit
       with TimeUnitFormat
       with _ParseValue
  @scala.inline
  def date: date = "date".asInstanceOf[date]
  
  @js.native
  sealed trait datum extends StObject
  @scala.inline
  def datum: datum = "datum".asInstanceOf[datum]
  
  @js.native
  sealed trait datumDotdatum extends StObject
  @scala.inline
  def datumDotdatum: datumDotdatum = "datum.datum".asInstanceOf[datumDotdatum]
  
  @js.native
  sealed trait day
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def day: day = "day".asInstanceOf[day]
  
  @js.native
  sealed trait dayhours extends LocalMultiTimeUnit
  @scala.inline
  def dayhours: dayhours = "dayhours".asInstanceOf[dayhours]
  
  @js.native
  sealed trait dayhoursminutes extends LocalMultiTimeUnit
  @scala.inline
  def dayhoursminutes: dayhoursminutes = "dayhoursminutes".asInstanceOf[dayhoursminutes]
  
  @js.native
  sealed trait dayhoursminutesseconds extends LocalMultiTimeUnit
  @scala.inline
  def dayhoursminutesseconds: dayhoursminutesseconds = "dayhoursminutesseconds".asInstanceOf[dayhoursminutesseconds]
  
  @js.native
  sealed trait dayofyear extends LocalSingleTimeUnit
  @scala.inline
  def dayofyear: dayofyear = "dayofyear".asInstanceOf[dayofyear]
  
  @js.native
  sealed trait defined extends VgEncodeChannel
  @scala.inline
  def defined: defined = "defined".asInstanceOf[defined]
  
  @js.native
  sealed trait dense_rank extends WindowOnlyOp
  @scala.inline
  def dense_rank: dense_rank = "dense_rank".asInstanceOf[dense_rank]
  
  @js.native
  sealed trait descending extends SortOrder
  @scala.inline
  def descending: descending = "descending".asInstanceOf[descending]
  
  @js.native
  sealed trait description extends Channel
  @scala.inline
  def description: description = "description".asInstanceOf[description]
  
  @js.native
  sealed trait detail extends Channel
  @scala.inline
  def detail: detail = "detail".asInstanceOf[detail]
  
  @js.native
  sealed trait dir extends VgEncodeChannel
  @scala.inline
  def dir: dir = "dir".asInstanceOf[dir]
  
  @js.native
  sealed trait direction extends StObject
  @scala.inline
  def direction: direction = "direction".asInstanceOf[direction]
  
  @js.native
  sealed trait disable extends StObject
  @scala.inline
  def disable: disable = "disable".asInstanceOf[disable]
  
  @js.native
  sealed trait discrete extends _RangeType
  @scala.inline
  def discrete: discrete = "discrete".asInstanceOf[discrete]
  
  @js.native
  sealed trait discreteBandSize extends StObject
  @scala.inline
  def discreteBandSize: discreteBandSize = "discreteBandSize".asInstanceOf[discreteBandSize]
  
  @js.native
  sealed trait discretizing extends StObject
  @scala.inline
  def discretizing: discretizing = "discretizing".asInstanceOf[discretizing]
  
  @js.native
  sealed trait distinct
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def distinct: distinct = "distinct".asInstanceOf[distinct]
  
  @js.native
  sealed trait domain extends AxisPart
  @scala.inline
  def domain: domain = "domain".asInstanceOf[domain]
  
  @js.native
  sealed trait domainCap extends StObject
  @scala.inline
  def domainCap: domainCap = "domainCap".asInstanceOf[domainCap]
  
  @js.native
  sealed trait domainColor extends StObject
  @scala.inline
  def domainColor: domainColor = "domainColor".asInstanceOf[domainColor]
  
  @js.native
  sealed trait domainDash extends StObject
  @scala.inline
  def domainDash: domainDash = "domainDash".asInstanceOf[domainDash]
  
  @js.native
  sealed trait domainDashOffset extends StObject
  @scala.inline
  def domainDashOffset: domainDashOffset = "domainDashOffset".asInstanceOf[domainDashOffset]
  
  @js.native
  sealed trait domainMax extends StObject
  @scala.inline
  def domainMax: domainMax = "domainMax".asInstanceOf[domainMax]
  
  @js.native
  sealed trait domainMid extends StObject
  @scala.inline
  def domainMid: domainMid = "domainMid".asInstanceOf[domainMid]
  
  @js.native
  sealed trait domainMin extends StObject
  @scala.inline
  def domainMin: domainMin = "domainMin".asInstanceOf[domainMin]
  
  @js.native
  sealed trait domainOpacity extends StObject
  @scala.inline
  def domainOpacity: domainOpacity = "domainOpacity".asInstanceOf[domainOpacity]
  
  @js.native
  sealed trait domainWidth extends StObject
  @scala.inline
  def domainWidth: domainWidth = "domainWidth".asInstanceOf[domainWidth]
  
  @js.native
  sealed trait domains extends StObject
  @scala.inline
  def domains: domains = "domains".asInstanceOf[domains]
  
  @js.native
  sealed trait dsv extends DataFormatType
  @scala.inline
  def dsv: dsv = "dsv".asInstanceOf[dsv]
  
  @js.native
  sealed trait dx extends VgEncodeChannel
  @scala.inline
  def dx: dx = "dx".asInstanceOf[dx]
  
  @js.native
  sealed trait dy extends VgEncodeChannel
  @scala.inline
  def dy: dy = "dy".asInstanceOf[dy]
  
  @js.native
  sealed trait each extends StObject
  @scala.inline
  def each: each = "each".asInstanceOf[each]
  
  @js.native
  sealed trait ellipsis extends VgEncodeChannel
  @scala.inline
  def ellipsis: ellipsis = "ellipsis".asInstanceOf[ellipsis]
  
  @js.native
  sealed trait encode extends StObject
  @scala.inline
  def encode: encode = "encode".asInstanceOf[encode]
  
  @js.native
  sealed trait encoding extends StObject
  @scala.inline
  def encoding: encoding = "encoding".asInstanceOf[encoding]
  
  @js.native
  sealed trait end extends StObject
  @scala.inline
  def end: end = "end".asInstanceOf[end]
  
  @js.native
  sealed trait endAngle extends VgEncodeChannel
  @scala.inline
  def endAngle: endAngle = "endAngle".asInstanceOf[endAngle]
  
  @js.native
  sealed trait errorband extends StObject
  @scala.inline
  def errorband: errorband = "errorband".asInstanceOf[errorband]
  
  @js.native
  sealed trait errorbar extends StObject
  @scala.inline
  def errorbar: errorbar = "errorbar".asInstanceOf[errorbar]
  
  @js.native
  sealed trait exp extends StObject
  @scala.inline
  def exp: exp = "exp".asInstanceOf[exp]
  
  @js.native
  sealed trait exponent extends StObject
  @scala.inline
  def exponent: exponent = "exponent".asInstanceOf[exponent]
  
  @js.native
  sealed trait extent extends StObject
  @scala.inline
  def extent: extent = "extent".asInstanceOf[extent]
  
  @js.native
  sealed trait facet
    extends FacetChannel
       with SpecType
  @scala.inline
  def facet: facet = "facet".asInstanceOf[facet]
  
  @js.native
  sealed trait fill
    extends SortByChannel
       with Channel
       with ColorChannel
       with VgEncodeChannel
  @scala.inline
  def fill: fill = "fill".asInstanceOf[fill]
  
  @js.native
  sealed trait fillColor extends StObject
  @scala.inline
  def fillColor: fillColor = "fillColor".asInstanceOf[fillColor]
  
  @js.native
  sealed trait fillOpacity
    extends SortByChannel
       with Channel
       with VgEncodeChannel
  @scala.inline
  def fillOpacity: fillOpacity = "fillOpacity".asInstanceOf[fillOpacity]
  
  @js.native
  sealed trait filled extends StObject
  @scala.inline
  def filled: filled = "filled".asInstanceOf[filled]
  
  @js.native
  sealed trait filter extends StObject
  @scala.inline
  def filter: filter = "filter".asInstanceOf[filter]
  
  @js.native
  sealed trait first_value extends WindowOnlyOp
  @scala.inline
  def first_value: first_value = "first_value".asInstanceOf[first_value]
  
  @js.native
  sealed trait fit
    extends AutosizeType
       with FitType
  @scala.inline
  def fit: fit = "fit".asInstanceOf[fit]
  
  @js.native
  sealed trait `fit-x`
    extends AutosizeType
       with FitType
  @scala.inline
  def `fit-x`: `fit-x` = "fit-x".asInstanceOf[`fit-x`]
  
  @js.native
  sealed trait `fit-y`
    extends AutosizeType
       with FitType
  @scala.inline
  def `fit-y`: `fit-y` = "fit-y".asInstanceOf[`fit-y`]
  
  @js.native
  sealed trait flexible extends _RangeType
  @scala.inline
  def flexible: flexible = "flexible".asInstanceOf[flexible]
  
  @js.native
  sealed trait flush extends StObject
  @scala.inline
  def flush: flush = "flush".asInstanceOf[flush]
  
  @js.native
  sealed trait font extends VgEncodeChannel
  @scala.inline
  def font: font = "font".asInstanceOf[font]
  
  @js.native
  sealed trait fontSize extends VgEncodeChannel
  @scala.inline
  def fontSize: fontSize = "fontSize".asInstanceOf[fontSize]
  
  @js.native
  sealed trait fontStyle extends VgEncodeChannel
  @scala.inline
  def fontStyle: fontStyle = "fontStyle".asInstanceOf[fontStyle]
  
  @js.native
  sealed trait fontWeight extends VgEncodeChannel
  @scala.inline
  def fontWeight: fontWeight = "fontWeight".asInstanceOf[fontWeight]
  
  @js.native
  sealed trait footer extends HeaderType
  @scala.inline
  def footer: footer = "footer".asInstanceOf[footer]
  
  @js.native
  sealed trait format extends StObject
  @scala.inline
  def format: format = "format".asInstanceOf[format]
  
  @js.native
  sealed trait formatType extends StObject
  @scala.inline
  def formatType: formatType = "formatType".asInstanceOf[formatType]
  
  @js.native
  sealed trait frame extends StObject
  @scala.inline
  def frame: frame = "frame".asInstanceOf[frame]
  
  @js.native
  sealed trait full extends StObject
  @scala.inline
  def full: full = "full".asInstanceOf[full]
  
  @js.native
  sealed trait functional extends StObject
  @scala.inline
  def functional: functional = "functional".asInstanceOf[functional]
  
  @js.native
  sealed trait geojson
    extends Type
       with TypeForShape
  @scala.inline
  def geojson: geojson = "geojson".asInstanceOf[geojson]
  
  @js.native
  sealed trait geoshape extends Mark
  @scala.inline
  def geoshape: geoshape = "geoshape".asInstanceOf[geoshape]
  
  @js.native
  sealed trait global extends SelectionResolution
  @scala.inline
  def global: global = "global".asInstanceOf[global]
  
  @js.native
  sealed trait gradient extends StObject
  @scala.inline
  def gradient: gradient = "gradient".asInstanceOf[gradient]
  
  @js.native
  sealed trait gradientDirection extends StObject
  @scala.inline
  def gradientDirection: gradientDirection = "gradientDirection".asInstanceOf[gradientDirection]
  
  @js.native
  sealed trait gradientHorizontalMaxLength extends StObject
  @scala.inline
  def gradientHorizontalMaxLength: gradientHorizontalMaxLength = "gradientHorizontalMaxLength".asInstanceOf[gradientHorizontalMaxLength]
  
  @js.native
  sealed trait gradientHorizontalMinLength extends StObject
  @scala.inline
  def gradientHorizontalMinLength: gradientHorizontalMinLength = "gradientHorizontalMinLength".asInstanceOf[gradientHorizontalMinLength]
  
  @js.native
  sealed trait gradientLabelLimit extends StObject
  @scala.inline
  def gradientLabelLimit: gradientLabelLimit = "gradientLabelLimit".asInstanceOf[gradientLabelLimit]
  
  @js.native
  sealed trait gradientLabelOffset extends StObject
  @scala.inline
  def gradientLabelOffset: gradientLabelOffset = "gradientLabelOffset".asInstanceOf[gradientLabelOffset]
  
  @js.native
  sealed trait gradientLength extends StObject
  @scala.inline
  def gradientLength: gradientLength = "gradientLength".asInstanceOf[gradientLength]
  
  @js.native
  sealed trait gradientOpacity extends StObject
  @scala.inline
  def gradientOpacity: gradientOpacity = "gradientOpacity".asInstanceOf[gradientOpacity]
  
  @js.native
  sealed trait gradientStrokeColor extends StObject
  @scala.inline
  def gradientStrokeColor: gradientStrokeColor = "gradientStrokeColor".asInstanceOf[gradientStrokeColor]
  
  @js.native
  sealed trait gradientStrokeWidth extends StObject
  @scala.inline
  def gradientStrokeWidth: gradientStrokeWidth = "gradientStrokeWidth".asInstanceOf[gradientStrokeWidth]
  
  @js.native
  sealed trait gradientThickness extends StObject
  @scala.inline
  def gradientThickness: gradientThickness = "gradientThickness".asInstanceOf[gradientThickness]
  
  @js.native
  sealed trait gradientVerticalMaxLength extends StObject
  @scala.inline
  def gradientVerticalMaxLength: gradientVerticalMaxLength = "gradientVerticalMaxLength".asInstanceOf[gradientVerticalMaxLength]
  
  @js.native
  sealed trait gradientVerticalMinLength extends StObject
  @scala.inline
  def gradientVerticalMinLength: gradientVerticalMinLength = "gradientVerticalMinLength".asInstanceOf[gradientVerticalMinLength]
  
  @js.native
  sealed trait greedy extends StObject
  @scala.inline
  def greedy: greedy = "greedy".asInstanceOf[greedy]
  
  @js.native
  sealed trait grid extends AxisPart
  @scala.inline
  def grid: grid = "grid".asInstanceOf[grid]
  
  @js.native
  sealed trait gridAlign extends StObject
  @scala.inline
  def gridAlign: gridAlign = "gridAlign".asInstanceOf[gridAlign]
  
  @js.native
  sealed trait gridCap extends StObject
  @scala.inline
  def gridCap: gridCap = "gridCap".asInstanceOf[gridCap]
  
  @js.native
  sealed trait gridColor extends ConditionalAxisProp
  @scala.inline
  def gridColor: gridColor = "gridColor".asInstanceOf[gridColor]
  
  @js.native
  sealed trait gridDash extends ConditionalAxisProp
  @scala.inline
  def gridDash: gridDash = "gridDash".asInstanceOf[gridDash]
  
  @js.native
  sealed trait gridDashOffset extends ConditionalAxisProp
  @scala.inline
  def gridDashOffset: gridDashOffset = "gridDashOffset".asInstanceOf[gridDashOffset]
  
  @js.native
  sealed trait gridOpacity extends ConditionalAxisProp
  @scala.inline
  def gridOpacity: gridOpacity = "gridOpacity".asInstanceOf[gridOpacity]
  
  @js.native
  sealed trait gridScale extends StObject
  @scala.inline
  def gridScale: gridScale = "gridScale".asInstanceOf[gridScale]
  
  @js.native
  sealed trait gridWidth extends ConditionalAxisProp
  @scala.inline
  def gridWidth: gridWidth = "gridWidth".asInstanceOf[gridWidth]
  
  @js.native
  sealed trait group extends StObject
  @scala.inline
  def group: group = "group".asInstanceOf[group]
  
  @js.native
  sealed trait header extends HeaderType
  @scala.inline
  def header: header = "header".asInstanceOf[header]
  
  @js.native
  sealed trait headerColumn extends StObject
  @scala.inline
  def headerColumn: headerColumn = "headerColumn".asInstanceOf[headerColumn]
  
  @js.native
  sealed trait headerFacet extends StObject
  @scala.inline
  def headerFacet: headerFacet = "headerFacet".asInstanceOf[headerFacet]
  
  @js.native
  sealed trait headerRow extends StObject
  @scala.inline
  def headerRow: headerRow = "headerRow".asInstanceOf[headerRow]
  
  @js.native
  sealed trait height
    extends LayoutSizeType
       with VgEncodeChannel
  @scala.inline
  def height: height = "height".asInstanceOf[height]
  
  @js.native
  sealed trait hide extends StObject
  @scala.inline
  def hide: hide = "hide".asInstanceOf[hide]
  
  @js.native
  sealed trait horizontal extends StObject
  @scala.inline
  def horizontal: horizontal = "horizontal".asInstanceOf[horizontal]
  
  @js.native
  sealed trait hours
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def hours: hours = "hours".asInstanceOf[hours]
  
  @js.native
  sealed trait `hours-minutes` extends TimeUnitFormat
  @scala.inline
  def `hours-minutes`: `hours-minutes` = "hours-minutes".asInstanceOf[`hours-minutes`]
  
  @js.native
  sealed trait hoursminutes extends LocalMultiTimeUnit
  @scala.inline
  def hoursminutes: hoursminutes = "hoursminutes".asInstanceOf[hoursminutes]
  
  @js.native
  sealed trait hoursminutesseconds extends LocalMultiTimeUnit
  @scala.inline
  def hoursminutesseconds: hoursminutesseconds = "hoursminutesseconds".asInstanceOf[hoursminutesseconds]
  
  @js.native
  sealed trait href
    extends Channel
       with VgEncodeChannel
  @scala.inline
  def href: href = "href".asInstanceOf[href]
  
  @js.native
  sealed trait identity extends ScaleType
  @scala.inline
  def identity: identity = "identity".asInstanceOf[identity]
  
  @js.native
  sealed trait ignore extends StObject
  @scala.inline
  def ignore: ignore = "ignore".asInstanceOf[ignore]
  
  @js.native
  sealed trait image extends Mark
  @scala.inline
  def image: image = "image".asInstanceOf[image]
  
  @js.native
  sealed trait include extends StObject
  @scala.inline
  def include: include = "include".asInstanceOf[include]
  
  @js.native
  sealed trait independent extends ResolveMode
  @scala.inline
  def independent: independent = "independent".asInstanceOf[independent]
  
  @js.native
  sealed trait innerRadius extends VgEncodeChannel
  @scala.inline
  def innerRadius: innerRadius = "innerRadius".asInstanceOf[innerRadius]
  
  @js.native
  sealed trait interpolate extends VgEncodeChannel
  @scala.inline
  def interpolate: interpolate = "interpolate".asInstanceOf[interpolate]
  
  @js.native
  sealed trait intersect extends SelectionResolution
  @scala.inline
  def intersect: intersect = "intersect".asInstanceOf[intersect]
  
  @js.native
  sealed trait interval extends SelectionType
  @scala.inline
  def interval: interval = "interval".asInstanceOf[interval]
  
  @js.native
  sealed trait invalid extends StObject
  @scala.inline
  def invalid: invalid = "invalid".asInstanceOf[invalid]
  
  @js.native
  sealed trait iqr extends ErrorBarExtent
  @scala.inline
  def iqr: iqr = "iqr".asInstanceOf[iqr]
  
  @js.native
  sealed trait joinaggregate extends StObject
  @scala.inline
  def joinaggregate: joinaggregate = "joinaggregate".asInstanceOf[joinaggregate]
  
  @js.native
  sealed trait json extends DataFormatType
  @scala.inline
  def json: json = "json".asInstanceOf[json]
  
  @js.native
  sealed trait key extends Channel
  @scala.inline
  def key: key = "key".asInstanceOf[key]
  
  @js.native
  sealed trait labelAlign extends ConditionalAxisProp
  @scala.inline
  def labelAlign: labelAlign = "labelAlign".asInstanceOf[labelAlign]
  
  @js.native
  sealed trait labelAnchor extends StObject
  @scala.inline
  def labelAnchor: labelAnchor = "labelAnchor".asInstanceOf[labelAnchor]
  
  @js.native
  sealed trait labelAngle extends StObject
  @scala.inline
  def labelAngle: labelAngle = "labelAngle".asInstanceOf[labelAngle]
  
  @js.native
  sealed trait labelBaseline extends ConditionalAxisProp
  @scala.inline
  def labelBaseline: labelBaseline = "labelBaseline".asInstanceOf[labelBaseline]
  
  @js.native
  sealed trait labelBound extends StObject
  @scala.inline
  def labelBound: labelBound = "labelBound".asInstanceOf[labelBound]
  
  @js.native
  sealed trait labelColor extends ConditionalAxisProp
  @scala.inline
  def labelColor: labelColor = "labelColor".asInstanceOf[labelColor]
  
  @js.native
  sealed trait labelExpr extends StObject
  @scala.inline
  def labelExpr: labelExpr = "labelExpr".asInstanceOf[labelExpr]
  
  @js.native
  sealed trait labelFlush extends StObject
  @scala.inline
  def labelFlush: labelFlush = "labelFlush".asInstanceOf[labelFlush]
  
  @js.native
  sealed trait labelFlushOffset extends StObject
  @scala.inline
  def labelFlushOffset: labelFlushOffset = "labelFlushOffset".asInstanceOf[labelFlushOffset]
  
  @js.native
  sealed trait labelFont extends ConditionalAxisProp
  @scala.inline
  def labelFont: labelFont = "labelFont".asInstanceOf[labelFont]
  
  @js.native
  sealed trait labelFontSize extends ConditionalAxisProp
  @scala.inline
  def labelFontSize: labelFontSize = "labelFontSize".asInstanceOf[labelFontSize]
  
  @js.native
  sealed trait labelFontStyle extends ConditionalAxisProp
  @scala.inline
  def labelFontStyle: labelFontStyle = "labelFontStyle".asInstanceOf[labelFontStyle]
  
  @js.native
  sealed trait labelFontWeight extends ConditionalAxisProp
  @scala.inline
  def labelFontWeight: labelFontWeight = "labelFontWeight".asInstanceOf[labelFontWeight]
  
  @js.native
  sealed trait labelLimit extends StObject
  @scala.inline
  def labelLimit: labelLimit = "labelLimit".asInstanceOf[labelLimit]
  
  @js.native
  sealed trait labelLineHeight extends StObject
  @scala.inline
  def labelLineHeight: labelLineHeight = "labelLineHeight".asInstanceOf[labelLineHeight]
  
  @js.native
  sealed trait labelOffset extends ConditionalAxisProp
  @scala.inline
  def labelOffset: labelOffset = "labelOffset".asInstanceOf[labelOffset]
  
  @js.native
  sealed trait labelOpacity extends ConditionalAxisProp
  @scala.inline
  def labelOpacity: labelOpacity = "labelOpacity".asInstanceOf[labelOpacity]
  
  @js.native
  sealed trait labelOrient extends StObject
  @scala.inline
  def labelOrient: labelOrient = "labelOrient".asInstanceOf[labelOrient]
  
  @js.native
  sealed trait labelOverlap extends StObject
  @scala.inline
  def labelOverlap: labelOverlap = "labelOverlap".asInstanceOf[labelOverlap]
  
  @js.native
  sealed trait labelPadding extends ConditionalAxisProp
  @scala.inline
  def labelPadding: labelPadding = "labelPadding".asInstanceOf[labelPadding]
  
  @js.native
  sealed trait labelSeparation extends StObject
  @scala.inline
  def labelSeparation: labelSeparation = "labelSeparation".asInstanceOf[labelSeparation]
  
  @js.native
  sealed trait labels extends AxisPart
  @scala.inline
  def labels: labels = "labels".asInstanceOf[labels]
  
  @js.native
  sealed trait lag extends WindowOnlyOp
  @scala.inline
  def lag: lag = "lag".asInstanceOf[lag]
  
  @js.native
  sealed trait last_value extends WindowOnlyOp
  @scala.inline
  def last_value: last_value = "last_value".asInstanceOf[last_value]
  
  @js.native
  sealed trait latitude
    extends Channel
       with GeoPositionChannel
       with _MainChannelOf[js.Any]
  @scala.inline
  def latitude: latitude = "latitude".asInstanceOf[latitude]
  
  @js.native
  sealed trait latitude2
    extends Channel
       with GeoPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[js.Any]
  @scala.inline
  def latitude2: latitude2 = "latitude2".asInstanceOf[latitude2]
  
  @js.native
  sealed trait layer extends SpecType
  @scala.inline
  def layer: layer = "layer".asInstanceOf[layer]
  
  @js.native
  sealed trait layout extends StObject
  @scala.inline
  def layout: layout = "layout".asInstanceOf[layout]
  
  @js.native
  sealed trait lead extends WindowOnlyOp
  @scala.inline
  def lead: lead = "lead".asInstanceOf[lead]
  
  @js.native
  sealed trait left extends StObject
  @scala.inline
  def left: left = "left".asInstanceOf[left]
  
  @js.native
  sealed trait legend
    extends LegendBinding
       with SplitParentProperty
  @scala.inline
  def legend: legend = "legend".asInstanceOf[legend]
  
  @js.native
  sealed trait legendX extends StObject
  @scala.inline
  def legendX: legendX = "legendX".asInstanceOf[legendX]
  
  @js.native
  sealed trait legendY extends StObject
  @scala.inline
  def legendY: legendY = "legendY".asInstanceOf[legendY]
  
  @js.native
  sealed trait limit extends VgEncodeChannel
  @scala.inline
  def limit: limit = "limit".asInstanceOf[limit]
  
  @js.native
  sealed trait line extends Mark
  @scala.inline
  def line: line = "line".asInstanceOf[line]
  
  @js.native
  sealed trait lineBreak extends StObject
  @scala.inline
  def lineBreak: lineBreak = "lineBreak".asInstanceOf[lineBreak]
  
  @js.native
  sealed trait lineHeight extends StObject
  @scala.inline
  def lineHeight: lineHeight = "lineHeight".asInstanceOf[lineHeight]
  
  @js.native
  sealed trait linear extends ScaleType
  @scala.inline
  def linear: linear = "linear".asInstanceOf[linear]
  
  @js.native
  sealed trait log extends ScaleType
  @scala.inline
  def log: log = "log".asInstanceOf[log]
  
  @js.native
  sealed trait longitude
    extends Channel
       with GeoPositionChannel
       with _MainChannelOf[js.Any]
  @scala.inline
  def longitude: longitude = "longitude".asInstanceOf[longitude]
  
  @js.native
  sealed trait longitude2
    extends Channel
       with GeoPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[js.Any]
  @scala.inline
  def longitude2: longitude2 = "longitude2".asInstanceOf[longitude2]
  
  @js.native
  sealed trait main extends StObject
  @scala.inline
  def main: main = "main".asInstanceOf[main]
  
  @js.native
  sealed trait mark extends StObject
  @scala.inline
  def mark: mark = "mark".asInstanceOf[mark]
  
  @js.native
  sealed trait max
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def max: max = "max".asInstanceOf[max]
  
  @js.native
  sealed trait maxExtent extends StObject
  @scala.inline
  def maxExtent: maxExtent = "maxExtent".asInstanceOf[maxExtent]
  
  @js.native
  sealed trait mean
    extends Aggregate
       with ErrorBarCenter
       with NonArgAggregateOp
  @scala.inline
  def mean: mean = "mean".asInstanceOf[mean]
  
  @js.native
  sealed trait median
    extends Aggregate
       with BoxPlotPart
       with ErrorBarCenter
       with NonArgAggregateOp
  @scala.inline
  def median: median = "median".asInstanceOf[median]
  
  @js.native
  sealed trait merged extends _LayoutSize
  @scala.inline
  def merged: merged = "merged".asInstanceOf[merged]
  
  @js.native
  sealed trait mid extends StObject
  @scala.inline
  def mid: mid = "mid".asInstanceOf[mid]
  
  @js.native
  sealed trait middle extends StObject
  @scala.inline
  def middle: middle = "middle".asInstanceOf[middle]
  
  @js.native
  sealed trait milliseconds
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def milliseconds: milliseconds = "milliseconds".asInstanceOf[milliseconds]
  
  @js.native
  sealed trait min
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def min: min = "min".asInstanceOf[min]
  
  @js.native
  sealed trait `min-max` extends StObject
  @scala.inline
  def `min-max`: `min-max` = "min-max".asInstanceOf[`min-max`]
  
  @js.native
  sealed trait minExtent extends StObject
  @scala.inline
  def minExtent: minExtent = "minExtent".asInstanceOf[minExtent]
  
  @js.native
  sealed trait minutes
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def minutes: minutes = "minutes".asInstanceOf[minutes]
  
  @js.native
  sealed trait minutesseconds extends LocalMultiTimeUnit
  @scala.inline
  def minutesseconds: minutesseconds = "minutesseconds".asInstanceOf[minutesseconds]
  
  @js.native
  sealed trait missing
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def missing: missing = "missing".asInstanceOf[missing]
  
  @js.native
  sealed trait month
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def month: month = "month".asInstanceOf[month]
  
  @js.native
  sealed trait monthdate extends LocalMultiTimeUnit
  @scala.inline
  def monthdate: monthdate = "monthdate".asInstanceOf[monthdate]
  
  @js.native
  sealed trait monthdatehours extends LocalMultiTimeUnit
  @scala.inline
  def monthdatehours: monthdatehours = "monthdatehours".asInstanceOf[monthdatehours]
  
  @js.native
  sealed trait monthdatehoursminutes extends LocalMultiTimeUnit
  @scala.inline
  def monthdatehoursminutes: monthdatehoursminutes = "monthdatehoursminutes".asInstanceOf[monthdatehoursminutes]
  
  @js.native
  sealed trait monthdatehoursminutesseconds extends LocalMultiTimeUnit
  @scala.inline
  def monthdatehoursminutesseconds: monthdatehoursminutesseconds = "monthdatehoursminutesseconds".asInstanceOf[monthdatehoursminutesseconds]
  
  @js.native
  sealed trait multi extends SelectionType
  @scala.inline
  def multi: multi = "multi".asInstanceOf[multi]
  
  @js.native
  sealed trait nice extends StObject
  @scala.inline
  def nice: nice = "nice".asInstanceOf[nice]
  
  @js.native
  sealed trait nominal
    extends StandardType
       with Type
       with TypeForShape
  @scala.inline
  def nominal: nominal = "nominal".asInstanceOf[nominal]
  
  @js.native
  sealed trait none extends AutosizeType
  @scala.inline
  def none: none = "none".asInstanceOf[none]
  
  @js.native
  sealed trait normalize extends StackOffset
  @scala.inline
  def normalize: normalize = "normalize".asInstanceOf[normalize]
  
  @js.native
  sealed trait nth_value extends WindowOnlyOp
  @scala.inline
  def nth_value: nth_value = "nth_value".asInstanceOf[nth_value]
  
  @js.native
  sealed trait ntile extends WindowOnlyOp
  @scala.inline
  def ntile: ntile = "ntile".asInstanceOf[ntile]
  
  @js.native
  sealed trait number extends _ParseValue
  @scala.inline
  def number: number = "number".asInstanceOf[number]
  
  @js.native
  sealed trait numeric extends StObject
  @scala.inline
  def numeric: numeric = "numeric".asInstanceOf[numeric]
  
  @js.native
  sealed trait offset extends StObject
  @scala.inline
  def offset: offset = "offset".asInstanceOf[offset]
  
  @js.native
  sealed trait opacity
    extends SortByChannel
       with Channel
       with VgEncodeChannel
  @scala.inline
  def opacity: opacity = "opacity".asInstanceOf[opacity]
  
  @js.native
  sealed trait order extends Channel
  @scala.inline
  def order: order = "order".asInstanceOf[order]
  
  @js.native
  sealed trait ordinal
    extends ScaleType
       with StandardType
       with Type
       with TypeForShape
  @scala.inline
  def ordinal: ordinal = "ordinal".asInstanceOf[ordinal]
  
  @js.native
  sealed trait `ordinal-position` extends StObject
  @scala.inline
  def `ordinal-position`: `ordinal-position` = "ordinal-position".asInstanceOf[`ordinal-position`]
  
  @js.native
  sealed trait orient extends VgEncodeChannel
  @scala.inline
  def orient: orient = "orient".asInstanceOf[orient]
  
  @js.native
  sealed trait outerRadius extends VgEncodeChannel
  @scala.inline
  def outerRadius: outerRadius = "outerRadius".asInstanceOf[outerRadius]
  
  @js.native
  sealed trait outliers extends BoxPlotPart
  @scala.inline
  def outliers: outliers = "outliers".asInstanceOf[outliers]
  
  @js.native
  sealed trait pad extends AutosizeType
  @scala.inline
  def pad: pad = "pad".asInstanceOf[pad]
  
  @js.native
  sealed trait padAngle extends StObject
  @scala.inline
  def padAngle: padAngle = "padAngle".asInstanceOf[padAngle]
  
  @js.native
  sealed trait padding extends StObject
  @scala.inline
  def padding: padding = "padding".asInstanceOf[padding]
  
  @js.native
  sealed trait paddingInner extends StObject
  @scala.inline
  def paddingInner: paddingInner = "paddingInner".asInstanceOf[paddingInner]
  
  @js.native
  sealed trait paddingOuter extends StObject
  @scala.inline
  def paddingOuter: paddingOuter = "paddingOuter".asInstanceOf[paddingOuter]
  
  @js.native
  sealed trait parent extends StObject
  @scala.inline
  def parent: parent = "parent".asInstanceOf[parent]
  
  @js.native
  sealed trait parity extends StObject
  @scala.inline
  def parity: parity = "parity".asInstanceOf[parity]
  
  @js.native
  sealed trait path extends VgEncodeChannel
  @scala.inline
  def path: path = "path".asInstanceOf[path]
  
  @js.native
  sealed trait percent_rank extends WindowOnlyOp
  @scala.inline
  def percent_rank: percent_rank = "percent_rank".asInstanceOf[percent_rank]
  
  @js.native
  sealed trait plain extends StObject
  @scala.inline
  def plain: plain = "plain".asInstanceOf[plain]
  
  @js.native
  sealed trait point
    extends Mark
       with ScaleType
  @scala.inline
  def point: point = "point".asInstanceOf[point]
  
  @js.native
  sealed trait poly extends StObject
  @scala.inline
  def poly: poly = "poly".asInstanceOf[poly]
  
  @js.native
  sealed trait position extends StObject
  @scala.inline
  def position: position = "position".asInstanceOf[position]
  
  @js.native
  sealed trait pow extends ScaleType
  @scala.inline
  def pow: pow = "pow".asInstanceOf[pow]
  
  @js.native
  sealed trait product
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def product: product = "product".asInstanceOf[product]
  
  @js.native
  sealed trait property extends StObject
  @scala.inline
  def property: property = "property".asInstanceOf[property]
  
  @js.native
  sealed trait q1
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def q1: q1 = "q1".asInstanceOf[q1]
  
  @js.native
  sealed trait q3
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def q3: q3 = "q3".asInstanceOf[q3]
  
  @js.native
  sealed trait quad extends StObject
  @scala.inline
  def quad: quad = "quad".asInstanceOf[quad]
  
  @js.native
  sealed trait quantile extends ScaleType
  @scala.inline
  def quantile: quantile = "quantile".asInstanceOf[quantile]
  
  @js.native
  sealed trait quantitative
    extends StandardType
       with Type
  @scala.inline
  def quantitative: quantitative = "quantitative".asInstanceOf[quantitative]
  
  @js.native
  sealed trait quantize extends ScaleType
  @scala.inline
  def quantize: quantize = "quantize".asInstanceOf[quantize]
  
  @js.native
  sealed trait quarter
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def quarter: quarter = "quarter".asInstanceOf[quarter]
  
  @js.native
  sealed trait quartermonth extends LocalMultiTimeUnit
  @scala.inline
  def quartermonth: quartermonth = "quartermonth".asInstanceOf[quartermonth]
  
  @js.native
  sealed trait radius
    extends Channel
       with PolarPositionChannel
       with PolarPositionScaleChannel
       with VgEncodeChannel
       with _MainChannelOf[js.Any]
  @scala.inline
  def radius: radius = "radius".asInstanceOf[radius]
  
  @js.native
  sealed trait radius2
    extends Channel
       with PolarPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[js.Any]
  @scala.inline
  def radius2: radius2 = "radius2".asInstanceOf[radius2]
  
  @js.native
  sealed trait radius2Offset extends StObject
  @scala.inline
  def radius2Offset: radius2Offset = "radius2Offset".asInstanceOf[radius2Offset]
  
  @js.native
  sealed trait radiusOffset extends StObject
  @scala.inline
  def radiusOffset: radiusOffset = "radiusOffset".asInstanceOf[radiusOffset]
  
  @js.native
  sealed trait range extends StObject
  @scala.inline
  def range: range = "range".asInstanceOf[range]
  
  @js.native
  sealed trait rangeMax extends StObject
  @scala.inline
  def rangeMax: rangeMax = "rangeMax".asInstanceOf[rangeMax]
  
  @js.native
  sealed trait rangeMin extends StObject
  @scala.inline
  def rangeMin: rangeMin = "rangeMin".asInstanceOf[rangeMin]
  
  @js.native
  sealed trait rank extends WindowOnlyOp
  @scala.inline
  def rank: rank = "rank".asInstanceOf[rank]
  
  @js.native
  sealed trait raw extends ErrorInputType
  @scala.inline
  def raw: raw = "raw".asInstanceOf[raw]
  
  @js.native
  sealed trait rect extends Mark
  @scala.inline
  def rect: rect = "rect".asInstanceOf[rect]
  
  @js.native
  sealed trait repeat extends StObject
  @scala.inline
  def repeat: repeat = "repeat".asInstanceOf[repeat]
  
  @js.native
  sealed trait reverse extends StObject
  @scala.inline
  def reverse: reverse = "reverse".asInstanceOf[reverse]
  
  @js.native
  sealed trait right extends StObject
  @scala.inline
  def right: right = "right".asInstanceOf[right]
  
  @js.native
  sealed trait round extends StObject
  @scala.inline
  def round: round = "round".asInstanceOf[round]
  
  @js.native
  sealed trait row
    extends FacetChannel
       with HeaderChannel
  @scala.inline
  def row: row = "row".asInstanceOf[row]
  
  @js.native
  sealed trait rowPadding extends StObject
  @scala.inline
  def rowPadding: rowPadding = "rowPadding".asInstanceOf[rowPadding]
  
  @js.native
  sealed trait row_number extends WindowOnlyOp
  @scala.inline
  def row_number: row_number = "row_number".asInstanceOf[row_number]
  
  @js.native
  sealed trait rule
    extends BoxPlotPart
       with ErrorBarPart
       with Mark
  @scala.inline
  def rule: rule = "rule".asInstanceOf[rule]
  
  @js.native
  sealed trait scale extends SplitParentProperty
  @scala.inline
  def scale: scale = "scale".asInstanceOf[scale]
  
  @js.native
  sealed trait scaleX extends VgEncodeChannel
  @scala.inline
  def scaleX: scaleX = "scaleX".asInstanceOf[scaleX]
  
  @js.native
  sealed trait scaleY extends VgEncodeChannel
  @scala.inline
  def scaleY: scaleY = "scaleY".asInstanceOf[scaleY]
  
  @js.native
  sealed trait scales extends StObject
  @scala.inline
  def scales: scales = "scales".asInstanceOf[scales]
  
  @js.native
  sealed trait scheme extends StObject
  @scala.inline
  def scheme: scheme = "scheme".asInstanceOf[scheme]
  
  @js.native
  sealed trait seconds
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def seconds: seconds = "seconds".asInstanceOf[seconds]
  
  @js.native
  sealed trait secondsmilliseconds extends LocalMultiTimeUnit
  @scala.inline
  def secondsmilliseconds: secondsmilliseconds = "secondsmilliseconds".asInstanceOf[secondsmilliseconds]
  
  @js.native
  sealed trait selections extends StObject
  @scala.inline
  def selections: selections = "selections".asInstanceOf[selections]
  
  @js.native
  sealed trait sequential extends ScaleType
  @scala.inline
  def sequential: sequential = "sequential".asInstanceOf[sequential]
  
  @js.native
  sealed trait shape
    extends SortByChannel
       with Channel
       with VgEncodeChannel
  @scala.inline
  def shape: shape = "shape".asInstanceOf[shape]
  
  @js.native
  sealed trait shared extends ResolveMode
  @scala.inline
  def shared: shared = "shared".asInstanceOf[shared]
  
  @js.native
  sealed trait single extends SelectionType
  @scala.inline
  def single: single = "single".asInstanceOf[single]
  
  @js.native
  sealed trait size
    extends SortByChannel
       with Channel
       with VgEncodeChannel
  @scala.inline
  def size: size = "size".asInstanceOf[size]
  
  @js.native
  sealed trait smooth extends StObject
  @scala.inline
  def smooth: smooth = "smooth".asInstanceOf[smooth]
  
  @js.native
  sealed trait sqrt extends ScaleType
  @scala.inline
  def sqrt: sqrt = "sqrt".asInstanceOf[sqrt]
  
  @js.native
  sealed trait square extends Mark
  @scala.inline
  def square: square = "square".asInstanceOf[square]
  
  @js.native
  sealed trait start extends StObject
  @scala.inline
  def start: start = "start".asInstanceOf[start]
  
  @js.native
  sealed trait startAngle extends VgEncodeChannel
  @scala.inline
  def startAngle: startAngle = "startAngle".asInstanceOf[startAngle]
  
  @js.native
  sealed trait stderr
    extends Aggregate
       with ErrorBarExtent
       with NonArgAggregateOp
  @scala.inline
  def stderr: stderr = "stderr".asInstanceOf[stderr]
  
  @js.native
  sealed trait stdev
    extends Aggregate
       with ErrorBarExtent
       with NonArgAggregateOp
  @scala.inline
  def stdev: stdev = "stdev".asInstanceOf[stdev]
  
  @js.native
  sealed trait stdevp
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def stdevp: stdevp = "stdevp".asInstanceOf[stdevp]
  
  @js.native
  sealed trait step extends _LayoutSize
  @scala.inline
  def step: step = "step".asInstanceOf[step]
  
  @js.native
  sealed trait string extends _ParseValue
  @scala.inline
  def string: string = "string".asInstanceOf[string]
  
  @js.native
  sealed trait stroke
    extends SortByChannel
       with Channel
       with ColorChannel
       with VgEncodeChannel
  @scala.inline
  def stroke: stroke = "stroke".asInstanceOf[stroke]
  
  @js.native
  sealed trait strokeCap extends VgEncodeChannel
  @scala.inline
  def strokeCap: strokeCap = "strokeCap".asInstanceOf[strokeCap]
  
  @js.native
  sealed trait strokeColor extends StObject
  @scala.inline
  def strokeColor: strokeColor = "strokeColor".asInstanceOf[strokeColor]
  
  @js.native
  sealed trait strokeDash
    extends Channel
       with VgEncodeChannel
  @scala.inline
  def strokeDash: strokeDash = "strokeDash".asInstanceOf[strokeDash]
  
  @js.native
  sealed trait strokeDashOffset extends VgEncodeChannel
  @scala.inline
  def strokeDashOffset: strokeDashOffset = "strokeDashOffset".asInstanceOf[strokeDashOffset]
  
  @js.native
  sealed trait strokeForeground extends VgEncodeChannel
  @scala.inline
  def strokeForeground: strokeForeground = "strokeForeground".asInstanceOf[strokeForeground]
  
  @js.native
  sealed trait strokeJoin extends VgEncodeChannel
  @scala.inline
  def strokeJoin: strokeJoin = "strokeJoin".asInstanceOf[strokeJoin]
  
  @js.native
  sealed trait strokeMiterLimit extends VgEncodeChannel
  @scala.inline
  def strokeMiterLimit: strokeMiterLimit = "strokeMiterLimit".asInstanceOf[strokeMiterLimit]
  
  @js.native
  sealed trait strokeOffset extends VgEncodeChannel
  @scala.inline
  def strokeOffset: strokeOffset = "strokeOffset".asInstanceOf[strokeOffset]
  
  @js.native
  sealed trait strokeOpacity
    extends SortByChannel
       with Channel
       with VgEncodeChannel
  @scala.inline
  def strokeOpacity: strokeOpacity = "strokeOpacity".asInstanceOf[strokeOpacity]
  
  @js.native
  sealed trait strokeWidth
    extends SortByChannel
       with Channel
       with VgEncodeChannel
  @scala.inline
  def strokeWidth: strokeWidth = "strokeWidth".asInstanceOf[strokeWidth]
  
  @js.native
  sealed trait style extends StObject
  @scala.inline
  def style: style = "style".asInstanceOf[style]
  
  @js.native
  sealed trait subtitleColor extends StObject
  @scala.inline
  def subtitleColor: subtitleColor = "subtitleColor".asInstanceOf[subtitleColor]
  
  @js.native
  sealed trait subtitleFont extends StObject
  @scala.inline
  def subtitleFont: subtitleFont = "subtitleFont".asInstanceOf[subtitleFont]
  
  @js.native
  sealed trait subtitleFontSize extends StObject
  @scala.inline
  def subtitleFontSize: subtitleFontSize = "subtitleFontSize".asInstanceOf[subtitleFontSize]
  
  @js.native
  sealed trait subtitleFontStyle extends StObject
  @scala.inline
  def subtitleFontStyle: subtitleFontStyle = "subtitleFontStyle".asInstanceOf[subtitleFontStyle]
  
  @js.native
  sealed trait subtitleFontWeight extends StObject
  @scala.inline
  def subtitleFontWeight: subtitleFontWeight = "subtitleFontWeight".asInstanceOf[subtitleFontWeight]
  
  @js.native
  sealed trait subtitleLineHeight extends StObject
  @scala.inline
  def subtitleLineHeight: subtitleLineHeight = "subtitleLineHeight".asInstanceOf[subtitleLineHeight]
  
  @js.native
  sealed trait subtitlePadding extends StObject
  @scala.inline
  def subtitlePadding: subtitlePadding = "subtitlePadding".asInstanceOf[subtitlePadding]
  
  @js.native
  sealed trait sum
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def sum: sum = "sum".asInstanceOf[sum]
  
  @js.native
  sealed trait symbol extends StObject
  @scala.inline
  def symbol: symbol = "symbol".asInstanceOf[symbol]
  
  @js.native
  sealed trait symbolBaseFillColor extends StObject
  @scala.inline
  def symbolBaseFillColor: symbolBaseFillColor = "symbolBaseFillColor".asInstanceOf[symbolBaseFillColor]
  
  @js.native
  sealed trait symbolBaseStrokeColor extends StObject
  @scala.inline
  def symbolBaseStrokeColor: symbolBaseStrokeColor = "symbolBaseStrokeColor".asInstanceOf[symbolBaseStrokeColor]
  
  @js.native
  sealed trait symbolDash extends StObject
  @scala.inline
  def symbolDash: symbolDash = "symbolDash".asInstanceOf[symbolDash]
  
  @js.native
  sealed trait symbolDashOffset extends StObject
  @scala.inline
  def symbolDashOffset: symbolDashOffset = "symbolDashOffset".asInstanceOf[symbolDashOffset]
  
  @js.native
  sealed trait symbolDirection extends StObject
  @scala.inline
  def symbolDirection: symbolDirection = "symbolDirection".asInstanceOf[symbolDirection]
  
  @js.native
  sealed trait symbolFillColor extends StObject
  @scala.inline
  def symbolFillColor: symbolFillColor = "symbolFillColor".asInstanceOf[symbolFillColor]
  
  @js.native
  sealed trait symbolLimit extends StObject
  @scala.inline
  def symbolLimit: symbolLimit = "symbolLimit".asInstanceOf[symbolLimit]
  
  @js.native
  sealed trait symbolOffset extends StObject
  @scala.inline
  def symbolOffset: symbolOffset = "symbolOffset".asInstanceOf[symbolOffset]
  
  @js.native
  sealed trait symbolOpacity extends StObject
  @scala.inline
  def symbolOpacity: symbolOpacity = "symbolOpacity".asInstanceOf[symbolOpacity]
  
  @js.native
  sealed trait symbolSize extends StObject
  @scala.inline
  def symbolSize: symbolSize = "symbolSize".asInstanceOf[symbolSize]
  
  @js.native
  sealed trait symbolStrokeColor extends StObject
  @scala.inline
  def symbolStrokeColor: symbolStrokeColor = "symbolStrokeColor".asInstanceOf[symbolStrokeColor]
  
  @js.native
  sealed trait symbolStrokeWidth extends StObject
  @scala.inline
  def symbolStrokeWidth: symbolStrokeWidth = "symbolStrokeWidth".asInstanceOf[symbolStrokeWidth]
  
  @js.native
  sealed trait symbolType extends StObject
  @scala.inline
  def symbolType: symbolType = "symbolType".asInstanceOf[symbolType]
  
  @js.native
  sealed trait symlog extends ScaleType
  @scala.inline
  def symlog: symlog = "symlog".asInstanceOf[symlog]
  
  @js.native
  sealed trait temporal
    extends StandardType
       with Type
  @scala.inline
  def temporal: temporal = "temporal".asInstanceOf[temporal]
  
  @js.native
  sealed trait tension extends VgEncodeChannel
  @scala.inline
  def tension: tension = "tension".asInstanceOf[tension]
  
  @js.native
  sealed trait text
    extends SortByChannel
       with Channel
       with Mark
       with VgEncodeChannel
  @scala.inline
  def text: text = "text".asInstanceOf[text]
  
  @js.native
  sealed trait theta
    extends Channel
       with PolarPositionChannel
       with PolarPositionScaleChannel
       with VgEncodeChannel
       with _MainChannelOf[js.Any]
  @scala.inline
  def theta: theta = "theta".asInstanceOf[theta]
  
  @js.native
  sealed trait theta2
    extends Channel
       with PolarPositionChannel
       with SecondaryRangeChannel
       with _SecondaryChannelOf[js.Any]
  @scala.inline
  def theta2: theta2 = "theta2".asInstanceOf[theta2]
  
  @js.native
  sealed trait theta2Offset extends StObject
  @scala.inline
  def theta2Offset: theta2Offset = "theta2Offset".asInstanceOf[theta2Offset]
  
  @js.native
  sealed trait thetaOffset extends StObject
  @scala.inline
  def thetaOffset: thetaOffset = "thetaOffset".asInstanceOf[thetaOffset]
  
  @js.native
  sealed trait thickness extends StObject
  @scala.inline
  def thickness: thickness = "thickness".asInstanceOf[thickness]
  
  @js.native
  sealed trait threshold extends ScaleType
  @scala.inline
  def threshold: threshold = "threshold".asInstanceOf[threshold]
  
  @js.native
  sealed trait tick extends Mark
  @scala.inline
  def tick: tick = "tick".asInstanceOf[tick]
  
  @js.native
  sealed trait tickBand extends StObject
  @scala.inline
  def tickBand: tickBand = "tickBand".asInstanceOf[tickBand]
  
  @js.native
  sealed trait tickCap extends StObject
  @scala.inline
  def tickCap: tickCap = "tickCap".asInstanceOf[tickCap]
  
  @js.native
  sealed trait tickColor extends ConditionalAxisProp
  @scala.inline
  def tickColor: tickColor = "tickColor".asInstanceOf[tickColor]
  
  @js.native
  sealed trait tickCount extends StObject
  @scala.inline
  def tickCount: tickCount = "tickCount".asInstanceOf[tickCount]
  
  @js.native
  sealed trait tickDash extends ConditionalAxisProp
  @scala.inline
  def tickDash: tickDash = "tickDash".asInstanceOf[tickDash]
  
  @js.native
  sealed trait tickDashOffset extends ConditionalAxisProp
  @scala.inline
  def tickDashOffset: tickDashOffset = "tickDashOffset".asInstanceOf[tickDashOffset]
  
  @js.native
  sealed trait tickExtra extends StObject
  @scala.inline
  def tickExtra: tickExtra = "tickExtra".asInstanceOf[tickExtra]
  
  @js.native
  sealed trait tickMinStep extends StObject
  @scala.inline
  def tickMinStep: tickMinStep = "tickMinStep".asInstanceOf[tickMinStep]
  
  @js.native
  sealed trait tickOffset extends StObject
  @scala.inline
  def tickOffset: tickOffset = "tickOffset".asInstanceOf[tickOffset]
  
  @js.native
  sealed trait tickOpacity extends ConditionalAxisProp
  @scala.inline
  def tickOpacity: tickOpacity = "tickOpacity".asInstanceOf[tickOpacity]
  
  @js.native
  sealed trait tickRound extends StObject
  @scala.inline
  def tickRound: tickRound = "tickRound".asInstanceOf[tickRound]
  
  @js.native
  sealed trait tickSize extends ConditionalAxisProp
  @scala.inline
  def tickSize: tickSize = "tickSize".asInstanceOf[tickSize]
  
  @js.native
  sealed trait tickWidth extends ConditionalAxisProp
  @scala.inline
  def tickWidth: tickWidth = "tickWidth".asInstanceOf[tickWidth]
  
  @js.native
  sealed trait ticks
    extends AxisPart
       with BoxPlotPart
       with ErrorBarPart
  @scala.inline
  def ticks: ticks = "ticks".asInstanceOf[ticks]
  
  @js.native
  sealed trait time extends ScaleType
  @scala.inline
  def time: time = "time".asInstanceOf[time]
  
  @js.native
  sealed trait timeUnitBand extends StObject
  @scala.inline
  def timeUnitBand: timeUnitBand = "timeUnitBand".asInstanceOf[timeUnitBand]
  
  @js.native
  sealed trait timeUnitBandPosition extends StObject
  @scala.inline
  def timeUnitBandPosition: timeUnitBandPosition = "timeUnitBandPosition".asInstanceOf[timeUnitBandPosition]
  
  @js.native
  sealed trait title extends AxisPart
  @scala.inline
  def title: title = "title".asInstanceOf[title]
  
  @js.native
  sealed trait titleAlign extends StObject
  @scala.inline
  def titleAlign: titleAlign = "titleAlign".asInstanceOf[titleAlign]
  
  @js.native
  sealed trait titleAnchor extends StObject
  @scala.inline
  def titleAnchor: titleAnchor = "titleAnchor".asInstanceOf[titleAnchor]
  
  @js.native
  sealed trait titleAngle extends StObject
  @scala.inline
  def titleAngle: titleAngle = "titleAngle".asInstanceOf[titleAngle]
  
  @js.native
  sealed trait titleBaseline extends StObject
  @scala.inline
  def titleBaseline: titleBaseline = "titleBaseline".asInstanceOf[titleBaseline]
  
  @js.native
  sealed trait titleColor extends StObject
  @scala.inline
  def titleColor: titleColor = "titleColor".asInstanceOf[titleColor]
  
  @js.native
  sealed trait titleFont extends StObject
  @scala.inline
  def titleFont: titleFont = "titleFont".asInstanceOf[titleFont]
  
  @js.native
  sealed trait titleFontSize extends StObject
  @scala.inline
  def titleFontSize: titleFontSize = "titleFontSize".asInstanceOf[titleFontSize]
  
  @js.native
  sealed trait titleFontStyle extends StObject
  @scala.inline
  def titleFontStyle: titleFontStyle = "titleFontStyle".asInstanceOf[titleFontStyle]
  
  @js.native
  sealed trait titleFontWeight extends StObject
  @scala.inline
  def titleFontWeight: titleFontWeight = "titleFontWeight".asInstanceOf[titleFontWeight]
  
  @js.native
  sealed trait titleLimit extends StObject
  @scala.inline
  def titleLimit: titleLimit = "titleLimit".asInstanceOf[titleLimit]
  
  @js.native
  sealed trait titleLineHeight extends StObject
  @scala.inline
  def titleLineHeight: titleLineHeight = "titleLineHeight".asInstanceOf[titleLineHeight]
  
  @js.native
  sealed trait titleOpacity extends StObject
  @scala.inline
  def titleOpacity: titleOpacity = "titleOpacity".asInstanceOf[titleOpacity]
  
  @js.native
  sealed trait titleOrient extends StObject
  @scala.inline
  def titleOrient: titleOrient = "titleOrient".asInstanceOf[titleOrient]
  
  @js.native
  sealed trait titlePadding extends StObject
  @scala.inline
  def titlePadding: titlePadding = "titlePadding".asInstanceOf[titlePadding]
  
  @js.native
  sealed trait titleX extends StObject
  @scala.inline
  def titleX: titleX = "titleX".asInstanceOf[titleX]
  
  @js.native
  sealed trait titleY extends StObject
  @scala.inline
  def titleY: titleY = "titleY".asInstanceOf[titleY]
  
  @js.native
  sealed trait tooltip
    extends Channel
       with VgEncodeChannel
  @scala.inline
  def tooltip: tooltip = "tooltip".asInstanceOf[tooltip]
  
  @js.native
  sealed trait top extends StObject
  @scala.inline
  def top: top = "top".asInstanceOf[top]
  
  @js.native
  sealed trait `top-left` extends StObject
  @scala.inline
  def `top-left`: `top-left` = "top-left".asInstanceOf[`top-left`]
  
  @js.native
  sealed trait `top-right` extends StObject
  @scala.inline
  def `top-right`: `top-right` = "top-right".asInstanceOf[`top-right`]
  
  @js.native
  sealed trait topojson extends DataFormatType
  @scala.inline
  def topojson: topojson = "topojson".asInstanceOf[topojson]
  
  @js.native
  sealed trait trail extends Mark
  @scala.inline
  def trail: trail = "trail".asInstanceOf[trail]
  
  @js.native
  sealed trait translate extends StObject
  @scala.inline
  def translate: translate = "translate".asInstanceOf[translate]
  
  @js.native
  sealed trait transparent extends StObject
  @scala.inline
  def transparent: transparent = "transparent".asInstanceOf[transparent]
  
  @js.native
  sealed trait tsv extends DataFormatType
  @scala.inline
  def tsv: tsv = "tsv".asInstanceOf[tsv]
  
  @js.native
  sealed trait tukey extends StObject
  @scala.inline
  def tukey: tukey = "tukey".asInstanceOf[tukey]
  
  @js.native
  sealed trait `type` extends StObject
  @scala.inline
  def `type`: `type` = "type".asInstanceOf[`type`]
  
  @js.native
  sealed trait unaggregated extends _Domain
  @scala.inline
  def unaggregated: unaggregated = "unaggregated".asInstanceOf[unaggregated]
  
  @js.native
  sealed trait union extends SelectionResolution
  @scala.inline
  def union: union = "union".asInstanceOf[union]
  
  @js.native
  sealed trait unit extends SpecType
  @scala.inline
  def unit: unit = "unit".asInstanceOf[unit]
  
  @js.native
  sealed trait unselectedOpacity extends StObject
  @scala.inline
  def unselectedOpacity: unselectedOpacity = "unselectedOpacity".asInstanceOf[unselectedOpacity]
  
  @js.native
  sealed trait url
    extends Channel
       with VgEncodeChannel
  @scala.inline
  def url: url = "url".asInstanceOf[url]
  
  @js.native
  sealed trait utc extends ScaleType
  @scala.inline
  def utc: utc = "utc".asInstanceOf[utc]
  
  @js.native
  sealed trait utcdate extends UtcSingleTimeUnit
  @scala.inline
  def utcdate: utcdate = "utcdate".asInstanceOf[utcdate]
  
  @js.native
  sealed trait utcday extends UtcSingleTimeUnit
  @scala.inline
  def utcday: utcday = "utcday".asInstanceOf[utcday]
  
  @js.native
  sealed trait utcdayhours extends UtcMultiTimeUnit
  @scala.inline
  def utcdayhours: utcdayhours = "utcdayhours".asInstanceOf[utcdayhours]
  
  @js.native
  sealed trait utcdayhoursminutes extends UtcMultiTimeUnit
  @scala.inline
  def utcdayhoursminutes: utcdayhoursminutes = "utcdayhoursminutes".asInstanceOf[utcdayhoursminutes]
  
  @js.native
  sealed trait utcdayhoursminutesseconds extends UtcMultiTimeUnit
  @scala.inline
  def utcdayhoursminutesseconds: utcdayhoursminutesseconds = "utcdayhoursminutesseconds".asInstanceOf[utcdayhoursminutesseconds]
  
  @js.native
  sealed trait utcdayofyear extends UtcSingleTimeUnit
  @scala.inline
  def utcdayofyear: utcdayofyear = "utcdayofyear".asInstanceOf[utcdayofyear]
  
  @js.native
  sealed trait utchours extends UtcSingleTimeUnit
  @scala.inline
  def utchours: utchours = "utchours".asInstanceOf[utchours]
  
  @js.native
  sealed trait utchoursminutes extends UtcMultiTimeUnit
  @scala.inline
  def utchoursminutes: utchoursminutes = "utchoursminutes".asInstanceOf[utchoursminutes]
  
  @js.native
  sealed trait utchoursminutesseconds extends UtcMultiTimeUnit
  @scala.inline
  def utchoursminutesseconds: utchoursminutesseconds = "utchoursminutesseconds".asInstanceOf[utchoursminutesseconds]
  
  @js.native
  sealed trait utcmilliseconds extends UtcSingleTimeUnit
  @scala.inline
  def utcmilliseconds: utcmilliseconds = "utcmilliseconds".asInstanceOf[utcmilliseconds]
  
  @js.native
  sealed trait utcminutes extends UtcSingleTimeUnit
  @scala.inline
  def utcminutes: utcminutes = "utcminutes".asInstanceOf[utcminutes]
  
  @js.native
  sealed trait utcminutesseconds extends UtcMultiTimeUnit
  @scala.inline
  def utcminutesseconds: utcminutesseconds = "utcminutesseconds".asInstanceOf[utcminutesseconds]
  
  @js.native
  sealed trait utcmonth extends UtcSingleTimeUnit
  @scala.inline
  def utcmonth: utcmonth = "utcmonth".asInstanceOf[utcmonth]
  
  @js.native
  sealed trait utcmonthdate extends UtcMultiTimeUnit
  @scala.inline
  def utcmonthdate: utcmonthdate = "utcmonthdate".asInstanceOf[utcmonthdate]
  
  @js.native
  sealed trait utcmonthdatehours extends UtcMultiTimeUnit
  @scala.inline
  def utcmonthdatehours: utcmonthdatehours = "utcmonthdatehours".asInstanceOf[utcmonthdatehours]
  
  @js.native
  sealed trait utcmonthdatehoursminutes extends UtcMultiTimeUnit
  @scala.inline
  def utcmonthdatehoursminutes: utcmonthdatehoursminutes = "utcmonthdatehoursminutes".asInstanceOf[utcmonthdatehoursminutes]
  
  @js.native
  sealed trait utcmonthdatehoursminutesseconds extends UtcMultiTimeUnit
  @scala.inline
  def utcmonthdatehoursminutesseconds: utcmonthdatehoursminutesseconds = "utcmonthdatehoursminutesseconds".asInstanceOf[utcmonthdatehoursminutesseconds]
  
  @js.native
  sealed trait utcquarter extends UtcSingleTimeUnit
  @scala.inline
  def utcquarter: utcquarter = "utcquarter".asInstanceOf[utcquarter]
  
  @js.native
  sealed trait utcquartermonth extends UtcMultiTimeUnit
  @scala.inline
  def utcquartermonth: utcquartermonth = "utcquartermonth".asInstanceOf[utcquartermonth]
  
  @js.native
  sealed trait utcseconds extends UtcSingleTimeUnit
  @scala.inline
  def utcseconds: utcseconds = "utcseconds".asInstanceOf[utcseconds]
  
  @js.native
  sealed trait utcsecondsmilliseconds extends UtcMultiTimeUnit
  @scala.inline
  def utcsecondsmilliseconds: utcsecondsmilliseconds = "utcsecondsmilliseconds".asInstanceOf[utcsecondsmilliseconds]
  
  @js.native
  sealed trait utcweek extends UtcSingleTimeUnit
  @scala.inline
  def utcweek: utcweek = "utcweek".asInstanceOf[utcweek]
  
  @js.native
  sealed trait utcweekday extends UtcMultiTimeUnit
  @scala.inline
  def utcweekday: utcweekday = "utcweekday".asInstanceOf[utcweekday]
  
  @js.native
  sealed trait utcweekdayhoursminutes extends UtcMultiTimeUnit
  @scala.inline
  def utcweekdayhoursminutes: utcweekdayhoursminutes = "utcweekdayhoursminutes".asInstanceOf[utcweekdayhoursminutes]
  
  @js.native
  sealed trait utcweekdayhoursminutesseconds extends UtcMultiTimeUnit
  @scala.inline
  def utcweekdayhoursminutesseconds: utcweekdayhoursminutesseconds = "utcweekdayhoursminutesseconds".asInstanceOf[utcweekdayhoursminutesseconds]
  
  @js.native
  sealed trait utcweeksdayhours extends UtcMultiTimeUnit
  @scala.inline
  def utcweeksdayhours: utcweeksdayhours = "utcweeksdayhours".asInstanceOf[utcweeksdayhours]
  
  @js.native
  sealed trait utcyear extends UtcSingleTimeUnit
  @scala.inline
  def utcyear: utcyear = "utcyear".asInstanceOf[utcyear]
  
  @js.native
  sealed trait utcyeardayofyear extends UtcMultiTimeUnit
  @scala.inline
  def utcyeardayofyear: utcyeardayofyear = "utcyeardayofyear".asInstanceOf[utcyeardayofyear]
  
  @js.native
  sealed trait utcyearmonth extends UtcMultiTimeUnit
  @scala.inline
  def utcyearmonth: utcyearmonth = "utcyearmonth".asInstanceOf[utcyearmonth]
  
  @js.native
  sealed trait utcyearmonthdate extends UtcMultiTimeUnit
  @scala.inline
  def utcyearmonthdate: utcyearmonthdate = "utcyearmonthdate".asInstanceOf[utcyearmonthdate]
  
  @js.native
  sealed trait utcyearmonthdatehours extends UtcMultiTimeUnit
  @scala.inline
  def utcyearmonthdatehours: utcyearmonthdatehours = "utcyearmonthdatehours".asInstanceOf[utcyearmonthdatehours]
  
  @js.native
  sealed trait utcyearmonthdatehoursminutes extends UtcMultiTimeUnit
  @scala.inline
  def utcyearmonthdatehoursminutes: utcyearmonthdatehoursminutes = "utcyearmonthdatehoursminutes".asInstanceOf[utcyearmonthdatehoursminutes]
  
  @js.native
  sealed trait utcyearmonthdatehoursminutesseconds extends UtcMultiTimeUnit
  @scala.inline
  def utcyearmonthdatehoursminutesseconds: utcyearmonthdatehoursminutesseconds = "utcyearmonthdatehoursminutesseconds".asInstanceOf[utcyearmonthdatehoursminutesseconds]
  
  @js.native
  sealed trait utcyearquarter extends UtcMultiTimeUnit
  @scala.inline
  def utcyearquarter: utcyearquarter = "utcyearquarter".asInstanceOf[utcyearquarter]
  
  @js.native
  sealed trait utcyearquartermonth extends UtcMultiTimeUnit
  @scala.inline
  def utcyearquartermonth: utcyearquartermonth = "utcyearquartermonth".asInstanceOf[utcyearquartermonth]
  
  @js.native
  sealed trait utcyearweek extends UtcMultiTimeUnit
  @scala.inline
  def utcyearweek: utcyearweek = "utcyearweek".asInstanceOf[utcyearweek]
  
  @js.native
  sealed trait utcyearweekday extends UtcMultiTimeUnit
  @scala.inline
  def utcyearweekday: utcyearweekday = "utcyearweekday".asInstanceOf[utcyearweekday]
  
  @js.native
  sealed trait utcyearweekdayhours extends UtcMultiTimeUnit
  @scala.inline
  def utcyearweekdayhours: utcyearweekdayhours = "utcyearweekdayhours".asInstanceOf[utcyearweekdayhours]
  
  @js.native
  sealed trait utcyearweekdayhoursminutes extends UtcMultiTimeUnit
  @scala.inline
  def utcyearweekdayhoursminutes: utcyearweekdayhoursminutes = "utcyearweekdayhoursminutes".asInstanceOf[utcyearweekdayhoursminutes]
  
  @js.native
  sealed trait utcyearweekdayhoursminutesseconds extends UtcMultiTimeUnit
  @scala.inline
  def utcyearweekdayhoursminutesseconds: utcyearweekdayhoursminutesseconds = "utcyearweekdayhoursminutesseconds".asInstanceOf[utcyearweekdayhoursminutesseconds]
  
  @js.native
  sealed trait valid
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def valid: valid = "valid".asInstanceOf[valid]
  
  @js.native
  sealed trait values
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def values: values = "values".asInstanceOf[values]
  
  @js.native
  sealed trait variance
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def variance: variance = "variance".asInstanceOf[variance]
  
  @js.native
  sealed trait variancep
    extends Aggregate
       with NonArgAggregateOp
  @scala.inline
  def variancep: variancep = "variancep".asInstanceOf[variancep]
  
  @js.native
  sealed trait verbal extends StObject
  @scala.inline
  def verbal: verbal = "verbal".asInstanceOf[verbal]
  
  @js.native
  sealed trait week
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def week: week = "week".asInstanceOf[week]
  
  @js.native
  sealed trait weekday extends LocalMultiTimeUnit
  @scala.inline
  def weekday: weekday = "weekday".asInstanceOf[weekday]
  
  @js.native
  sealed trait weekdayhoursminutes extends LocalMultiTimeUnit
  @scala.inline
  def weekdayhoursminutes: weekdayhoursminutes = "weekdayhoursminutes".asInstanceOf[weekdayhoursminutes]
  
  @js.native
  sealed trait weekdayhoursminutesseconds extends LocalMultiTimeUnit
  @scala.inline
  def weekdayhoursminutesseconds: weekdayhoursminutesseconds = "weekdayhoursminutesseconds".asInstanceOf[weekdayhoursminutesseconds]
  
  @js.native
  sealed trait weeksdayhours extends LocalMultiTimeUnit
  @scala.inline
  def weeksdayhours: weeksdayhours = "weeksdayhours".asInstanceOf[weeksdayhours]
  
  @js.native
  sealed trait width
    extends LayoutSizeType
       with VgEncodeChannel
  @scala.inline
  def width: width = "width".asInstanceOf[width]
  
  @js.native
  sealed trait x
    extends SortByChannel
       with Channel
       with PositionChannel
       with PositionScaleChannel
       with VgEncodeChannel
       with _MainChannelOf[js.Any]
  @scala.inline
  def x: x = "x".asInstanceOf[x]
  
  @js.native
  sealed trait x2
    extends Channel
       with PositionChannel
       with SecondaryRangeChannel
       with VgEncodeChannel
       with _SecondaryChannelOf[js.Any]
  @scala.inline
  def x2: x2 = "x2".asInstanceOf[x2]
  
  @js.native
  sealed trait x2Offset extends StObject
  @scala.inline
  def x2Offset: x2Offset = "x2Offset".asInstanceOf[x2Offset]
  
  @js.native
  sealed trait xOffset extends StObject
  @scala.inline
  def xOffset: xOffset = "xOffset".asInstanceOf[xOffset]
  
  @js.native
  sealed trait xc extends VgEncodeChannel
  @scala.inline
  def xc: xc = "xc".asInstanceOf[xc]
  
  @js.native
  sealed trait y
    extends SortByChannel
       with Channel
       with PositionChannel
       with PositionScaleChannel
       with VgEncodeChannel
       with _MainChannelOf[js.Any]
  @scala.inline
  def y: y = "y".asInstanceOf[y]
  
  @js.native
  sealed trait y2
    extends Channel
       with PositionChannel
       with SecondaryRangeChannel
       with VgEncodeChannel
       with _SecondaryChannelOf[js.Any]
  @scala.inline
  def y2: y2 = "y2".asInstanceOf[y2]
  
  @js.native
  sealed trait y2Offset extends StObject
  @scala.inline
  def y2Offset: y2Offset = "y2Offset".asInstanceOf[y2Offset]
  
  @js.native
  sealed trait yOffset extends StObject
  @scala.inline
  def yOffset: yOffset = "yOffset".asInstanceOf[yOffset]
  
  @js.native
  sealed trait yc extends VgEncodeChannel
  @scala.inline
  def yc: yc = "yc".asInstanceOf[yc]
  
  @js.native
  sealed trait year
    extends LocalSingleTimeUnit
       with TimeUnitFormat
  @scala.inline
  def year: year = "year".asInstanceOf[year]
  
  @js.native
  sealed trait `year-month` extends TimeUnitFormat
  @scala.inline
  def `year-month`: `year-month` = "year-month".asInstanceOf[`year-month`]
  
  @js.native
  sealed trait `year-month-date` extends TimeUnitFormat
  @scala.inline
  def `year-month-date`: `year-month-date` = "year-month-date".asInstanceOf[`year-month-date`]
  
  @js.native
  sealed trait yeardayofyear extends LocalMultiTimeUnit
  @scala.inline
  def yeardayofyear: yeardayofyear = "yeardayofyear".asInstanceOf[yeardayofyear]
  
  @js.native
  sealed trait yearmonth extends LocalMultiTimeUnit
  @scala.inline
  def yearmonth: yearmonth = "yearmonth".asInstanceOf[yearmonth]
  
  @js.native
  sealed trait yearmonthdate extends LocalMultiTimeUnit
  @scala.inline
  def yearmonthdate: yearmonthdate = "yearmonthdate".asInstanceOf[yearmonthdate]
  
  @js.native
  sealed trait yearmonthdatehours extends LocalMultiTimeUnit
  @scala.inline
  def yearmonthdatehours: yearmonthdatehours = "yearmonthdatehours".asInstanceOf[yearmonthdatehours]
  
  @js.native
  sealed trait yearmonthdatehoursminutes extends LocalMultiTimeUnit
  @scala.inline
  def yearmonthdatehoursminutes: yearmonthdatehoursminutes = "yearmonthdatehoursminutes".asInstanceOf[yearmonthdatehoursminutes]
  
  @js.native
  sealed trait yearmonthdatehoursminutesseconds extends LocalMultiTimeUnit
  @scala.inline
  def yearmonthdatehoursminutesseconds: yearmonthdatehoursminutesseconds = "yearmonthdatehoursminutesseconds".asInstanceOf[yearmonthdatehoursminutesseconds]
  
  @js.native
  sealed trait yearquarter extends LocalMultiTimeUnit
  @scala.inline
  def yearquarter: yearquarter = "yearquarter".asInstanceOf[yearquarter]
  
  @js.native
  sealed trait yearquartermonth extends LocalMultiTimeUnit
  @scala.inline
  def yearquartermonth: yearquartermonth = "yearquartermonth".asInstanceOf[yearquartermonth]
  
  @js.native
  sealed trait yearweek extends LocalMultiTimeUnit
  @scala.inline
  def yearweek: yearweek = "yearweek".asInstanceOf[yearweek]
  
  @js.native
  sealed trait yearweekday extends LocalMultiTimeUnit
  @scala.inline
  def yearweekday: yearweekday = "yearweekday".asInstanceOf[yearweekday]
  
  @js.native
  sealed trait yearweekdayhours extends LocalMultiTimeUnit
  @scala.inline
  def yearweekdayhours: yearweekdayhours = "yearweekdayhours".asInstanceOf[yearweekdayhours]
  
  @js.native
  sealed trait yearweekdayhoursminutes extends LocalMultiTimeUnit
  @scala.inline
  def yearweekdayhoursminutes: yearweekdayhoursminutes = "yearweekdayhoursminutes".asInstanceOf[yearweekdayhoursminutes]
  
  @js.native
  sealed trait yearweekdayhoursminutesseconds extends LocalMultiTimeUnit
  @scala.inline
  def yearweekdayhoursminutesseconds: yearweekdayhoursminutesseconds = "yearweekdayhoursminutesseconds".asInstanceOf[yearweekdayhoursminutesseconds]
  
  @js.native
  sealed trait zero extends StackOffset
  @scala.inline
  def zero: zero = "zero".asInstanceOf[zero]
  
  @js.native
  sealed trait zeroOrMax extends StObject
  @scala.inline
  def zeroOrMax: zeroOrMax = "zeroOrMax".asInstanceOf[zeroOrMax]
  
  @js.native
  sealed trait zeroOrMin extends StObject
  @scala.inline
  def zeroOrMin: zeroOrMin = "zeroOrMin".asInstanceOf[zeroOrMin]
  
  @js.native
  sealed trait zindex extends StObject
  @scala.inline
  def zindex: zindex = "zindex".asInstanceOf[zindex]
}
