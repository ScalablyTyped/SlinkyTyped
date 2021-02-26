package typingsSlinky.wechatMiniprogram.anon

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.drag
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.end
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.scale
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends StObject {
  
  /**
    * 导致视野变化的原因
    *
    * - drag: 拖动地图导致
    * - scale: 缩放导致
    * - update: 调用接口导致
    */
  var causedBy: drag | scale | update = js.native
  
  /**
    * 视野变化结束时触发
    *
    * 视野变化结束为 `end`
    */
  var `type`: end = js.native
}
object Type {
  
  @scala.inline
  def apply(causedBy: drag | scale | update, `type`: end): Type = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Type]
  }
  
  @scala.inline
  implicit class TypeMutableBuilder[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCausedBy(value: drag | scale | update): Self = StObject.set(x, "causedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: end): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
