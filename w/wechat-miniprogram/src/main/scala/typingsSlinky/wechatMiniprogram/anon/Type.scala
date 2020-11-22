package typingsSlinky.wechatMiniprogram.anon

import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.drag
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.end
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.scale
import typingsSlinky.wechatMiniprogram.wechatMiniprogramStrings.update
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Type extends js.Object {
  
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
  implicit class TypeOps[Self <: Type] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCausedBy(value: drag | scale | update): Self = this.set("causedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: end): Self = this.set("type", value.asInstanceOf[js.Any])
  }
}
