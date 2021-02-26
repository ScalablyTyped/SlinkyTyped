package typingsSlinky.uikit.mod.UIkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UIkitAlertElement extends StObject {
  
  def close(): Unit = js.native
}
object UIkitAlertElement {
  
  @scala.inline
  def apply(close: () => Unit): UIkitAlertElement = {
    val __obj = js.Dynamic.literal(close = js.Any.fromFunction0(close))
    __obj.asInstanceOf[UIkitAlertElement]
  }
  
  @scala.inline
  implicit class UIkitAlertElementMutableBuilder[Self <: UIkitAlertElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClose(value: () => Unit): Self = StObject.set(x, "close", js.Any.fromFunction0(value))
  }
}
