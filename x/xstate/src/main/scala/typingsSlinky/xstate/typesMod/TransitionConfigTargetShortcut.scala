package typingsSlinky.xstate.typesMod

import typingsSlinky.xstate.stateNodeMod.StateNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - js.UndefOr[scala.Nothing]
  - typingsSlinky.xstate.stateNodeMod.StateNode[TContext, js.Any, TEvent, js.Any]
*/
trait TransitionConfigTargetShortcut[TContext, TEvent /* <: EventObject */] extends js.Object

object TransitionConfigTargetShortcut {
  @scala.inline
  implicit def apply[TContext, TEvent](value: StateNode[TContext, js.Any, TEvent, js.Any]): TransitionConfigTargetShortcut[TContext, TEvent] = value.asInstanceOf[TransitionConfigTargetShortcut[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: String): TransitionConfigTargetShortcut[TContext, TEvent] = value.asInstanceOf[TransitionConfigTargetShortcut[TContext, TEvent]]
  @scala.inline
  implicit def fromUndef[TContext, TEvent, T](value: js.UndefOr[T])(implicit ev: T => TransitionConfigTargetShortcut[TContext, TEvent]): TransitionConfigTargetShortcut[TContext, TEvent] = value.asInstanceOf[TransitionConfigTargetShortcut[TContext, TEvent]]
}

