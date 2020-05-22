package typingsSlinky.xrm.Xrm.Events

import typingsSlinky.xrm.Xrm.Attributes.Attribute
import typingsSlinky.xrm.Xrm.Controls.Control
import typingsSlinky.xrm.Xrm.Entity
import typingsSlinky.xrm.Xrm.FormContext
import typingsSlinky.xrm.Xrm.GlobalContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Interface for a process stage change event context
  */
trait StageChangeEventContext extends EventContext {
  /**
    * Gets process stage change event arguments.
    * @returns The event arguments.
    */
  def getEventArgs(): StageChangeEventArguments
}

object StageChangeEventContext {
  @scala.inline
  def apply(
    getContext: () => GlobalContext,
    getDepth: () => Double,
    getEventArgs: () => StageChangeEventArguments,
    getEventSource: () => Attribute | Control | Entity,
    getFormContext: () => FormContext,
    getSharedVariable: String => js.Any,
    setSharedVariable: (String, js.Any) => Unit
  ): StageChangeEventContext = {
    val __obj = js.Dynamic.literal(getContext = js.Any.fromFunction0(getContext), getDepth = js.Any.fromFunction0(getDepth), getEventArgs = js.Any.fromFunction0(getEventArgs), getEventSource = js.Any.fromFunction0(getEventSource), getFormContext = js.Any.fromFunction0(getFormContext), getSharedVariable = js.Any.fromFunction1(getSharedVariable), setSharedVariable = js.Any.fromFunction2(setSharedVariable))
    __obj.asInstanceOf[StageChangeEventContext]
  }
}

