package typingsSlinky.xrm.Xrm.Events

import typingsSlinky.xrm.Xrm.Attributes.Attribute
import typingsSlinky.xrm.Xrm.Controls.Control
import typingsSlinky.xrm.Xrm.Entity
import typingsSlinky.xrm.Xrm.FormContext
import typingsSlinky.xrm.Xrm.GlobalContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Interface for a save event context
  */
@js.native
trait SaveEventContext extends EventContext {
  
  /**
    * Gets save-event arguments.
    * @returns The event arguments.  Returns null for all but the "save" event.
    */
  def getEventArgs(): SaveEventArguments = js.native
}
object SaveEventContext {
  
  @scala.inline
  def apply(
    getContext: () => GlobalContext,
    getDepth: () => Double,
    getEventArgs: () => SaveEventArguments,
    getEventSource: () => Attribute | Control | Entity,
    getFormContext: () => FormContext,
    getSharedVariable: String => js.Any,
    setSharedVariable: (String, js.Any) => Unit
  ): SaveEventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
    __obj.asInstanceOf[SaveEventContext]
  }
  
  @scala.inline
  implicit class SaveEventContextOps[Self <: SaveEventContext] (val x: Self) extends AnyVal {
    
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
    def setGetEventArgs(value: () => SaveEventArguments): Self = this.set("getEventArgs", js.Any.fromFunction0(value))
  }
}
