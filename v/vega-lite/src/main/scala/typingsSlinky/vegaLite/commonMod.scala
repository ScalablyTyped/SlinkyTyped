package typingsSlinky.vegaLite

import typingsSlinky.std.Exclude
import typingsSlinky.vegaLite.anon.ExplicitValue
import typingsSlinky.vegaLite.anon.IgnoreVgConfig
import typingsSlinky.vegaLite.anon.PartialRecordVgEncodeChan
import typingsSlinky.vegaLite.anon.Value
import typingsSlinky.vegaLite.anon.VgChannel
import typingsSlinky.vegaLite.axisMod.ConditionalAxisProperty
import typingsSlinky.vegaLite.binMod.Bin
import typingsSlinky.vegaLite.binMod.BinParams
import typingsSlinky.vegaLite.channeldefMod.ConditionalPredicate
import typingsSlinky.vegaLite.channeldefMod.DatumDef
import typingsSlinky.vegaLite.channeldefMod.FieldDef
import typingsSlinky.vegaLite.channeldefMod.FieldDefBase
import typingsSlinky.vegaLite.channeldefMod.FieldRefOption
import typingsSlinky.vegaLite.channeldefMod.OrderFieldDef
import typingsSlinky.vegaLite.channeldefMod.PrimitiveValue
import typingsSlinky.vegaLite.channeldefMod.ValueDef
import typingsSlinky.vegaLite.datetimeMod.DateTime
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.sortMod.SortFields
import typingsSlinky.vegaLite.splitMod.Explicit
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcConfigMod.StyleConfigIndex
import typingsSlinky.vegaLite.srcMarkMod.Hide
import typingsSlinky.vegaLite.srcMarkMod.Mark
import typingsSlinky.vegaLite.srcMarkMod.MarkDef
import typingsSlinky.vegaLite.srcMarkMod.OverlayMarkDef
import typingsSlinky.vegaLite.srcMarkMod.TooltipContent
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteStrings.`type`
import typingsSlinky.vegaLite.vegaLiteStrings.align
import typingsSlinky.vegaLite.vegaLiteStrings.angle
import typingsSlinky.vegaLite.vegaLiteStrings.aria
import typingsSlinky.vegaLite.vegaLiteStrings.ariaRole
import typingsSlinky.vegaLite.vegaLiteStrings.ariaRoleDescription
import typingsSlinky.vegaLite.vegaLiteStrings.aspect
import typingsSlinky.vegaLite.vegaLiteStrings.bandPosition
import typingsSlinky.vegaLite.vegaLiteStrings.bandSize
import typingsSlinky.vegaLite.vegaLiteStrings.baseline
import typingsSlinky.vegaLite.vegaLiteStrings.binSpacing
import typingsSlinky.vegaLite.vegaLiteStrings.binned
import typingsSlinky.vegaLite.vegaLiteStrings.blend
import typingsSlinky.vegaLite.vegaLiteStrings.clip
import typingsSlinky.vegaLite.vegaLiteStrings.color
import typingsSlinky.vegaLite.vegaLiteStrings.continuousBandSize
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadius
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusBottomRight
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusEnd
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusTopLeft
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusTopRight
import typingsSlinky.vegaLite.vegaLiteStrings.cursor
import typingsSlinky.vegaLite.vegaLiteStrings.description
import typingsSlinky.vegaLite.vegaLiteStrings.dir
import typingsSlinky.vegaLite.vegaLiteStrings.disable
import typingsSlinky.vegaLite.vegaLiteStrings.discreteBandSize
import typingsSlinky.vegaLite.vegaLiteStrings.domain
import typingsSlinky.vegaLite.vegaLiteStrings.domainCap
import typingsSlinky.vegaLite.vegaLiteStrings.domainColor
import typingsSlinky.vegaLite.vegaLiteStrings.domainDash
import typingsSlinky.vegaLite.vegaLiteStrings.domainDashOffset
import typingsSlinky.vegaLite.vegaLiteStrings.domainOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.domainWidth
import typingsSlinky.vegaLite.vegaLiteStrings.dx
import typingsSlinky.vegaLite.vegaLiteStrings.dy
import typingsSlinky.vegaLite.vegaLiteStrings.ellipsis
import typingsSlinky.vegaLite.vegaLiteStrings.endAngle
import typingsSlinky.vegaLite.vegaLiteStrings.fill
import typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.filled
import typingsSlinky.vegaLite.vegaLiteStrings.filter
import typingsSlinky.vegaLite.vegaLiteStrings.font
import typingsSlinky.vegaLite.vegaLiteStrings.fontSize
import typingsSlinky.vegaLite.vegaLiteStrings.fontStyle
import typingsSlinky.vegaLite.vegaLiteStrings.fontWeight
import typingsSlinky.vegaLite.vegaLiteStrings.format
import typingsSlinky.vegaLite.vegaLiteStrings.formatType
import typingsSlinky.vegaLite.vegaLiteStrings.grid
import typingsSlinky.vegaLite.vegaLiteStrings.gridCap
import typingsSlinky.vegaLite.vegaLiteStrings.gridColor
import typingsSlinky.vegaLite.vegaLiteStrings.gridDash
import typingsSlinky.vegaLite.vegaLiteStrings.gridDashOffset
import typingsSlinky.vegaLite.vegaLiteStrings.gridOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.gridWidth
import typingsSlinky.vegaLite.vegaLiteStrings.height
import typingsSlinky.vegaLite.vegaLiteStrings.href
import typingsSlinky.vegaLite.vegaLiteStrings.innerRadius
import typingsSlinky.vegaLite.vegaLiteStrings.interpolate
import typingsSlinky.vegaLite.vegaLiteStrings.invalid
import typingsSlinky.vegaLite.vegaLiteStrings.labelAlign
import typingsSlinky.vegaLite.vegaLiteStrings.labelAngle
import typingsSlinky.vegaLite.vegaLiteStrings.labelBaseline
import typingsSlinky.vegaLite.vegaLiteStrings.labelBound
import typingsSlinky.vegaLite.vegaLiteStrings.labelColor
import typingsSlinky.vegaLite.vegaLiteStrings.labelExpr
import typingsSlinky.vegaLite.vegaLiteStrings.labelFlush
import typingsSlinky.vegaLite.vegaLiteStrings.labelFlushOffset
import typingsSlinky.vegaLite.vegaLiteStrings.labelFont
import typingsSlinky.vegaLite.vegaLiteStrings.labelFontSize
import typingsSlinky.vegaLite.vegaLiteStrings.labelFontStyle
import typingsSlinky.vegaLite.vegaLiteStrings.labelFontWeight
import typingsSlinky.vegaLite.vegaLiteStrings.labelLimit
import typingsSlinky.vegaLite.vegaLiteStrings.labelLineHeight
import typingsSlinky.vegaLite.vegaLiteStrings.labelOffset
import typingsSlinky.vegaLite.vegaLiteStrings.labelOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.labelOverlap
import typingsSlinky.vegaLite.vegaLiteStrings.labelPadding
import typingsSlinky.vegaLite.vegaLiteStrings.labelSeparation
import typingsSlinky.vegaLite.vegaLiteStrings.labels
import typingsSlinky.vegaLite.vegaLiteStrings.limit
import typingsSlinky.vegaLite.vegaLiteStrings.line
import typingsSlinky.vegaLite.vegaLiteStrings.lineBreak
import typingsSlinky.vegaLite.vegaLiteStrings.lineHeight
import typingsSlinky.vegaLite.vegaLiteStrings.maxExtent
import typingsSlinky.vegaLite.vegaLiteStrings.minExtent
import typingsSlinky.vegaLite.vegaLiteStrings.offset
import typingsSlinky.vegaLite.vegaLiteStrings.opacity
import typingsSlinky.vegaLite.vegaLiteStrings.order
import typingsSlinky.vegaLite.vegaLiteStrings.orient
import typingsSlinky.vegaLite.vegaLiteStrings.outerRadius
import typingsSlinky.vegaLite.vegaLiteStrings.padAngle
import typingsSlinky.vegaLite.vegaLiteStrings.point
import typingsSlinky.vegaLite.vegaLiteStrings.position
import typingsSlinky.vegaLite.vegaLiteStrings.radius
import typingsSlinky.vegaLite.vegaLiteStrings.radius2
import typingsSlinky.vegaLite.vegaLiteStrings.radius2Offset
import typingsSlinky.vegaLite.vegaLiteStrings.radiusOffset
import typingsSlinky.vegaLite.vegaLiteStrings.shape
import typingsSlinky.vegaLite.vegaLiteStrings.size
import typingsSlinky.vegaLite.vegaLiteStrings.smooth
import typingsSlinky.vegaLite.vegaLiteStrings.startAngle
import typingsSlinky.vegaLite.vegaLiteStrings.stroke
import typingsSlinky.vegaLite.vegaLiteStrings.strokeCap
import typingsSlinky.vegaLite.vegaLiteStrings.strokeDash
import typingsSlinky.vegaLite.vegaLiteStrings.strokeDashOffset
import typingsSlinky.vegaLite.vegaLiteStrings.strokeJoin
import typingsSlinky.vegaLite.vegaLiteStrings.strokeMiterLimit
import typingsSlinky.vegaLite.vegaLiteStrings.strokeOffset
import typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth
import typingsSlinky.vegaLite.vegaLiteStrings.style
import typingsSlinky.vegaLite.vegaLiteStrings.tension
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.theta
import typingsSlinky.vegaLite.vegaLiteStrings.theta2
import typingsSlinky.vegaLite.vegaLiteStrings.theta2Offset
import typingsSlinky.vegaLite.vegaLiteStrings.thetaOffset
import typingsSlinky.vegaLite.vegaLiteStrings.thickness
import typingsSlinky.vegaLite.vegaLiteStrings.tickBand
import typingsSlinky.vegaLite.vegaLiteStrings.tickCap
import typingsSlinky.vegaLite.vegaLiteStrings.tickColor
import typingsSlinky.vegaLite.vegaLiteStrings.tickCount
import typingsSlinky.vegaLite.vegaLiteStrings.tickDash
import typingsSlinky.vegaLite.vegaLiteStrings.tickDashOffset
import typingsSlinky.vegaLite.vegaLiteStrings.tickExtra
import typingsSlinky.vegaLite.vegaLiteStrings.tickMinStep
import typingsSlinky.vegaLite.vegaLiteStrings.tickOffset
import typingsSlinky.vegaLite.vegaLiteStrings.tickOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.tickRound
import typingsSlinky.vegaLite.vegaLiteStrings.tickSize
import typingsSlinky.vegaLite.vegaLiteStrings.tickWidth
import typingsSlinky.vegaLite.vegaLiteStrings.ticks
import typingsSlinky.vegaLite.vegaLiteStrings.timeUnitBand
import typingsSlinky.vegaLite.vegaLiteStrings.timeUnitBandPosition
import typingsSlinky.vegaLite.vegaLiteStrings.title
import typingsSlinky.vegaLite.vegaLiteStrings.titleAlign
import typingsSlinky.vegaLite.vegaLiteStrings.titleAnchor
import typingsSlinky.vegaLite.vegaLiteStrings.titleAngle
import typingsSlinky.vegaLite.vegaLiteStrings.titleBaseline
import typingsSlinky.vegaLite.vegaLiteStrings.titleColor
import typingsSlinky.vegaLite.vegaLiteStrings.titleFont
import typingsSlinky.vegaLite.vegaLiteStrings.titleFontSize
import typingsSlinky.vegaLite.vegaLiteStrings.titleFontStyle
import typingsSlinky.vegaLite.vegaLiteStrings.titleFontWeight
import typingsSlinky.vegaLite.vegaLiteStrings.titleLimit
import typingsSlinky.vegaLite.vegaLiteStrings.titleLineHeight
import typingsSlinky.vegaLite.vegaLiteStrings.titleOpacity
import typingsSlinky.vegaLite.vegaLiteStrings.titlePadding
import typingsSlinky.vegaLite.vegaLiteStrings.titleX
import typingsSlinky.vegaLite.vegaLiteStrings.titleY
import typingsSlinky.vegaLite.vegaLiteStrings.tooltip
import typingsSlinky.vegaLite.vegaLiteStrings.translate
import typingsSlinky.vegaLite.vegaLiteStrings.transparent
import typingsSlinky.vegaLite.vegaLiteStrings.url
import typingsSlinky.vegaLite.vegaLiteStrings.values
import typingsSlinky.vegaLite.vegaLiteStrings.width
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.x2
import typingsSlinky.vegaLite.vegaLiteStrings.x2Offset
import typingsSlinky.vegaLite.vegaLiteStrings.xOffset
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaLite.vegaLiteStrings.y2
import typingsSlinky.vegaLite.vegaLiteStrings.y2Offset
import typingsSlinky.vegaLite.vegaLiteStrings.yOffset
import typingsSlinky.vegaLite.vegaLiteStrings.zindex
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeEntry
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import typingsSlinky.vegaTypings.colorMod.Color
import typingsSlinky.vegaTypings.configMod.Cursor
import typingsSlinky.vegaTypings.configMod.StrokeCap
import typingsSlinky.vegaTypings.configMod.StrokeJoin
import typingsSlinky.vegaTypings.dataMod.URI
import typingsSlinky.vegaTypings.encodeMod.Align
import typingsSlinky.vegaTypings.encodeMod.Blend
import typingsSlinky.vegaTypings.encodeMod.ColorValueRef
import typingsSlinky.vegaTypings.encodeMod.FontStyle
import typingsSlinky.vegaTypings.encodeMod.FontWeight
import typingsSlinky.vegaTypings.encodeMod.Gradient
import typingsSlinky.vegaTypings.encodeMod.Interpolate
import typingsSlinky.vegaTypings.encodeMod.NumericValueRef
import typingsSlinky.vegaTypings.encodeMod.Orientation
import typingsSlinky.vegaTypings.encodeMod.ScaledValueRef
import typingsSlinky.vegaTypings.encodeMod.SymbolShape
import typingsSlinky.vegaTypings.encodeMod.Text
import typingsSlinky.vegaTypings.encodeMod.TextBaseline
import typingsSlinky.vegaTypings.encodeMod.TextDirection
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object commonMod {
  
  @JSImport("vega-lite/build/src/compile/common", "BIN_RANGE_DELIMITER")
  @js.native
  val BIN_RANGE_DELIMITER: /* " \\u2013 " */ String = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "applyMarkConfig")
  @js.native
  def applyMarkConfig(
    e: VgEncodeEntry,
    model: UnitModel,
    propsList: js.Array[
      /* keyof vega-lite.vega-lite/build/src/mark.MarkConfig<any> */ /* import warning: LimitUnionLength.leaveTypeRef Was union type with length 69 */ js.Any
    ]
  ): PartialRecordVgEncodeChan = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "conditionalSignalRefOrValue")
  @js.native
  def conditionalSignalRefOrValue[T /* <: (FieldDef[_, _]) | (DatumDef[String, PrimitiveValue | DateTime | ExprRef | SignalRef]) | ValueDef[_] */](value: ConditionalPredicate[T | typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef]): ConditionalPredicate[T | SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "exprFromValueOrSignalRef")
  @js.native
  def exprFromValueOrSignalRef(ref: VgValueRef): String = js.native
  @JSImport("vega-lite/build/src/compile/common", "exprFromValueOrSignalRef")
  @js.native
  def exprFromValueOrSignalRef(ref: SignalRef): String = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_align[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: align, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Align | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_align[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: align, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Align | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_angle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: angle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_angle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: angle, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_aria[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aria, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_aria[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aria, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_ariaRole[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ariaRole, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_ariaRole[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ariaRole, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_ariaRoleDescription[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ariaRoleDescription, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_ariaRoleDescription[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: ariaRoleDescription,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_aspect[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aspect, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_aspect[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aspect, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_bandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: bandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_bandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: bandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_baseline[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: baseline, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[TextBaseline | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_baseline[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: baseline, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[TextBaseline | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_binSpacing[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: binSpacing, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_binSpacing[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: binSpacing, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_blend[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: blend, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[Blend], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_blend[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: blend, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[js.UndefOr[Blend], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_clip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: clip, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_clip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: clip, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_color[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: color, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Color | Gradient | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_color[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: color, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Color | Gradient | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_continuousBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: continuousBandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_continuousBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: continuousBandSize,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusBottomLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusBottomLeft, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusBottomLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusBottomLeft,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusBottomRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusBottomRight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusBottomRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusBottomRight,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusEnd[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusEnd, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusEnd[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusEnd,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusTopLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusTopLeft, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusTopLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusTopLeft,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusTopRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusTopRight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cornerRadiusTopRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusTopRight,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cursor[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cursor, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Cursor | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_cursor[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cursor, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Cursor | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_description[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: description, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_description[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: description, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_dir[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dir, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[TextDirection | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_dir[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dir, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[TextDirection | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_discreteBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: discreteBandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_discreteBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: discreteBandSize,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_dx[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dx, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_dx[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dx, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_dy[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dy, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_dy[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dy, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_ellipsis[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ellipsis, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_ellipsis[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ellipsis, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_endAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: endAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_endAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: endAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fill[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fill, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fill[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fill, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fillOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fillOpacity, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fillOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fillOpacity, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_filled[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: filled, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_filled[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: filled, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_font[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: font, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_font[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: font, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fontSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fontSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontSize, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fontStyle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontStyle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[FontStyle | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fontStyle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontStyle, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[FontStyle | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fontWeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontWeight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[FontWeight | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_fontWeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontWeight, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[FontWeight | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_height[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: height, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_height[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: height, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_href[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: href, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_href[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: href, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_innerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: innerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_innerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: innerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_interpolate[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: interpolate, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Interpolate | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_interpolate[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: interpolate, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Interpolate | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_invalid[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: invalid, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[filter | Hide | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_invalid[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: invalid, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[filter | Hide | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_limit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: limit, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_limit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: limit, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_line[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: line, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_line[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: line, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_lineBreak[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineBreak, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_lineBreak[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineBreak, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_lineHeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineHeight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_lineHeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineHeight, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_opacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: opacity, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_opacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: opacity, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_order[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: order, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Null | Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_order[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: order, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Null | Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_orient[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: orient, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Orientation] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_orient[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: orient, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Orientation] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_outerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: outerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_outerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: outerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_padAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: padAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_padAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: padAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_point[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: point, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean | OverlayMarkDef[ES] | transparent] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_point[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: point, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Boolean | OverlayMarkDef[ES] | transparent] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radius2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radius2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius2, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radius2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radius2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: radius2Offset,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radiusOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radiusOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_radiusOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radiusOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_shape[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: shape, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[SymbolShape | String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_shape[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: shape, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[SymbolShape | String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_size[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: size, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_size[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: size, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_smooth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: smooth, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_smooth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: smooth, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_startAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: startAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_startAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: startAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_stroke[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: stroke, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_stroke[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: stroke, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeCap[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeCap, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeCap[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeCap, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeDash[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeDash, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeDash[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeDash, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeDashOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeDashOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeDashOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: strokeDashOffset,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeJoin[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeJoin, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeJoin[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeJoin, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeMiterLimit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeMiterLimit, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeMiterLimit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: strokeMiterLimit,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeOpacity, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: strokeOpacity,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeWidth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeWidth, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_strokeWidth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeWidth, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_style[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: style, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[String | js.Array[String]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_style[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: style, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[String | js.Array[String]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_tension[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tension, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_tension[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tension, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_text[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: text, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[Text | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_text[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: text, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[js.UndefOr[Text | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_theta[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_theta[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_theta2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_theta2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_theta2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_theta2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_thetaOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thetaOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_thetaOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thetaOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_thickness[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thickness, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_thickness[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thickness, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_timeUnitBand[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: timeUnitBand, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_timeUnitBand[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: timeUnitBand, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_timeUnitBandPosition[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: timeUnitBandPosition, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_timeUnitBandPosition[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: timeUnitBandPosition,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    hasVgChannel: VgChannel
  ): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_tooltip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tooltip, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_tooltip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tooltip, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_type[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: `type`, mark: MarkDef[Mark, ES], config: Config[SignalRef]): Mark = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_type[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: `type`, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): Mark = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_url[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: url, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_url[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: url, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_width[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: width, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_width[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: width, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_x[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_x[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_x2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_x2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_x2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_x2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_xOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: xOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_xOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: xOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_y[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_y[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_y2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_y2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_y2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_y2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_yOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: yOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkConfig")
  @js.native
  def getMarkConfig_yOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: yOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], hasVgChannel: VgChannel): js.UndefOr[Double | ES] = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_align[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: align, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Align | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_align[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: align, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Align | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_angle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: angle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_angle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: angle, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_aria[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aria, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_aria[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aria, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_ariaRole[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ariaRole, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_ariaRole[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ariaRole, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_ariaRoleDescription[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ariaRoleDescription, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_ariaRoleDescription[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: ariaRoleDescription,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    opt: IgnoreVgConfig
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_aspect[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aspect, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_aspect[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: aspect, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_bandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: bandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_bandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: bandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_baseline[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: baseline, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[TextBaseline | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_baseline[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: baseline, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[TextBaseline | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_binSpacing[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: binSpacing, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_binSpacing[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: binSpacing, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_blend[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: blend, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[Blend], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_blend[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: blend, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[js.UndefOr[Blend], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_clip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: clip, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_clip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: clip, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_color[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: color, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Color | Gradient | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_color[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: color, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Color | Gradient | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_continuousBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: continuousBandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_continuousBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: continuousBandSize,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    opt: IgnoreVgConfig
  ): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusBottomLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusBottomLeft, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusBottomLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusBottomLeft,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    opt: IgnoreVgConfig
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusBottomRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusBottomRight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusBottomRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusBottomRight,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    opt: IgnoreVgConfig
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusEnd[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusEnd, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusEnd[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusEnd, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusTopLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusTopLeft, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusTopLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusTopLeft,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    opt: IgnoreVgConfig
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusTopRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cornerRadiusTopRight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cornerRadiusTopRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: cornerRadiusTopRight,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    opt: IgnoreVgConfig
  ): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cursor[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cursor, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Cursor | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_cursor[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: cursor, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Cursor | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_description[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: description, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_description[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: description, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_dir[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dir, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[TextDirection | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_dir[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dir, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[TextDirection | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_discreteBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: discreteBandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_discreteBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: discreteBandSize, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_dx[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dx, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_dx[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dx, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_dy[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dy, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_dy[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: dy, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_ellipsis[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ellipsis, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_ellipsis[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: ellipsis, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[js.UndefOr[String], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_endAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: endAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_endAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: endAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fill[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fill, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fill[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fill, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fillOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fillOpacity, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fillOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fillOpacity, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_filled[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: filled, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_filled[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: filled, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_font[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: font, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_font[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: font, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fontSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontSize, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fontSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontSize, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fontStyle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontStyle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[FontStyle | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fontStyle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontStyle, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[FontStyle | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fontWeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontWeight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[FontWeight | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_fontWeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: fontWeight, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[FontWeight | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_height[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: height, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_height[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: height, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_href[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: href, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_href[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: href, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_innerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: innerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_innerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: innerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_interpolate[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: interpolate, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Interpolate | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_interpolate[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: interpolate, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Interpolate | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_invalid[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: invalid, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[filter | Hide | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_invalid[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: invalid, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[filter | Hide | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_limit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: limit, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_limit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: limit, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_line[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: line, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_line[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: line, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Boolean | OverlayMarkDef[ES]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_lineBreak[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineBreak, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_lineBreak[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineBreak, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_lineHeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineHeight, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_lineHeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: lineHeight, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_opacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: opacity, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_opacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: opacity, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_order[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: order, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Null | Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_order[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: order, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Null | Boolean] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_orient[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: orient, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Orientation] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_orient[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: orient, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Orientation] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_outerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: outerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_outerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: outerRadius, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_padAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: padAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_padAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: padAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_point[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: point, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Boolean | OverlayMarkDef[ES] | transparent] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_point[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: point, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Boolean | OverlayMarkDef[ES] | transparent] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radius2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radius2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius2, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radius2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radius2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radius2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radiusOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radiusOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_radiusOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: radiusOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_shape[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: shape, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[SymbolShape | String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_shape[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: shape, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[SymbolShape | String | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_size[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: size, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_size[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: size, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_smooth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: smooth, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_smooth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: smooth, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Boolean | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_startAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: startAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_startAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: startAngle, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_stroke[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: stroke, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_stroke[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: stroke, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Color | Gradient | Null | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeCap[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeCap, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeCap[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeCap, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeCap | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeDash[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeDash, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeDash[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeDash, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[js.Array[Double] | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeDashOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeDashOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeDashOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeDashOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeJoin[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeJoin, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeJoin[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeJoin, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[StrokeJoin | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeMiterLimit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeMiterLimit, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeMiterLimit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeMiterLimit, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeOpacity, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeOpacity, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeWidth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeWidth, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_strokeWidth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: strokeWidth, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_style[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: style, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[String | js.Array[String]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_style[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: style, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[String | js.Array[String]] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_tension[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tension, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_tension[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tension, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_text[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: text, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[Text | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_text[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: text, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[js.UndefOr[Text | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_theta[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_theta[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_theta2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_theta2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_theta2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_theta2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: theta2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_thetaOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thetaOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_thetaOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thetaOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_thickness[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thickness, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_thickness[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: thickness, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | SignalRef] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_timeUnitBand[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: timeUnitBand, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_timeUnitBand[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: timeUnitBand, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_timeUnitBandPosition[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: timeUnitBandPosition, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_timeUnitBandPosition[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    channel: timeUnitBandPosition,
    mark: MarkDef[Mark, ES],
    config: Config[SignalRef],
    opt: IgnoreVgConfig
  ): js.UndefOr[Double] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_tooltip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tooltip, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_tooltip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: tooltip, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | String | Boolean | TooltipContent | ES | Null] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_type[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: `type`, mark: MarkDef[Mark, ES], config: Config[SignalRef]): Mark = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_type[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: `type`, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): Mark = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_url[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: url, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_url[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: url, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[js.UndefOr[URI | SignalRef], ScaledValueRef[_] | NumericValueRef | ColorValueRef]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_width[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: width, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_width[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: width, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[
    (Exclude[
      js.UndefOr[Double | SignalRef], 
      ScaledValueRef[_] | NumericValueRef | ColorValueRef
    ]) | ES
  ] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_x[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_x[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_x2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_x2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | width | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_x2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_x2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: x2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_xOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: xOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_xOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: xOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_y[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_y[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_y2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_y2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | height | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_y2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_y2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: y2Offset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_yOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: yOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef]): js.UndefOr[Double | ES] = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkPropOrConfig")
  @js.native
  def getMarkPropOrConfig_yOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](channel: yOffset, mark: MarkDef[Mark, ES], config: Config[SignalRef], opt: IgnoreVgConfig): js.UndefOr[Double | ES] = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_align[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: align, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_angle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: angle, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_aria[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: aria, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_ariaRole[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: ariaRole, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_ariaRoleDescription[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: ariaRoleDescription, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_aspect[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: aspect, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_bandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: bandSize, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_baseline[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: baseline, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_binSpacing[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: binSpacing, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_blend[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: blend, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_clip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: clip, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_color[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: color, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_continuousBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: continuousBandSize, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_cornerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: cornerRadius, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_cornerRadiusBottomLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    prop: cornerRadiusBottomLeft,
    mark: MarkDef[Mark, ES],
    styleConfigIndex: StyleConfigIndex[SignalRef]
  ): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_cornerRadiusBottomRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](
    prop: cornerRadiusBottomRight,
    mark: MarkDef[Mark, ES],
    styleConfigIndex: StyleConfigIndex[SignalRef]
  ): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_cornerRadiusEnd[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: cornerRadiusEnd, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_cornerRadiusTopLeft[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: cornerRadiusTopLeft, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_cornerRadiusTopRight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: cornerRadiusTopRight, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_cursor[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: cursor, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_description[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: description, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_dir[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: dir, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_discreteBandSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: discreteBandSize, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_dx[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: dx, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_dy[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: dy, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_ellipsis[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: ellipsis, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_endAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: endAngle, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_fill[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: fill, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_fillOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: fillOpacity, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_filled[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: filled, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_font[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: font, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_fontSize[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: fontSize, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_fontStyle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: fontStyle, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_fontWeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: fontWeight, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_height[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: height, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_href[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: href, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_innerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: innerRadius, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_interpolate[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: interpolate, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_invalid[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: invalid, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_limit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: limit, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_line[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: line, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_lineBreak[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: lineBreak, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_lineHeight[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: lineHeight, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_opacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: opacity, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_order[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: order, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_orient[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: orient, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_outerRadius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: outerRadius, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_padAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: padAngle, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_point[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: point, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_radius[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: radius, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_radius2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: radius2, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_radius2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: radius2Offset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_radiusOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: radiusOffset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_shape[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: shape, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_size[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: size, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_smooth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: smooth, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_startAngle[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: startAngle, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_stroke[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: stroke, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeCap[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeCap, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeDash[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeDash, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeDashOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeDashOffset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeJoin[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeJoin, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeMiterLimit[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeMiterLimit, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeOffset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeOpacity[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeOpacity, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_strokeWidth[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: strokeWidth, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_style[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: style, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_tension[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: tension, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_text[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: text, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_theta[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: theta, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_theta2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: theta2, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_theta2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: theta2Offset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_thetaOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: thetaOffset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_thickness[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: thickness, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_timeUnitBand[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: timeUnitBand, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_timeUnitBandPosition[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: timeUnitBandPosition, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_tooltip[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: tooltip, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_type[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: `type`, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_url[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: url, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_width[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: width, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_x[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: x, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_x2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: x2, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_x2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: x2Offset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_xOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: xOffset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_y[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: y, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_y2[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: y2, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_y2Offset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: y2Offset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getMarkStyleConfig")
  @js.native
  def getMarkStyleConfig_yOffset[ES /* <: typingsSlinky.vegaTypings.exprMod.ExprRef | SignalRef */](prop: yOffset, mark: MarkDef[Mark, ES], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_align(p: align, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_align(p: align, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_angle(p: angle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_angle(p: angle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_aria(p: aria, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_aria(p: aria, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ariaRole(p: ariaRole, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ariaRole(p: ariaRole, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ariaRoleDescription(p: ariaRoleDescription, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ariaRoleDescription(p: ariaRoleDescription, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_aspect(p: aspect, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_aspect(p: aspect, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_bandPosition(p: bandPosition, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_bandPosition(p: bandPosition, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_bandSize(p: bandSize, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_bandSize(p: bandSize, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_baseline(p: baseline, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_baseline(p: baseline, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_binSpacing(p: binSpacing, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_binSpacing(p: binSpacing, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_blend(p: blend, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_blend(p: blend, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_clip(p: clip, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_clip(p: clip, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_color(p: color, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_color(p: color, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_continuousBandSize(p: continuousBandSize, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_continuousBandSize(p: continuousBandSize, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadius(p: cornerRadius, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadius(p: cornerRadius, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusBottomLeft(p: cornerRadiusBottomLeft, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusBottomLeft(p: cornerRadiusBottomLeft, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusBottomRight(p: cornerRadiusBottomRight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusBottomRight(
    p: cornerRadiusBottomRight,
    styles: js.Array[String],
    styleConfigIndex: StyleConfigIndex[SignalRef]
  ): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusEnd(p: cornerRadiusEnd, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusEnd(p: cornerRadiusEnd, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusTopLeft(p: cornerRadiusTopLeft, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusTopLeft(p: cornerRadiusTopLeft, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusTopRight(p: cornerRadiusTopRight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cornerRadiusTopRight(p: cornerRadiusTopRight, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cursor(p: cursor, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_cursor(p: cursor, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_description(p: description, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_description(p: description, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_dir(p: dir, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_dir(p: dir, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_disable(p: disable, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_disable(p: disable, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_discreteBandSize(p: discreteBandSize, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_discreteBandSize(p: discreteBandSize, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domain(p: domain, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domain(p: domain, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainCap(p: domainCap, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainCap(p: domainCap, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainColor(p: domainColor, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainColor(p: domainColor, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainDash(p: domainDash, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainDash(p: domainDash, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainDashOffset(p: domainDashOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainDashOffset(p: domainDashOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainOpacity(p: domainOpacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainOpacity(p: domainOpacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainWidth(p: domainWidth, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_domainWidth(p: domainWidth, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_dx(p: dx, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_dx(p: dx, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_dy(p: dy, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_dy(p: dy, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ellipsis(p: ellipsis, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ellipsis(p: ellipsis, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_endAngle(p: endAngle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_endAngle(p: endAngle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fill(p: fill, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fill(p: fill, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fillOpacity(p: fillOpacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fillOpacity(p: fillOpacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_filled(p: filled, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_filled(p: filled, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_font(p: font, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_font(p: font, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fontSize(p: fontSize, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fontSize(p: fontSize, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fontStyle(p: fontStyle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fontStyle(p: fontStyle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fontWeight(p: fontWeight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_fontWeight(p: fontWeight, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_format(p: format, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_format(p: format, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_formatType(p: formatType, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_formatType(p: formatType, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_grid(p: grid, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_grid(p: grid, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridCap(p: gridCap, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridCap(p: gridCap, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridColor(p: gridColor, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridColor(p: gridColor, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridDash(p: gridDash, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridDash(p: gridDash, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridDashOffset(p: gridDashOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridDashOffset(p: gridDashOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridOpacity(p: gridOpacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridOpacity(p: gridOpacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridWidth(p: gridWidth, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_gridWidth(p: gridWidth, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_height(p: height, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_height(p: height, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_href(p: href, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_href(p: href, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_innerRadius(p: innerRadius, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_innerRadius(p: innerRadius, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_interpolate(p: interpolate, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_interpolate(p: interpolate, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_invalid(p: invalid, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_invalid(p: invalid, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelAlign(p: labelAlign, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelAlign(p: labelAlign, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelAngle(p: labelAngle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelAngle(p: labelAngle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelBaseline(p: labelBaseline, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelBaseline(p: labelBaseline, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelBound(p: labelBound, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelBound(p: labelBound, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelColor(p: labelColor, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelColor(p: labelColor, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelExpr(p: labelExpr, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelExpr(p: labelExpr, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFlush(p: labelFlush, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFlush(p: labelFlush, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFlushOffset(p: labelFlushOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFlushOffset(p: labelFlushOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFont(p: labelFont, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFont(p: labelFont, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFontSize(p: labelFontSize, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFontSize(p: labelFontSize, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFontStyle(p: labelFontStyle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFontStyle(p: labelFontStyle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFontWeight(p: labelFontWeight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelFontWeight(p: labelFontWeight, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelLimit(p: labelLimit, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelLimit(p: labelLimit, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelLineHeight(p: labelLineHeight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelLineHeight(p: labelLineHeight, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelOffset(p: labelOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelOffset(p: labelOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelOpacity(p: labelOpacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelOpacity(p: labelOpacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelOverlap(p: labelOverlap, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelOverlap(p: labelOverlap, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelPadding(p: labelPadding, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelPadding(p: labelPadding, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelSeparation(p: labelSeparation, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labelSeparation(p: labelSeparation, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labels(p: labels, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_labels(p: labels, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_limit(p: limit, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_limit(p: limit, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_line(p: line, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_line(p: line, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_lineBreak(p: lineBreak, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_lineBreak(p: lineBreak, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_lineHeight(p: lineHeight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_lineHeight(p: lineHeight, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_maxExtent(p: maxExtent, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_maxExtent(p: maxExtent, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_minExtent(p: minExtent, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_minExtent(p: minExtent, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_offset(p: offset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_offset(p: offset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_opacity(p: opacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_opacity(p: opacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_order(p: order, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_order(p: order, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_orient(p: orient, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_orient(p: orient, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_outerRadius(p: outerRadius, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_outerRadius(p: outerRadius, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_padAngle(p: padAngle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_padAngle(p: padAngle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_point(p: point, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_point(p: point, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_position(p: position, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_position(p: position, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radius(p: radius, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radius(p: radius, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radius2(p: radius2, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radius2(p: radius2, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radius2Offset(p: radius2Offset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radius2Offset(p: radius2Offset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radiusOffset(p: radiusOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_radiusOffset(p: radiusOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_shape(p: shape, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_shape(p: shape, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_size(p: size, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_size(p: size, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_smooth(p: smooth, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_smooth(p: smooth, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_startAngle(p: startAngle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_startAngle(p: startAngle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_stroke(p: stroke, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_stroke(p: stroke, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeCap(p: strokeCap, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeCap(p: strokeCap, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeDash(p: strokeDash, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeDash(p: strokeDash, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeDashOffset(p: strokeDashOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeDashOffset(p: strokeDashOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeJoin(p: strokeJoin, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeJoin(p: strokeJoin, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeMiterLimit(p: strokeMiterLimit, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeMiterLimit(p: strokeMiterLimit, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeOffset(p: strokeOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeOffset(p: strokeOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeOpacity(p: strokeOpacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeOpacity(p: strokeOpacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeWidth(p: strokeWidth, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_strokeWidth(p: strokeWidth, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_style(p: style, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_style(p: style, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tension(p: tension, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tension(p: tension, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_text(p: text, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_text(p: text, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_theta(p: theta, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_theta(p: theta, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_theta2(p: theta2, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_theta2(p: theta2, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_theta2Offset(p: theta2Offset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_theta2Offset(p: theta2Offset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_thetaOffset(p: thetaOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_thetaOffset(p: thetaOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_thickness(p: thickness, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_thickness(p: thickness, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickBand(p: tickBand, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickBand(p: tickBand, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickCap(p: tickCap, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickCap(p: tickCap, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickColor(p: tickColor, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickColor(p: tickColor, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickCount(p: tickCount, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickCount(p: tickCount, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickDash(p: tickDash, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickDash(p: tickDash, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickDashOffset(p: tickDashOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickDashOffset(p: tickDashOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickExtra(p: tickExtra, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickExtra(p: tickExtra, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickMinStep(p: tickMinStep, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickMinStep(p: tickMinStep, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickOffset(p: tickOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickOffset(p: tickOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickOpacity(p: tickOpacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickOpacity(p: tickOpacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickRound(p: tickRound, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickRound(p: tickRound, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickSize(p: tickSize, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickSize(p: tickSize, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickWidth(p: tickWidth, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tickWidth(p: tickWidth, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ticks(p: ticks, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_ticks(p: ticks, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_timeUnitBand(p: timeUnitBand, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_timeUnitBand(p: timeUnitBand, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_timeUnitBandPosition(p: timeUnitBandPosition, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_timeUnitBandPosition(p: timeUnitBandPosition, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_title(p: title, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_title(p: title, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleAlign(p: titleAlign, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleAlign(p: titleAlign, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleAnchor(p: titleAnchor, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleAnchor(p: titleAnchor, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleAngle(p: titleAngle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleAngle(p: titleAngle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleBaseline(p: titleBaseline, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleBaseline(p: titleBaseline, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleColor(p: titleColor, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleColor(p: titleColor, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFont(p: titleFont, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFont(p: titleFont, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFontSize(p: titleFontSize, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFontSize(p: titleFontSize, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFontStyle(p: titleFontStyle, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFontStyle(p: titleFontStyle, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFontWeight(p: titleFontWeight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleFontWeight(p: titleFontWeight, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleLimit(p: titleLimit, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleLimit(p: titleLimit, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleLineHeight(p: titleLineHeight, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleLineHeight(p: titleLineHeight, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleOpacity(p: titleOpacity, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleOpacity(p: titleOpacity, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titlePadding(p: titlePadding, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titlePadding(p: titlePadding, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleX(p: titleX, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleX(p: titleX, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleY(p: titleY, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_titleY(p: titleY, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tooltip(p: tooltip, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_tooltip(p: tooltip, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_translate(p: translate, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_translate(p: translate, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_type(p: `type`, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_type(p: `type`, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_url(p: url, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_url(p: url, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_values(p: values, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_values(p: values, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_width(p: width, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_width(p: width, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_x(p: x, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_x(p: x, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_x2(p: x2, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_x2(p: x2, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_x2Offset(p: x2Offset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_x2Offset(p: x2Offset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_xOffset(p: xOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_xOffset(p: xOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_y(p: y, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_y(p: y, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_y2(p: y2, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_y2(p: y2, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_y2Offset(p: y2Offset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_y2Offset(p: y2Offset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_yOffset(p: yOffset, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_yOffset(p: yOffset, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_zindex(p: zindex, styles: String, styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  @JSImport("vega-lite/build/src/compile/common", "getStyleConfig")
  @js.native
  def getStyleConfig_zindex(p: zindex, styles: js.Array[String], styleConfigIndex: StyleConfigIndex[SignalRef]): js.Any = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "getStyles")
  @js.native
  def getStyles(mark: MarkDef[Mark, ExprRef | SignalRef]): js.Array[String] = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "mergeTitle")
  @js.native
  def mergeTitle(title1: Text, title2: Text): String | js.Array[String] | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/common", "mergeTitle")
  @js.native
  def mergeTitle(title1: Text, title2: SignalRef): String | js.Array[String] | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/common", "mergeTitle")
  @js.native
  def mergeTitle(title1: SignalRef, title2: Text): String | js.Array[String] | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/common", "mergeTitle")
  @js.native
  def mergeTitle(title1: SignalRef, title2: SignalRef): String | js.Array[String] | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "mergeTitleComponent")
  @js.native
  def mergeTitleComponent(v1: Explicit[AxisTitleComponent], v2: Explicit[AxisTitleComponent]): typingsSlinky.vegaLite.anon.Explicit | ExplicitValue = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "mergeTitleFieldDefs")
  @js.native
  def mergeTitleFieldDefs(f1: js.Array[FieldDefBase[String, Bin]], f2: js.Array[FieldDefBase[String, Bin]]): js.Array[FieldDefBase[String, Boolean | BinParams | binned]] = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "signalOrStringValue")
  @js.native
  def signalOrStringValue(v: js.Any): String = js.native
  @JSImport("vega-lite/build/src/compile/common", "signalOrStringValue")
  @js.native
  def signalOrStringValue(v: SignalRef): String = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "signalOrValueRef")
  @js.native
  def signalOrValueRef[T](value: T): Value[T] | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/common", "signalOrValueRef")
  @js.native
  def signalOrValueRef[T](value: typingsSlinky.vegaTypings.exprMod.ExprRef): Value[T] | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/common", "signalOrValueRef")
  @js.native
  def signalOrValueRef[T](value: SignalRef): Value[T] | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "signalOrValueRefWithCondition")
  @js.native
  def signalOrValueRefWithCondition[V /* <: (typingsSlinky.vegaLite.channeldefMod.Value[ExprRef | SignalRef]) | js.Array[Double] */](`val`: ConditionalAxisProperty[V, SignalRef | typingsSlinky.vegaTypings.exprMod.ExprRef]): ConditionalAxisProperty[V, SignalRef] = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "signalRefOrValue")
  @js.native
  def signalRefOrValue[T](value: T): T | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/common", "signalRefOrValue")
  @js.native
  def signalRefOrValue[T](value: typingsSlinky.vegaTypings.exprMod.ExprRef): T | SignalRef = js.native
  @JSImport("vega-lite/build/src/compile/common", "signalRefOrValue")
  @js.native
  def signalRefOrValue[T](value: SignalRef): T | SignalRef = js.native
  
  @JSImport("vega-lite/build/src/compile/common", "sortParams")
  @js.native
  def sortParams(orderDef: js.Array[OrderFieldDef[String]]): SortFields = js.native
  @JSImport("vega-lite/build/src/compile/common", "sortParams")
  @js.native
  def sortParams(orderDef: js.Array[OrderFieldDef[String]], fieldRefOption: FieldRefOption): SortFields = js.native
  @JSImport("vega-lite/build/src/compile/common", "sortParams")
  @js.native
  def sortParams(orderDef: OrderFieldDef[String]): SortFields = js.native
  @JSImport("vega-lite/build/src/compile/common", "sortParams")
  @js.native
  def sortParams(orderDef: OrderFieldDef[String], fieldRefOption: FieldRefOption): SortFields = js.native
  
  type AxisTitleComponent = Text | (js.Array[FieldDefBase[String, Bin]]) | SignalRef
}
