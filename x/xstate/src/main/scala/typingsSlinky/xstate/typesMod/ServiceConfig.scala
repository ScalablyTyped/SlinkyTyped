package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xstate.typesMod.StateMachine[js.Any, js.Any, js.Any, js.Any]
  - typingsSlinky.xstate.typesMod.InvokeCreator[TContext, typingsSlinky.xstate.typesMod.AnyEventObject, js.Any]
*/
trait ServiceConfig[TContext] extends js.Object

object ServiceConfig {
  @scala.inline
  implicit def apply[TContext](value: InvokeCreator[TContext, AnyEventObject, js.Any]): ServiceConfig[TContext] = value.asInstanceOf[ServiceConfig[TContext]]
  @scala.inline
  implicit def apply[TContext](value: StateMachine[js.Any, js.Any, js.Any, js.Any]): ServiceConfig[TContext] = value.asInstanceOf[ServiceConfig[TContext]]
  @scala.inline
  implicit def apply[TContext](value: String): ServiceConfig[TContext] = value.asInstanceOf[ServiceConfig[TContext]]
}

