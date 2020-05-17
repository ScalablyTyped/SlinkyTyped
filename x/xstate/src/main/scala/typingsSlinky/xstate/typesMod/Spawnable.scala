package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]
  - js.Promise[js.Any]
  - typingsSlinky.xstate.typesMod.InvokeCallback
  - typingsSlinky.xstate.typesMod.Subscribable[js.Any]
*/
trait Spawnable extends js.Object

object Spawnable {
  @scala.inline
  implicit def apply(value: InvokeCallback): Spawnable = value.asInstanceOf[Spawnable]
  @scala.inline
  implicit def apply(value: js.Promise[js.Any]): Spawnable = value.asInstanceOf[Spawnable]
  @scala.inline
  implicit def apply(value: StateMachine[js.Any, js.Any, js.Any, js.Any]): Spawnable = value.asInstanceOf[Spawnable]
  @scala.inline
  implicit def apply(value: Subscribable[js.Any]): Spawnable = value.asInstanceOf[Spawnable]
}

