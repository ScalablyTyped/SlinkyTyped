package typingsSlinky.vegaLite.srcMarkMod

import typingsSlinky.vegaLite.exprMod.ExprRef
import typingsSlinky.vegaTypings.signalMod.SignalRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MarkConfigMixins[ES /* <: ExprRef | SignalRef */] extends StObject {
  
  /** Arc-specific Config */
  var arc: js.UndefOr[RectConfig[ES]] = js.native
  
  /** Area-Specific Config */
  var area: js.UndefOr[AreaConfig[ES]] = js.native
  
  /** Bar-Specific Config */
  var bar: js.UndefOr[BarConfig[ES]] = js.native
  
  /** Circle-Specific Config */
  var circle: js.UndefOr[MarkConfig[ES]] = js.native
  
  /** Geoshape-Specific Config */
  var geoshape: js.UndefOr[MarkConfig[ES]] = js.native
  
  /** Image-specific Config */
  var image: js.UndefOr[RectConfig[ES]] = js.native
  
  /** Line-Specific Config */
  var line: js.UndefOr[LineConfig[ES]] = js.native
  
  /** Mark Config */
  var mark: js.UndefOr[MarkConfig[ES]] = js.native
  
  /** Point-Specific Config */
  var point: js.UndefOr[MarkConfig[ES]] = js.native
  
  /** Rect-Specific Config */
  var rect: js.UndefOr[RectConfig[ES]] = js.native
  
  /** Rule-Specific Config */
  var rule: js.UndefOr[MarkConfig[ES]] = js.native
  
  /** Square-Specific Config */
  var square: js.UndefOr[MarkConfig[ES]] = js.native
  
  /** Text-Specific Config */
  var text: js.UndefOr[MarkConfig[ES]] = js.native
  
  /** Tick-Specific Config */
  var tick: js.UndefOr[TickConfig[ES]] = js.native
  
  /** Trail-Specific Config */
  var trail: js.UndefOr[LineConfig[ES]] = js.native
}
object MarkConfigMixins {
  
  @scala.inline
  def apply[ES /* <: ExprRef | SignalRef */](): MarkConfigMixins[ES] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MarkConfigMixins[ES]]
  }
  
  @scala.inline
  implicit class MarkConfigMixinsMutableBuilder[Self <: MarkConfigMixins[_], ES /* <: ExprRef | SignalRef */] (val x: Self with MarkConfigMixins[ES]) extends AnyVal {
    
    @scala.inline
    def setArc(value: RectConfig[ES]): Self = StObject.set(x, "arc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setArcUndefined: Self = StObject.set(x, "arc", js.undefined)
    
    @scala.inline
    def setArea(value: AreaConfig[ES]): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
    
    @scala.inline
    def setBar(value: BarConfig[ES]): Self = StObject.set(x, "bar", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBarUndefined: Self = StObject.set(x, "bar", js.undefined)
    
    @scala.inline
    def setCircle(value: MarkConfig[ES]): Self = StObject.set(x, "circle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCircleUndefined: Self = StObject.set(x, "circle", js.undefined)
    
    @scala.inline
    def setGeoshape(value: MarkConfig[ES]): Self = StObject.set(x, "geoshape", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoshapeUndefined: Self = StObject.set(x, "geoshape", js.undefined)
    
    @scala.inline
    def setImage(value: RectConfig[ES]): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
    
    @scala.inline
    def setLine(value: LineConfig[ES]): Self = StObject.set(x, "line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLineUndefined: Self = StObject.set(x, "line", js.undefined)
    
    @scala.inline
    def setMark(value: MarkConfig[ES]): Self = StObject.set(x, "mark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkUndefined: Self = StObject.set(x, "mark", js.undefined)
    
    @scala.inline
    def setPoint(value: MarkConfig[ES]): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
    
    @scala.inline
    def setRect(value: RectConfig[ES]): Self = StObject.set(x, "rect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRectUndefined: Self = StObject.set(x, "rect", js.undefined)
    
    @scala.inline
    def setRule(value: MarkConfig[ES]): Self = StObject.set(x, "rule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuleUndefined: Self = StObject.set(x, "rule", js.undefined)
    
    @scala.inline
    def setSquare(value: MarkConfig[ES]): Self = StObject.set(x, "square", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSquareUndefined: Self = StObject.set(x, "square", js.undefined)
    
    @scala.inline
    def setText(value: MarkConfig[ES]): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTick(value: TickConfig[ES]): Self = StObject.set(x, "tick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTickUndefined: Self = StObject.set(x, "tick", js.undefined)
    
    @scala.inline
    def setTrail(value: LineConfig[ES]): Self = StObject.set(x, "trail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTrailUndefined: Self = StObject.set(x, "trail", js.undefined)
  }
}
