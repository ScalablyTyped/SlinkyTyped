package typingsSlinky.xrm.Xrm.Controls

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for UI elements which can have the disabled value updated.
  */
@js.native
trait UiCanSetDisabledElement extends StObject {
  
  /**
    * Sets the state of the control to either enabled, or disabled.
    * @param disabled true to disable, false to enable.
    */
  def setDisabled(disabled: Boolean): Unit = js.native
}
object UiCanSetDisabledElement {
  
  @scala.inline
  def apply(setDisabled: Boolean => Unit): UiCanSetDisabledElement = {
    val __obj = js.Dynamic.literal(setDisabled = js.Any.fromFunction1(setDisabled))
    __obj.asInstanceOf[UiCanSetDisabledElement]
  }
  
  @scala.inline
  implicit class UiCanSetDisabledElementMutableBuilder[Self <: UiCanSetDisabledElement] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSetDisabled(value: Boolean => Unit): Self = StObject.set(x, "setDisabled", js.Any.fromFunction1(value))
  }
}
