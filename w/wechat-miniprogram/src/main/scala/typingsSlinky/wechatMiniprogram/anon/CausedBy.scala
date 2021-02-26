package typingsSlinky.wechatMiniprogram.anon

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.begin
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.gesture
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.update
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CausedBy extends StObject {
  
  /**
    * 导致视野变化的原因
    *
    * - gesture: 用户手势
    * - update: 调用接口导致
    */
  var causedBy: gesture | update = js.native
  
  /**
    * 视野变化开始、结束时触发
    *
    * 视野变化开始为 `begin`
    */
  var `type`: begin = js.native
}
object CausedBy {
  
  @scala.inline
  def apply(causedBy: gesture | update, `type`: begin): CausedBy = {
    val __obj = js.Dynamic.literal(causedBy = causedBy.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[CausedBy]
  }
  
  @scala.inline
  implicit class CausedByMutableBuilder[Self <: CausedBy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCausedBy(value: gesture | update): Self = StObject.set(x, "causedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: begin): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
