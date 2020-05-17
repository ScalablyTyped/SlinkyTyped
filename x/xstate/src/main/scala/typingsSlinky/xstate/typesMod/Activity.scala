package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - java.lang.String
  - typingsSlinky.xstate.typesMod.ActivityDefinition[TContext, TEvent]
*/
trait Activity[TContext, TEvent /* <: EventObject */] extends js.Object

object Activity {
  @scala.inline
  implicit def apply[TContext, TEvent](value: ActivityDefinition[TContext, TEvent]): Activity[TContext, TEvent] = value.asInstanceOf[Activity[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: String): Activity[TContext, TEvent] = value.asInstanceOf[Activity[TContext, TEvent]]
}

