package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.typesMod.TransitionsConfigMap[TContext, TEvent]
  - typingsSlinky.xstate.typesMod.TransitionsConfigArray[TContext, TEvent]
*/
trait TransitionsConfig[TContext, TEvent /* <: EventObject */] extends js.Object

object TransitionsConfig {
  @scala.inline
  implicit def apply[TContext, TEvent](value: TransitionsConfigArray[TContext, TEvent]): TransitionsConfig[TContext, TEvent] = value.asInstanceOf[TransitionsConfig[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: TransitionsConfigMap[TContext, TEvent]): TransitionsConfig[TContext, TEvent] = value.asInstanceOf[TransitionsConfig[TContext, TEvent]]
}

