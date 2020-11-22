package typingsSlinky.scrivito.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.HTMLAttributes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LinkTagProps extends HTMLAttributes[HTMLAnchorElement] {
  
  @JSName("onClick")
  var onClick_LinkTagProps: js.UndefOr[js.Function1[/* event */ SyntheticMouseEvent[Element], Unit]] = js.native
  
  var params: js.UndefOr[js.Object] = js.native
  
  var to: Obj | Link = js.native
}
object LinkTagProps {
  
  @scala.inline
  def apply(to: Obj | Link): LinkTagProps = {
    val __obj = js.Dynamic.literal(to = to.asInstanceOf[js.Any])
    __obj.asInstanceOf[LinkTagProps]
  }
  
  @scala.inline
  implicit class LinkTagPropsOps[Self <: LinkTagProps] (val x: Self) extends AnyVal {
    
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
    def setTo(value: Obj | Link): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOnClick(value: /* event */ SyntheticMouseEvent[Element] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = this.set("params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteParams: Self = this.set("params", js.undefined)
  }
}
