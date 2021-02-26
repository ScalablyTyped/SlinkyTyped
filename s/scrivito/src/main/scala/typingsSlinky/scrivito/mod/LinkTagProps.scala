package typingsSlinky.scrivito.mod

import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLAnchorElement
import slinky.web.SyntheticMouseEvent
import typingsSlinky.react.mod.HTMLAttributes
import org.scalablytyped.runtime.StObject
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
  implicit class LinkTagPropsMutableBuilder[Self <: LinkTagProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnClick(value: /* event */ SyntheticMouseEvent[Element] => Unit): Self = StObject.set(x, "onClick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setOnClickUndefined: Self = StObject.set(x, "onClick", js.undefined)
    
    @scala.inline
    def setParams(value: js.Object): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
    
    @scala.inline
    def setTo(value: Obj | Link): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
  }
}
