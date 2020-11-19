package typingsSlinky.storybookComponents.iconMod

import typingsSlinky.storybookComponents.iconsMod.IconKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IconsProps extends js.Object {
  
  var icon: IconKey = js.native
}
object IconsProps {
  
  @scala.inline
  def apply(icon: IconKey): IconsProps = {
    val __obj = js.Dynamic.literal(icon = icon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IconsProps]
  }
  
  @scala.inline
  implicit class IconsPropsOps[Self <: IconsProps] (val x: Self) extends AnyVal {
    
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
    def setIcon(value: IconKey): Self = this.set("icon", value.asInstanceOf[js.Any])
  }
}
