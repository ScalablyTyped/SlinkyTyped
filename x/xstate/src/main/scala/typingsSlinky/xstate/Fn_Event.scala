package typingsSlinky.xstate

import typingsSlinky.xstate.libTypesMod.Event
import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.RaiseAction
import typingsSlinky.xstate.libTypesMod.SendAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_Event extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](event: Event[TEvent]): RaiseAction[TEvent] | (SendAction[TContext, TEvent]) = js.native
}

