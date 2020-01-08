package typingsSlinky.xstate

import typingsSlinky.xstate.libTypesMod.EventObject
import typingsSlinky.xstate.libTypesMod.SendAction
import typingsSlinky.xstate.libTypesMod.SendActionOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_ErrorData extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](errorData: js.Any): SendAction[TContext, TEvent] = js.native
  def apply[TContext, TEvent /* <: EventObject */](errorData: js.Any, options: SendActionOptions[TContext, TEvent]): SendAction[TContext, TEvent] = js.native
}

