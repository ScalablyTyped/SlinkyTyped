package typingsSlinky.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitDropdownElement extends StObject {
  
  def hide(): Unit = js.native
  
  def show(): Unit = js.native
}
object UIkitDropdownElement {
  
  @scala.inline
  def apply(hide: () => Unit, show: () => Unit): UIkitDropdownElement = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[UIkitDropdownElement]
  }
  
  @scala.inline
  implicit class UIkitDropdownElementMutableBuilder[Self <: UIkitDropdownElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setHide(value: () => Unit): Self = StObject.set(x, "hide", js.Any.fromFunction0(value))
    
    @scala.inline
    def setShow(value: () => Unit): Self = StObject.set(x, "show", js.Any.fromFunction0(value))
  }
}
