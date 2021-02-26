package typingsSlinky.wechatMiniprogram.WechatMiniprogram.Component

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TriggerEventOption extends StObject {
  
  /** 事件是否冒泡
    *
    * 默认值： `false`
    */
  var bubbles: js.UndefOr[Boolean] = js.native
  
  /** 事件是否拥有捕获阶段
    *
    * 默认值： `false`
    */
  var capturePhase: js.UndefOr[Boolean] = js.native
  
  /** 事件是否可以穿越组件边界，为false时，事件将只能在引用组件的节点树上触发，不进入其他任何组件内部
    *
    * 默认值： `false`
    */
  var composed: js.UndefOr[Boolean] = js.native
}
object TriggerEventOption {
  
  @scala.inline
  def apply(): TriggerEventOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TriggerEventOption]
  }
  
  @scala.inline
  implicit class TriggerEventOptionMutableBuilder[Self <: TriggerEventOption] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBubbles(value: Boolean): Self = StObject.set(x, "bubbles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBubblesUndefined: Self = StObject.set(x, "bubbles", js.undefined)
    
    @scala.inline
    def setCapturePhase(value: Boolean): Self = StObject.set(x, "capturePhase", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCapturePhaseUndefined: Self = StObject.set(x, "capturePhase", js.undefined)
    
    @scala.inline
    def setComposed(value: Boolean): Self = StObject.set(x, "composed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComposedUndefined: Self = StObject.set(x, "composed", js.undefined)
  }
}
