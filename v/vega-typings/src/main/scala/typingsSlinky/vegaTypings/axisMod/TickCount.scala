package typingsSlinky.vegaTypings.axisMod

import typingsSlinky.vegaTypings.scaleMod.TimeInterval
import typingsSlinky.vegaTypings.signalMod.SignalRef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - scala.Double
  - typingsSlinky.vegaTypings.scaleMod.TimeInterval
  - typingsSlinky.vegaTypings.signalMod.SignalRef
*/
trait TickCount extends js.Object

object TickCount {
  @scala.inline
  implicit def apply(value: Double): TickCount = value.asInstanceOf[TickCount]
  @scala.inline
  implicit def apply(value: SignalRef): TickCount = value.asInstanceOf[TickCount]
  @scala.inline
  implicit def apply(value: TimeInterval): TickCount = value.asInstanceOf[TickCount]
}

