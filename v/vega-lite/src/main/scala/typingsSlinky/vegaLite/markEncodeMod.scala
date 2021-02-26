package typingsSlinky.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vegaLite.anon.AriaAriaRoleDescription
import typingsSlinky.vegaLite.anon.AriaRoleDescription
import typingsSlinky.vegaLite.anon.AxisTranslate
import typingsSlinky.vegaLite.anon.Clip
import typingsSlinky.vegaLite.anon.CornerRadius
import typingsSlinky.vegaLite.anon.CornerRadiusBottomLeft
import typingsSlinky.vegaLite.anon.CornerRadiusBottomRight
import typingsSlinky.vegaLite.anon.CornerRadiusTopLeft
import typingsSlinky.vegaLite.anon.CornerRadiusTopRight
import typingsSlinky.vegaLite.anon.Cursor
import typingsSlinky.vegaLite.anon.DefaultPos
import typingsSlinky.vegaLite.anon.DefaultPos2
import typingsSlinky.vegaLite.anon.DefaultPosDefaultPos2
import typingsSlinky.vegaLite.anon.DefaultRef
import typingsSlinky.vegaLite.anon.Description
import typingsSlinky.vegaLite.anon.Filled
import typingsSlinky.vegaLite.anon.Offset
import typingsSlinky.vegaLite.anon.PartialRecordVgEncodeChan
import typingsSlinky.vegaLite.anon.ReactiveGeom
import typingsSlinky.vegaLite.anon.Signal
import typingsSlinky.vegaLite.anon.Tooltip
import typingsSlinky.vegaLite.channelMod.NonPositionScaleChannel
import typingsSlinky.vegaLite.channeldefMod.ChannelDef
import typingsSlinky.vegaLite.channeldefMod.Value
import typingsSlinky.vegaLite.encodeBaseMod.Ignore
import typingsSlinky.vegaLite.encodingMod.Encoding
import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaLite.srcConfigMod.Config
import typingsSlinky.vegaLite.srcGuideMod.GuideEncodingConditionalValueDef
import typingsSlinky.vegaLite.srcStackMod.StackProperties
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteStrings.arc
import typingsSlinky.vegaLite.vegaLiteStrings.bar
import typingsSlinky.vegaLite.vegaLiteStrings.description
import typingsSlinky.vegaLite.vegaLiteStrings.href
import typingsSlinky.vegaLite.vegaLiteStrings.image
import typingsSlinky.vegaLite.vegaLiteStrings.radius
import typingsSlinky.vegaLite.vegaLiteStrings.rect
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.theta
import typingsSlinky.vegaLite.vegaLiteStrings.url
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeEntry
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object markEncodeMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "aria")
  @js.native
  def aria(model: UnitModel): AriaRoleDescription | Description | Clip | AriaAriaRoleDescription = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "baseEncodeEntry")
  @js.native
  def baseEncodeEntry(model: UnitModel, ignore: Ignore): AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "color")
  @js.native
  def color(model: UnitModel): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "color")
  @js.native
  def color(model: UnitModel, opt: Filled): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "defined")
  @js.native
  def defined(model: UnitModel): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "nonPosition")
  @js.native
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "nonPosition")
  @js.native
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel, opt: DefaultRef): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointOrRangePosition")
  @js.native
  def pointOrRangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointOrRangePosition")
  @js.native
  def pointOrRangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_radius(channel: radius, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_theta(channel: theta, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_x(channel: x, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "pointPosition")
  @js.native
  def pointPosition_y(channel: y, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_radius(channel: radius, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_theta(channel: theta, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rangePosition")
  @js.native
  def rangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectBinPosition")
  @js.native
  def rectBinPosition(hasFieldDefFieldDef2ChannelBandScaleNameMarkDefSpacingAxisTranslateReverseConfig: AxisTranslate): StringDictionary[js.Array[VgValueRef] | Offset | VgValueRef] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: rect): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text(model: UnitModel): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_description(model: UnitModel, channel: description): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_href(model: UnitModel, channel: href): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_text(model: UnitModel, channel: text): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "text")
  @js.native
  def text_url(model: UnitModel, channel: url): PartialRecordVgEncodeChan = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltip")
  @js.native
  def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltip")
  @js.native
  def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(encoding: Encoding[String], stack: StackProperties, config: Config[ExprRef | SignalRef]): Signal = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode", "tooltipRefForEncoding")
  @js.native
  def tooltipRefForEncoding(
    encoding: Encoding[String],
    stack: StackProperties,
    config: Config[ExprRef | SignalRef],
    hasReactiveGeom: ReactiveGeom
  ): Signal = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "valueIfDefined")
  @js.native
  def valueIfDefined(prop: String, value: Value[ExprRef | SignalRef]): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode", "wrapCondition")
  @js.native
  def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = js.native
}
