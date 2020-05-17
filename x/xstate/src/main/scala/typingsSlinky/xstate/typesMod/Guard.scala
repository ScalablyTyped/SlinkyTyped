package typingsSlinky.xstate.typesMod

import typingsSlinky.std.Record
import typingsSlinky.xstate.anon.TypeString
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.xstate.typesMod.GuardPredicate[TContext, TEvent]
  - (typingsSlinky.std.Record[java.lang.String, _]) with typingsSlinky.xstate.anon.TypeString
*/
trait Guard[TContext, TEvent /* <: EventObject */] extends Condition[TContext, TEvent]

object Guard {
  @scala.inline
  implicit def apply[TContext, TEvent](value: (Record[String, _]) with TypeString): Guard[TContext, TEvent] = value.asInstanceOf[Guard[TContext, TEvent]]
  @scala.inline
  implicit def apply[TContext, TEvent](value: GuardPredicate[TContext, TEvent]): Guard[TContext, TEvent] = value.asInstanceOf[Guard[TContext, TEvent]]
}

