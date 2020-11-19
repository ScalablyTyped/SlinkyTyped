package typingsSlinky.wechatMiniprogram.WechatMiniprogram.Page

import typingsSlinky.wechatMiniprogram.anon.WindowHeight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IResizeOption extends js.Object {
  
  var size: WindowHeight = js.native
}
object IResizeOption {
  
  @scala.inline
  def apply(size: WindowHeight): IResizeOption = {
    val __obj = js.Dynamic.literal(size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[IResizeOption]
  }
  
  @scala.inline
  implicit class IResizeOptionOps[Self <: IResizeOption] (val x: Self) extends AnyVal {
    
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
    def setSize(value: WindowHeight): Self = this.set("size", value.asInstanceOf[js.Any])
  }
}
