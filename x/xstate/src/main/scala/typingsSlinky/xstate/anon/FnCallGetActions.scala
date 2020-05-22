package typingsSlinky.xstate.anon

import typingsSlinky.xstate.typesMod.ActionObject
import typingsSlinky.xstate.typesMod.EventObject
import typingsSlinky.xstate.typesMod.PureAction
import typingsSlinky.xstate.typesMod.SingleOrArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallGetActions extends js.Object {
  def apply[TContext, TEvent /* <: EventObject */](
    getActions: js.Function2[
      /* context */ TContext, 
      /* event */ TEvent, 
      js.UndefOr[SingleOrArray[ActionObject[TContext, TEvent]]]
    ]
  ): PureAction[TContext, TEvent] = js.native
}

