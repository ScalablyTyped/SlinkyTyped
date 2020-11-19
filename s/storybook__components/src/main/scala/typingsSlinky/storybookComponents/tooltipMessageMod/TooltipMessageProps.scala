package typingsSlinky.storybookComponents.tooltipMessageMod

import slinky.core.facade.ReactElement
import typingsSlinky.storybookComponents.anon.Href
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TooltipMessageProps extends js.Object {
  
  var desc: js.UndefOr[ReactElement] = js.native
  
  var links: js.UndefOr[js.Array[Href]] = js.native
  
  var title: js.UndefOr[ReactElement] = js.native
}
object TooltipMessageProps {
  
  @scala.inline
  def apply(): TooltipMessageProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TooltipMessageProps]
  }
  
  @scala.inline
  implicit class TooltipMessagePropsOps[Self <: TooltipMessageProps] (val x: Self) extends AnyVal {
    
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
    def setDescReactElement(value: ReactElement): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDesc(value: ReactElement): Self = this.set("desc", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDesc: Self = this.set("desc", js.undefined)
    
    @scala.inline
    def setLinksVarargs(value: Href*): Self = this.set("links", js.Array(value :_*))
    
    @scala.inline
    def setLinks(value: js.Array[Href]): Self = this.set("links", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLinks: Self = this.set("links", js.undefined)
    
    @scala.inline
    def setTitleReactElement(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: ReactElement): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
