package typingsSlinky.xstate.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - / * import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] * / js.Any
  - TEvent
*/
trait Event[TEvent /* <: EventObject */] extends js.Object

object Event {
  @scala.inline
  implicit def apply[TEvent](
    value: /* import warning: importer.ImportType#apply Failed type conversion: TEvent['type'] */ js.Any
  ): Event[TEvent] = value.asInstanceOf[Event[TEvent]]
  @scala.inline
  implicit def apply[TEvent](value: TEvent): Event[TEvent] = value.asInstanceOf[Event[TEvent]]
}

