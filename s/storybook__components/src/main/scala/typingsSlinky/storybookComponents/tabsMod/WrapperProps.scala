package typingsSlinky.storybookComponents.tabsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperProps extends js.Object {
  
  var absolute: js.UndefOr[Boolean] = js.native
  
  var bordered: js.UndefOr[Boolean] = js.native
}
object WrapperProps {
  
  @scala.inline
  def apply(): WrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WrapperProps]
  }
  
  @scala.inline
  implicit class WrapperPropsOps[Self <: WrapperProps] (val x: Self) extends AnyVal {
    
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
    def setAbsolute(value: Boolean): Self = this.set("absolute", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAbsolute: Self = this.set("absolute", js.undefined)
    
    @scala.inline
    def setBordered(value: Boolean): Self = this.set("bordered", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBordered: Self = this.set("bordered", js.undefined)
  }
}
