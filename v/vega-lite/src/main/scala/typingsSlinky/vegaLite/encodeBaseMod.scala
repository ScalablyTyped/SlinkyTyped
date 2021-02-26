package typingsSlinky.vegaLite

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vegaLite.anon.AriaRoleDescription
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
import typingsSlinky.vegaLite.anon.Filled
import typingsSlinky.vegaLite.anon.PartialRecordVgEncodeChan
import typingsSlinky.vegaLite.anon.ReactiveGeom
import typingsSlinky.vegaLite.anon.Tooltip
import typingsSlinky.vegaLite.channelMod.NonPositionScaleChannel
import typingsSlinky.vegaLite.channeldefMod.ChannelDef
import typingsSlinky.vegaLite.srcGuideMod.GuideEncodingConditionalValueDef
import typingsSlinky.vegaLite.unitMod.UnitModel
import typingsSlinky.vegaLite.vegaLiteStrings.arc
import typingsSlinky.vegaLite.vegaLiteStrings.bar
import typingsSlinky.vegaLite.vegaLiteStrings.description
import typingsSlinky.vegaLite.vegaLiteStrings.href
import typingsSlinky.vegaLite.vegaLiteStrings.ignore
import typingsSlinky.vegaLite.vegaLiteStrings.image
import typingsSlinky.vegaLite.vegaLiteStrings.include
import typingsSlinky.vegaLite.vegaLiteStrings.radius
import typingsSlinky.vegaLite.vegaLiteStrings.rect
import typingsSlinky.vegaLite.vegaLiteStrings.text
import typingsSlinky.vegaLite.vegaLiteStrings.theta
import typingsSlinky.vegaLite.vegaLiteStrings.url
import typingsSlinky.vegaLite.vegaLiteStrings.x
import typingsSlinky.vegaLite.vegaLiteStrings.y
import typingsSlinky.vegaLite.vegaSchemaMod.VgEncodeEntry
import typingsSlinky.vegaLite.vegaSchemaMod.VgValueRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object encodeBaseMod {
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "baseEncodeEntry")
  @js.native
  def baseEncodeEntry(model: UnitModel, ignore: Ignore): AriaRoleDescription | CornerRadius | Clip | CornerRadiusBottomLeft | CornerRadiusBottomRight | CornerRadiusTopLeft | CornerRadiusTopRight | Cursor = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "color")
  @js.native
  def color(model: UnitModel): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "color")
  @js.native
  def color(model: UnitModel, opt: Filled): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "nonPosition")
  @js.native
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "nonPosition")
  @js.native
  def nonPosition(channel: NonPositionScaleChannel, model: UnitModel, opt: DefaultRef): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "pointOrRangePosition")
  @js.native
  def pointOrRangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "pointOrRangePosition")
  @js.native
  def pointOrRangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2Range: DefaultPos2): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "pointPosition")
  @js.native
  def pointPosition_radius(channel: radius, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "pointPosition")
  @js.native
  def pointPosition_theta(channel: theta, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "pointPosition")
  @js.native
  def pointPosition_x(channel: x, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "pointPosition")
  @js.native
  def pointPosition_y(channel: y, model: UnitModel, hasDefaultPosVgChannelIsMidPoint: DefaultPos): StringDictionary[VgValueRef | js.Array[VgValueRef]] = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rangePosition")
  @js.native
  def rangePosition_radius(channel: radius, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rangePosition")
  @js.native
  def rangePosition_theta(channel: theta, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rangePosition")
  @js.native
  def rangePosition_x(channel: x, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rangePosition")
  @js.native
  def rangePosition_y(channel: y, model: UnitModel, hasDefaultPosDefaultPos2: DefaultPosDefaultPos2): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: radius, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: theta, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: x, mark: rect): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: arc): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: bar): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: image): VgEncodeEntry = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "rectPosition")
  @js.native
  def rectPosition(model: UnitModel, channel: y, mark: rect): VgEncodeEntry = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "text")
  @js.native
  def text(model: UnitModel): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "text")
  @js.native
  def text_description(model: UnitModel, channel: description): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "text")
  @js.native
  def text_href(model: UnitModel, channel: href): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "text")
  @js.native
  def text_text(model: UnitModel, channel: text): PartialRecordVgEncodeChan = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "text")
  @js.native
  def text_url(model: UnitModel, channel: url): PartialRecordVgEncodeChan = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "tooltip")
  @js.native
  def tooltip(model: UnitModel): PartialRecordVgEncodeChan | Tooltip = js.native
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "tooltip")
  @js.native
  def tooltip(model: UnitModel, opt: ReactiveGeom): PartialRecordVgEncodeChan | Tooltip = js.native
  
  @JSImport("vega-lite/build/src/compile/mark/encode/base", "wrapCondition")
  @js.native
  def wrapCondition[CD /* <: ChannelDef[String] | GuideEncodingConditionalValueDef */](
    model: UnitModel,
    channelDef: CD,
    vgChannel: String,
    refFn: js.Function1[/* cDef */ CD, VgValueRef]
  ): VgEncodeEntry = js.native
  
  /* Inlined std.Record<'color' | 'size' | 'orient' | 'align' | 'baseline' | 'theta', 'ignore' | 'include'> */
  @js.native
  trait Ignore extends StObject {
    
    var align: ignore | include = js.native
    
    var baseline: ignore | include = js.native
    
    var color: ignore | include = js.native
    
    var orient: ignore | include = js.native
    
    var size: ignore | include = js.native
    
    var theta: ignore | include = js.native
  }
  object Ignore {
    
    @scala.inline
    def apply(
      align: ignore | include,
      baseline: ignore | include,
      color: ignore | include,
      orient: ignore | include,
      size: ignore | include,
      theta: ignore | include
    ): Ignore = {
      val __obj = js.Dynamic.literal(align = align.asInstanceOf[js.Any], baseline = baseline.asInstanceOf[js.Any], color = color.asInstanceOf[js.Any], orient = orient.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], theta = theta.asInstanceOf[js.Any])
      __obj.asInstanceOf[Ignore]
    }
    
    @scala.inline
    implicit class IgnoreMutableBuilder[Self <: Ignore] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAlign(value: ignore | include): Self = StObject.set(x, "align", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBaseline(value: ignore | include): Self = StObject.set(x, "baseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColor(value: ignore | include): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOrient(value: ignore | include): Self = StObject.set(x, "orient", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSize(value: ignore | include): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTheta(value: ignore | include): Self = StObject.set(x, "theta", value.asInstanceOf[js.Any])
    }
  }
}
