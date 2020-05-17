package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.std.Record[
java.lang.String | scala.Double, 
java.lang.String | (typingsSlinky.xstate.typesMod.SingleOrArray[typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]])]
  - js.Array[
(typingsSlinky.xstate.typesMod.TransitionConfig[TContext, TEvent]) with (typingsSlinky.xstate.anon.Delay[TContext, TEvent])]
*/
trait DelayedTransitions[TContext, TEvent /* <: EventObject */] extends js.Object

object DelayedTransitions {
  @scala.inline
  implicit def apply[TContext, TEvent](
    value: js.Array[
      (TransitionConfig[TContext, TEvent]) with (typingsSlinky.xstate.anon.Delay[TContext, TEvent])
    ]
  ): DelayedTransitions[TContext, TEvent] = value.asInstanceOf[DelayedTransitions[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: Record[String | Double, String | (SingleOrArray[TransitionConfig[TContext, TEvent]])]): DelayedTransitions[TContext, TEvent] = value.asInstanceOf[DelayedTransitions[TContext, TEvent]]
}

