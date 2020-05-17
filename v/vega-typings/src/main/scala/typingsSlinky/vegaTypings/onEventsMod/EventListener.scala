package typingsSlinky.vegaTypings.onEventsMod

import typingsSlinky.vegaTypings.anon.ScaleString
import typingsSlinky.vegaTypings.signalMod.SignalRef
import typingsSlinky.vegaTypings.streamMod.Stream
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.signalMod.SignalRef
  - typingsSlinky.vegaTypings.anon.ScaleString
  - typingsSlinky.vegaTypings.streamMod.Stream
*/
trait EventListener extends Events

object EventListener {
  @scala.inline
  implicit def apply(value: ScaleString): EventListener = value.asInstanceOf[EventListener]
  @scala.inline
  implicit def apply(value: SignalRef): EventListener = value.asInstanceOf[EventListener]
  @scala.inline
  implicit def apply(value: Stream): EventListener = value.asInstanceOf[EventListener]
}

