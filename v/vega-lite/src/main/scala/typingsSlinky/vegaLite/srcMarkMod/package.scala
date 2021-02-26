package typingsSlinky.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object srcMarkMod {
  
  @scala.inline
  def ARC: typingsSlinky.vegaLite.vegaLiteStrings.arc = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("ARC").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.arc]
  
  @scala.inline
  def AREA: typingsSlinky.vegaLite.vegaLiteStrings.area = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("AREA").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.area]
  
  type AnyMark = typingsSlinky.vegaLite.compositemarkMod.CompositeMark | typingsSlinky.vegaLite.compositemarkMod.CompositeMarkDef | typingsSlinky.vegaLite.srcMarkMod.Mark | (typingsSlinky.vegaLite.srcMarkMod.MarkDef[
    typingsSlinky.vegaLite.srcMarkMod.Mark, 
    typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef
  ])
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vegaLite.srcMarkMod.MarkConfig[typingsSlinky.vegaTypings.signalMod.SignalRef]
    - typingsSlinky.vegaLite.srcMarkMod.AreaConfig[ES]
    - typingsSlinky.vegaLite.srcMarkMod.BarConfig[ES]
    - typingsSlinky.vegaLite.srcMarkMod.RectConfig[ES]
    - typingsSlinky.vegaLite.srcMarkMod.LineConfig[ES]
    - typingsSlinky.vegaLite.srcMarkMod.TickConfig[ES]
  */
  type AnyMarkConfig[ES /* <: typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef */] = typingsSlinky.vegaLite.srcMarkMod._AnyMarkConfig[ES] | typingsSlinky.vegaLite.srcMarkMod.MarkConfig[typingsSlinky.vegaTypings.signalMod.SignalRef] | typingsSlinky.vegaLite.srcMarkMod.BarConfig[ES]
  
  @scala.inline
  def BAR: typingsSlinky.vegaLite.vegaLiteStrings.bar = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("BAR").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.bar]
  
  type BarConfig[ES /* <: typingsSlinky.vegaLite.exprMod.ExprRef | typingsSlinky.vegaTypings.signalMod.SignalRef */] = typingsSlinky.vegaLite.srcMarkMod.RectConfig[ES] with typingsSlinky.vegaLite.srcMarkMod.BarCornerRadiusMixins[ES]
  
  @scala.inline
  def CIRCLE: typingsSlinky.vegaLite.vegaLiteStrings.circle = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("CIRCLE").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.circle]
  
  @scala.inline
  def FILL_CONFIG: js.Tuple2[
    typingsSlinky.vegaLite.vegaLiteStrings.fill, 
    typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity
  ] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("FILL_CONFIG").asInstanceOf[js.Tuple2[
    typingsSlinky.vegaLite.vegaLiteStrings.fill, 
    typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity
  ]]
  
  @scala.inline
  def FILL_STROKE_CONFIG: js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.fill | typingsSlinky.vegaLite.vegaLiteStrings.stroke | typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity | typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity | typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth | typingsSlinky.vegaLite.vegaLiteStrings.strokeDash | typingsSlinky.vegaLite.vegaLiteStrings.strokeDashOffset | typingsSlinky.vegaLite.vegaLiteStrings.strokeMiterLimit | typingsSlinky.vegaLite.vegaLiteStrings.strokeJoin
  ] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("FILL_STROKE_CONFIG").asInstanceOf[js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.fill | typingsSlinky.vegaLite.vegaLiteStrings.stroke | typingsSlinky.vegaLite.vegaLiteStrings.fillOpacity | typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity | typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth | typingsSlinky.vegaLite.vegaLiteStrings.strokeDash | typingsSlinky.vegaLite.vegaLiteStrings.strokeDashOffset | typingsSlinky.vegaLite.vegaLiteStrings.strokeMiterLimit | typingsSlinky.vegaLite.vegaLiteStrings.strokeJoin
  ]]
  
  @scala.inline
  def GEOSHAPE: typingsSlinky.vegaLite.vegaLiteStrings.geoshape = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("GEOSHAPE").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.geoshape]
  
  type Hide = typingsSlinky.vegaLite.vegaLiteStrings.hide
  
  @scala.inline
  def IMAGE: typingsSlinky.vegaLite.vegaLiteStrings.image = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("IMAGE").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.image]
  
  @scala.inline
  def LINE: typingsSlinky.vegaLite.vegaLiteStrings.line = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("LINE").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.line]
  
  @scala.inline
  def MARK_CONFIGS: js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.square | typingsSlinky.vegaLite.vegaLiteStrings.area | typingsSlinky.vegaLite.vegaLiteStrings.mark | typingsSlinky.vegaLite.vegaLiteStrings.circle | typingsSlinky.vegaLite.vegaLiteStrings.image | typingsSlinky.vegaLite.vegaLiteStrings.line | typingsSlinky.vegaLite.vegaLiteStrings.rect | typingsSlinky.vegaLite.vegaLiteStrings.text | typingsSlinky.vegaLite.vegaLiteStrings.point | typingsSlinky.vegaLite.vegaLiteStrings.arc | typingsSlinky.vegaLite.vegaLiteStrings.rule | typingsSlinky.vegaLite.vegaLiteStrings.trail | typingsSlinky.vegaLite.vegaLiteStrings.geoshape | typingsSlinky.vegaLite.vegaLiteStrings.bar | typingsSlinky.vegaLite.vegaLiteStrings.tick
  ] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("MARK_CONFIGS").asInstanceOf[js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.square | typingsSlinky.vegaLite.vegaLiteStrings.area | typingsSlinky.vegaLite.vegaLiteStrings.mark | typingsSlinky.vegaLite.vegaLiteStrings.circle | typingsSlinky.vegaLite.vegaLiteStrings.image | typingsSlinky.vegaLite.vegaLiteStrings.line | typingsSlinky.vegaLite.vegaLiteStrings.rect | typingsSlinky.vegaLite.vegaLiteStrings.text | typingsSlinky.vegaLite.vegaLiteStrings.point | typingsSlinky.vegaLite.vegaLiteStrings.arc | typingsSlinky.vegaLite.vegaLiteStrings.rule | typingsSlinky.vegaLite.vegaLiteStrings.trail | typingsSlinky.vegaLite.vegaLiteStrings.geoshape | typingsSlinky.vegaLite.vegaLiteStrings.bar | typingsSlinky.vegaLite.vegaLiteStrings.tick
  ]]
  
  @scala.inline
  def POINT: typingsSlinky.vegaLite.vegaLiteStrings.point = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("POINT").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.point]
  
  @scala.inline
  def PRIMITIVE_MARKS: js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.square | typingsSlinky.vegaLite.vegaLiteStrings.area | typingsSlinky.vegaLite.vegaLiteStrings.circle | typingsSlinky.vegaLite.vegaLiteStrings.image | typingsSlinky.vegaLite.vegaLiteStrings.line | typingsSlinky.vegaLite.vegaLiteStrings.rect | typingsSlinky.vegaLite.vegaLiteStrings.text | typingsSlinky.vegaLite.vegaLiteStrings.point | typingsSlinky.vegaLite.vegaLiteStrings.arc | typingsSlinky.vegaLite.vegaLiteStrings.rule | typingsSlinky.vegaLite.vegaLiteStrings.trail | typingsSlinky.vegaLite.vegaLiteStrings.geoshape | typingsSlinky.vegaLite.vegaLiteStrings.bar | typingsSlinky.vegaLite.vegaLiteStrings.tick
  ] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("PRIMITIVE_MARKS").asInstanceOf[js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.square | typingsSlinky.vegaLite.vegaLiteStrings.area | typingsSlinky.vegaLite.vegaLiteStrings.circle | typingsSlinky.vegaLite.vegaLiteStrings.image | typingsSlinky.vegaLite.vegaLiteStrings.line | typingsSlinky.vegaLite.vegaLiteStrings.rect | typingsSlinky.vegaLite.vegaLiteStrings.text | typingsSlinky.vegaLite.vegaLiteStrings.point | typingsSlinky.vegaLite.vegaLiteStrings.arc | typingsSlinky.vegaLite.vegaLiteStrings.rule | typingsSlinky.vegaLite.vegaLiteStrings.trail | typingsSlinky.vegaLite.vegaLiteStrings.geoshape | typingsSlinky.vegaLite.vegaLiteStrings.bar | typingsSlinky.vegaLite.vegaLiteStrings.tick
  ]]
  
  @scala.inline
  def RECT: typingsSlinky.vegaLite.vegaLiteStrings.rect = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("RECT").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.rect]
  
  @scala.inline
  def RULE: typingsSlinky.vegaLite.vegaLiteStrings.rule = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("RULE").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.rule]
  
  @scala.inline
  def SQUARE: typingsSlinky.vegaLite.vegaLiteStrings.square = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("SQUARE").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.square]
  
  @scala.inline
  def STROKE_CONFIG: js.Tuple7[
    typingsSlinky.vegaLite.vegaLiteStrings.stroke, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeDash, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeDashOffset, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeJoin, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeMiterLimit
  ] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("STROKE_CONFIG").asInstanceOf[js.Tuple7[
    typingsSlinky.vegaLite.vegaLiteStrings.stroke, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeWidth, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeDash, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeDashOffset, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeOpacity, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeJoin, 
    typingsSlinky.vegaLite.vegaLiteStrings.strokeMiterLimit
  ]]
  
  @scala.inline
  def TEXT: typingsSlinky.vegaLite.vegaLiteStrings.text = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("TEXT").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.text]
  
  @scala.inline
  def TICK: typingsSlinky.vegaLite.vegaLiteStrings.tick = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("TICK").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.tick]
  
  @scala.inline
  def TRAIL: typingsSlinky.vegaLite.vegaLiteStrings.trail = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("TRAIL").asInstanceOf[typingsSlinky.vegaLite.vegaLiteStrings.trail]
  
  @scala.inline
  def VL_ONLY_MARK_CONFIG_PROPERTIES: js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.invalid | typingsSlinky.vegaLite.vegaLiteStrings.color | typingsSlinky.vegaLite.vegaLiteStrings.theta2 | typingsSlinky.vegaLite.vegaLiteStrings.radius2 | typingsSlinky.vegaLite.vegaLiteStrings.order | typingsSlinky.vegaLite.vegaLiteStrings.filled | typingsSlinky.vegaLite.vegaLiteStrings.timeUnitBandPosition | typingsSlinky.vegaLite.vegaLiteStrings.timeUnitBand
  ] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("VL_ONLY_MARK_CONFIG_PROPERTIES").asInstanceOf[js.Array[
    typingsSlinky.vegaLite.vegaLiteStrings.invalid | typingsSlinky.vegaLite.vegaLiteStrings.color | typingsSlinky.vegaLite.vegaLiteStrings.theta2 | typingsSlinky.vegaLite.vegaLiteStrings.radius2 | typingsSlinky.vegaLite.vegaLiteStrings.order | typingsSlinky.vegaLite.vegaLiteStrings.filled | typingsSlinky.vegaLite.vegaLiteStrings.timeUnitBandPosition | typingsSlinky.vegaLite.vegaLiteStrings.timeUnitBand
  ]]
  
  @scala.inline
  def defaultBarConfig: typingsSlinky.vegaLite.srcMarkMod.RectConfig[typingsSlinky.vegaTypings.signalMod.SignalRef] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultBarConfig").asInstanceOf[typingsSlinky.vegaLite.srcMarkMod.RectConfig[typingsSlinky.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def defaultMarkConfig: typingsSlinky.vegaLite.srcMarkMod.MarkConfig[typingsSlinky.vegaTypings.signalMod.SignalRef] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultMarkConfig").asInstanceOf[typingsSlinky.vegaLite.srcMarkMod.MarkConfig[typingsSlinky.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def defaultRectConfig: typingsSlinky.vegaLite.srcMarkMod.RectConfig[typingsSlinky.vegaTypings.signalMod.SignalRef] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultRectConfig").asInstanceOf[typingsSlinky.vegaLite.srcMarkMod.RectConfig[typingsSlinky.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def defaultTickConfig: typingsSlinky.vegaLite.srcMarkMod.TickConfig[typingsSlinky.vegaTypings.signalMod.SignalRef] = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].selectDynamic("defaultTickConfig").asInstanceOf[typingsSlinky.vegaLite.srcMarkMod.TickConfig[typingsSlinky.vegaTypings.signalMod.SignalRef]]
  
  @scala.inline
  def getMarkType(m: java.lang.String): js.Any = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMarkType")(m.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  @scala.inline
  def getMarkType(m: typingsSlinky.vegaLite.srcMarkMod.GenericMarkDef[_]): js.Any = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("getMarkType")(m.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def isMark(m: java.lang.String): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMark")(m.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean]
  
  @scala.inline
  def isMarkDef(mark: java.lang.String): /* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkDef")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean]
  @scala.inline
  def isMarkDef(mark: typingsSlinky.vegaLite.srcMarkMod.GenericMarkDef[_]): /* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isMarkDef")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.GenericMarkDef<any> */ scala.Boolean]
  
  @scala.inline
  def isPathMark(m: typingsSlinky.vegaLite.compositemarkMod.CompositeMark): scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPathMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isPathMark(m: typingsSlinky.vegaLite.srcMarkMod.Mark): scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPathMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  
  @scala.inline
  def isPrimitiveMark(mark: typingsSlinky.vegaLite.srcMarkMod.AnyMark): /* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isPrimitiveMark")(mark.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/mark.Mark */ scala.Boolean]
  
  @scala.inline
  def isRectBasedMark(m: typingsSlinky.vegaLite.compositemarkMod.CompositeMark): scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRectBasedMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
  @scala.inline
  def isRectBasedMark(m: typingsSlinky.vegaLite.srcMarkMod.Mark): scala.Boolean = typingsSlinky.vegaLite.srcMarkMod.^.asInstanceOf[js.Dynamic].applyDynamic("isRectBasedMark")(m.asInstanceOf[js.Any]).asInstanceOf[scala.Boolean]
}
