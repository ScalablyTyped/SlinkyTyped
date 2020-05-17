package typingsSlinky.vegaTypings.signalMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.NewSignal
  - typingsSlinky.vegaTypings.signalMod.InitSignal
  - typingsSlinky.vegaTypings.signalMod.PushSignal
*/
trait Signal extends js.Object

object Signal {
  @scala.inline
  implicit def apply(value: InitSignal): Signal = value.asInstanceOf[Signal]
  @scala.inline
  implicit def apply(value: NewSignal): Signal = value.asInstanceOf[Signal]
  @scala.inline
  implicit def apply(value: PushSignal): Signal = value.asInstanceOf[Signal]
}

